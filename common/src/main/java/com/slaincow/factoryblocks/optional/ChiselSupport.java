package com.slaincow.factoryblocks.optional;

import com.matthewperiut.chisel.block.ChiselGroupLookup;
import com.slaincow.factoryblocks.TooltipBlockItem;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;

public class ChiselSupport {
    public static void addFactoryBlockToChisel(Block block, String nameID, boolean include, Identifier blockID, TooltipBlockItem BlockItem)
    {
        /* todo:
        ItemGroupEvents.modifyEntriesEvent(CHISEL_GROUP).register(content -> {
            content.add(BlockItem);
        });*/
        if (include)
            ChiselGroupLookup.addItemToGroup("factory", blockID);
    }
}
