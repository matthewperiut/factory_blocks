package com.periut.factoryblocks;

import net.minecraft.block.Block;
import net.minecraft.component.type.TooltipDisplayComponent;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;
import java.util.function.Consumer;

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
    public void appendTooltip(ItemStack stack, TooltipContext context, TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
        textConsumer.accept(Text.translatable("item." + FactoryBlocksMod.MODID + "." + customTooltip).formatted(Formatting.GRAY));
        if (debug)
        {
            textConsumer.accept(Text.translatable("item." + FactoryBlocksMod.MODID + ".debug").formatted(Formatting.RED));
        }
        super.appendTooltip(stack, context, displayComponent, textConsumer, type);
    }
}
