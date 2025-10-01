package com.periut.factoryblocks.platform.fabric;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

public class RegistryHelperImpl {
    public static <T extends Block> Supplier<T> registerBlock(Identifier id, RegistryKey<Block> key, Supplier<T> block) {
        T registeredBlock = Registry.register(Registries.BLOCK, id, block.get());
        return () -> registeredBlock;
    }

    public static <T extends Item> Supplier<T> registerItem(Identifier id, RegistryKey<Item> key, Supplier<T> item) {
        T registeredItem = Registry.register(Registries.ITEM, id, item.get());
        return () -> registeredItem;
    }

    public static void addToItemGroup(RegistryKey<ItemGroup> group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void initialize() {
        // Fabric doesn't require explicit initialization
    }
}
