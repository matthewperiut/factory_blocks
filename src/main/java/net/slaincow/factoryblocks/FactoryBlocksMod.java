package net.slaincow.factoryblocks;

import net.fabricmc.api.ModInitializer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.slaincow.factoryblocks.block.RegisterBlocks;

public class FactoryBlocksMod implements ModInitializer {
	public static final String MODID = "factory_blocks";

	@Override
	public void onInitialize() {
		RegisterBlocks.register();
		Registry.register(Registries.SOUND_EVENT, FactorySound.METAL_BLOCK_SOUND, FactorySound.METAL_SOUND_EVENT);
	}
}
