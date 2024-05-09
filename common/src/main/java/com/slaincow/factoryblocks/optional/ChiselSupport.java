package com.slaincow.factoryblocks.optional;

import com.matthewperiut.chisel.block.ChiselGroupLookup;
import com.slaincow.factoryblocks.TooltipBlockItem;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;

public class ChiselSupport {
    public static void addFactoryBlockToChisel(Identifier blockID)
    {
        try {
            ChiselGroupLookup.addItemToGroup("factory", blockID);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
