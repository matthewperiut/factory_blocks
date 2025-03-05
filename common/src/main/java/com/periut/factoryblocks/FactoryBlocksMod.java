package com.periut.factoryblocks;

import com.periut.factoryblocks.block.RegisterBlocks;
import com.periut.factoryblocks.optional.ChiselSupport;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FactoryBlocksMod
{
	public static final String MODID = "factory_blocks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	public static void init()
	{
		RegisterBlocks.register();
	}

	public static void post(boolean chisel) {
		if (chisel) {
			for (RegistrySupplier<Item> supplier : RegisterBlocks.itemSuppliers) {
				ChiselSupport.addFactoryBlockToChisel(supplier.get().arch$registryName());
			}
		}
	}
}
