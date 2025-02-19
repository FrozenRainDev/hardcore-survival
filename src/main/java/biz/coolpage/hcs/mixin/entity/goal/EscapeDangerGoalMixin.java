package biz.coolpage.hcs.mixin.entity.goal;

import biz.coolpage.hcs.status.accessor.IKickCoolDown;
import biz.coolpage.hcs.status.accessor.ILivingEntity;
import biz.coolpage.hcs.util.EntityHelper;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.NoPenaltyTargeting;
import net.minecraft.entity.ai.goal.EscapeDangerGoal;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static biz.coolpage.hcs.util.CommUtil.hasNull;

@Mixin(EscapeDangerGoal.class)
public abstract class EscapeDangerGoalMixin {
    @Shadow
    @Final
    @Mutable
    protected final double speed;

    @Shadow
    @Final
    @Mutable
    protected final PathAwareEntity mob;
    @Shadow
    protected double targetX, targetY, targetZ;

    public EscapeDangerGoalMixin(double speed, PathAwareEntity mob) {
        this.speed = speed;
        this.mob = mob;
    }

    @Unique
    private boolean isAttackerAfar() {
        if (this.mob instanceof ILivingEntity ent) {
            LivingEntity attacker0 = ent.getHcsLastAttacker();
            return attacker0 != null && this.mob.distanceTo(attacker0) > 48;
        }
        return false;
    }

    @Inject(method = "canStart", at = @At("RETURN"), cancellable = true)
    protected void canStart(CallbackInfoReturnable<Boolean> cir) {
        if (isAttackerAfar()) cir.setReturnValue(false);
    }

    @ModifyArg(method = "start", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/ai/pathing/EntityNavigation;startMovingTo(DDDD)Z"), index = 3)
    public double startMixin(double speed) {
        //Improve escaping speed
        if (mob instanceof CowEntity) speed *= 1.1;
        else if (mob instanceof ChickenEntity) speed *= 1.2;
        else speed *= 1.4;
        return speed;
    }

    @Inject(method = "findTarget", at = @At("HEAD"), cancellable = true)
    protected void findTarget(@NotNull CallbackInfoReturnable<Boolean> cir) {
        var attacker = this.mob.getAttacker();
        if (attacker == null) return;
        var attackerPos = attacker.getPos();
        var mobPos = this.mob.getPos();
        if (hasNull(attackerPos, mobPos)) return;
        double escVectorX = mobPos.x - attackerPos.x, escVectorZ = mobPos.z - attackerPos.z;
        var escPos = NoPenaltyTargeting.findTo(this.mob, 5, 4, Vec3d.ofBottomCenter(BlockPos.ofFloored(mobPos.x + escVectorX, mobPos.y, mobPos.z + escVectorZ)), 1.5707963705062866);
        if (escPos == null) {
            var escVector = attackerPos.subtract(mobPos);
            escPos = NoPenaltyTargeting.findTo(this.mob, 5, 4, Vec3d.ofBottomCenter(BlockPos.ofFloored(escVector)), 1.5707963705062866);
        }
        if (escPos == null) {
            cir.setReturnValue(false);
            return;
        }
        this.targetX = escPos.x;
        this.targetY = escPos.y;
        this.targetZ = escPos.z;
        cir.setReturnValue(true);
    }

    @Inject(method = "shouldContinue", at = @At("HEAD"), cancellable = true)
    public void shouldContinue(@NotNull CallbackInfoReturnable<Boolean> cir) {
        /* `CowKickRevengeGoal` Core Code
        Goals with same priority won't run simultaneously,
        if CowKickRevengeGoal runs, EscapingDangerGoal terminates and the entity will lose memory of escaping from its attackers,
        so I mixed such goal's code into EscapingDanger reluctantly. */
        if (this.mob instanceof IKickCoolDown kicker && !this.mob.isBaby()) {
            kicker.updateCooldown();
            if (kicker.canKick()) {
                LivingEntity attacker = this.mob.getAttacker();
                if (attacker != null && !EntityHelper.isInLeather(attacker) && this.mob.distanceTo(attacker) < 3.0) {
                    EntityHelper.flyOut(this.mob, attacker, 6.0F);
                    kicker.notifyKick();
                }
            }
        }
        // The method stop() won't be called when the return value is false, so I called it manually
        if (isAttackerAfar()) {
            cir.setReturnValue(false);
        }
    }
}
