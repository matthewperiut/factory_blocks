package net.slaincow.factoryblocks.block.fan;

import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class MediumFanBlock extends BaseFanBlock {
    private static final VoxelShape NS_SHAPE = VoxelShapes.cuboid(0, 0, 0, 2, 2, 1);
    private static final VoxelShape EW_SHAPE = VoxelShapes.cuboid(0, 0, 0, 1, 2, 2);
    private static final VoxelShape UD_SHAPE = VoxelShapes.cuboid(0, 0, 0, 1, 2, 2);

    public MediumFanBlock(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext ctx) {
        return switch(state.get(Properties.HORIZONTAL_FACING)) {
            case NORTH, SOUTH -> NS_SHAPE;
            case EAST, WEST -> EW_SHAPE;
            default -> UD_SHAPE;
        };
    }
}
