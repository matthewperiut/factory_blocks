package net.slaincow.factoryblocks.block.fan;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class RedstoneFanBlock extends BaseFanBlock
{
    public static final BooleanProperty ON = BooleanProperty.of("on");

    public RedstoneFanBlock(Settings settings)
    {
        super(settings);
        setDefaultState(this.stateManager.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.EAST).with(ON, false));
    }

    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify)
    {
        if (!world.isClient)
        {
            if (world.isReceivingRedstonePower(pos))
            {
                world.setBlockState(pos, state.with(ON, true));
            }
            else
            {
                world.setBlockState(pos, state.with(ON, false));
            }
        }
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(Properties.HORIZONTAL_FACING);
        builder.add(ON);
    }
}
