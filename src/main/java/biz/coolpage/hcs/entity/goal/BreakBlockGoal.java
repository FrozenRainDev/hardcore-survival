package biz.coolpage.hcs.entity.goal;

import biz.coolpage.hcs.config.HcsDifficulty;
import biz.coolpage.hcs.util.DigRestrictHelper;
import biz.coolpage.hcs.util.EntityHelper;
import biz.coolpage.hcs.util.WorldHelper;
import net.minecraft.block.*;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.NavigationConditions;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GameRules;
import net.minecraft.world.WorldEvents;
import org.jetbrains.annotations.NotNull;

public class BreakBlockGoal extends Goal {
    protected final MobEntity mob;
    private LivingEntity hcsLastAttacker;
    protected BlockPos breakPos = BlockPos.ORIGIN;
    protected BlockState breakState = Blocks.AIR.getDefaultState();
    protected boolean shouldStop;
    private float offsetX, offsetZ;
    protected int breakProgress = -1, prevBreakStage = -1;

    public BreakBlockGoal(MobEntity mob) {
        this.mob = mob;
        if (!NavigationConditions.hasMobNavigation(mob)) {
            throw new IllegalArgumentException("Unsupported mob type for BreakBlockGoal");
        }
    }

    @Override
    public boolean canStart() {
        // Choose a block to break
        LivingEntity target = this.mob.getTarget();
        if (target == null || !this.mob.getWorld().getGameRules().getBoolean(GameRules.DO_MOB_GRIEFING)) return false;
        for (double[] findPos : EntityHelper.FIND_NEAREST_BLOCKS) {
            // Should not dig upward when not above target
            if (findPos[1] == -1 && this.mob.getY() <= target.getY()) continue;
            // Should not dig downward when not under target
            if (findPos[1] == 2 && this.mob.getY() >= target.getY()) continue;
            // Choose a pos to break
            BlockPos pendingBreakPos = new BlockPos((int) (this.mob.getX() + findPos[0]), (int) (this.mob.getY() + findPos[1]), (int) (this.mob.getZ() + findPos[2]));
            // Should not break the block behind itself
            BlockPos backPos = EntityHelper.getPosFacing(this.mob, true);
            if (pendingBreakPos.getX() == backPos.getX() && pendingBreakPos.getZ() == backPos.getZ()) continue;
            BlockState pendingBreakState = this.mob.getWorld().getBlockState(pendingBreakPos);
            // Avoid redundant destroying if material == Material.REPLACEABLE_PLANT || material == Material.PLANT
            if (pendingBreakState.isReplaceable() /*|| pendingBreakState.getSoundGroup().equals(BlockSoundGroup.GRASS)*/)
                continue;
            // Determine whether to start
            if (canBreakBlock(pendingBreakState) && this.mob.getNavigation().isIdle()) {
//                System.out.println("Breaking block " + pendingBreakPos);
                this.breakPos = pendingBreakPos;
                this.breakState = pendingBreakState;
                return true;
            }
        }
        return false;
    }

    @Override
    public void start() {
//        System.out.println("Starting BreakBlockGoal");
        this.shouldStop = false;
        this.offsetX = (float) ((double) this.breakPos.getX() + 0.5 - this.mob.getX());
        this.offsetZ = (float) ((double) this.breakPos.getZ() + 0.5 - this.mob.getZ());
        this.breakProgress = 0;
    }

    @Override
    public void stop() {
        super.stop();
        this.mob.getWorld().setBlockBreakingInfo(this.mob.getId(), this.breakPos, -1);
    }

    @Override
    public boolean shouldRunEveryTick() {
        return true;
    }


    @Override
    public boolean shouldContinue() {
//         System.out.println("state=" + this.breakState + "\t!shouldStop=" + !this.shouldStop + "\t breakProgress=" + this.breakProgress + "\t max=" + this.getMaxProgress() + "\t canBreak=" + canBreakBlock(this.breakState) + "\t withinDistance=" + this.breakPos.isWithinDistance(this.mob.getPos(), 5) + "\tTimeSinceLastAttack=" + this.mob.getDamageTracker().getTimeSinceLastAttack());
        if (this.mob.getAttacker() != null) this.hcsLastAttacker = this.mob.getLastAttacker();
        if (this.hcsLastAttacker != null && this.hcsLastAttacker.isDead()) this.hcsLastAttacker = null;
        return !this.shouldStop && this.breakProgress <= this.getMaxProgress() && canBreakBlock(this.breakState) && this.breakPos.isWithinDistance(this.mob.getPos(), 4) && (this.hcsLastAttacker == null /*wasRecentlyAttacked*/ || this.mob.getDamageTracker().getTimeSinceLastAttack() > 20);
    }

    public int getMaxProgress() {
        return (int) (HcsDifficulty.chooseVal(this.mob.getWorld(), 2000.0F, 1000.0F, 500.0F) * this.breakState.getBlock().getHardness() * ((this.mob.getMainHandStack().getItem() instanceof ShovelItem) ? 0.2F : 1.0F));
    }

    public boolean canBreakBlock(@NotNull BlockState state) {
        return !state.isAir() && (state.isIn(BlockTags.WOODEN_DOORS) || (DigRestrictHelper.canBreak(this.mob.getMainHandStack().getItem(), state) && (state.getBlock().getHardness() < Blocks.STONE.getHardness() || this.mob.getMainHandStack().getItem() instanceof PickaxeItem)) /*&& !state.getBlock().getTranslationKey().contains("brick")*/) || state.isIn(BlockTags.SHOVEL_MINEABLE);
    }

    @Override
    public void tick() {
        ++this.breakProgress;
        if (this.offsetX * (float) ((double) this.breakPos.getX() + 0.5 - this.mob.getX()) + this.offsetZ * (float) ((double) this.breakPos.getZ() + 0.5 - this.mob.getZ()) < 0.0f)
            this.shouldStop = true;
        if (this.breakProgress % 40 == 0 && !this.mob.handSwinging) this.mob.swingHand(this.mob.getActiveHand());
        int breakStage = (int) ((float) this.breakProgress / (float) this.getMaxProgress() * 10.0f);
        if (breakStage != this.prevBreakStage) {
            this.mob.getWorld().setBlockBreakingInfo(this.mob.getId(), this.breakPos, breakStage);
            this.mob.getWorld().syncWorldEvent(WorldEvents.BLOCK_BROKEN, this.breakPos, Block.getRawIdFromState(this.breakState));
            this.prevBreakStage = breakStage;
        }
        if (this.breakProgress >= this.getMaxProgress()) {
            this.mob.getWorld().breakBlock(this.breakPos, true, this.mob);
            WorldHelper.checkBlockGravity(this.mob.getWorld(), this.breakPos);
        }
    }
}