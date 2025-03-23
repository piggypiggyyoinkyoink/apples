package com.ppyy_apples.apples.datagen;

import com.ppyy_apples.apples.Apples;
import com.ppyy_apples.apples.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output,  ExistingFileHelper existingFileHelper) {
        super(output, Apples.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.IRON_APPLE.get());
        basicItem(ModItems.ENCHANTED_IRON_APPLE.get());
        basicItem(ModItems.DIAMOND_APPLE.get());
        basicItem(ModItems.ENCHANTED_DIAMOND_APPLE.get());
        basicItem(ModItems.NETHERITE_APPLE.get());
        basicItem(ModItems.ENCHANTED_NETHERITE_APPLE.get());
        basicItem(ModItems.EMERALD_APPLE.get());
        basicItem(ModItems.ENCHANTED_EMERALD_APPLE.get());
        basicItem(ModItems.COPPER_APPLE.get());
        basicItem(ModItems.ENCHANTED_COPPER_APPLE.get());
        basicItem(ModItems.QUARTZ_APPLE.get());
        basicItem(ModItems.ENCHANTED_QUARTZ_APPLE.get());
        basicItem(ModItems.PRISMARINE_APPLE.get());
        basicItem(ModItems.ENCHANTED_PRISMARINE_APPLE.get());
        basicItem(ModItems.AMETHYST_APPLE.get());
        basicItem(ModItems.ENCHANTED_AMETHYST_APPLE.get());

        basicItem(ModItems.RUBY_APPLE.get());
        basicItem(ModItems.SAPPHIRE_APPLE.get());
        basicItem(ModItems.ONYX_APPLE.get());
        basicItem(ModItems.JADE_APPLE.get());

        basicItem(ModItems.TIN_APPLE.get());
        basicItem(ModItems.BRASS_APPLE.get());
        basicItem(ModItems.BRONZE_APPLE.get());

    }
}
