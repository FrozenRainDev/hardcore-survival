package com.hcs.mixin.client;

import com.hcs.misc.HcsEffects;
import com.hcs.misc.accessor.StatAccessor;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.*;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.*;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value = EnvType.CLIENT)
@Mixin(WorldRenderer.class)
public abstract class WorldRendererMixin {
    protected WorldRendererMixin(BufferBuilderStorage bufferBuilders) {
        this.bufferBuilders = bufferBuilders;
    }

    @Shadow
    protected abstract void renderEntity(Entity entity, double cameraX, double cameraY, double cameraZ, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers);

    @Mutable
    @Shadow
    @Final
    private final BufferBuilderStorage bufferBuilders;

    @Shadow
    @Final
    private MinecraftClient client;
    Entity halluEntity;

    @Inject(method = "render", at = @At("HEAD"))
    public void render(MatrixStack matrices, float tickDelta, long limitTime, boolean renderBlockOutline, Camera camera, GameRenderer gameRenderer, LightmapTextureManager lightmapTextureManager, Matrix4f positionMatrix, CallbackInfo ci) {
        if (this.client.world != null && this.client.player != null && this.client.player.hasStatusEffect(HcsEffects.INSANITY) && ((StatAccessor) this.client.player).getSanityManager().get() < 0.15F) {
            double dist;
            if (this.halluEntity == null || (dist = this.client.player.getPos().distanceTo(halluEntity == null ? Vec3d.ZERO : halluEntity.getPos())) > 16 || dist < 6) {
                Entity[] entities = {new BlazeEntity(EntityType.BLAZE, this.client.world), new EndermanEntity(EntityType.ENDERMAN, this.client.world),new RavagerEntity(EntityType.RAVAGER, this.client.world), new SpiderEntity(EntityType.SPIDER, this.client.world), new VindicatorEntity(EntityType.VINDICATOR, this.client.world), new WardenEntity(EntityType.WARDEN, this.client.world), new ZombieEntity(EntityType.ZOMBIE, this.client.world), new WitherSkeletonEntity(EntityType.WITHER_SKELETON, this.client.world)};
                halluEntity = entities[(int) (entities.length * Math.random())];
                halluEntity.setPos(this.client.player.getX() + MathHelper.nextInt(Random.create(), -16, 16), this.client.player.getY() + 1, MathHelper.nextInt(Random.create(), -16, 16));
                halluEntity.lastRenderX = halluEntity.getX();
                halluEntity.lastRenderY = halluEntity.getY();
                halluEntity.lastRenderZ = halluEntity.getZ();
            }
            this.renderEntity(halluEntity, camera.getPos().getX(), camera.getPos().getY(), camera.getPos().getZ(), tickDelta, matrices, this.bufferBuilders.getOutlineVertexConsumers());
        }
    }
}
