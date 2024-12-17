package biz.coolpage.hcs.block;

import biz.coolpage.hcs.Reg;
import biz.coolpage.hcs.entity.SmolderingOrBurntCampfireBlockEntity;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class BurntCampfireBlock extends CampfireBlock {
    public BurntCampfireBlock() {
        super(false, 0, Settings.copy(Blocks.CAMPFIRE).luminance(Blocks.createLightLevelFromLitBlockState(0)));
        this.setDefaultState(this.stateManager.getDefaultState().with(LIT, false).with(SIGNAL_FIRE, false).with(WATERLOGGED, false).with(FACING, Direction.NORTH));
    }

    @Override
    protected Block asBlock() {
        return Reg.BURNT_CAMPFIRE_BLOCK;
    }

    @Override
    public Item asItem() {
        return Reg.BURNT_CAMPFIRE;
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new SmolderingOrBurntCampfireBlockEntity(pos, state);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        return ActionResult.FAIL;
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        // Do nothing
    }

}
