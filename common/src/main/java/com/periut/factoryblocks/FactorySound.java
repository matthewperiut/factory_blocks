package com.periut.factoryblocks;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class FactorySound
{
    public static final Identifier METAL_BLOCK_SOUND = Identifier.of(FactoryBlocksMod.MODID,"metal_sound");
    public static SoundEvent METAL_SOUND_EVENT = SoundEvent.of(METAL_BLOCK_SOUND);
    public static BlockSoundGroup FACTORY_BLOCKS = new BlockSoundGroup(1.0F, 1.0F, METAL_SOUND_EVENT, METAL_SOUND_EVENT, METAL_SOUND_EVENT, METAL_SOUND_EVENT, METAL_SOUND_EVENT);
}
