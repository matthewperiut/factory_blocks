package net.slaincow.factoryblocks;

import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

import static net.slaincow.factoryblocks.FactoryBlocksMod.MODID;

public class TooltipBlockItem extends BlockItem
{
    String customTooltip;
    boolean debug = false;
    public TooltipBlockItem(Block block, Settings settings, String tooltip)
    {
        super(block, settings);
        customTooltip = tooltip;
    }

    public void debugMode()
    {
        debug = true;
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
    {
        tooltip.add(Text.translatable("item." + MODID + "." + customTooltip).formatted(Formatting.GRAY));
        if (debug)
        {
            tooltip.add(Text.translatable("item." + MODID + ".debug").formatted(Formatting.RED));
        }
    }
}
