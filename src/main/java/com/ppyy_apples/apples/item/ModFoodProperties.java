package com.ppyy_apples.apples.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
//    public static final FoodProperties RADISH = new FoodProperties.Builder()
//            .nutrition(3)
//            .saturationModifier(0.25f)
//            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 400), 0.35f)
//            .build(); //other methods than .effect() exist too, e.g. alwaysEdible() (for gapples etc), usingConvertsTo() (e.g. to get the bowl back after eating stew)
    //doubletap shift and search foods in classes for info on how to balance stats etc
    // to make into a drink make a custom item class for the food and override the use animation


    public static final FoodProperties DIAMOND_APPLE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(9.6f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 4800, 1), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 4800, 0), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 300, 2), 1.0f)
            .alwaysEdible()
            .build();

    public static final FoodProperties ENCHANTED_DIAMOND_APPLE = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(9.6f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 12000, 4), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 12000, 1), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 600, 2), 1.0f)
            .alwaysEdible()
            .build();
     public static final FoodProperties NETHERITE_APPLE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(9.6f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 7200, 3), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 2), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 500, 2), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 9600, 0), 1.0f)

            .alwaysEdible()
            .build();

    public static final FoodProperties ENCHANTED_NETHERITE_APPLE = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(9.6f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 12000, 4), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 12000, 1), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 600, 2), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 12000, 0), 1.0f)
            .alwaysEdible()
            .build();

    public static final FoodProperties COPPER_APPLE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(8.5f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 2400, 0), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 60, 0), 1.0f)
            .alwaysEdible()
            .build();
    public static final FoodProperties ENCHANTED_COPPER_APPLE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(8.5f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 4800, 2), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 120, 0), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 400, 0), 1.0f)
            .alwaysEdible()
            .build();
    public static final FoodProperties IRON_APPLE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(8.5f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2400, 0), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 1800, 0), 1.0f)
            .alwaysEdible()
            .build();
    public static final FoodProperties ENCHANTED_IRON_APPLE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(8.5f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 6000, 1), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 4800, 0), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 4200, 1), 1.0f)
            .alwaysEdible()
            .build();
    public static final FoodProperties AMETHYST_APPLE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(8.5f)
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 4800, 0), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 0), 1.0f)
            .alwaysEdible()
            .build();
    public static final FoodProperties ENCHANTED_AMETHYST_APPLE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(8.5f)
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 12000, 0), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 4800, 1), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 4800, 2), 1.0f)
            .alwaysEdible()
            .build();
    public static final FoodProperties PRISMARINE_APPLE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(8.5f)
            .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 4800, 0), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 4800, 0), 1.0f)
            .alwaysEdible()
            .build();
    public static final FoodProperties ENCHANTED_PRISMARINE_APPLE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(8.5f)
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 12000, 0), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.CONDUIT_POWER, 12000, 0), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 4800, 0), 1.0f)
            .alwaysEdible()
            .build();
    public static final FoodProperties EMERALD_APPLE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(8.5f)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 9600, 1), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 6000, 1), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 120, 1), 1.0f)
            .alwaysEdible()
            .build();
    public static final FoodProperties ENCHANTED_EMERALD_APPLE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(8.5f)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 12000, 2), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 9600, 0), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 7200, 2), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200, 2), 1.0f)
            .alwaysEdible()
            .build();
    public static final FoodProperties QUARTZ_APPLE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(8.5f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2400, 0), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.SLOW_FALLING, 600, 0), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 1), 1.0f)
            .alwaysEdible()
            .build();
    public static final FoodProperties ENCHANTED_QUARTZ_APPLE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(8.5f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 9600, 1), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.SLOW_FALLING, 1800, 0), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 1800, 2), 1.0f)
            .alwaysEdible()
            .build();


    public static final FoodProperties TIN_APPLE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(7.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1200, 0), 1.0f)
            .alwaysEdible()
            .build();
    public static final FoodProperties BRASS_APPLE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(8.5f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1800, 0), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 1200, 0), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100, 0), 1.0f)
            .alwaysEdible()
            .build();
    public static final FoodProperties BRONZE_APPLE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(8.5f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 0), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2400, 0), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100, 0), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 3600, 0), 1.0f)
            .alwaysEdible()
            .build();
    public static final FoodProperties RUBY_APPLE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(8.5f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 2400, 1), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200, 0), 1.0f)
            .alwaysEdible()
            .build();
    public static final FoodProperties SAPPHIRE_APPLE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(8.5f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 2400, 1), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.SATURATION, 2400, 0), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100, 1), 1.0f)
            .alwaysEdible()
            .build();
    public static final FoodProperties ONYX_APPLE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(8.5f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 4800, 0), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2400, 0), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2400, 0), 1.0f)
            .alwaysEdible()
            .build();
    public static final FoodProperties JADE_APPLE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(8.5f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 4800, 0), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2400, 0), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 4800, 1), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.SATURATION, 200, 0), 1.0f)
            .alwaysEdible()
            .build();


}
