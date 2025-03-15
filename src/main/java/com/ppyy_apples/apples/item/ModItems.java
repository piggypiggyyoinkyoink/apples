package com.ppyy_apples.apples.item;

import com.ppyy_apples.apples.Apples;
import com.ppyy_apples.apples.item.custom.EnchantedAppleItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
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



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);

    }
}
