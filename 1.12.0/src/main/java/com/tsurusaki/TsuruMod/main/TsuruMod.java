package com.tsurusaki.TsuruMod.main;

import com.tsurusaki.TsuruMod.regi.tab.Tabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TsuruMod.MOD_ID)
public class TsuruMod {
    public static final String MOD_ID = "tsurumod";

    public TsuruMod(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        Tabs.MOD_TABS.register(bus);
    }
}
