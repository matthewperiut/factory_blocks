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

public class RegisterBlocks
{
    private static void addFactoryBlock(Block block, String nameID)
    {
        addFactoryBlock(block, nameID, true);
    }

    private static void addFactoryBlock(Block block, String nameID, boolean include)
    {
        Identifier blockID = new Identifier(MODID, nameID);
        Registry.register(Registries.BLOCK, blockID, block);
        TooltipBlockItem BlockItem = new TooltipBlockItem(block, new FabricItemSettings(), nameID + ".tooltip");
        ItemGroupEvents.modifyEntriesEvent(CHISEL_GROUP).register(content -> {
            content.add(BlockItem);
        });
        if(include)
            ChiselGroupLookup.addItemToGroup("factory", blockID);
        else
            BlockItem.debugMode();
        Registry.register(Registries.ITEM, blockID, BlockItem);
    }

    public static final BaseFactoryBlock FACTORY_BASE = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock RUST = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock VRUST = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock SRUST = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock WIREFRAME = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock PURPLE_WIREFRAME = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock HAZARD = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock HAZARD_ORANGE = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock CIRCUIT = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock METAL_BOX = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock GOLD_CIRCUIT = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock PURPLE_GOLD_CIRCUIT = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock GRINDER = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock OLD_VENTS = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock RUST_PLATES = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock BLUE_CIRCUIT = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock FACTORY_ICE = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock MOSAIC = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock BLUE_WIREFRAME = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock RUSTY_SCAFFOLD = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock CAUTION = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock LARGE_PIPES = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock SMALL_PIPES = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock VENT = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock GVENT = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock INSULATION = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock GEARS = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock CABLES = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock RUST_BPLATES = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock GRATE = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock RUSTY_GRATE = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock HEX = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock WEATHERED_GREEN_PANEL = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock WEATHERED_ORANGE_PANEL = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock STURDY = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock MEGACELL = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock EXHAUST = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock ENGINEER = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock SCAFFOLD = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock PIPING = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFactoryBlock LARGE_PLATING = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));

    public static final BaseFactoryBlock SMOOTH_METAL = new BaseFactoryBlock(FabricBlockSettings.of(Material.METAL));
    public static final RedstoneFanBlock FAN_STILL = new RedstoneFanBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFanBlock FAN_ON = new BaseFanBlock(FabricBlockSettings.of(Material.METAL));
    public static final RedstoneFanBlock FAN_FOUR = new RedstoneFanBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFanBlock FAN_FOUR_ON = new RedstoneFanBlock(FabricBlockSettings.of(Material.METAL));
    public static final RedstoneFanBlock FAN_MALFUNCTION = new RedstoneFanBlock(FabricBlockSettings.of(Material.METAL));
    public static final BaseFanBlock FAN_MALFUNCTION_ON = new RedstoneFanBlock(FabricBlockSettings.of(Material.METAL));
    public static final MediumFanBlock MEDIUM_FAN = new MediumFanBlock(FabricBlockSettings.of(Material.METAL).dynamicBounds().collidable(true));

    public static void register()
    {
        addFactoryBlock(FACTORY_BASE, "factory");
        addFactoryBlock(RUST, "rust");
        addFactoryBlock(VRUST, "vrust");
        addFactoryBlock(SRUST, "srust");
        addFactoryBlock(WIREFRAME, "wireframe");
        addFactoryBlock(PURPLE_WIREFRAME, "pwireframe");
        addFactoryBlock(HAZARD, "hazard");
        addFactoryBlock(HAZARD_ORANGE, "hazardo");
        addFactoryBlock(CIRCUIT, "circuit");
        addFactoryBlock(METAL_BOX, "metalbox");
        addFactoryBlock(GOLD_CIRCUIT, "gcircuit");
        addFactoryBlock(PURPLE_GOLD_CIRCUIT, "pgcircuit");
        addFactoryBlock(GRINDER, "grinder");
        addFactoryBlock(OLD_VENTS, "old_vents");
        addFactoryBlock(RUST_PLATES, "rust_plates");
        addFactoryBlock(BLUE_CIRCUIT, "bcircuit");
        addFactoryBlock(FACTORY_ICE, "ice");
        addFactoryBlock(MOSAIC, "mosaic");
        addFactoryBlock(BLUE_WIREFRAME, "bwireframe");
        addFactoryBlock(RUSTY_SCAFFOLD, "rusty_scaffold");
        addFactoryBlock(CAUTION, "caution");
        addFactoryBlock(LARGE_PIPES, "large_pipes");
        addFactoryBlock(SMALL_PIPES, "small_pipes");
        addFactoryBlock(VENT, "vent");
        addFactoryBlock(GVENT, "gvent");
        addFactoryBlock(INSULATION, "insulation");
        addFactoryBlock(GEARS, "gears");
        addFactoryBlock(CABLES, "cables");
        addFactoryBlock(RUST_BPLATES, "rust_bplates");
        addFactoryBlock(GRATE, "grate");
        addFactoryBlock(RUSTY_GRATE, "rgrate");
        addFactoryBlock(HEX, "hex");
        addFactoryBlock(WEATHERED_GREEN_PANEL, "wgpanel");
        addFactoryBlock(WEATHERED_ORANGE_PANEL, "wopanel");
        addFactoryBlock(STURDY, "sturdy");
        addFactoryBlock(MEGACELL, "megacell");
        addFactoryBlock(EXHAUST, "exhaust");
        addFactoryBlock(ENGINEER, "engineer");
        addFactoryBlock(SCAFFOLD, "scaffold");
        addFactoryBlock(PIPING, "piping");
        addFactoryBlock(LARGE_PLATING, "large_plating");

        addFactoryBlock(SMOOTH_METAL, "fan_side");
        addFactoryBlock(FAN_STILL, "fan");
        addFactoryBlock(FAN_ON, "fan_on");
        addFactoryBlock(FAN_FOUR, "fan_four");
        addFactoryBlock(FAN_FOUR_ON, "fan_four_on");
        addFactoryBlock(FAN_MALFUNCTION, "fan_malfunction");
        addFactoryBlock(FAN_MALFUNCTION_ON, "fan_malfunction_on");
        addFactoryBlock(MEDIUM_FAN, "medium_fan", false);
    }
}
