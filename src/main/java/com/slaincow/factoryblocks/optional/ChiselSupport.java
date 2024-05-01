package com.slaincow.factoryblocks.optional;

import com.matthewperiut.chisel.block.ChiselGroupLookup;
import com.slaincow.factoryblocks.TooltipBlockItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;

import static com.matthewperiut.chisel.Chisel.CHISEL_GROUP;

public class ChiselSupport {
    public static void addFactoryBlockToChisel(Block block, String nameID, boolean include, Identifier blockID, TooltipBlockItem BlockItem)
    {
        ItemGroupEvents.modifyEntriesEvent(CHISEL_GROUP).register(content -> {
            content.add(BlockItem);
        });
        if (include)
            ChiselGroupLookup.addItemToGroup("factory", blockID);
    }
}
