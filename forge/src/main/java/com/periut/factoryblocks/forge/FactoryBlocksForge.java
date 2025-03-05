package com.periut.factoryblocks.forge;

import com.periut.factoryblocks.FactoryBlocksMod;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(FactoryBlocksMod.MODID)
public class FactoryBlocksForge {
    public FactoryBlocksForge() {
        // Submit our event bus to let architectury register our content on the right time
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        EventBuses.registerModEventBus(FactoryBlocksMod.MODID, FMLJavaModLoadingContext.get().getModEventBus());
        FactoryBlocksMod.init();
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        FactoryBlocksMod.post(ModList.get().isLoaded("chisel"));
    }
}
