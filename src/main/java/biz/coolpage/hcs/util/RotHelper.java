package biz.coolpage.hcs.util;

import biz.coolpage.hcs.Reg;
import biz.coolpage.hcs.entity.DryingRackBlockEntity;
import biz.coolpage.hcs.status.HcsEffects;
import biz.coolpage.hcs.status.accessor.StatAccessor;
import biz.coolpage.hcs.status.manager.SanityManager;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.HungerManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.text.TextContent;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static biz.coolpage.hcs.config.HcsFoodSpoilage.canFoodSpoil;

public class RotHelper {
    public static final String HFE = "hcs_food_exp"; // food expiry (ticks)
    public static final String HFF = "hcs_food_fresh"; // percentage of food freshness
    public static final String HFI = "hcs_food_exp_icebox"; // food expiry when in icebox

    // See ItemStackMixin, really annoying :(
    public static void combineNBT(@NotNull ItemStack stackA, @NotNull ItemStack stackB) {
        if (WorldHelper.cannotGetServerWorld()) return;
        int countA = stackA.getCount();
        int countB = stackB.getCount();
        NbtCompound nbtA = stackA.getOrCreateNbt();
        NbtCompound nbtB = stackB.getOrCreateNbt();
        float freshA = getFresh(WorldHelper.getServerWorld(), stackA);
        float freshB = getFresh(WorldHelper.getServerWorld(), stackB);
        if (Float.compare(freshA, freshB) == 0) // Same freshness doesn't need further operations
            return;
//        System.out.println("further ops");
        if (countA <= 0 || countB <= 0) {
            Reg.LOGGER.error("RotHelper/combineNBT(); {}", countA + ", " + countB);
            return;
        }
        if (WorldHelper.cannotGetServerWorld()) return;
        float avgFresh = (getFresh(WorldHelper.getServerWorld(), stackA) * countA + getFresh(WorldHelper.getServerWorld(), stackB) * countB) / (float) (countA + countB);
        if (nbtA.contains(HFE) || nbtA.contains(HFI))
            createExp(WorldHelper.getServerWorld(), stackA, avgFresh, nbtA.contains(HFI));
        if (nbtB.contains(HFE) || nbtB.contains(HFI))
            createExp(WorldHelper.getServerWorld(), stackB, avgFresh, nbtB.contains(HFI));
    }

    // To improve performance, do not use "onInteract" "stack.isOf"
    public static boolean canRot(Item item) {
        if (item == null) return false;
        // Check food spoil enabling config
        // Just need to add code here; other complex methods are not wise
        if (WorldHelper.cannotGetServerWorld()) { // Client Side
            if (WorldHelper.getClientPlayer() != null && !canFoodSpoil(WorldHelper.getClientPlayer()))
                return false;
        } else if (!canFoodSpoil(WorldHelper.getServerWorld()))
            return false; // Server Side
        // Check special food types
        if (item == Reg.ROT || item == Reg.WORM || item == Items.ROTTEN_FLESH || item == Items.GOLDEN_APPLE || item == Items.ENCHANTED_GOLDEN_APPLE || item == Items.GOLDEN_CARROT || item == Items.GLISTERING_MELON_SLICE || Reg.IS_BARK.test(item))
            return false;
        String name = item.getTranslationKey();
        if (item == Reg.SELAGINELLA || item == Items.SUGAR || item == Items.EGG || item == Items.TURTLE_EGG || item == Items.MILK_BUCKET || item == Items.FERMENTED_SPIDER_EYE || item == Reg.CACTUS_JUICE || item == Items.CAKE || item == Items.RABBIT_FOOT || item.getTranslationKey().contains("seeds") || name.contains("pumpkin") || name.contains("melon"))
            return true;
        return item.isFood() && item.getFoodComponent() != null && !item.getDefaultStack().isIn(ItemTags.FLOWERS);
    }

    public static int getPackageType(@NotNull Item item) {
        return getPackageType(item.getTranslationKey());
    }

    public static int getPackageType(@NotNull String name) {
        if ((name.contains("_can") && !name.contains("cane"))) return 2;//Canned Food
        if (name.contains("_stew") || name.contains("stew_") || name.contains("_salad") || name.contains("_soup") || name.contains("_bucket") || name.contains("bucket_") || name.contains("_bottle") || name.contains("bottle_") || name.contains("_cup") || name.contains("cup_") || name.contains("_juice"))
            return 1; // Food in container
        return 0; // Non-packaged
    }

