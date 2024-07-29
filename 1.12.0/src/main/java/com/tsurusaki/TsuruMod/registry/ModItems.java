package com.tsurusaki.TsuruMod.registry;

import com.tsurusaki.TsuruMod.Application;
import com.tsurusaki.TsuruMod.item.TitaniumIngot;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Application.MOD_ID);

    public static final RegistryObject<Item> TITANIUM_INGOT =
            ITEMS.register("titanium_ingot", TitaniumIngot::new);
}
