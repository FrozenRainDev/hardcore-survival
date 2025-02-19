package biz.coolpage.hcs.mixin.entity;

import biz.coolpage.hcs.Reg;
import biz.coolpage.hcs.status.accessor.ILivingEntity;
import biz.coolpage.hcs.status.accessor.StatAccessor;
import biz.coolpage.hcs.util.ArmorHelper;
import biz.coolpage.hcs.util.EntityHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
@SuppressWarnings({"ConstantValue", "AddedMixinMembersNamePattern"})
public abstract class LivingEntityMixin extends Entity implements ILivingEntity {
    @Shadow
    private int lastAttackedTime;

    @Shadow
    public abstract boolean isBaby();

    @Shadow
    @Nullable
    public abstract LivingEntity getAttacker();

    @Unique
    private LivingEntity hcsLastAttacker = null;

    @Unique
    @Override
    public LivingEntity getHcsLastAttacker() {
        return this.hcsLastAttacker;
    }

    public LivingEntityMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    @Inject(method = "baseTick", at = @At("HEAD"))
    public void baseTick(CallbackInfo cir) {
        //Enable prolonged panic caused by being attacked
        if (this.getAttacker() != null) this.hcsLastAttacker = this.getAttacker();
        if (this.hcsLastAttacker != null && this.hcsLastAttacker.isDead()) this.hcsLastAttacker = null;
        if ((Object) this instanceof AnimalEntity animal // && this.age % 6 != 0
                && this.hcsLastAttacker != null && animal.distanceTo(this.hcsLastAttacker) < 48)
            ++this.lastAttackedTime;
    }

    @Inject(method = "getNextAirOnLand", at = @At("RETURN"), cancellable = true)
    protected void getNextAirOnLand(int air, @NotNull CallbackInfoReturnable<Integer> cir) {
        if ((Object) this instanceof PlayerEntity player) {
            int lvl = ((StatAccessor) player).getStatusManager().getFinalOxygenLackLevel();
            if (lvl > 0 && !player.hasStatusEffect(StatusEffects.WATER_BREATHING)) {
                cir.setReturnValue(air + ((air + 1 >= this.getMaxAir()) ? 0 : (lvl == 1 ? 1 : 0)));
            }
        }
    }

    @Inject(method = "damage", at = @At("TAIL"))
    public void damage(DamageSource source, float amount, CallbackInfoReturnable<Integer> cir) {
        Object victim = this;
        if (source != null && source.getAttacker() instanceof LivingEntity attacker) {
            if (victim instanceof PlayerEntity player && attacker instanceof HostileEntity)
                ((StatAccessor) player).getSanityManager().add(attacker instanceof EndermanEntity ? -0.08 : -0.005);
            if (victim instanceof AnimalEntity animal) {
                EntityHelper.getOthersEntitiesInRange(animal, AnimalEntity.class, 1.0).stream()
                        .filter(entity -> entity != null && entity != animal)
                        .forEach(entity -> {
                            entity.setAttacker(animal.getAttacker());
                            entity.lastAttackedTicks = entity.age;
                        });
                if (victim instanceof AnimalEntity) {
                    if (victim instanceof ChickenEntity) EntityHelper.dropItem(this, Items.FEATHER, 1);
                }
            }
        }
    }

    @Inject(method = "onDeath", at = @At("TAIL"))
    public void onDeath(@NotNull DamageSource source, CallbackInfo ci) {
        if (EntityHelper.SHOULD_DROP_AFTER_DEATH.test(this, source)) return;
        Object ent = this;
        Item meat = this.getFireTicks() > 0 ? Reg.COOKED_MEAT : Reg.RAW_MEAT;
        if (ent instanceof ChickenEntity || ent instanceof CowEntity || ent instanceof PigEntity || ent instanceof SheepEntity) {
            if (!(ent instanceof ChickenEntity)) {
                //EntityHelper.dropItem(this, Items.BONE, 2);
                EntityHelper.dropItem(this, Reg.ANIMAL_VISCERA);
                if (ent instanceof SheepEntity && Math.random() < 0.3) EntityHelper.dropItem(this, Items.LEATHER);
            }
            if (this.isBaby()) EntityHelper.dropItem(this, meat);
        } else if (ent instanceof AxolotlEntity || ent instanceof CatEntity || ent instanceof FrogEntity || ent instanceof ParrotEntity || ent instanceof SquidEntity)
            EntityHelper.dropItem(this, meat);
        else if (ent instanceof AnimalEntity && !(ent instanceof BeeEntity || ent instanceof TadpoleEntity || ent instanceof RabbitEntity || ent instanceof ZombieHorseEntity || ent instanceof SkeletonHorseEntity)) {
            if (ent instanceof AbstractHorseEntity)
                EntityHelper.dropItem(this, this.getFireTicks() > 0 ? Items.COOKED_BEEF : Items.BEEF, (int) (Math.random() * 3) + 1);
            else EntityHelper.dropItem(this, meat, (int) (Math.random() * 3) + 1);
            // EntityHelper.dropItem(this, Items.BONE, 2);
            EntityHelper.dropItem(this, Reg.ANIMAL_VISCERA);
        } else if (ent instanceof SpiderEntity && Math.random() < 0.33) EntityHelper.dropItem(this, Reg.SPIDER_GLAND);
        else if (ent instanceof BatEntity)
            EntityHelper.dropItem(this, this.getFireTicks() > 0 ? Reg.ROASTED_BAT_WINGS : Reg.BAT_WINGS);
        else if (ent instanceof WitherEntity) {
            EntityHelper.dropItem(this, Items.NETHERITE_INGOT, 2 + (int) (Math.random() * 2));
            EntityHelper.dropItem(this, Items.DIAMOND, 12 + (int) (Math.random() * 6));
        } else if (ent instanceof EnderDragonEntity) {
            EntityHelper.dropItem(this, Items.NETHERITE_INGOT, 6 + (int) (Math.random() * 6));
            EntityHelper.dropItem(this, Items.DIAMOND, 32 + (int) (Math.random() * 32));
            EntityHelper.dropItem(this, Items.ENCHANTED_GOLDEN_APPLE, 20 + (int) (Math.random() * 20));
        }
    }

    @Inject(method = "drop", at = @At("HEAD"), cancellable = true)
    protected void drop(DamageSource source, CallbackInfo ci) {
        if (EntityHelper.SHOULD_DROP_AFTER_DEATH.test(this, source)) ci.cancel();
    }

    @Inject(method = "applyArmorToDamage", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/DamageUtil;getDamageLeft(FFF)F"), cancellable = true)
    protected void applyArmorToDamage(DamageSource source, float amount, @NotNull CallbackInfoReturnable<Float> cir) {
        if (((Object) this) instanceof PlayerEntity player)
            cir.setReturnValue(ArmorHelper.getDamageLeft(player, amount));
    }

}
