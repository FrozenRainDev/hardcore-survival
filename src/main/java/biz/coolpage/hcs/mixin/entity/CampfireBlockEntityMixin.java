package biz.coolpage.hcs.mixin.entity;

import biz.coolpage.hcs.Reg;
import biz.coolpage.hcs.item.HotWaterBottleItem;
import biz.coolpage.hcs.status.accessor.ICampfireBlockEntity;
import biz.coolpage.hcs.util.CombustionHelper;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CampfireBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.CampfireBlockEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldEvents;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@SuppressWarnings("AddedMixinMembersNamePattern")
@Mixin(CampfireBlockEntity.class)
public abstract class CampfireBlockEntityMixin extends BlockEntity implements ICampfireBlockEntity {
    @Unique
    private long extinguishTime = Long.MAX_VALUE;

    @Unique
    private static final String EXTINGUISH_TIME_NBT = "hcs_extinguish_nbt";

    public CampfireBlockEntityMixin(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    @Unique
    public long getBurnOutTime() {
        return this.extinguishTime;
    }

    @Unique
    public void resetBurnOutTime() {
        if (this.world != null)
            this.extinguishTime = this.world.getTime() + CombustionHelper.CAMPFIRE_MAX_BURNING_LENGTH;
    }

    @Inject(method = "litServerTick", at = @At("HEAD"), cancellable = true)
    private static void litServerTickInjected1(@NotNull World world, BlockPos pos, @NotNull BlockState state, CampfireBlockEntity campfire, CallbackInfo ci) {
        if (state.isOf(Reg.BURNT_CAMPFIRE_BLOCK)) ci.cancel();
        if (state.isOf(Blocks.SOUL_CAMPFIRE)) {
            world.setBlockState(pos, state.with(CombustionHelper.COMBUST_LUMINANCE, 15));
            ci.cancel();
        } else {
            boolean hasFlame = !state.isOf(Reg.SMOLDERING_CAMPFIRE_BLOCK);
            if (hasFlame && world.getRandom().nextFloat() < 0.001F) // Lit inflammable blocks nearby
                Fluids.LAVA.onRandomTick(world, pos, Fluids.LAVA.getDefaultState(), world.getRandom());
            long time = world.getTime(), burnOutTime = ((ICampfireBlockEntity) campfire).getBurnOutTime();
            if (burnOutTime < time) {
                CampfireBlock.extinguish(null, world, pos, state);
                // "setBlockState" causes automatic cooking items drop (See CampfireBlock::onStateReplaced)
                world.setBlockState(pos,
                        (hasFlame ? Reg.SMOLDERING_CAMPFIRE_BLOCK : Reg.BURNT_CAMPFIRE_BLOCK)
                                .getDefaultState()
                                .with(CampfireBlock.FACING, state.get(CampfireBlock.FACING))
                                .with(CampfireBlock.WATERLOGGED, state.get(CampfireBlock.WATERLOGGED)));
                world.syncWorldEvent(null, WorldEvents.FIRE_EXTINGUISHED, pos, 0);
            } else {
                if (burnOutTime == Long.MAX_VALUE) ((ICampfireBlockEntity) campfire).resetBurnOutTime();
                else if (hasFlame)
                    world.setBlockState(pos, CombustionHelper.updateCombustionState(state, (int) (burnOutTime - time)));
            }
        }
    }

    @Inject(method = "litServerTick", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/ItemScatterer;spawn(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V"), locals = LocalCapture.CAPTURE_FAILSOFT)
    private static void litServerTickInjected2(World world, BlockPos pos, @NotNull BlockState state, CampfireBlockEntity campfire, CallbackInfo ci, boolean bl, int i, ItemStack itemStack, Inventory inventory, ItemStack itemStack2) {
        if (state.isOf(Blocks.SOUL_CAMPFIRE) && itemStack2.isOf(Reg.HOT_WATER_BOTTLE))
            HotWaterBottleItem.setStatus(itemStack2, -1); // Soul campfire will cool temp down for hot water bag
    }

    @Inject(method = "readNbt", at = @At("HEAD"))
    public void readNbt(@NotNull NbtCompound nbt, CallbackInfo ci) {
        if (nbt.contains(EXTINGUISH_TIME_NBT, NbtElement.LONG_TYPE))
            this.extinguishTime = nbt.getLong(EXTINGUISH_TIME_NBT);
    }

    @Inject(method = "writeNbt", at = @At("HEAD"))
    protected void writeNbt(@NotNull NbtCompound nbt, CallbackInfo ci) {
        nbt.putLong(EXTINGUISH_TIME_NBT, this.extinguishTime);
    }
}
