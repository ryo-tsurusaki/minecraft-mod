package com.tsurusaki.TsuruMod.item;

import com.tsurusaki.TsuruMod.constants.item.StacksTo;
import net.minecraft.world.item.Item;

public class TitaniumIngot extends Item {

    /**
     * チタンインゴット
     */
    public TitaniumIngot() {
        super(new Properties()
                .fireResistant()
                .stacksTo(StacksTo.INGOT.toInt())
        );
    }
}
