package com.periut.factoryblocks.block;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.periut.factoryblocks.TooltipBlockItem;
import com.periut.factoryblocks.block.fan.BaseFanBlock;
import com.periut.factoryblocks.block.fan.MediumFanBlock;
import com.periut.factoryblocks.block.fan.RedstoneFanBlock;
import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrarManager;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.ArrayList;

import static com.periut.factoryblocks.FactoryBlocksMod.MODID;

public class RegisterBlocks
{
    public static final Supplier<RegistrarManager> MANAGER = Suppliers.memoize(() -> RegistrarManager.get(MODID));

    enum Type {
        base,
        baseFan,
        redFan,
        mediumFan
    }

    private static void addFactoryBlock(String nameID, Type type)
    {
        addFactoryBlock(nameID, type,true);
    }

    public static ArrayList<RegistrySupplier<Item>> itemSuppliers = new ArrayList<>();

    private static void addFactoryBlock(String nameID, Type type, boolean include)
    {
        Identifier blockID = Identifier.of(MODID, nameID);
        RegistryKey<Block> blockKey = RegistryKey.of(RegistryKeys.BLOCK, blockID);
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, blockID);

        Registrar<Block> blocks = MANAGER.get().get(Registries.BLOCK);
        RegistrySupplier<Block> blockSupplier;

        switch (type) {
            default -> blockSupplier = blocks.register(blockID, () -> new BaseFactoryBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).registryKey(blockKey)));
            case baseFan -> blockSupplier = blocks.register(blockID, () -> new BaseFanBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).registryKey(blockKey)));
            case redFan -> blockSupplier = blocks.register(blockID, () -> new RedstoneFanBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).registryKey(blockKey)));
            case mediumFan -> blockSupplier = blocks.register(blockID, () -> new MediumFanBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).registryKey(blockKey)));
        }

        Registrar<Item> items = MANAGER.get().get(Registries.ITEM);
        itemSuppliers.add(items.register(blockID, () -> new TooltipBlockItem(blockSupplier.get(), new Item.Settings().arch$tab(ItemGroups.BUILDING_BLOCKS).registryKey(itemKey), nameID + ".tooltip")));
    }

    public static void register()
    {
        addFactoryBlock("factory", Type.base);
        addFactoryBlock("rust", Type.base);
        addFactoryBlock("vrust", Type.base);
        addFactoryBlock("srust", Type.base);
        addFactoryBlock("wireframe", Type.base);
        addFactoryBlock("pwireframe", Type.base);
        addFactoryBlock("hazard", Type.base);
        addFactoryBlock("hazardo", Type.base);
        addFactoryBlock("circuit", Type.base);
        addFactoryBlock("metalbox", Type.base);
        addFactoryBlock("gcircuit", Type.base);
        addFactoryBlock("pgcircuit", Type.base);
        addFactoryBlock("grinder", Type.base);
        addFactoryBlock("old_vents", Type.base);
        addFactoryBlock("rust_plates", Type.base);
        addFactoryBlock("bcircuit", Type.base);
        addFactoryBlock("ice", Type.base);
        addFactoryBlock("mosaic", Type.base);
        addFactoryBlock("bwireframe", Type.base);
        addFactoryBlock("rusty_scaffold", Type.base);
        addFactoryBlock("caution", Type.base);
        addFactoryBlock("large_pipes", Type.base);
        addFactoryBlock("small_pipes", Type.base);
        addFactoryBlock("vent", Type.base);
        addFactoryBlock("gvent", Type.base);
        addFactoryBlock("insulation", Type.base);
        addFactoryBlock("gears", Type.base);
        addFactoryBlock("cables", Type.base);
        addFactoryBlock("rust_bplates", Type.base);
        addFactoryBlock("grate", Type.base);
        addFactoryBlock("rgrate", Type.base);
        addFactoryBlock("hex", Type.base);
        addFactoryBlock("wgpanel", Type.base);
        addFactoryBlock("wopanel", Type.base);
        addFactoryBlock("sturdy", Type.base);
        addFactoryBlock("megacell", Type.base);
        addFactoryBlock("exhaust", Type.base);
        addFactoryBlock("engineer", Type.base);
        addFactoryBlock("scaffold", Type.base);
        addFactoryBlock("piping", Type.base);
        addFactoryBlock("large_plating", Type.base);
        addFactoryBlock("fan_side", Type.base);

        addFactoryBlock("fan_on", Type.baseFan);
        addFactoryBlock("fan_four_on", Type.baseFan);
        addFactoryBlock("fan_malfunction_on", Type.baseFan);

        addFactoryBlock("fan", Type.redFan);
        addFactoryBlock("fan_four", Type.redFan);
        addFactoryBlock("fan_malfunction", Type.redFan);

        addFactoryBlock("medium_fan", Type.mediumFan, false);
    }
}
