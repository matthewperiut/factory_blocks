package com.slaincow.factoryblocks.forge;

import com.slaincow.factoryblocks.FactoryBlocksMod;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(FactoryBlocksMod.MODID)
public class FactoryBlocksForge {
    public FactoryBlocksForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(FactoryBlocksMod.MODID, FMLJavaModLoadingContext.get().getModEventBus());
        FactoryBlocksMod.init(ModList.get().isLoaded("chisel"));
    }
}
