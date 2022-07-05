package net.slaincow.factoryblocks;

import net.fabricmc.api.ModInitializer;
import net.slaincow.factoryblocks.block.RegisterBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FactoryBlocksMod implements ModInitializer
{
	public static final String MODID = "factory_blocks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize()
	{
		RegisterBlocks.register();
	}
}
