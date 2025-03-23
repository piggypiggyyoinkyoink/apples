package com.ppyy_apples.apples.datagen;

import com.ppyy_apples.apples.Apples;
import com.ppyy_apples.apples.block.ModBlocks;
import com.ppyy_apples.apples.item.ModItems;
import com.ppyy_apples.apples.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.neoforged.neoforge.common.conditions.ItemExistsCondition;
import net.neoforged.neoforge.common.conditions.ModLoadedCondition;
import net.neoforged.neoforge.common.conditions.TagEmptyCondition;
import net.neoforged.neoforge.common.crafting.ConditionalRecipeOutput;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.DIAMOND_APPLE.get())
                .pattern("DDD")
                .pattern("DAD")
                .pattern("DDD")
                .define('D', Items.DIAMOND)
                .define('A', Items.APPLE)
                .unlockedBy("has_diamond", has(Items.DIAMOND)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.ENCHANTED_DIAMOND_APPLE.get())
                .pattern("DDD")
                .pattern("DAD")
                .pattern("DDD")
                .define('D', Items.DIAMOND_BLOCK)
                .define('A', Items.APPLE)
                .unlockedBy("has_diamond_block", has(Items.DIAMOND_BLOCK)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.IRON_APPLE.get())
                .pattern("DDD")
                .pattern("DAD")
                .pattern("DDD")
                .define('D', Items.IRON_INGOT)
                .define('A', Items.APPLE)
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.ENCHANTED_IRON_APPLE.get())
                .pattern("DDD")
                .pattern("DAD")
                .pattern("DDD")
                .define('D', Items.IRON_BLOCK)
                .define('A', Items.APPLE)
                .unlockedBy("has_iron_block", has(Items.IRON_BLOCK)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.EMERALD_APPLE.get())
                .pattern("DDD")
                .pattern("DAD")
                .pattern("DDD")
                .define('D', Items.EMERALD)
                .define('A', Items.APPLE)
                .unlockedBy("has_emerald", has(Items.EMERALD)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.ENCHANTED_EMERALD_APPLE.get())
                .pattern("DDD")
                .pattern("DAD")
                .pattern("DDD")
                .define('D', Items.EMERALD_BLOCK)
                .define('A', Items.APPLE)
                .unlockedBy("has_emerald_block", has(Items.EMERALD_BLOCK)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.COPPER_APPLE.get())
                .pattern("DDD")
                .pattern("DAD")
                .pattern("DDD")
                .define('D', Items.COPPER_INGOT)
                .define('A', Items.APPLE)
                .unlockedBy("has_copper", has(Items.COPPER_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.ENCHANTED_COPPER_APPLE.get())
                .pattern("DDD")
                .pattern("DAD")
                .pattern("DDD")
                .define('D', Items.COPPER_BLOCK)
                .define('A', Items.APPLE)
                .unlockedBy("has_copper_block", has(Items.COPPER_BLOCK)).save(recipeOutput);
         ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.ENCHANTED_COPPER_APPLE.get())
                .pattern("DDD")
                .pattern("DAD")
                .pattern("DDD")
                .define('D', Items.EXPOSED_COPPER)
                .define('A', Items.APPLE)
                .unlockedBy("has_copper_block", has(Items.COPPER_BLOCK)).save(recipeOutput,"ppyy_apples:enchanted_copper_apple_from_exposed_copper" );
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.ENCHANTED_COPPER_APPLE.get())
                .pattern("DDD")
                .pattern("DAD")
                .pattern("DDD")
                .define('D', Items.OXIDIZED_COPPER)
                .define('A', Items.APPLE)
                .unlockedBy("has_copper_block", has(Items.COPPER_BLOCK)).save(recipeOutput,"ppyy_apples:enchanted_copper_apple_from_oxidized_copper" );
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.ENCHANTED_COPPER_APPLE.get())
                .pattern("DDD")
                .pattern("DAD")
                .pattern("DDD")
                .define('D', Items.WEATHERED_COPPER)
                .define('A', Items.APPLE)
                .unlockedBy("has_copper_block", has(Items.COPPER_BLOCK)).save(recipeOutput,"ppyy_apples:enchanted_copper_apple_from_weathered_copper" );
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.ENCHANTED_COPPER_APPLE.get())
                .pattern("DDD")
                .pattern("DAD")
                .pattern("DDD")
                .define('D', Items.WAXED_COPPER_BLOCK)
                .define('A', Items.APPLE)
                .unlockedBy("has_copper_block", has(Items.COPPER_BLOCK)).save(recipeOutput,"ppyy_apples:enchanted_copper_apple_from_waxed_copper" );
         ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.ENCHANTED_COPPER_APPLE.get())
                .pattern("DDD")
                .pattern("DAD")
                .pattern("DDD")
                .define('D', Items.WAXED_EXPOSED_COPPER)
                .define('A', Items.APPLE)
                .unlockedBy("has_copper_block", has(Items.COPPER_BLOCK)).save(recipeOutput,"ppyy_apples:enchanted_copper_apple_from_waxed_exposed_copper" );
         ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.ENCHANTED_COPPER_APPLE.get())
                .pattern("DDD")
                .pattern("DAD")
                .pattern("DDD")
                .define('D', Items.WAXED_WEATHERED_COPPER)
                .define('A', Items.APPLE)
                .unlockedBy("has_copper_block", has(Items.COPPER_BLOCK)).save(recipeOutput,"ppyy_apples:enchanted_copper_apple_from_waxed_weathered_copper" );
         ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.ENCHANTED_COPPER_APPLE.get())
                .pattern("DDD")
                .pattern("DAD")
                .pattern("DDD")
                .define('D', Items.WAXED_OXIDIZED_COPPER)
                .define('A', Items.APPLE)
                .unlockedBy("has_copper_block", has(Items.COPPER_BLOCK)).save(recipeOutput,"ppyy_apples:enchanted_copper_apple_from_waxed_oxidized_copper" );

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, Items.ENCHANTED_GOLDEN_APPLE)
                .pattern("DDD")
                .pattern("DAD")
                .pattern("DDD")
                .define('D', Items.GOLD_BLOCK)
                .define('A', Items.APPLE)
                .unlockedBy("has_gold_block", has(Items.GOLD_BLOCK)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.AMETHYST_APPLE.get())
                .pattern("DDD")
                .pattern("DAD")
                .pattern("DDD")
                .define('D', Items.AMETHYST_SHARD)
                .define('A', Items.APPLE)
                .unlockedBy("has_amethyst", has(Items.AMETHYST_SHARD)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.ENCHANTED_AMETHYST_APPLE.get())
                .pattern("DDD")
                .pattern("DAD")
                .pattern("DDD")
                .define('D', Items.AMETHYST_BLOCK)
                .define('A', Items.APPLE)
                .unlockedBy("has_amethyst_block", has(Items.AMETHYST_BLOCK)).save(recipeOutput);
    ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.QUARTZ_APPLE.get())
                .pattern("DDD")
                .pattern("DAD")
                .pattern("DDD")
                .define('D', Items.QUARTZ)
                .define('A', Items.APPLE)
                .unlockedBy("has_diamond", has(Items.QUARTZ)).save(recipeOutput);
    ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.ENCHANTED_QUARTZ_APPLE.get())
                .pattern("DDD")
                .pattern("DAD")
                .pattern("DDD")
                .define('D', Items.QUARTZ_BLOCK)
                .define('A', Items.APPLE)
                .unlockedBy("has_quartz_block", has(Items.QUARTZ_BLOCK)).save(recipeOutput);

    ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.PRISMARINE_APPLE.get())
                .pattern("SCS")
                .pattern("CAC")
                .pattern("SCS")
                .define('S', Items.PRISMARINE_SHARD)
                .define('C', Items.PRISMARINE_CRYSTALS)
                .define('A', Items.APPLE)
                .unlockedBy("has_prismarine_crystals", has(Items.PRISMARINE_CRYSTALS))
                .unlockedBy("has_prismarine_shard", has(Items.PRISMARINE_SHARD)).save(recipeOutput);
    ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.ENCHANTED_PRISMARINE_APPLE.get())
                .pattern("DDD")
                .pattern("DAD")
                .pattern("DDD")
                .define('D', Items.PRISMARINE)
                .define('A', Items.APPLE)
                .unlockedBy("has_prismarine", has(Items.PRISMARINE)).save(recipeOutput);
    ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.ENCHANTED_PRISMARINE_APPLE.get())
                .pattern("DDD")
                .pattern("DAD")
                .pattern("DDD")
                .define('D', Items.PRISMARINE_BRICKS)
                .define('A', Items.APPLE)
                .unlockedBy("has_prismarine", has(Items.PRISMARINE))
                .unlockedBy("has_prismarine_bricks", has(Items.PRISMARINE_BRICKS))
                .save(recipeOutput, "ppyy_apples:enchanted_prismarine_apple_from_prismarine_bricks");
    ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.ENCHANTED_PRISMARINE_APPLE.get())
                .pattern("DDD")
                .pattern("DAD")
                .pattern("DDD")
                .define('D', Items.DARK_PRISMARINE)
                .define('A', Items.APPLE)
                .unlockedBy("has_prismarine", has(Items.PRISMARINE))
                .unlockedBy("has_dark_prismarine", has(Items.DARK_PRISMARINE))
                .save(recipeOutput, "ppyy_apples:enchanted_prismarine_apple_from_dark_prismarine");
    ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.ENCHANTED_PRISMARINE_APPLE.get(), 3)
                .pattern("DDD")
                .pattern("DAD")
                .pattern("DDD")
                .define('D', Items.SEA_LANTERN)
                .define('A', Items.APPLE)
                .unlockedBy("has_sea_lantern", has(Items.SEA_LANTERN))
                .save(recipeOutput, "ppyy_apples:enchanted_prismarine_apple_from_sea_lantern");


        netheriteSmithing(recipeOutput, ModItems.DIAMOND_APPLE.get(), RecipeCategory.FOOD, ModItems.NETHERITE_APPLE.get());
        netheriteSmithing(recipeOutput, ModItems.ENCHANTED_DIAMOND_APPLE.get(), RecipeCategory.FOOD, ModItems.ENCHANTED_NETHERITE_APPLE.get());

