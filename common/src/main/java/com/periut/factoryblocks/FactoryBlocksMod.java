package com.periut.factoryblocks;

import com.periut.factoryblocks.block.RegisterBlocks;
import com.periut.factoryblocks.optional.ChiselSupport;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Supplier;

public class FactoryBlocksMod
{
	public static final String MODID = "factory_blocks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	public static void init()
	{
		RegisterBlocks.register();
	}

	public static void post(boolean chisel) {
		RegisterBlocks.registerItemGroups();
		if (chisel) {
			for (Supplier<Item> supplier : RegisterBlocks.itemSuppliers) {
				Item item = supplier.get();
				Identifier id = net.minecraft.registry.Registries.ITEM.getId(item);
				ChiselSupport.addFactoryBlockToChisel(id);
			}
		}
	}
}
