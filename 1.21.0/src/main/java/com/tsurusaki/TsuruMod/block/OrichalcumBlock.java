package com.tsurusaki.TsuruMod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class OrichalcumBlock extends Block {
    public OrichalcumBlock() {
        super(Properties.of()
                .strength(1.0F, 1500F)
                .sound(SoundType.AMETHYST_CLUSTER)
                .lightLevel((light) -> 15)
                .requiresCorrectToolForDrops()
        );
    }
}
