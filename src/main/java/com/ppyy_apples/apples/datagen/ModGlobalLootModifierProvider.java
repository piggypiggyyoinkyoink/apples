package com.ppyy_apples.apples.datagen;

import com.ppyy_apples.apples.Apples;
import com.ppyy_apples.apples.item.ModItems;
import com.ppyy_apples.apples.loot.AddItemModifier;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceWithEnchantedBonusCondition;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;

import java.util.concurrent.CompletableFuture;

public class ModGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifierProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, Apples.MODID);
    }

    @Override
    protected void start() {
        this.add("diamond_apples_to_oak_leaves",
                new AddItemModifier(new LootItemCondition[]{
                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.OAK_LEAVES).build(),
                        LootItemRandomChanceCondition.randomChance(0.01f).build() //1 in 10k
                }, ModItems.DIAMOND_APPLE.get()));
        this.add("emerald_apples_to_oak_leaves",
                new AddItemModifier(new LootItemCondition[]{
                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.OAK_LEAVES).build(),
                        LootItemRandomChanceCondition.randomChance(0.00913f).build() //1 in 12k
                }, ModItems.EMERALD_APPLE.get()));
        this.add("copper_apples_to_oak_leaves",
                new AddItemModifier(new LootItemCondition[]{
                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.OAK_LEAVES).build(),
                        LootItemRandomChanceCondition.randomChance(0.0707f).build() //1 in 200
                }, ModItems.COPPER_APPLE.get()));
        this.add("iron_apples_to_oak_leaves",
                new AddItemModifier(new LootItemCondition[]{
                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.OAK_LEAVES).build(),
                        LootItemRandomChanceCondition.randomChance(0.0365f).build() //1 in 750
                }, ModItems.IRON_APPLE.get()));
        this.add("amethyst_apples_to_oak_leaves",
                new AddItemModifier(new LootItemCondition[]{
                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.OAK_LEAVES).build(),
                        LootItemRandomChanceCondition.randomChance(0.0707f).build() //1 in 200
                }, ModItems.AMETHYST_APPLE.get()));
        this.add("prismarine_apples_to_oak_leaves",
                new AddItemModifier(new LootItemCondition[]{
                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.OAK_LEAVES).build(),
                        LootItemRandomChanceCondition.randomChance(0.0447f).build() //1 in 500
                }, ModItems.PRISMARINE_APPLE.get()));
        this.add("golden_apples_to_oak_leaves",
                new AddItemModifier(new LootItemCondition[]{
                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.OAK_LEAVES).build(),
                        LootItemRandomChanceCondition.randomChance(0.0316f).build() //1 in 1000
                }, Items.GOLDEN_APPLE));
    }
}
