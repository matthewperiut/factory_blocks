package com.slaincow.factoryblocks;

import com.slaincow.factoryblocks.block.RegisterBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FactoryBlocksMod implements ModInitializer
{
	public static final String MODID = "factory_blocks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
	public static boolean ChiselDetected = false;

	@Override
	public void onInitialize()
	{
		if (FabricLoader.getInstance().isModLoaded("chisel")) {
			ChiselDetected = true;
		}
		RegisterBlocks.register();
		Registry.register(Registries.SOUND_EVENT,FactorySound.METAL_BLOCK_SOUND,FactorySound.METAL_SOUND_EVENT);
	}
}
