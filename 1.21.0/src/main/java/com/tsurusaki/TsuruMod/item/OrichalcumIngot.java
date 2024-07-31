package com.tsurusaki.TsuruMod.item;

import com.tsurusaki.TsuruMod.constants.item.StacksTo;
import com.tsurusaki.TsuruMod.registry.ModTags;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrichalcumIngot extends Item {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrichalcumIngot.class);

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(
            @NotNull Level world,
            Player player,
            @NotNull InteractionHand hand) {

        player.sendSystemMessage(Component.literal("OrichalcumIngot used."));
        LOGGER.debug("OrichalcumIngot used.");

        ItemStack itemStack = player.getItemInHand(hand);
        if (itemStack.is(ModTags.Items.IS_SHINE)) {
            // 3秒間光らせる
            player.addEffect(new MobEffectInstance(MobEffects.GLOWING, 20 * 3, 1));
        }

        return InteractionResultHolder.consume(itemStack);
    }

    /**
     * オリハルコンインゴット
     */
    public OrichalcumIngot() {
        super(new Properties()
                .fireResistant()
                .stacksTo(StacksTo.INGOT.toInt())
        );
    }
}
