package com.slaincow.factoryblocks;

import com.google.common.base.Supplier;
import com.slaincow.factoryblocks.block.RegisterBlocks;
import com.slaincow.factoryblocks.optional.ChiselSupport;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.slaincow.factoryblocks.block.RegisterBlocks.itemSuppliers;

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
