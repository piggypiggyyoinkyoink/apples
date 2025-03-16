package com.ppyy_apples.apples.datagen;

import com.ppyy_apples.apples.Apples;
import com.ppyy_apples.apples.item.ModItems;
//import com.ppyy_apples.apples.util.ModTags;  currently unimplemented
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
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
    }
}
