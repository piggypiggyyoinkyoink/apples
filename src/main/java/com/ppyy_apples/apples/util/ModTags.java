package com.ppyy_apples.apples.util;

//import com.piggypiggyyoinkyoink.experimental.Experimental;
import com.ppyy_apples.apples.Apples;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks{
        private static TagKey<Block> createTag(String name){
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(Apples.MODID, name));
        }
    }
    public static class Items{
        public static final TagKey<Item> RUBY_GEMS = createTag("gems/ruby");
        public static final TagKey<Item> SAPPHIRE_GEMS = createTag("gems/sapphire");
        public static final TagKey<Item> ONYX_GEMS = createTag("gems/onyx");
        public static final TagKey<Item> JADE_GEMS = createTag("gems/jade");
        public static final TagKey<Item> TIN_INGOTS = createTag("ingots/tin");
        public static final TagKey<Item> BRASS_INGOTS = createTag("ingots/tin");
        public static final TagKey<Item> BRONZE_INGOTS = createTag("ingots/bronze");

        private static TagKey<Item> createTag(String name){
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", name));
        }
    }
}