package net.marshal.ghxstvanillaaddons.datagen;

import net.marshal.ghxstvanillaaddons.GhxstVanillaAddons;
import net.marshal.ghxstvanillaaddons.block.ModBlocks;
import net.marshal.ghxstvanillaaddons.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
//    private static final List<ItemLike> SAPPHIRE_SMELTABLES = List.of(ModItems.RAW_SAPPHIRE.get(),
//            ModBlocks.SAPPHIRE_ORE.get(), ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
//        oreSmelting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 0.25f, 200, "sapphire");
//        oreBlasting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 0.25f, 100, "sapphire");



        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AMETHYST_ALLOY.get(), 1)
                .pattern("AAA")
                .pattern("AID")
                .pattern("DD ")
                .define('A', Items.AMETHYST_SHARD)
                .define('I', Items.IRON_INGOT)
                .define('D', Items.DIAMOND)
                .unlockedBy(getHasName(Items.AMETHYST_SHARD), has(Items.AMETHYST_SHARD))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.GLISTENING_CARROT.get(), 1)
                .pattern("ADA")
                .pattern("SGS")
                .pattern(" P ")
                .define('A', Items.AMETHYST_SHARD)
                .define('D', Items.DIAMOND)
                .define('G', Items.GOLDEN_CARROT)
                .define('S', Items.GLOW_INK_SAC)
                .define('P', Items.BLAZE_POWDER)
                .unlockedBy(getHasName(Items.GOLDEN_CARROT), has(Items.GOLDEN_CARROT))
                .save(pWriter);

