package com.periut.factoryblocks.fabric;

import com.periut.factoryblocks.FactoryBlocksMod;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;

public class FactoryBlocksFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        FactoryBlocksMod.init();
        FactoryBlocksMod.post(FabricLoader.getInstance().isModLoaded("chisel"));
    }
}
