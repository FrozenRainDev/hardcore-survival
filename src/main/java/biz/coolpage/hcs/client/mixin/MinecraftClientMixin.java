package biz.coolpage.hcs.client.mixin;

import biz.coolpage.hcs.Reg;
import biz.coolpage.hcs.client.ClientC2S;
import biz.coolpage.hcs.status.accessor.StatAccessor;
import biz.coolpage.hcs.util.EntityHelper;
import biz.coolpage.hcs.util.WorldHelper;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.Mouse;
import net.minecraft.client.WindowEventHandler;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.thread.ReentrantThreadExecutor;
import net.minecraft.world.RaycastContext;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value = EnvType.CLIENT)
@Mixin(MinecraftClient.class)
public abstract class MinecraftClientMixin extends ReentrantThreadExecutor<Runnable> implements WindowEventHandler {
    @Shadow
    public HitResult crosshairTarget;
    @Shadow
    public ClientPlayerEntity player;
    @Shadow
    public ClientPlayerInteractionManager interactionManager;

    @Shadow
    @Nullable
    public ClientWorld world;
    @Shadow
    public Screen currentScreen;
    @Shadow
    @Final
    public Mouse mouse;

    public MinecraftClientMixin(String string) {
        super(string);
    }

    //    todo cannot find method handleBlockBreaking in PCL launcher
    @ModifyArg(method = "handleInputEvents", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/MinecraftClient;handleBlockBreaking(Z)V"), index = 0)
    private boolean handleInputEvents(boolean breaking) {
        return breaking || (((StatAccessor) this.player).getStatusManager().lockDestroying() && this.currentScreen == null && this.mouse.isCursorLocked());
    }

//    @Inject(method = "handleBlockBreaking", at = @At("TAIL"))
//    private void handleBlockBreaking(boolean breaking, CallbackInfo ci) {
//        boolean hcsBreaking = (((StatAccessor) this.player).getStatusManager().lockDestroying() && this.currentScreen == null && this.mouse.isCursorLocked());
//        if (!breaking && hcsBreaking) this.handleBlockBreaking(true);
//    }

    @SuppressWarnings("CancellableInjectionUsage")
    @Inject(method = "doAttack", at = @At("HEAD"), cancellable = true)
    private void doAttack(CallbackInfoReturnable<Boolean> cir) {
        if (crosshairTarget != null && player != null) {
            if (crosshairTarget.getType() == HitResult.Type.ENTITY) {
                /*
                Default reach distance:
                block or interact with entity: 2
                attack entity: 2 - 0.5 = 1.5
                */
                if (crosshairTarget.getPos().distanceTo(player.getEyePos()) + (EntityHelper.IS_HOLDING_BLOCK.test(player.getMainHandStack(), player.getOffHandStack()) ? EntityHelper.HOLDING_BLOCK_REACHING_RANGE_ADDITION : 0.0F) + 0.5F > interactionManager.getReachDistance()) {
                    player.swingHand(Hand.MAIN_HAND);
                    cir.cancel();
                }
            }
        }
    }

    @Inject(method = "doItemUse", at = @At("HEAD"), cancellable = true)
    private void doItemUse(CallbackInfo ci) {
        // player.getActiveItem() is invalid here! Always return air
        if (world == null || player == null) return;
        BlockHitResult customHitResult = EntityHelper.rayCast(world, player, RaycastContext.FluidHandling.SOURCE_ONLY, 2.5);
        BlockPos pos = customHitResult.getBlockPos();
        FluidState state = world.getFluidState(pos);
        if (state.isIn(FluidTags.WATER))
            ClientC2S.writeC2SPacketOnDrinkWater(player, pos.getX(), pos.getY(), pos.getZ());
        else if (state.isIn(FluidTags.LAVA)) {
            ItemStack s1 = player.getMainHandStack(), s2 = player.getOffHandStack();
            if (!s1.isEmpty()) s2 = Items.AIR.getDefaultStack();
            boolean b1 = s1.isOf(Reg.UNLIT_TORCH_ITEM) || s1.isOf(Reg.CRUDE_TORCH_ITEM);
            boolean b2 = s2.isOf(Reg.UNLIT_TORCH_ITEM) || s2.isOf(Reg.CRUDE_TORCH_ITEM);
            if (b1 || b2) {
                ClientC2S.writeC2SPacketOnLitHoldingTorchInLava(player, b1 ? 1 : 2);
                ci.cancel();
            }
        }
    }

    @Inject(method = "tick", at = @At("HEAD"))
    public void tick(CallbackInfo ci) {
        WorldHelper.updateClientWorldAndMainPlayer(this.world, this.player);
    }
}
