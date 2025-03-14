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



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);

    }
}
