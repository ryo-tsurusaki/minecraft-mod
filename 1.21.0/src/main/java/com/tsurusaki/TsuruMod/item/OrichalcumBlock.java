package com.tsurusaki.TsuruMod.item;

import com.tsurusaki.TsuruMod.constants.item.StacksTo;
import com.tsurusaki.TsuruMod.registry.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

public class OrichalcumBlock extends BlockItem {

    /**
     * オリハルコンブロック
     */
    public OrichalcumBlock() {
        super(ModBlocks.Blocks.ORICHALUM_BLOCK.get(),
                new Item.Properties()
                        .fireResistant()
                        .stacksTo(StacksTo.BLOCK.toInt())
        );
    }
}