//  HOW TO DO OPTIONAL DEPENDENCY RECIPE
//        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.ENCHANTED_DIAMOND_APPLE.get())
//                .pattern("DDD")
//                .pattern("DAD")
//                .pattern("DDD")
//                .define('D', com.piggypiggyyoinkyoink.experimental.item.ModItems.DINGUS.get())
//                .define('A', Items.APPLE)
//                .unlockedBy("has_dingus", has(com.piggypiggyyoinkyoink.experimental.item.ModItems.DINGUS)).save(recipeOutput.withConditions(new ModLoadedCondition("piggypiggyyoinkyoink")), "test_dingus");

//  HOW TO DO RECIPE WITH TAGS FROM OTHER MODS - NOTE: DEFINE THE TAGS IN MODTAGS FIRST
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.RUBY_APPLE.get())
                .pattern("DDD")
                .pattern("DAD")
                .pattern("DDD")
                .define('D', ModTags.Items.RUBY_GEMS)
                .define('A', Items.APPLE)
                .unlockedBy("has_ruby", has(ModTags.Items.RUBY_GEMS)).save(recipeOutput.withConditions(not(new TagEmptyCondition("c:gems/ruby"))), "ruby_apple");
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.SAPPHIRE_APPLE.get())
                .pattern("DDD")
                .pattern("DAD")
                .pattern("DDD")
                .define('D', ModTags.Items.SAPPHIRE_GEMS)
                .define('A', Items.APPLE)
                .unlockedBy("has_sapphire", has(ModTags.Items.SAPPHIRE_GEMS)).save(recipeOutput.withConditions(not(new TagEmptyCondition("c:gems/sapphire"))), "sapphire_apple");
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.ONYX_APPLE.get())
                .pattern("DDD")
                .pattern("DAD")
                .pattern("DDD")
                .define('D', ModTags.Items.ONYX_GEMS)
                .define('A', Items.APPLE)
                .unlockedBy("has_onyx", has(ModTags.Items.ONYX_GEMS)).save(recipeOutput.withConditions(not(new TagEmptyCondition("c:gems/onyx"))), "onyx_apple");

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.TIN_APPLE.get())
                .pattern("DDD")
                .pattern("DAD")
                .pattern("DDD")
                .define('D', ModTags.Items.TIN_INGOTS)
                .define('A', Items.APPLE)
                .unlockedBy("has_tin", has(ModTags.Items.TIN_INGOTS)).save(recipeOutput.withConditions(not(new TagEmptyCondition("c:ingots/tin"))), "tin_apple");
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.BRASS_APPLE.get())
                .pattern("DDD")
                .pattern("DAD")
                .pattern("DDD")
                .define('D', ModTags.Items.BRASS_INGOTS)
                .define('A', Items.APPLE)
                .unlockedBy("has_brass", has(ModTags.Items.BRASS_INGOTS)).save(recipeOutput.withConditions(not(new TagEmptyCondition("c:ingots/brass"))), "brass_apple");
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.BRONZE_APPLE.get())
                .pattern("DDD")
                .pattern("DAD")
                .pattern("DDD")
                .define('D', ModTags.Items.BRONZE_INGOTS)
                .define('A', Items.APPLE)
                .unlockedBy("has_bronze", has(ModTags.Items.BRONZE_INGOTS)).save(recipeOutput.withConditions(not(new TagEmptyCondition("c:ingots/bronze"))), "bronze_apple");




    }
    protected static void netheriteSmithing(RecipeOutput recipeOutput, Item ingredientItem, RecipeCategory pCategory, Item pResult) {
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), Ingredient.of(ingredientItem), Ingredient.of(Items.NETHERITE_INGOT), pCategory, pResult
                )
                .unlocks("has_netherite_ingot", has(Items.NETHERITE_INGOT))
                .save(recipeOutput, Apples.MODID + ":" + getItemName(pResult) + "_from_smithing");
    }
}
