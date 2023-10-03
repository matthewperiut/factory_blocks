package net.slaincow.factoryblocks.block;

import net.minecraft.block.Block;
import static net.slaincow.factoryblocks.FactorySound.FACTORY_BLOCKS;

public class BaseFactoryBlock extends Block {
    public BaseFactoryBlock(Settings settings) {
        super(settings.strength(2).sounds(FACTORY_BLOCKS));
    }
}
