package com.slaincow.factoryblocks.fabric;

import com.slaincow.factoryblocks.FactoryBlocksMod;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;

public class FactoryBlocksFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        FactoryBlocksMod.init(FabricLoader.getInstance().isModLoaded("chisel"));
    }
}
