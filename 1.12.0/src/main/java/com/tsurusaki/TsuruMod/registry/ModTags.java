package com.tsurusaki.TsuruMod.registry;

import com.tsurusaki.TsuruMod.Application;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {

    public static class Items{

        public static final TagKey<Item> IS_SHINE = tag("is_shine");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(Application.MOD_ID, name));
        }
    }
}
