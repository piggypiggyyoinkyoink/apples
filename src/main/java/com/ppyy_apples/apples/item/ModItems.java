package com.ppyy_apples.apples.item;

import com.ppyy_apples.apples.Apples;
import com.ppyy_apples.apples.item.custom.EnchantedAppleItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.TagManager;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.ConditionContext;
import net.neoforged.neoforge.common.conditions.ICondition;
import net.neoforged.neoforge.common.conditions.TagEmptyCondition;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {


    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Apples.MODID);

    public static final DeferredItem<Item> DIAMOND_APPLE = ITEMS.register("diamond_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.DIAMOND_APPLE)));
    public static final DeferredItem<Item> ENCHANTED_DIAMOND_APPLE = ITEMS.register("enchanted_diamond_apple",
            () -> new EnchantedAppleItem(new Item.Properties().food(ModFoodProperties.ENCHANTED_DIAMOND_APPLE)));
    public static final DeferredItem<Item> COPPER_APPLE = ITEMS.register("copper_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COPPER_APPLE)));
    public static final DeferredItem<Item> ENCHANTED_COPPER_APPLE = ITEMS.register("enchanted_copper_apple",
            () -> new EnchantedAppleItem(new Item.Properties().food(ModFoodProperties.ENCHANTED_COPPER_APPLE)));
    public static final DeferredItem<Item> IRON_APPLE = ITEMS.register("iron_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.IRON_APPLE)));
    public static final DeferredItem<Item> ENCHANTED_IRON_APPLE = ITEMS.register("enchanted_iron_apple",
            () -> new EnchantedAppleItem(new Item.Properties().food(ModFoodProperties.ENCHANTED_IRON_APPLE)));
    public static final DeferredItem<Item> AMETHYST_APPLE = ITEMS.register("amethyst_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.AMETHYST_APPLE)));
    public static final DeferredItem<Item> ENCHANTED_AMETHYST_APPLE = ITEMS.register("enchanted_amethyst_apple",
            () -> new EnchantedAppleItem(new Item.Properties().food(ModFoodProperties.ENCHANTED_AMETHYST_APPLE)));
    public static final DeferredItem<Item> PRISMARINE_APPLE = ITEMS.register("prismarine_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.PRISMARINE_APPLE)));
    public static final DeferredItem<Item> ENCHANTED_PRISMARINE_APPLE = ITEMS.register("enchanted_prismarine_apple",
            () -> new EnchantedAppleItem(new Item.Properties().food(ModFoodProperties.ENCHANTED_PRISMARINE_APPLE)));
    public static final DeferredItem<Item> EMERALD_APPLE = ITEMS.register("emerald_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.EMERALD_APPLE)));
    public static final DeferredItem<Item> ENCHANTED_EMERALD_APPLE = ITEMS.register("enchanted_emerald_apple",
            () -> new EnchantedAppleItem(new Item.Properties().food(ModFoodProperties.ENCHANTED_EMERALD_APPLE)));
    public static final DeferredItem<Item> QUARTZ_APPLE = ITEMS.register("quartz_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.QUARTZ_APPLE)));
    public static final DeferredItem<Item> ENCHANTED_QUARTZ_APPLE = ITEMS.register("enchanted_quartz_apple",
            () -> new EnchantedAppleItem(new Item.Properties().food(ModFoodProperties.ENCHANTED_QUARTZ_APPLE)));
    public static final DeferredItem<Item> NETHERITE_APPLE = ITEMS.register("netherite_apple",
            () -> new Item(new Item.Properties()
                    .food(ModFoodProperties.NETHERITE_APPLE)
                    .fireResistant()));
    public static final DeferredItem<Item> ENCHANTED_NETHERITE_APPLE = ITEMS.register("enchanted_netherite_apple",
            () -> new EnchantedAppleItem(new Item.Properties()
                    .food(ModFoodProperties.ENCHANTED_NETHERITE_APPLE)
                    .fireResistant()));

    //if(not(new TagEmptyCondition("c:ingots/tin"))){


    public static final DeferredItem<Item> TIN_APPLE = ITEMS.register("tin_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TIN_APPLE)));
    public static final DeferredItem<Item> BRASS_APPLE = ITEMS.register("brass_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BRASS_APPLE)));
    public static final DeferredItem<Item> BRONZE_APPLE = ITEMS.register("bronze_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BRONZE_APPLE)));

    public static final DeferredItem<Item> RUBY_APPLE = ITEMS.register("ruby_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RUBY_APPLE)));
    public static final DeferredItem<Item> SAPPHIRE_APPLE = ITEMS.register("sapphire_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SAPPHIRE_APPLE)));
    public static final DeferredItem<Item> ONYX_APPLE = ITEMS.register("onyx_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ONYX_APPLE)));
    public static final DeferredItem<Item> JADE_APPLE = ITEMS.register("jade_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.JADE_APPLE)));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);

    }
}
