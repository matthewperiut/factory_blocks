package com.periut.factoryblocks.neoforge;

import com.periut.factoryblocks.FactoryBlocksMod;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod(FactoryBlocksMod.MODID)
public class FactoryBlocksNeoforge
{
    public FactoryBlocksNeoforge(IEventBus modEventBus)
    {
        // Submit our event bus to let architectury register our content on the right time
        FactoryBlocksMod.init();
        modEventBus.addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        FactoryBlocksMod.post(ModList.get().isLoaded("chisel"));
    }
}