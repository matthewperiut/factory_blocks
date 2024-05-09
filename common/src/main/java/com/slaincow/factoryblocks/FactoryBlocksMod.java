package com.slaincow.factoryblocks;

import com.slaincow.factoryblocks.block.RegisterBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FactoryBlocksMod
{
	public static final String MODID = "factory_blocks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
	public static boolean ChiselDetected = false;

	public static void init(boolean chisel)
	{
		ChiselDetected = chisel;
		RegisterBlocks.register();
	}
}
