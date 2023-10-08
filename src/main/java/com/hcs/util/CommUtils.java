package com.hcs.util;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.render.*;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.text.DecimalFormat;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class CommUtils {
    public static String customNumFormat(String pattern, double value) {
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        return decimalFormat.format(value);
    }

    public static String customNumFormat(String pattern, float value) {
        return customNumFormat(pattern, (double) value);
    }

    public static String retain5(double val) {
        // Retain five decimal places
        return String.format("%.5f", val);
    }

    @Deprecated
    public static void renderGuiQuad(@NotNull BufferBuilder buffer, int x, int y, int width, int height, int red, int green, int blue, int alpha, boolean needShader) {
        RenderSystem.setShader(GameRenderer::getPositionColorProgram);
        buffer.begin(VertexFormat.DrawMode.QUADS, VertexFormats.POSITION_COLOR);
        buffer.vertex(x, y, 0.0).color(red, green, blue, alpha).next();
        buffer.vertex(x, y + height, 0.0).color(red, green, blue, alpha).next();
        buffer.vertex(x + width, y + height, 0.0).color(red, green, blue, alpha).next();
        buffer.vertex(x + width, y, 0.0).color(red, green, blue, alpha).next();
        if (needShader) BufferRenderer.drawWithGlobalProgram(buffer.end());
        else BufferRenderer.drawWithGlobalProgram(buffer.end()); //never use it !!
    }

    @Contract(pure = true)
    public static <T> @NotNull T optElse(@Nullable T instance, @NotNull T defaultVal) {
        return Optional.ofNullable(instance).orElse(defaultVal);
    }

    //Optional class cannot directly do these:
    @Deprecated
    @Contract(pure = true)
    public static <T> void applyNullable(@Nullable T instance, @NotNull Consumer<T> consumer) {
        if (instance != null) consumer.accept(instance);
    }

    @Contract(pure = true)
    public static <T, R> @NotNull R applyNullable(@Nullable T instance, @NotNull Function<T, R> function, @NotNull R defaultVal) {
        if (instance == null) return defaultVal;
        return function.apply(instance);
    }

}
