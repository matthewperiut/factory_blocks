package net.slaincow.factoryblocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;

import static net.slaincow.factoryblocks.FactorySound.FACTORY_BLOCKS;

public class BaseFactoryBlock extends Block {
    public BaseFactoryBlock(Settings settings) {
        super(settings.mapColor(MapColor.IRON_GRAY).instrument(Instrument.IRON_XYLOPHONE).requiresTool().strength(2).sounds(FACTORY_BLOCKS));
    }
}
