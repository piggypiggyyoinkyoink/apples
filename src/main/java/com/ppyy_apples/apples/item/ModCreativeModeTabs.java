package com.ppyy_apples.apples.item;

import com.ppyy_apples.apples.Apples;
import com.ppyy_apples.apples.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Apples.MODID);

    public static final Supplier<CreativeModeTab> APPLES_TAB = CREATIVE_MODE_TAB.register("ppyy_apples_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.ENCHANTED_DIAMOND_APPLE.get()))
                    .title(Component.translatable("creativetab.ppyy_apples.ppyy_apples"))
                    .displayItems((itemDisplayParameters, output) ->{
                        output.accept(ModItems.COPPER_APPLE);
                        output.accept(ModItems.ENCHANTED_COPPER_APPLE);
                        output.accept(ModItems.IRON_APPLE);
                        output.accept(ModItems.ENCHANTED_IRON_APPLE);
                        output.accept(ModItems.DIAMOND_APPLE);
                        output.accept(ModItems.ENCHANTED_DIAMOND_APPLE);
                        output.accept(ModItems.EMERALD_APPLE);
                        output.accept(ModItems.ENCHANTED_EMERALD_APPLE);
                        output.accept(ModItems.AMETHYST_APPLE);
                        output.accept(ModItems.ENCHANTED_AMETHYST_APPLE);
                        output.accept(ModItems.PRISMARINE_APPLE);
                        output.accept(ModItems.ENCHANTED_PRISMARINE_APPLE);

                    })
                    .build());
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
