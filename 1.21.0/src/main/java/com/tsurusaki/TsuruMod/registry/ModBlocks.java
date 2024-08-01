package com.tsurusaki.TsuruMod.registry;

import com.tsurusaki.TsuruMod.Application;
import com.tsurusaki.TsuruMod.item.OrichalcumBlock;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

    private static final String ORICHALUM_BLOCK_ID = "orichalcum_block";

    public static class Blocks {
        public static final DeferredRegister<Block> BLOCKS = DeferredRegister
                .create(ForgeRegistries.BLOCKS, Application.MOD_ID);

        public static final RegistryObject<Block> ORICHALUM_BLOCK =
                BLOCKS.register(ORICHALUM_BLOCK_ID, com.tsurusaki.TsuruMod.block.OrichalcumBlock::new);
    }

    public static class BlockItems {
        public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister
                .create(ForgeRegistries.ITEMS, Application.MOD_ID);

        public static final RegistryObject<Item> ORICHALUM_BLOCK =
                BLOCK_ITEMS.register(ORICHALUM_BLOCK_ID, OrichalcumBlock::new);
    }
}
