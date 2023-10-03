package net.slaincow.factoryblocks.block;

import com.matthewperiut.chisel.block.ChiselGroupLookup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
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
    BaseFactoryBlock FACTORY_BASE = addFactoryBlock("factory", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock RUST = addFactoryBlock("rust", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock VRUST = addFactoryBlock("vrust", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock SRUST = addFactoryBlock("srust", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock WIREFRAME = addFactoryBlock("wireframe", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock PURPLE_WIREFRAME = addFactoryBlock("pwireframe", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock HAZARD = addFactoryBlock("hazard", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock HAZARD_ORANGE = addFactoryBlock("hazardo", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock CIRCUIT = addFactoryBlock("circuit", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock METAL_BOX = addFactoryBlock("metalbox", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock GOLD_CIRCUIT = addFactoryBlock("gcircuit", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock PURPLE_GOLD_CIRCUIT = addFactoryBlock("pgcircuit", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock GRINDER = addFactoryBlock("grinder", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock OLD_VENTS = addFactoryBlock("old_vents", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock RUST_PLATES = addFactoryBlock("rust_plates", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock BLUE_CIRCUIT = addFactoryBlock("bcircuit", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock FACTORY_ICE = addFactoryBlock("ice", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock MOSAIC = addFactoryBlock("mosaic", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock BLUE_WIREFRAME = addFactoryBlock("bwireframe", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock RUSTY_SCAFFOLD = addFactoryBlock("rusty_scaffold", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock CAUTION = addFactoryBlock("caution", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock LARGE_PIPES = addFactoryBlock("large_pipes", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock SMALL_PIPES = addFactoryBlock("small_pipes", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock VENT = addFactoryBlock("vent", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock GVENT = addFactoryBlock("gvent", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock INSULATION = addFactoryBlock("insulation", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock GEARS = addFactoryBlock("gears", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock CABLES = addFactoryBlock("cables", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock RUST_BPLATES = addFactoryBlock("rust_bplates", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock GRATE = addFactoryBlock("grate", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock RUSTY_GRATE = addFactoryBlock("rgrate", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock HEX = addFactoryBlock("hex", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock WEATHERED_GREEN_PANEL = addFactoryBlock("wgpanel", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock WEATHERED_ORANGE_PANEL = addFactoryBlock("wopanel", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock STURDY = addFactoryBlock("sturdy", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock MEGACELL = addFactoryBlock("megacell", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock EXHAUST = addFactoryBlock("exhaust", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock ENGINEER = addFactoryBlock("engineer", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock SCAFFOLD = addFactoryBlock("scaffold", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock PIPING = addFactoryBlock("piping", new BaseFactoryBlock(Block.Settings.create()));
    BaseFactoryBlock LARGE_PLATING = addFactoryBlock("large_plating", new BaseFactoryBlock(Block.Settings.create()));

    BaseFactoryBlock SMOOTH_METAL = addFactoryBlock("fan_side", new BaseFactoryBlock(Block.Settings.create()));
    RedstoneFanBlock FAN_STILL = addFactoryBlock("fan", new RedstoneFanBlock(Block.Settings.create()));
    BaseFanBlock FAN_ON = addFactoryBlock("fan_on", new BaseFanBlock(Block.Settings.create()));
    RedstoneFanBlock FAN_FOUR = addFactoryBlock("fan_four", new RedstoneFanBlock(Block.Settings.create()));
    BaseFanBlock FAN_FOUR_ON = addFactoryBlock("fan_four_on", new RedstoneFanBlock(Block.Settings.create()));
    RedstoneFanBlock FAN_MALFUNCTION = addFactoryBlock("fan_malfunction", new RedstoneFanBlock(Block.Settings.create()));
    BaseFanBlock FAN_MALFUNCTION_ON = addFactoryBlock("fan_malfunction_on", new RedstoneFanBlock(Block.Settings.create()));
    MediumFanBlock MEDIUM_FAN = addFactoryBlock("medium_fan", new MediumFanBlock(FabricBlockSettings.create().dynamicBounds().collidable(true)), false);

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
