package biz.coolpage.hcs.client.mixin.gui;

import biz.coolpage.hcs.status.HcsEffects;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.AbstractInventoryScreen;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.text.Text;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static biz.coolpage.hcs.status.HcsEffects.IS_EFFECT_NAME_VARIABLE;

@Environment(value = EnvType.CLIENT)
@Mixin(AbstractInventoryScreen.class)
public abstract class AbstractInventoryScreenMixin {
    @Unique
    private static final float ZOOM_SCALE = 0.75F;

    @Redirect(method = "drawStatusEffectDescriptions", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/DrawContext;drawTextWithShadow(Lnet/minecraft/client/font/TextRenderer;Lnet/minecraft/text/Text;III)I"))
    public int drawStatusEffectDescriptionsRedirected(DrawContext ctx, TextRenderer textRenderer, @NotNull Text text, int x, int y, int color) {
        float descale = 1 / ZOOM_SCALE;
        boolean shouldZoom = !text.getString().contains(":");
        if (shouldZoom) {
            ctx.getMatrices().scale(ZOOM_SCALE, ZOOM_SCALE, ZOOM_SCALE);
            x *= descale;
            y *= descale; // TODO check var type
        }
        int result = ctx.drawText(textRenderer, text, x, y, color, true); // TODO check T/F
        if (shouldZoom) ctx.getMatrices().scale(descale, descale, descale);
        return result;
    }

    @Inject(method = "getStatusEffectDescription", at = @At("HEAD"), cancellable = true)
    private void getStatusEffectDescription(@NotNull StatusEffectInstance statusEffect, CallbackInfoReturnable<Text> cir) {
        if (IS_EFFECT_NAME_VARIABLE.test(statusEffect.getEffectType()))
            cir.setReturnValue(Text.translatable(HcsEffects.getEffectVarName(statusEffect.getTranslationKey(), statusEffect.getAmplifier())));
    }

}
