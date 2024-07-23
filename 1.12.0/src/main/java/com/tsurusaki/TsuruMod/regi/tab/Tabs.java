package com.tsurusaki.TsuruMod.regi.tab;

import com.tsurusaki.TsuruMod.main.TsuruMod;
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
            .create(Registries.CREATIVE_MODE_TAB, TsuruMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TOOL_TAB = MOD_TABS.register("tool",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(Blocks.CHERRY_PLANKS))
                    .title(Component.translatable("itemGroup.tool"))
                    .displayItems((param, output) -> {
                        for (Item item : ToolItems.items) {
                            output.accept(item);
                        }
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> TOOL_SUB_TAB = MOD_TABS.register("tool_sub",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(Blocks.ACACIA_PLANKS))
                    .title(Component.translatable("itemGroup.tool_sub"))
                    .withTabsBefore(Tabs.TOOL_TAB.getId())
                    .displayItems((param, output) -> {
                        for (Item item : ToolItems.items) {
                            output.accept(item);
                        }
                    })
                    .build());
}
