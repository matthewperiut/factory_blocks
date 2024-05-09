package com.slaincow.factoryblocks.block.fan;

import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class MediumFanBlock extends BaseFanBlock
{
    public MediumFanBlock(Settings settings)
    {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext ctx) {
        Direction dir = state.get(Properties.HORIZONTAL_FACING);
        switch(dir) {
            case NORTH:
            case SOUTH:
                return VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 2.0f, 2.0f, 1.0f);
            case EAST:
            case WEST:
                return VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 1.0f, 2.0f, 2.0f);
            default:
                return VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 1.0f, 2.0f, 2.0f);
        }
    }
}