    public static float getExpDate(Item item) {
        if (item == null) return 7;
        String name = item.getTranslationKey(); // item.getName().toString();
        int packageType = getPackageType(name);
        if (item == Reg.POTHERB || item == Reg.FEARLESSNESS_HERB || item == Reg.ROASTED_SEEDS || item == Items.PUMPKIN_PIE || item == Items.KELP)
            return 10;
        if (item == Items.WHEAT || name.contains("seeds")) return 500;
        if (item == Items.MILK_BUCKET || item == Reg.CACTUS_JUICE) return 2.5F;
        if (item == Items.MELON_SLICE) return 2;
        if (name.contains("_slice")) return 3;
        if (item == Reg.ANIMAL_VISCERA || item.getDefaultStack().isIn(ItemTags.FISHES)) return 4;
        if (item == Items.APPLE || item == Items.SUGAR_CANE || item == Items.POISONOUS_POTATO || name.contains("melon"))
            return 20;
        if (item == Items.CARROT || item == Items.BEETROOT) return 30;
        if (item == Items.EGG || item == Items.TURTLE_EGG || item == Reg.CACTUS_FLESH || item == Reg.ORANGE || item == Items.POTATO || item == Reg.GINGER)
            return 45;
        if (name.contains("jerky") || item == Items.COOKIE || item == Items.DRIED_KELP || item == Items.FERMENTED_SPIDER_EYE)
            return 60;
        if (item == Items.HONEYCOMB) return 180;
        if (packageType == 2 || item == Items.HONEY_BOTTLE || item == Items.SUGAR)
            return 1000;
        if (packageType == 1 || name.contains("cooked_") || name.contains("baked_") || name.contains("roasted_") || name.contains("steamed_") || name.contains("fried_"))
            return 5;
        if (item == Items.COCOA_BEANS || item == Items.NETHER_WART || name.contains("pumpkin") || item == Reg.SELAGINELLA)
            return 80;
        if (!item.isFood() || item.getFoodComponent() == null) return 7;
        if (item.getFoodComponent().isMeat() || item == Items.RABBIT_FOOT || item == Reg.BAT_WINGS) return 5;
        return 7;
    }

    public static long createExp(World world, ItemStack stack) {
        return createExp(world, stack, false);
    }

    public static long createExp(World world, ItemStack stack, boolean isInIcebox) {
        return createExp(world, stack, 1.0F, isInIcebox);
    }

    public static long createExp(World world, ItemStack stack, float fresh, boolean isInIcebox) {
        if (world == null) {
            Reg.LOGGER.error("RotHelper/createExp;world==null");
            return setExp(stack, 0, isInIcebox);
        }
        return setExp(stack, world.getTime() + (long) (getExpDate(stack.getItem()) * 24000 * fresh * (isInIcebox ? 3 : 1)), isInIcebox);
    }

    @Deprecated
    public static long getExp(@NotNull ItemStack stack) {
        if (stack.getOrCreateNbt().contains(HFI)) return stack.getOrCreateNbt().getLong(HFI);
        if (stack.getOrCreateNbt().contains(HFE)) return stack.getOrCreateNbt().getLong(HFE);
        if (WorldHelper.cannotGetServerWorld()) {
            Reg.LOGGER.error("getExp client called");
            return 0;
        }
        return createExp(WorldHelper.getServerWorld(), stack);
    }

    public static long getExp(@NotNull ItemStack stack, boolean isInIcebox) {
        if (stack.getOrCreateNbt().contains(isInIcebox ? HFI : HFE))
            return stack.getOrCreateNbt().getLong(isInIcebox ? HFI : HFE);
        return Long.MAX_VALUE;
    }

    @Deprecated
    public static long setExp(@NotNull ItemStack stack, long expirationTime) {
        return setExp(stack, expirationTime, false);
    }

    public static long setExp(@NotNull ItemStack stack, long expirationTime, boolean isInIcebox) {
        stack.getOrCreateNbt().putLong(isInIcebox ? HFI : HFE, expirationTime);
        return expirationTime;
    }

