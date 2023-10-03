package net.slaincow.factoryblocks.block;

import com.matthewperiut.chisel.block.ChiselGroupLookup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.slaincow.factoryblocks.TooltipBlockItem;
import net.slaincow.factoryblocks.block.fan.BaseFanBlock;
import net.slaincow.factoryblocks.block.fan.MediumFanBlock;
import net.slaincow.factoryblocks.block.fan.RedstoneFanBlock;

import static com.matthewperiut.chisel.Chisel.CHISEL_GROUP;
import static net.slaincow.factoryblocks.FactoryBlocksMod.MODID;

public interface RegisterBlocks {
    BaseFactoryBlock FACTORY_BASE = addFactoryBlock("factory", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock RUST = addFactoryBlock("rust", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock VRUST = addFactoryBlock("vrust", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock SRUST = addFactoryBlock("srust", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock WIREFRAME = addFactoryBlock("wireframe", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock PURPLE_WIREFRAME = addFactoryBlock("pwireframe", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock HAZARD = addFactoryBlock("hazard", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock HAZARD_ORANGE = addFactoryBlock("hazardo", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock CIRCUIT = addFactoryBlock("circuit", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock METAL_BOX = addFactoryBlock("metalbox", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock GOLD_CIRCUIT = addFactoryBlock("gcircuit", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock PURPLE_GOLD_CIRCUIT = addFactoryBlock("pgcircuit", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock GRINDER = addFactoryBlock("grinder", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock OLD_VENTS = addFactoryBlock("old_vents", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock RUST_PLATES = addFactoryBlock("rust_plates", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock BLUE_CIRCUIT = addFactoryBlock("bcircuit", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock FACTORY_ICE = addFactoryBlock("ice", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock MOSAIC = addFactoryBlock("mosaic", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock BLUE_WIREFRAME = addFactoryBlock("bwireframe", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock RUSTY_SCAFFOLD = addFactoryBlock("rusty_scaffold", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock CAUTION = addFactoryBlock("caution", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock LARGE_PIPES = addFactoryBlock("large_pipes", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock SMALL_PIPES = addFactoryBlock("small_pipes", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock VENT = addFactoryBlock("vent", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock GVENT = addFactoryBlock("gvent", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock INSULATION = addFactoryBlock("insulation", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock GEARS = addFactoryBlock("gears", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock CABLES = addFactoryBlock("cables", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock RUST_BPLATES = addFactoryBlock("rust_bplates", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock GRATE = addFactoryBlock("grate", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock RUSTY_GRATE = addFactoryBlock("rgrate", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock HEX = addFactoryBlock("hex", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock WEATHERED_GREEN_PANEL = addFactoryBlock("wgpanel", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock WEATHERED_ORANGE_PANEL = addFactoryBlock("wopanel", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock STURDY = addFactoryBlock("sturdy", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock MEGACELL = addFactoryBlock("megacell", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock EXHAUST = addFactoryBlock("exhaust", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock ENGINEER = addFactoryBlock("engineer", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock SCAFFOLD = addFactoryBlock("scaffold", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock PIPING = addFactoryBlock("piping", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFactoryBlock LARGE_PLATING = addFactoryBlock("large_plating", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));

    BaseFactoryBlock SMOOTH_METAL = addFactoryBlock("fan_side", new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL)));
    RedstoneFanBlock FAN_STILL = addFactoryBlock("fan", new RedstoneFanBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFanBlock FAN_ON = addFactoryBlock("fan_on", new BaseFanBlock(FabricBlockSettings.of(Material.METAL)));
    RedstoneFanBlock FAN_FOUR = addFactoryBlock("fan_four", new RedstoneFanBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFanBlock FAN_FOUR_ON = addFactoryBlock("fan_four_on", new RedstoneFanBlock(FabricBlockSettings.of(Material.METAL)));
    RedstoneFanBlock FAN_MALFUNCTION = addFactoryBlock("fan_malfunction", new RedstoneFanBlock(FabricBlockSettings.of(Material.METAL)));
    BaseFanBlock FAN_MALFUNCTION_ON = addFactoryBlock("fan_mulfunction_on", new RedstoneFanBlock(FabricBlockSettings.of(Material.METAL)));
    MediumFanBlock MEDIUM_FAN = addFactoryBlock("fan_medium", new MediumFanBlock(FabricBlockSettings.of(Material.METAL).dynamicBounds().collidable(true)), false);

    private static <T extends Block> T addFactoryBlock(String name, T block) {
        return addFactoryBlock(name, block, true);
    }

    private static <T extends Block> T addFactoryBlock(String name, T block, boolean include) {
        Identifier id = new Identifier(MODID, name);
        Registry.register(Registries.BLOCK, id, block);
        TooltipBlockItem BlockItem = new TooltipBlockItem(block, new FabricItemSettings(), name + ".tooltip");
        ItemGroupEvents.modifyEntriesEvent(CHISEL_GROUP).register(content -> {
            content.add(BlockItem);
        });

        if (include) {
            ChiselGroupLookup.addItemToGroup("factory", id);
        } else {
            BlockItem.debugMode();
        }
        Registry.register(Registries.ITEM, id, BlockItem);
        return block;
    }

    static void register() {}
}
