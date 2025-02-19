package biz.coolpage.hcs.status;

import biz.coolpage.hcs.event.UseBlockEvent;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ServerC2S {
    public static final Identifier DRINK_WATER_WITH_BARE_HAND = new Identifier("hcs", "c2s_drink_water_with_bare_hand");
    public static final Identifier ON_PLAYER_ENTER = new Identifier("hcs", "c2s_on_player_enter");
    public static final Identifier LIT_HOLDING_TORCH_IN_LAVA = new Identifier("hcs", "c2s_lit_holding_torch_lava");

    public static void init() {
        ServerPlayNetworking.registerGlobalReceiver(DRINK_WATER_WITH_BARE_HAND, (server, player, handler, buf, responseSender) -> {
            int[] bufArr = buf.readIntArray();
            server.execute(() -> {
                if (player != null && player.getWorld() != null && player.getWorld().getEntityById(bufArr[0]) != null) {
                    Entity targetPlayer = player.getWorld().getEntityById(bufArr[0]);
                    if (targetPlayer instanceof ServerPlayerEntity serverPlayerEntity)
                        UseBlockEvent.onDrinkWaterWithBareHand(serverPlayerEntity, new BlockPos(bufArr[1], bufArr[2], bufArr[3]));
                }
            });
        });

        ServerPlayNetworking.registerGlobalReceiver(ON_PLAYER_ENTER, (server, player, handler, buf, responseSender) -> {
            int[] bufArr = buf.readIntArray();
            server.execute(() -> {
                // Debug when player effects reload
                if (player != null && player.getWorld() != null && player.getWorld().getEntityById(bufArr[0]) != null) {
                    Entity targetPlayer = player.getWorld().getEntityById(bufArr[0]);
                    if (targetPlayer instanceof ServerPlayerEntity serverPlayerEntity) {
                        Iterator<StatusEffect> iterator = getStatusEffectIterator(serverPlayerEntity);
                        while (iterator.hasNext()) {
                            // Avoid java.util.ConcurrentModificationException: null
                            StatusEffect next = iterator.next();
                            serverPlayerEntity.removeStatusEffect(next);
                        }
                    }
                }
            });
        });

        ServerPlayNetworking.registerGlobalReceiver(LIT_HOLDING_TORCH_IN_LAVA, (server, player, handler, buf, responseSender) -> {
            int[] bufArr = buf.readIntArray();
            server.execute(() -> {
                if (player != null && player.getWorld() != null && player.getWorld().getEntityById(bufArr[0]) != null) {
                    Entity targetPlayer = player.getWorld().getEntityById(bufArr[0]);
                    if (targetPlayer instanceof ServerPlayerEntity sp) {
                        ItemStack stack = bufArr[1] == 1 ? sp.getMainHandStack() : sp.getOffHandStack();
                        stack.decrement(1);
                        sp.getWorld().playSound(null, player.getBlockPos(), SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.BLOCKS);
                        sp.getWorld().addParticle(ParticleTypes.LARGE_SMOKE, sp.getX(), sp.getY(), sp.getZ(), 5, 0.0, 0.0/*, 0.0, 0.3*/);
                    }
                }
            });
        });
    }

    private static @NotNull Iterator<StatusEffect> getStatusEffectIterator(@NotNull ServerPlayerEntity serverPlayerEntity) {
        List<StatusEffect> list = new ArrayList<>();
        for (StatusEffectInstance effect : serverPlayerEntity.getStatusEffects()) {
            StatusEffect type = effect.getEffectType();
            if (type.getTranslationKey().contains("effect.hcs.") && type.getCategory() == StatusEffectCategory.HARMFUL)
                list.add(type);
        }
        return list.iterator();
    }
}