    public static float getFresh(World world, ItemStack stack) {
        return getFresh(world, stack, stack.getOrCreateNbt().contains(HFI));
    }

    public static float getFresh(World world, ItemStack stack, boolean isInIcebox) {
        if (world == null) return 1.0F;
        float fresh = (float) (getExp(stack, isInIcebox) - world.getTime()) / (getExpDate(stack.getItem()) * 24000.0F * (isInIcebox ? 3.0F : 1.0F));
        if (fresh > 1.0F) fresh = 1.0F;
        else if (fresh < 0.0F) fresh = 0.0F;
        return fresh;
    }

    public static int getFreshLevel(float fresh) {
        if (fresh > 0.7F) return 3; // Fresh
        if (fresh > 0.35F) return 2; // Stale
        if (fresh > 0.0F) return 1; // Spoiled
        return 0; // Rotten
    }

    public static float getFreshCooked(float prevFresh) {
        if (prevFresh <= 0.0F) return 0.0F; //Cooked rotten food is still rotten
        return Math.min(1.0F, 0.4F + prevFresh / 1.5F);
    }

    public static void setFresh(World world, ItemStack stack, float fresh) {
        setFresh(world, stack, fresh, false);
    }

    public static void setFresh(World world, ItemStack stack, float fresh, boolean isInIcebox) {
        if (world == null) return;
        if (fresh > 1.0F) fresh = 1.0F;
        else if (fresh < 0.0F) fresh = 0.0F;
        setExp(stack, (long) (fresh * getExpDate(stack.getItem()) * 24000.0F + world.getTime()), isInIcebox);
    }

    public static void update(World world, Inventory inv) {
        if (!(inv instanceof PlayerInventory)) // Prevent duplicate call
            CombustionHelper.inventoryTick(false, inv, null);
        update(world, inv, false);
    }

    public static void update(World world, Inventory inv, boolean isInIcebox) {
        if (world == null || inv == null) {
            Reg.LOGGER.error("RotHelper/tick();world==null||inv==null");
            return;
        }
        WorldHelper.trySetServerWorld(world);
        if (WorldHelper.cannotGetServerWorld()) return;
        if (world instanceof ServerWorld) {
//        world = WorldHelper.getServerWorld();
            for (int i = 0; i < inv.size(); ++i) {
                ItemStack stack = inv.getStack(i);
                if (stack == null) continue;
                Item item = stack.getItem();
                NbtCompound nbt = stack.getOrCreateNbt();
                if (nbt.contains(DryingRackBlockEntity.DRYING_DEADLINE) && !isInIcebox)
                    nbt.remove(DryingRackBlockEntity.DRYING_DEADLINE);
                if (stack.isEmpty() || !canRot(item)) {
                    if (nbt.contains(HFE)) nbt.remove(HFE);
                    continue;
                }
                if (nbt.contains(HFF)) {
                    createExp(world, stack, nbt.getFloat(HFF), isInIcebox);
                    nbt.remove(HFF);
                }
                if (nbt.contains(isInIcebox ? HFI : HFE)) {
                    if (getExp(stack, isInIcebox) <= world.getTime() && getPackageType(item) != 1) {
                        inv.setStack(i, new ItemStack(Reg.ROT, stack.getCount()));
                    }
                } else createExp(world, stack, isInIcebox);
                if (nbt.contains(isInIcebox ? HFE : HFI)) {
                    createExp(world, stack, getFresh(world, stack, !isInIcebox), isInIcebox);
                    nbt.remove(isInIcebox ? HFE : HFI);
                }
            }
        }
    }

    public static void onLeaveGame(World world, Inventory inv) {
        // prevent left players' inventories from rotting
        if (inv == null) {
            Reg.LOGGER.error("RotHelper/onLeaveGame;inv==null");
            return;
        }
        for (int i = 0; i < inv.size(); ++i) {
            ItemStack stack = inv.getStack(i);
            Item item = stack.getItem();
            NbtCompound nbt = stack.getOrCreateNbt();
            if (!canRot(item) || nbt.contains(HFF)) continue;
            if (nbt.contains(HFI)) update(world, inv, false);
            if (nbt.contains(HFE)) {
                nbt.putFloat(HFF, getFresh(world, stack, false));
                nbt.remove(HFE);
            }
        }
    }

