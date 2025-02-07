package biz.coolpage.hcs.config;

import biz.coolpage.hcs.Reg;
import biz.coolpage.hcs.status.accessor.StatAccessor;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import static biz.coolpage.hcs.Reg.HCS_FOOD_SPOILAGE;

public class HcsFoodSpoilage {
    public static String HCS_SPOILAGE_NAME = "hcsFoodSpoilage";

    public static boolean canFoodSpoil(@Nullable ServerWorld world) {
        if (!(world instanceof ServerWorld) || world.getGameRules() == null) {
            Reg.LOGGER.warn("{}: canFoodSpoil:ServerWorld Invalid world or game rules", HcsFoodSpoilage.class.getSimpleName());
            return true;
        }
        return world.getGameRules().get(HCS_FOOD_SPOILAGE).get();
    }

    public static boolean canFoodSpoil(@Nullable PlayerEntity player) {
        if (player == null) return true;
        return ((StatAccessor) player).getStatusManager().canFoodSpoil();
    }

    @Deprecated
    public static boolean canFoodSpoil(@Nullable World world) {
        if (world == null) {
            Reg.LOGGER.warn("{}: canFoodSpoil:canFoodSpoil Invalid world or game rules", HcsFoodSpoilage.class.getSimpleName());
            return true;
        }
        return canFoodSpoil(world.getPlayers().get(0));
    }
}
