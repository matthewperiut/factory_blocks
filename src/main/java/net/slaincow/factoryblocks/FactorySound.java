package net.slaincow.factoryblocks;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

import static net.slaincow.factoryblocks.FactoryBlocksMod.MODID;

public interface FactorySound {
    Identifier METAL_BLOCK_SOUND = new Identifier(MODID, "metal_sound");
    SoundEvent METAL_SOUND_EVENT = SoundEvent.of(METAL_BLOCK_SOUND);
    BlockSoundGroup FACTORY_BLOCKS = new BlockSoundGroup(1.0F, 1.0F, METAL_SOUND_EVENT, METAL_SOUND_EVENT, METAL_SOUND_EVENT, METAL_SOUND_EVENT, METAL_SOUND_EVENT);
}
