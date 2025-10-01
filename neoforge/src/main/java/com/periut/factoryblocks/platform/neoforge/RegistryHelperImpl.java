package com.periut.factoryblocks.platform.neoforge;

import com.periut.factoryblocks.FactoryBlocksMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class RegistryHelperImpl {
    private static final List<DeferredRegister<?>> REGISTERS = new ArrayList<>();
    private static final Map<RegistryKey<ItemGroup>, List<Item>> ITEM_GROUP_ENTRIES = new HashMap<>();

    private static DeferredRegister.Blocks BLOCKS = null;
    private static DeferredRegister.Items ITEMS = null;

    public static <T extends Block> Supplier<T> registerBlock(Identifier id, RegistryKey<Block> key, Supplier<T> block) {
        if (BLOCKS == null) {
            BLOCKS = DeferredRegister.createBlocks(FactoryBlocksMod.MODID);
            REGISTERS.add(BLOCKS);
        }
        return BLOCKS.register(id.getPath(), block);
    }

    public static <T extends Item> Supplier<T> registerItem(Identifier id, RegistryKey<Item> key, Supplier<T> item) {
        if (ITEMS == null) {
            ITEMS = DeferredRegister.createItems(FactoryBlocksMod.MODID);
            REGISTERS.add(ITEMS);
        }
        return ITEMS.register(id.getPath(), item);
    }

    public static void addToItemGroup(RegistryKey<ItemGroup> group, Item item) {
        // Items will be added via BuildCreativeModeTabContentsEvent in FactoryBlocksNeoforge
        ITEM_GROUP_ENTRIES.computeIfAbsent(group, k -> new ArrayList<>()).add(item);
    }

    public static void initialize() {
        // DeferredRegisters are registered in FactoryBlocksNeoforge
    }

    public static List<DeferredRegister<?>> getRegisters() {
        return REGISTERS;
    }

    public static Map<RegistryKey<ItemGroup>, List<Item>> getItemGroupEntries() {
        return ITEM_GROUP_ENTRIES;
    }
}
