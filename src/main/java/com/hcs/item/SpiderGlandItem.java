package com.hcs.item;

import com.hcs.Reg;
import com.hcs.status.accessor.StatAccessor;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

public class SpiderGlandItem extends Item {
    final int durationSeconds;

    public SpiderGlandItem(Item.Settings settings, int durationSeconds) {
        super(settings);
        this.durationSeconds = durationSeconds;
    }

    @Override
    public TypedActionResult<ItemStack> use(@NotNull World world, PlayerEntity user, Hand hand) {
        if (world.isClient()) return super.use(world, user, hand);
        ItemStack stack = user.getStackInHand(hand);
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, durationSeconds * 20, 0));
        if (stack.isOf(Reg.SELAGINELLA)) {
            ((StatAccessor) user).getStatusManager().setSoulImpairedStat(0);
            ((StatAccessor) user).getInjuryManager().applyPainkiller();
        }
        if (!user.getAbilities().creativeMode) stack.decrement(1);
        return TypedActionResult.success(stack, world.isClient());
    }

}
