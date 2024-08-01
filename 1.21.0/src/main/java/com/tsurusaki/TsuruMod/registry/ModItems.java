package com.tsurusaki.TsuruMod.registry;

import com.tsurusaki.TsuruMod.Application;
import com.tsurusaki.TsuruMod.item.OrichalcumIngot;
import com.tsurusaki.TsuruMod.item.TitaniumIngot;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    private static final String TITANIUM_INGOT_ID = "titanium_ingot";
    private static final String ORICHALCUM_INGOT_ID = "orichalcum_ingot";

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Application.MOD_ID);

    public static final RegistryObject<Item> TITANIUM_INGOT =
            ITEMS.register(TITANIUM_INGOT_ID, TitaniumIngot::new);
    public static final RegistryObject<Item> ORICHALCUM_INGOT =
            ITEMS.register(ORICHALCUM_INGOT_ID, OrichalcumIngot::new);
}
