package com.ppyy_apples.apples.datagen;

import com.ppyy_apples.apples.Apples;
import com.ppyy_apples.apples.item.ModItems;
//import com.ppyy_apples.apples.util.ModTags;  currently unimplemented
import com.ppyy_apples.apples.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {


    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, Apples.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        /*
        tag(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(ModItems.DINGUS.get())
                .add(ModItems.RAW_DINGUS.get())
                .add(Items.COAL)
                .add(Items.STICK)
                .add(Items.COMPASS);

         */
        tag(Tags.Items.FOODS)
                .add(ModItems.AMETHYST_APPLE.get())
                .add(ModItems.ENCHANTED_AMETHYST_APPLE.get())
                .add(ModItems.IRON_APPLE.get())
                .add(ModItems.ENCHANTED_IRON_APPLE.get())
                .add(ModItems.COPPER_APPLE.get())
                .add(ModItems.ENCHANTED_COPPER_APPLE.get())
                .add(ModItems.DIAMOND_APPLE.get())
                .add(ModItems.ENCHANTED_DIAMOND_APPLE.get())
                .add(ModItems.QUARTZ_APPLE.get())
                .add(ModItems.ENCHANTED_QUARTZ_APPLE.get())
                .add(ModItems.EMERALD_APPLE.get())
                .add(ModItems.ENCHANTED_EMERALD_APPLE.get())
                .add(ModItems.NETHERITE_APPLE.get())
                .add(ModItems.ENCHANTED_NETHERITE_APPLE.get())
                .add(ModItems.PRISMARINE_APPLE.get())
                .add(ModItems.ENCHANTED_PRISMARINE_APPLE.get())
                ;
        tag(Tags.Items.FOODS_FRUIT)
                .add(ModItems.AMETHYST_APPLE.get())
                .add(ModItems.ENCHANTED_AMETHYST_APPLE.get())
                .add(ModItems.IRON_APPLE.get())
                .add(ModItems.ENCHANTED_IRON_APPLE.get())
                .add(ModItems.COPPER_APPLE.get())
                .add(ModItems.ENCHANTED_COPPER_APPLE.get())
                .add(ModItems.DIAMOND_APPLE.get())
                .add(ModItems.ENCHANTED_DIAMOND_APPLE.get())
                .add(ModItems.QUARTZ_APPLE.get())
                .add(ModItems.ENCHANTED_QUARTZ_APPLE.get())
                .add(ModItems.EMERALD_APPLE.get())
                .add(ModItems.ENCHANTED_EMERALD_APPLE.get())
                .add(ModItems.NETHERITE_APPLE.get())
                .add(ModItems.ENCHANTED_NETHERITE_APPLE.get())
                .add(ModItems.PRISMARINE_APPLE.get())
                .add(ModItems.ENCHANTED_PRISMARINE_APPLE.get())
                ;
        tag(ModTags.Items.RUBY_GEMS);
        tag(ModTags.Items.SAPPHIRE_GEMS);
        tag(ModTags.Items.ONYX_GEMS);
        tag(ModTags.Items.JADE_GEMS);

        tag(ModTags.Items.BRASS_INGOTS);
        tag(ModTags.Items.TIN_INGOTS);
        tag(ModTags.Items.BRONZE_INGOTS);
    }
}
