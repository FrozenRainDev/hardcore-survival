package biz.coolpage.hcs.status.manager;

import biz.coolpage.hcs.Reg;
import biz.coolpage.hcs.status.HcsEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;

import static biz.coolpage.hcs.recipe.DryingRackRecipe.IS_RAW_MEAT;
import static biz.coolpage.hcs.util.CommUtil.hasNull;

public class DiseaseManager {
    public static final String PARASITE_NBT = "hcs_parasite";
    public static final String COLD_NBT = "hcs_cold";
    private double parasite = 0.0; //[0,3] 0~1 early stage 1~2 medium term 2~3 later period
    private double cold = 0.0; //[0,2] 0~1 pre 1~2 symptom appearing

    public static double getParasitePossibilityAndCheckFoodPoisoning(Item item, LivingEntity entity) {
        double poss = -1.0;
        if (hasNull(item, entity)) return poss;
        // WARNING: Food with parasite == Food causing poisoning
        // Modify it if new rules needed
        else if (IS_RAW_MEAT.test(item)) {
            if (item == Items.PORKCHOP || item == Reg.ANIMAL_VISCERA) poss = 0.08;
            else poss = 0.04;
        } else if (item == Items.ROTTEN_FLESH) return 0.2;
        else if (item == Reg.ROT || item == Reg.BAT_WINGS) poss = 0.1;
        if ((Math.random() < (poss * 3.5) || isFoodPoisonous(item.getFoodComponent())) && entity instanceof ServerPlayerEntity player)
            player.addStatusEffect(new StatusEffectInstance(HcsEffects.FOOD_POISONING, 1200, 0, false, false, true));
        return poss; // -1.0: Impossible
    }

    public static boolean isFoodPoisonous(FoodComponent component) {
        if (component != null) {
            var effects = component.getStatusEffects();
            if (effects != null) {
                for (var effectFloatPair : effects) {
                    var first = effectFloatPair.getFirst();
                    if (first != null && first.getEffectType() == StatusEffects.POISON) return true;
                }
            }
        }
        return false;
    }

    public double getParasite() {
        if (parasite < 0.0) parasite = 0.0;
        else if (parasite > 3.0) parasite = 3.0;
        return parasite;
    }

    public void setParasite(double val) {
        if (Double.isNaN(val)) {
            Reg.LOGGER.error("{}/setParasite(): Val is NaN", this.getClass().getSimpleName());
            return;
        }
        if (val > 3.0) val = 3.0;
        else if (val < 0.0) val = 0.0;
        parasite = val;
    }

    public void addParasite(double val) {
        setParasite(getParasite() + val);
    }

    public double getCold() {
        if (cold < 0.0) cold = 0.0;
        else if (cold > 2.0) cold = 2.0;
        return cold;
    }

    public void setCold(double val) {
        if (Double.isNaN(val)) {
            Reg.LOGGER.error(this.getClass().getSimpleName() + "/setCold(): Val is NaN");
            return;
        }
        if (val > 2.0) val = 2.0;
        else if (val < 0.0) val = 0.0;
        cold = val;
    }

    public void addCold(double val) {
        setCold(getCold() + val);
    }

    public void tick(boolean shouldReduceCold) {
        if (this.parasite > 0.01) addParasite(0.000035);
        if (shouldReduceCold) this.addCold(-0.000015);
    }

    public void reset() {
        parasite = 0.0;
        cold = 0.0;
    }
}