//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAPPHIRE_BLOCK.get())
//                .pattern("SSS")
//                .pattern("SSS")
//                .pattern("SSS")
//                .define('S', ModItems.SAPPHIRE.get())
//                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
//                .save(pWriter);
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 9)
//                .requires(ModBlocks.SAPPHIRE_BLOCK.get())
//                .unlockedBy(getHasName(ModBlocks.SAPPHIRE_BLOCK.get()), has(ModBlocks.SAPPHIRE_BLOCK.get()))
//                .save(pWriter);

        // COPPER SWORD & TOOLS
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.COPPER_SWORD.get())
                .pattern(" C ")
                .pattern(" C ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('C', Items.COPPER_INGOT)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.COPPER_PICKAXE.get())
                .pattern("CCC")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('C', Items.COPPER_INGOT)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.COPPER_SHOVEL.get())
                .pattern(" C ")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('C', Items.COPPER_INGOT)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.COPPER_AXE.get())
                .pattern("CC ")
                .pattern("CS ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('C', Items.COPPER_INGOT)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.COPPER_HOE.get())
                .pattern("CC ")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('C', Items.COPPER_INGOT)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(pWriter);

        // COPPER ARMOR
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.COPPER_HELMET.get())
                .pattern("CCC")
                .pattern("C C")
                .pattern("   ")
                .define('C', Items.COPPER_INGOT)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.COPPER_CHESTPLATE.get())
                .pattern("C C")
                .pattern("CCC")
                .pattern("CCC")
                .define('C', Items.COPPER_INGOT)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.COPPER_LEGGINGS.get())
                .pattern("CCC")
                .pattern("C C")
                .pattern("C C")
                .define('C', Items.COPPER_INGOT)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.COPPER_BOOTS.get())
                .pattern("C C")
                .pattern("C C")
                .define('C', Items.COPPER_INGOT)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(pWriter);

        // AMETHYST SWORD & TOOLS
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.AMETHYST_SWORD.get())
                .pattern(" A ")
                .pattern(" A ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('A', ModItems.AMETHYST_ALLOY.get())
                .unlockedBy(getHasName(ModItems.AMETHYST_ALLOY.get()), has(ModItems.AMETHYST_ALLOY.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.AMETHYST_PICKAXE.get())
                .pattern("AAA")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('A', ModItems.AMETHYST_ALLOY.get())
                .unlockedBy(getHasName(ModItems.AMETHYST_ALLOY.get()), has(ModItems.AMETHYST_ALLOY.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.AMETHYST_AXE.get())
                .pattern("AA ")
                .pattern("AS ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('A', ModItems.AMETHYST_ALLOY.get())
                .unlockedBy(getHasName(ModItems.AMETHYST_ALLOY.get()), has(ModItems.AMETHYST_ALLOY.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.AMETHYST_SHOVEL.get())
                .pattern(" A ")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('A', ModItems.AMETHYST_ALLOY.get())
                .unlockedBy(getHasName(ModItems.AMETHYST_ALLOY.get()), has(ModItems.AMETHYST_ALLOY.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.AMETHYST_HOE.get())
                .pattern("AA ")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('A', ModItems.AMETHYST_ALLOY.get())
                .unlockedBy(getHasName(ModItems.AMETHYST_ALLOY.get()), has(ModItems.AMETHYST_ALLOY.get()))
                .save(pWriter);

        // AMETHYST ARMOR
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.AMETHYST_HELMET.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("   ")
                .define('A', ModItems.AMETHYST_ALLOY.get())
                .unlockedBy(getHasName(ModItems.AMETHYST_ALLOY.get()), has(ModItems.AMETHYST_ALLOY.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.AMETHYST_CHESTPLATE.get())
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.AMETHYST_ALLOY.get())
                .unlockedBy(getHasName(ModItems.AMETHYST_ALLOY.get()), has(ModItems.AMETHYST_ALLOY.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.AMETHYST_LEGGINGS.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.AMETHYST_ALLOY.get())
                .unlockedBy(getHasName(ModItems.AMETHYST_ALLOY.get()), has(ModItems.AMETHYST_ALLOY.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.AMETHYST_BOOTS.get())
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.AMETHYST_ALLOY.get())
                .unlockedBy(getHasName(ModItems.AMETHYST_ALLOY.get()), has(ModItems.AMETHYST_ALLOY.get()))
                .save(pWriter);

        // EMERALD SWORD & TOOLS
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.EMERALD_SWORD.get())
                .pattern(" E ")
                .pattern(" E ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('E', Items.EMERALD)
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.EMERALD_PICKAXE.get())
                .pattern("EEE")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('E', Items.EMERALD)
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.EMERALD_SHOVEL.get())
                .pattern(" E ")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('E', Items.EMERALD)
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.EMERALD_AXE.get())
                .pattern("EE ")
                .pattern("ES ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('E', Items.EMERALD)
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.EMERALD_HOE.get())
                .pattern("EE ")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('E', Items.EMERALD)
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                .save(pWriter);

        // EMERALD ARMOR
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.EMERALD_HELMET.get())
                .pattern("EEE")
                .pattern("E E")
                .pattern("   ")
                .define('E', Items.EMERALD)
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.EMERALD_CHESTPLATE.get())
                .pattern("E E")
                .pattern("EEE")
                .pattern("EEE")
                .define('E', Items.EMERALD)
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.EMERALD_LEGGINGS.get())
                .pattern("EEE")
                .pattern("E E")
                .pattern("E E")
                .define('E', Items.EMERALD)
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.EMERALD_BOOTS.get())
                .pattern("E E")
                .pattern("E E")
                .define('E', Items.EMERALD)
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                .save(pWriter);

        // ==================================================================================================

        // Wooden Tools

        // OAK SWORD & TOOLS
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.OAK_SWORD.get())
                .pattern(" P ")
                .pattern(" P ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.OAK_PLANKS)
                .unlockedBy(getHasName(Blocks.OAK_PLANKS), has(Blocks.OAK_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.OAK_PICKAXE.get())
                .pattern("PPP")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.OAK_PLANKS)
                .unlockedBy(getHasName(Blocks.OAK_PLANKS), has(Blocks.OAK_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.OAK_SHOVEL.get())
                .pattern(" P ")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.OAK_PLANKS)
                .unlockedBy(getHasName(Blocks.OAK_PLANKS), has(Blocks.OAK_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.OAK_AXE.get())
                .pattern("PP ")
                .pattern("PS ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.OAK_PLANKS)
                .unlockedBy(getHasName(Blocks.OAK_PLANKS), has(Blocks.OAK_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.OAK_HOE.get())
                .pattern("PP ")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.OAK_PLANKS)
                .unlockedBy(getHasName(Blocks.OAK_PLANKS), has(Blocks.OAK_PLANKS))
                .save(pWriter);

        // BIRCH SWORD & TOOLS
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BIRCH_SWORD.get())
                .pattern(" P ")
                .pattern(" P ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.BIRCH_PLANKS)
                .unlockedBy(getHasName(Blocks.BIRCH_PLANKS), has(Blocks.BIRCH_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.BIRCH_PICKAXE.get())
                .pattern("PPP")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.BIRCH_PLANKS)
                .unlockedBy(getHasName(Blocks.BIRCH_PLANKS), has(Blocks.BIRCH_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.BIRCH_SHOVEL.get())
                .pattern(" P ")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.BIRCH_PLANKS)
                .unlockedBy(getHasName(Blocks.BIRCH_PLANKS), has(Blocks.BIRCH_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.BIRCH_AXE.get())
                .pattern("PP ")
                .pattern("PS ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.BIRCH_PLANKS)
                .unlockedBy(getHasName(Blocks.BIRCH_PLANKS), has(Blocks.BIRCH_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.BIRCH_HOE.get())
                .pattern("PP ")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.BIRCH_PLANKS)
                .unlockedBy(getHasName(Blocks.BIRCH_PLANKS), has(Blocks.BIRCH_PLANKS))
                .save(pWriter);

        // JUNGLE SWORD & TOOLS
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.JUNGLE_SWORD.get())
                .pattern(" P ")
                .pattern(" P ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.JUNGLE_PLANKS)
                .unlockedBy(getHasName(Blocks.JUNGLE_PLANKS), has(Blocks.JUNGLE_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.JUNGLE_PICKAXE.get())
                .pattern("PPP")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.JUNGLE_PLANKS)
                .unlockedBy(getHasName(Blocks.JUNGLE_PLANKS), has(Blocks.JUNGLE_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.JUNGLE_SHOVEL.get())
                .pattern(" P ")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.JUNGLE_PLANKS)
                .unlockedBy(getHasName(Blocks.JUNGLE_PLANKS), has(Blocks.JUNGLE_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.JUNGLE_AXE.get())
                .pattern("PP ")
                .pattern("PS ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.JUNGLE_PLANKS)
                .unlockedBy(getHasName(Blocks.JUNGLE_PLANKS), has(Blocks.JUNGLE_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.JUNGLE_HOE.get())
                .pattern("PP ")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.JUNGLE_PLANKS)
                .unlockedBy(getHasName(Blocks.JUNGLE_PLANKS), has(Blocks.JUNGLE_PLANKS))
                .save(pWriter);

        // ACACIA SWORD & TOOLS
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.ACACIA_SWORD.get())
                .pattern(" P ")
                .pattern(" P ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.ACACIA_PLANKS)
                .unlockedBy(getHasName(Blocks.ACACIA_PLANKS), has(Blocks.ACACIA_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ACACIA_PICKAXE.get())
                .pattern("PPP")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.ACACIA_PLANKS)
                .unlockedBy(getHasName(Blocks.ACACIA_PLANKS), has(Blocks.ACACIA_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ACACIA_SHOVEL.get())
                .pattern(" P ")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.ACACIA_PLANKS)
                .unlockedBy(getHasName(Blocks.ACACIA_PLANKS), has(Blocks.ACACIA_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ACACIA_AXE.get())
                .pattern("PP ")
                .pattern("PS ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.ACACIA_PLANKS)
                .unlockedBy(getHasName(Blocks.ACACIA_PLANKS), has(Blocks.ACACIA_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ACACIA_HOE.get())
                .pattern("PP ")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.ACACIA_PLANKS)
                .unlockedBy(getHasName(Blocks.ACACIA_PLANKS), has(Blocks.ACACIA_PLANKS))
                .save(pWriter);

        // DARK_OAK SWORD & TOOLS
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.DARK_OAK_SWORD.get())
                .pattern(" P ")
                .pattern(" P ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.DARK_OAK_PLANKS)
                .unlockedBy(getHasName(Blocks.DARK_OAK_PLANKS), has(Blocks.DARK_OAK_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.DARK_OAK_PICKAXE.get())
                .pattern("PPP")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.DARK_OAK_PLANKS)
                .unlockedBy(getHasName(Blocks.DARK_OAK_PLANKS), has(Blocks.DARK_OAK_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.DARK_OAK_SHOVEL.get())
                .pattern(" P ")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.DARK_OAK_PLANKS)
                .unlockedBy(getHasName(Blocks.DARK_OAK_PLANKS), has(Blocks.DARK_OAK_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.DARK_OAK_AXE.get())
                .pattern("PP ")
                .pattern("PS ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.DARK_OAK_PLANKS)
                .unlockedBy(getHasName(Blocks.DARK_OAK_PLANKS), has(Blocks.DARK_OAK_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.DARK_OAK_HOE.get())
                .pattern("PP ")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.DARK_OAK_PLANKS)
                .unlockedBy(getHasName(Blocks.DARK_OAK_PLANKS), has(Blocks.DARK_OAK_PLANKS))
                .save(pWriter);

        // MANGROVE SWORD & TOOLS
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.MANGROVE_SWORD.get())
                .pattern(" P ")
                .pattern(" P ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.MANGROVE_PLANKS)
                .unlockedBy(getHasName(Blocks.MANGROVE_PLANKS), has(Blocks.MANGROVE_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.MANGROVE_PICKAXE.get())
                .pattern("PPP")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.MANGROVE_PLANKS)
                .unlockedBy(getHasName(Blocks.MANGROVE_PLANKS), has(Blocks.MANGROVE_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.MANGROVE_SHOVEL.get())
                .pattern(" P ")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.MANGROVE_PLANKS)
                .unlockedBy(getHasName(Blocks.MANGROVE_PLANKS), has(Blocks.MANGROVE_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.MANGROVE_AXE.get())
                .pattern("PP ")
                .pattern("PS ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.MANGROVE_PLANKS)
                .unlockedBy(getHasName(Blocks.MANGROVE_PLANKS), has(Blocks.MANGROVE_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.MANGROVE_HOE.get())
                .pattern("PP ")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.MANGROVE_PLANKS)
                .unlockedBy(getHasName(Blocks.MANGROVE_PLANKS), has(Blocks.MANGROVE_PLANKS))
                .save(pWriter);

        // CHERRY SWORD & TOOLS
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.CHERRY_SWORD.get())
                .pattern(" P ")
                .pattern(" P ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.CHERRY_PLANKS)
                .unlockedBy(getHasName(Blocks.CHERRY_PLANKS), has(Blocks.CHERRY_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CHERRY_PICKAXE.get())
                .pattern("PPP")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.CHERRY_PLANKS)
                .unlockedBy(getHasName(Blocks.CHERRY_PLANKS), has(Blocks.CHERRY_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CHERRY_SHOVEL.get())
                .pattern(" P ")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.CHERRY_PLANKS)
                .unlockedBy(getHasName(Blocks.CHERRY_PLANKS), has(Blocks.CHERRY_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CHERRY_AXE.get())
                .pattern("PP ")
                .pattern("PS ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.CHERRY_PLANKS)
                .unlockedBy(getHasName(Blocks.CHERRY_PLANKS), has(Blocks.CHERRY_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CHERRY_HOE.get())
                .pattern("PP ")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.CHERRY_PLANKS)
                .unlockedBy(getHasName(Blocks.CHERRY_PLANKS), has(Blocks.CHERRY_PLANKS))
                .save(pWriter);

        // BAMBOO SWORD & TOOLS
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BAMBOO_STICK.get())
                .pattern(" P ")
                .pattern(" P ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.BAMBOO_PLANKS)
                .unlockedBy(getHasName(Blocks.BAMBOO_PLANKS), has(Blocks.BAMBOO_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.BAMBOO_PICKAXE.get())
                .pattern("PPP")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.BAMBOO_PLANKS)
                .unlockedBy(getHasName(Blocks.BAMBOO_PLANKS), has(Blocks.BAMBOO_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.BAMBOO_SHOVEL.get())
                .pattern(" P ")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.BAMBOO_PLANKS)
                .unlockedBy(getHasName(Blocks.BAMBOO_PLANKS), has(Blocks.BAMBOO_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.BAMBOO_AXE.get())
                .pattern("PP ")
                .pattern("PS ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.BAMBOO_PLANKS)
                .unlockedBy(getHasName(Blocks.BAMBOO_PLANKS), has(Blocks.BAMBOO_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.BAMBOO_HOE.get())
                .pattern("PP ")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.BAMBOO_PLANKS)
                .unlockedBy(getHasName(Blocks.BAMBOO_PLANKS), has(Blocks.BAMBOO_PLANKS))
                .save(pWriter);

        // CRIMSON SWORD & TOOLS
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.CRIMSON_SWORD.get())
                .pattern(" P ")
                .pattern(" P ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.CRIMSON_PLANKS)
                .unlockedBy(getHasName(Blocks.CRIMSON_PLANKS), has(Blocks.CRIMSON_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CRIMSON_PICKAXE.get())
                .pattern("PPP")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.CRIMSON_PLANKS)
                .unlockedBy(getHasName(Blocks.CRIMSON_PLANKS), has(Blocks.CRIMSON_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CRIMSON_SHOVEL.get())
                .pattern(" P ")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.CRIMSON_PLANKS)
                .unlockedBy(getHasName(Blocks.CRIMSON_PLANKS), has(Blocks.CRIMSON_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CRIMSON_AXE.get())
                .pattern("PP ")
                .pattern("PS ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.CRIMSON_PLANKS)
                .unlockedBy(getHasName(Blocks.CRIMSON_PLANKS), has(Blocks.CRIMSON_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CRIMSON_HOE.get())
                .pattern("PP ")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.CRIMSON_PLANKS)
                .unlockedBy(getHasName(Blocks.CRIMSON_PLANKS), has(Blocks.CRIMSON_PLANKS))
                .save(pWriter);

        // WARPED SWORD & TOOLS
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.WARPED_SWORD.get())
                .pattern(" P ")
                .pattern(" P ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.WARPED_PLANKS)
                .unlockedBy(getHasName(Blocks.WARPED_PLANKS), has(Blocks.WARPED_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.WARPED_PICKAXE.get())
                .pattern("PPP")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.WARPED_PLANKS)
                .unlockedBy(getHasName(Blocks.WARPED_PLANKS), has(Blocks.WARPED_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.WARPED_SHOVEL.get())
                .pattern(" P ")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.WARPED_PLANKS)
                .unlockedBy(getHasName(Blocks.WARPED_PLANKS), has(Blocks.WARPED_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.WARPED_AXE.get())
                .pattern("PP ")
                .pattern("PS ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.WARPED_PLANKS)
                .unlockedBy(getHasName(Blocks.WARPED_PLANKS), has(Blocks.WARPED_PLANKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.WARPED_HOE.get())
                .pattern("PP ")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', Blocks.WARPED_PLANKS)
                .unlockedBy(getHasName(Blocks.WARPED_PLANKS), has(Blocks.WARPED_PLANKS))
                .save(pWriter);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.MEAT_CHUNKS_RAW.get())
                , RecipeCategory.FOOD, ModItems.MEAT_CHUNKS_COOKED.get(),
                0.35F, 200)
                .unlockedBy("has_meat_chunks_raw", has(ModItems.MEAT_CHUNKS_RAW.get()))
                .save(pWriter);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer).group(pGroup)
                    .unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  GhxstVanillaAddons.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }


}
