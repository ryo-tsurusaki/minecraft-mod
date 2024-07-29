package com.tsurusaki.TsuruMod.item;

import net.minecraft.world.item.Item;

public class TitaniumIngot extends Item {

    /**
     * チタンインゴット
     */
    public TitaniumIngot() {
        super(new Properties()
                .fireResistant()
                .stacksTo(64)
        );
    }
}
