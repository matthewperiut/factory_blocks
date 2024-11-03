package com.slaincow.factoryblocks.neoforge;

import com.slaincow.factoryblocks.FactoryBlocksMod;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod(FactoryBlocksMod.MODID)
public class FactoryBlocksNeoforge
{
    public FactoryBlocksNeoforge(IEventBus modEventBus)
    {
        FactoryBlocksMod.init();
        modEventBus.addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        FactoryBlocksMod.post(ModList.get().isLoaded("chisel"));
    }
}