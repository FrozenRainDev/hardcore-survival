package com.hcs.mixin.entity;

import com.hcs.Reg;
import com.hcs.util.EntityHelper;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.passive.*;
import net.minecraft.item.Items;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@SuppressWarnings("all")
@Mixin(AnimalEntity.class)
public abstract class AnimalEntityMixin extends PassiveEntity {

    protected AnimalEntityMixin(EntityType<? extends PassiveEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "damage", at = @At("HEAD"))
    public void damage(DamageSource source, float amount, CallbackInfoReturnable<Integer> cir) {
        Object ent = this;
        if (ent instanceof ChickenEntity && source.toString().contains("EntityDamageSource"))
            EntityHelper.dropItem(this, Items.FEATHER, 1);
        //On death
        if ((this.getHealth() - amount) <= 0.0F && this.getHealth() > 0.0F) {
            if (ent instanceof ChickenEntity || ent instanceof CowEntity || ent instanceof PigEntity || ent instanceof SheepEntity) {
                if (!(ent instanceof ChickenEntity)) {
                    //EntityHelper.dropItem(this, Items.BONE, 2);
                    EntityHelper.dropItem(this, Reg.ANIMAL_VISCERA, 1);
                    if (ent instanceof SheepEntity && Math.random() < 0.6)
                        EntityHelper.dropItem(this, Items.LEATHER, 1);
                }
                if (this.isBaby())
                    EntityHelper.dropItem(this, this.getFireTicks() > 0 ? Reg.COOKED_MEAT : Reg.RAW_MEAT, 1);
            } else if (ent instanceof AxolotlEntity || ent instanceof CatEntity || ent instanceof FrogEntity || ent instanceof ParrotEntity)
                EntityHelper.dropItem(this, this.getFireTicks() > 0 ? Reg.COOKED_MEAT : Reg.RAW_MEAT, 1);
            else if (!(ent instanceof BeeEntity || ent instanceof TadpoleEntity)) {
                EntityHelper.dropItem(this, this.getFireTicks() > 0 ? Reg.COOKED_MEAT : Reg.RAW_MEAT, (int) (Math.random() * 3) + 1);
                //EntityHelper.dropItem(this, Items.BONE, 2);
                EntityHelper.dropItem(this, Reg.ANIMAL_VISCERA, 1);
            }
            //Also see at BatEntityMixin
        }
    }

    @Inject(method = "getXpToDrop", at = @At("HEAD"), cancellable = true)
    public void getXpToDrop(@NotNull CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }
}
