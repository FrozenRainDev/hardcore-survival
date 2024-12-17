package biz.coolpage.hcs.recipe;

import biz.coolpage.hcs.Reg;
import net.minecraft.inventory.RecipeInputInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SpecialCraftingRecipe;
import net.minecraft.recipe.book.CraftingRecipeCategory;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

public class ExtractWaterFromSnowRecipe extends SpecialCraftingRecipe {
    public ExtractWaterFromSnowRecipe(Identifier id, CraftingRecipeCategory category) {
        super(id, category);
    }

    @Override
    public boolean matches(@NotNull RecipeInputInventory inventory, World world) {
        boolean b1 = false, b2 = false;
        int count = 0;
        for (int i = 0; i < inventory.size(); ++i) {
            ItemStack stack = inventory.getStack(i);
            Item item = stack.getItem();
            if (!stack.isEmpty()) {
                ++count;
                if (item == Items.SNOWBALL) b1 = true;
                else if (item == Items.GLASS_BOTTLE) b2 = true;
            }
        }
        return b1 && b2 && count == 2;
    }

    @Override
    public ItemStack craft(RecipeInputInventory inventory, DynamicRegistryManager dynamicRegistryManager) {
        return Items.POTION.getDefaultStack();
    }

    @Override
    public boolean fits(int width, int height) {
        return width >= 2 && height >= 2;
    }

    @Override
    public DefaultedList<ItemStack> getRemainder(@NotNull RecipeInputInventory inventory) {
        return DefaultedList.ofSize(inventory.size(), ItemStack.EMPTY);
    }


    @Override
    public RecipeSerializer<?> getSerializer() {
        return Reg.EXTRACT_WATER_FROM_SNOW_RECIPE;
    }
}
