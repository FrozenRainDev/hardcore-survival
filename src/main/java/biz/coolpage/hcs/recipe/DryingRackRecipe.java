package biz.coolpage.hcs.recipe;

import biz.coolpage.hcs.Reg;
import biz.coolpage.hcs.util.CommUtil;
import biz.coolpage.hcs.util.WorldHelper;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.*;
import net.minecraft.recipe.RecipeManager;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

import java.util.function.Predicate;

public class DryingRackRecipe {
    public static Predicate<String> HAS_COOKED = name -> name.contains("cooked_") || name.contains("baked_") || name.contains("roasted_") || name.contains("steamed_") || name.contains("fried_");
    public static Predicate<Item> IS_RAW = item -> item != null && getCooked(item) != item;
    public static Predicate<Item> IS_RAW_MEAT = IS_RAW.and(item -> item.getFoodComponent() != null && item.getFoodComponent().isMeat());

    public static Item getOutput(Item input) {
        if (input == null) return Items.AIR;
        //Give priority to special recipes
        if (input == Items.ROTTEN_FLESH) return Items.LEATHER;
        if (input == Items.KELP) return Items.DRIED_KELP;
        //Reject items that don't meet standard
        FoodComponent component = input.getFoodComponent();
        String name = input.getTranslationKey();
        ItemStack stack = input.getDefaultStack();
        if (name.contains("jerky") || name.contains("viscera") || name.contains("innards") || input == Items.PUFFERFISH)
            return Items.AIR;
        if (!input.isFood() || component == null) return Items.AIR;
        if (!component.isMeat() && !stack.isIn(ItemTags.FISHES)) return Items.AIR;
        //Return corresponding jerky
        boolean isCooked = HAS_COOKED.test(name);
        Item cookedItem = isCooked ? input : getCooked(input);
        FoodComponent cookedComponent = cookedItem.getFoodComponent();
        boolean isSmall = CommUtil.optElse(cookedComponent, FoodComponents.COOKED_CHICKEN).getHunger() < 6 || cookedItem == Items.COOKED_SALMON;
        if (isCooked) {
            if (isSmall) return Reg.SMALL_JERKY;
            return Reg.JERKY;
        } else {
            if (isSmall) return Reg.RAW_SMALL_JERKY;
            return Reg.RAW_JERKY;
        }
    }

    public static @NotNull Item getCooked(Item rawMaterial) {
        if (WorldHelper.cannotGetServerWorld()) {
            Reg.LOGGER.error("CustomDryingRackRecipe/getCooked;RotHelper.theWorld==null");
            return rawMaterial;
        }
        World world = WorldHelper.getServerWorld();
        ItemStack stack = new ItemStack(rawMaterial);
        Inventory inventory = new SimpleInventory(stack);
        return CommUtil.optElse(RecipeManager.createCachedMatchGetter(RecipeType.CAMPFIRE_COOKING).getFirstMatch(inventory, world).map((recipe) -> recipe.craft(inventory, world.getRegistryManager())).orElse(stack).getItem(), rawMaterial);
    }

}
