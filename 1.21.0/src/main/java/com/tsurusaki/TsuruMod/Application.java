package com.tsurusaki.TsuruMod;

import com.tsurusaki.TsuruMod.registry.ModBlocks;
import com.tsurusaki.TsuruMod.registry.ModItems;
import com.tsurusaki.TsuruMod.registry.tab.Tabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Application.MOD_ID)
public class Application {
    public static final String MOD_ID = "tsuru_mod";

    public Application(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.ITEMS.register(bus);
        ModBlocks.Blocks.BLOCKS.register(bus);
        ModBlocks.BlockItems.BLOCK_ITEMS.register(bus);
        Tabs.MOD_TABS.register(bus);
    }
}
