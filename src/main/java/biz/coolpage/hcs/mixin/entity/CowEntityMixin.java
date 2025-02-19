package biz.coolpage.hcs.mixin.entity;

import biz.coolpage.hcs.status.accessor.IKickCoolDown;
import biz.coolpage.hcs.util.EntityHelper;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static biz.coolpage.hcs.util.EntityHelper.isInLeather;

@SuppressWarnings("AddedMixinMembersNamePattern")
@Mixin(CowEntity.class)
public abstract class CowEntityMixin extends AnimalEntity implements IKickCoolDown {
    /* See data tracker init in `PassiveEntityMixin`
     * Needs a data tracker to sync `Server` and `Client`
     * Data trackers have NO auto saving -- It still rely on NBTs
     * > Reference: SheepEntity
     * */

    @Unique
    private int kickCoolDown = 20;

    @Unique
    @Override
    public boolean canKick() {
        return this.kickCoolDown <= 0;
    }

    @Unique
    @Override
    public void notifyKick() {
        this.kickCoolDown = 100;
    }

    @Unique
    @Override
    public void updateCooldown() {
        if (this.kickCoolDown > 0) this.kickCoolDown--;
    }

    protected CowEntityMixin(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "createCowAttributes", at = @At("RETURN"), cancellable = true)
    private static void createCowAttributes(@NotNull CallbackInfoReturnable<DefaultAttributeContainer.Builder> cir) {
        cir.setReturnValue(cir.getReturnValue().add(EntityAttributes.GENERIC_MAX_HEALTH, 20.0));
    }

//    @Inject(method = "initGoals", at = @At("TAIL"))
//    protected void initGoals(CallbackInfo ci) {
//        this.goalSelector.add(1 /* priority 0 causes entity immobility when ending escaping danger goal*/, new CowKickRevengeGoal(this));
//    }

    @Inject(method = "interactMob", at = @At("HEAD"), cancellable = true)
    public void interactMob(@NotNull PlayerEntity player, Hand hand, @NotNull CallbackInfoReturnable<ActionResult> cir) {
        //  NOT SOLELY `ServerPlayerEntity` -- Both server and client side need the interaction
        boolean isMilking = player.getMainHandStack().isOf(Items.BUCKET) && !this.isBaby();
        if (isMilking && EntityHelper.IS_SURVIVAL_AND_SERVER.test(player)) {
            if (isInLeather(player)) {
                long time = this.getWorld().getTime();
                long milkedTime = this.dataTracker.get(EntityHelper.MILKED_TIME);
                if (Math.abs(milkedTime - time) < 24000L) {
                    // Prevent multiple milking in one day
                    player.playSound(SoundEvents.ENTITY_COW_AMBIENT, 1.0F, 1.0F);
                    cir.setReturnValue(ActionResult.FAIL);
                } else this.dataTracker.set(EntityHelper.MILKED_TIME, time);
            } else { // Rebel and become panic when someone milking without any leather clothing
                this.setAttacker(player); // Set relevant data as same as being attacked
                this.lastAttackedTicks = this.age;
                cir.setReturnValue(ActionResult.FAIL);
            }
        }
    }

}

