package net.marshal.ghxstvanillaaddons.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties GLISTENING_CARROT = new FoodProperties.Builder()
            .nutrition(8)
            .saturationMod(1.4f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2000, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2000, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 2600, 2), 1.0F)
            .alwaysEat()
            .build();
    public static final FoodProperties MEAT_CHUNKS_RAW = new FoodProperties.Builder()
            .nutrition(2)
            .saturationMod(0.3f)
            .build();
    public static final FoodProperties MEAT_CHUNKS_COOKED = new FoodProperties.Builder()
            .nutrition(5)
            .saturationMod(0.8f)
            .build();
}