    public static MutableText getModifierText(World world, @NotNull ItemStack stack) {
        boolean isInIcebox = stack.getOrCreateNbt().contains(HFI);
        if (world == null || (!stack.getOrCreateNbt().contains(HFE) && !isInIcebox))
            return Text.translatable("hcs.food_info.fresh").formatted(Formatting.DARK_GREEN);
        float fresh = getFresh(world, stack, isInIcebox);
        int freshLv = getFreshLevel(fresh);
        MutableText modifier = MutableText.of(TextContent.EMPTY);
        if (freshLv >= 3)
            modifier.append(Text.translatable("hcs.food_info.fresh").formatted(Formatting.DARK_GREEN)); //If .formatted() outside of append() rather than outside of it, the sibling cannot clear its style via cleaning father text? See ScreenMixin prev bug
        else if (freshLv == 2) modifier.append(Text.translatable("hcs.food_info.stale").formatted(Formatting.YELLOW));
        else if (freshLv == 1) modifier.append(Text.translatable("hcs.food_info.spoiled").formatted(Formatting.RED));
        else {
            modifier.append(Text.translatable("hcs.food_info.rotten").formatted(Formatting.DARK_RED));
            if (getPackageType(stack.getItem()) == 1)
                modifier.append(Text.translatable("hcs.food_info.pour").formatted(Formatting.GRAY));
            return modifier;
        }
//        modifier.append(Text.translatable("hcs.food_info.expiry", (int) Math.ceil(Math.max(getExpDate(stack.getItem()) * fresh * (isInIcebox ? 3 : 1), 0.1F))).formatted(Formatting.GRAY));
        return modifier;
    }

    public static void appendInfo(World world, ItemStack stack, List<Text> tooltip) {
        if (world == null) return;
        tooltip.add(getModifierText(world, stack));
    }

    public static int addDebuff(World world, PlayerEntity player, ItemStack stack) {
        int freshLevel = 3;
        if (player == null || stack == null) {
            Reg.LOGGER.error("RotHelper/addDebuff;player==null||stack==null");
            return freshLevel;
        }
        if (world.isClient()) {
            Reg.LOGGER.warn("RotHelper/addDebuff;world is client");
            return freshLevel;
        }
        HungerManager hungerManager = player.getHungerManager();
        SanityManager sanityManager = ((StatAccessor) player).getSanityManager();
        Item item = stack.getItem();
        FoodComponent food = item.getFoodComponent();
        freshLevel = getFreshLevel(getFresh(world, stack));
        boolean isRot = item == Reg.ROT;
        if (canRot(item) || isRot) {
            switch (isRot ? 0 : freshLevel) {
                case 0 -> {
                    hungerManager.setSaturationLevel(0);
                    sanityManager.add(-0.1);
                    if (food != null) hungerManager.setFoodLevel(hungerManager.getFoodLevel() - food.getHunger() + 1);
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200));
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 100));
                    player.addStatusEffect(new StatusEffectInstance(HcsEffects.FOOD_POISONING, 1200));
                    player.addStatusEffect(new StatusEffectInstance(HcsEffects.DIARRHEA, 600));
                }
                case 1 -> {
                    sanityManager.add(-0.07);
                    if (food != null)
                        hungerManager.setFoodLevel(hungerManager.getFoodLevel() - (int) (Math.min(food.getHunger() - 1, food.getHunger() * 0.7)));
                    player.addStatusEffect(new StatusEffectInstance(HcsEffects.FOOD_POISONING, 600));
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200));
                    player.addStatusEffect(new StatusEffectInstance(HcsEffects.DIARRHEA, 600));
                }
                case 2 -> {
                    if (food != null)
                        hungerManager.setFoodLevel(hungerManager.getFoodLevel() - (int) (Math.min(food.getHunger() - 1, food.getHunger() * 0.3)));
                }
            }
        }
        return freshLevel;
    }

    public static boolean isMeat(ItemStack stack) {
        if (stack == null) return false;
        return CommUtil.applyNullable(stack.getItem().getFoodComponent(), FoodComponent::isMeat, false);
    }

}
