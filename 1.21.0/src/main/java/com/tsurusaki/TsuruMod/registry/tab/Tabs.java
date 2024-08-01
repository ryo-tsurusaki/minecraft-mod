package com.tsurusaki.TsuruMod.registry.tab;

import com.tsurusaki.TsuruMod.Application;
import com.tsurusaki.TsuruMod.registry.ModBlocks;
import com.tsurusaki.TsuruMod.registry.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class Tabs {

    public static final DeferredRegister<CreativeModeTab> MOD_TABS = DeferredRegister
            .create(Registries.CREATIVE_MODE_TAB, Application.MOD_ID);

    /**
     * 「天然ブロック」タブ
     */
    public static final RegistryObject<CreativeModeTab> NATURAL_BLOCKS_TAB = MOD_TABS.register("natural_blocks",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.BlockItems.ORICHALUM_BLOCK.get()))
                    .title(Component.translatable("itemGroup.natural_blocks"))
                    .displayItems((param, output) -> {
                        for (Item item : NaturalBlocks.items) {
                            output.accept(item);
                        }
                    })
                    .build());


    /**
     * 「道具と実用品」タブ
     */
    public static final RegistryObject<CreativeModeTab> TOOLS_TAB = MOD_TABS.register("tools",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(Blocks.ACACIA_PLANKS))
                    .title(Component.translatable("itemGroup.tools"))
                    .withTabsBefore(Tabs.NATURAL_BLOCKS_TAB.getId())
                    .displayItems((param, output) -> {
                        for (Item item : ToolItems.items) {
                            output.accept(item);
                        }
                    })
                    .build());

    /**
     * 「材料」タブ
     */
    public static final RegistryObject<CreativeModeTab> INGREDIENTS_TAB = MOD_TABS.register("ingredients",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.TITANIUM_INGOT.get()))
                    .title(Component.translatable("itemGroup.ingredients"))
                    .withTabsBefore(Tabs.TOOLS_TAB.getId())
                    .displayItems((param, output) -> {
                        for (Item item : IngredientsItems.items) {
                            output.accept(item);
                        }
                    })
                    .build());
}
