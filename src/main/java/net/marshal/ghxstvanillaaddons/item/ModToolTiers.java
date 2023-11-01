package net.marshal.ghxstvanillaaddons.item;

import net.marshal.ghxstvanillaaddons.GhxstVanillaAddons;
import net.marshal.ghxstvanillaaddons.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier COPPER = TierSortingRegistry.registerTier(
            new ForgeTier(1, 500, 6f, 2f,14,
                    ModTags.Blocks.NEEDS_COPPER_TOOL, () -> Ingredient.of(Items.COPPER_INGOT)),
            new ResourceLocation("minecraft","copper_ingot"), List.of(Tiers.IRON), List.of());

    public static final Tier AMETHYST = TierSortingRegistry.registerTier(
            new ForgeTier(2, 1750, 6f, 2f,14,
                    ModTags.Blocks.NEEDS_AMETHYST_TOOL, () -> Ingredient.of(ModItems.AMETHYST_ALLOY.get())),
            new ResourceLocation(GhxstVanillaAddons.MOD_ID,"amethyst_alloy"), List.of(Tiers.DIAMOND), List.of());

    public static final Tier EMERALD = TierSortingRegistry.registerTier(
            new ForgeTier(0, 70, 10f, 2f,20,
                    ModTags.Blocks.NEEDS_EMERALD_TOOL, () -> Ingredient.of(Items.EMERALD)),
            new ResourceLocation("minecraft","emerald"), List.of(Tiers.GOLD), List.of());

    // WOOD TIERS
    public static final Tier OAK_WOOD = TierSortingRegistry.registerTier(
            new ForgeTier(0, 59, 2.0F, 0.0F, 15,
                    Tags.Blocks.NEEDS_WOOD_TOOL, () -> Ingredient.of(Blocks.OAK_PLANKS)),
            new ResourceLocation("minecraft","oak_planks"), List.of(Tiers.WOOD), List.of());
    public static final Tier BIRCH_WOOD = TierSortingRegistry.registerTier(
            new ForgeTier(0, 59, 2.0F, 0.0F, 15,
                    Tags.Blocks.NEEDS_WOOD_TOOL, () -> Ingredient.of(Blocks.BIRCH_PLANKS)),
            new ResourceLocation("minecraft","birch_planks"), List.of(Tiers.WOOD), List.of());
    public static final Tier JUNGLE_WOOD = TierSortingRegistry.registerTier(
            new ForgeTier(0, 59, 2.0F, 0.0F, 15,
                    Tags.Blocks.NEEDS_WOOD_TOOL, () -> Ingredient.of(Blocks.JUNGLE_PLANKS)),
            new ResourceLocation("minecraft","jungle_planks"), List.of(Tiers.WOOD), List.of());
    public static final Tier ACACIA_WOOD = TierSortingRegistry.registerTier(
            new ForgeTier(0, 59, 2.0F, 0.0F, 15,
                    Tags.Blocks.NEEDS_WOOD_TOOL, () -> Ingredient.of(Blocks.ACACIA_PLANKS)),
            new ResourceLocation("minecraft","acacia_planks"), List.of(Tiers.WOOD), List.of());
    public static final Tier DARK_OAK_WOOD = TierSortingRegistry.registerTier(
            new ForgeTier(0, 59, 2.0F, 0.0F, 15,
                    Tags.Blocks.NEEDS_WOOD_TOOL, () -> Ingredient.of(Blocks.DARK_OAK_PLANKS)),
            new ResourceLocation("minecraft","dark_oak_planks"), List.of(Tiers.WOOD), List.of());
    public static final Tier MANGROVE_WOOD = TierSortingRegistry.registerTier(
            new ForgeTier(0, 59, 2.0F, 0.0F, 15,
                    Tags.Blocks.NEEDS_WOOD_TOOL, () -> Ingredient.of(Blocks.MANGROVE_PLANKS)),
            new ResourceLocation("minecraft","mangrove_planks"), List.of(Tiers.WOOD), List.of());
    public static final Tier CHERRY_WOOD = TierSortingRegistry.registerTier(
            new ForgeTier(0, 59, 2.0F, 0.0F, 15,
                    Tags.Blocks.NEEDS_WOOD_TOOL, () -> Ingredient.of(Blocks.CHERRY_PLANKS)),
            new ResourceLocation("minecraft","cherry_planks"), List.of(Tiers.WOOD), List.of());
    public static final Tier BAMBOO_WOOD = TierSortingRegistry.registerTier(
            new ForgeTier(0, 59, 2.2F, 0.0F, 15,
                    Tags.Blocks.NEEDS_WOOD_TOOL, () -> Ingredient.of(Blocks.BAMBOO_PLANKS)),
            new ResourceLocation("minecraft","bamboo_planks"), List.of(Tiers.WOOD), List.of());
    public static final Tier CRIMSON_WOOD = TierSortingRegistry.registerTier(
            new ForgeTier(0, 59, 2.0F, 0.0F, 15,
                    Tags.Blocks.NEEDS_WOOD_TOOL, () -> Ingredient.of(Blocks.CRIMSON_PLANKS)),
            new ResourceLocation("minecraft","crimson_planks"), List.of(Tiers.WOOD), List.of());
    public static final Tier WARPED_WOOD = TierSortingRegistry.registerTier(
            new ForgeTier(0, 59, 2.0F, 0.0F, 15,
                    Tags.Blocks.NEEDS_WOOD_TOOL, () -> Ingredient.of(Blocks.WARPED_PLANKS)),
            new ResourceLocation("minecraft","warped_planks"), List.of(Tiers.WOOD), List.of());

    /*
    WOOD(0, 59, 2.0F, 0.0F, 15, () -> {
      return Ingredient.of(ItemTags.PLANKS);
    }),
    */
}
