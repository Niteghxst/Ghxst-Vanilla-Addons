package net.marshal.ghxstvanillaaddons.datagen;

import net.marshal.ghxstvanillaaddons.GhxstVanillaAddons;
import net.marshal.ghxstvanillaaddons.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, GhxstVanillaAddons.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.AMETHYST_ALLOY);
        simpleItem(ModItems.GLISTENING_CARROT);
        simpleItem(ModItems.MEAT_CHUNKS_RAW);
        simpleItem(ModItems.MEAT_CHUNKS_COOKED);

        handheldItem(ModItems.COPPER_SWORD);
        handheldItem(ModItems.COPPER_PICKAXE);
        handheldItem(ModItems.COPPER_AXE);
        handheldItem(ModItems.COPPER_SHOVEL);
        handheldItem(ModItems.COPPER_HOE);

        simpleItem(ModItems.COPPER_HELMET);
        simpleItem(ModItems.COPPER_CHESTPLATE);
        simpleItem(ModItems.COPPER_LEGGINGS);
        simpleItem(ModItems.COPPER_BOOTS);

        handheldItem(ModItems.AMETHYST_SWORD);
        handheldItem(ModItems.AMETHYST_PICKAXE);
        handheldItem(ModItems.AMETHYST_AXE);
        handheldItem(ModItems.AMETHYST_SHOVEL);
        handheldItem(ModItems.AMETHYST_HOE);

        simpleItem(ModItems.AMETHYST_HELMET);
        simpleItem(ModItems.AMETHYST_CHESTPLATE);
        simpleItem(ModItems.AMETHYST_LEGGINGS);
        simpleItem(ModItems.AMETHYST_BOOTS);

        handheldItem(ModItems.EMERALD_SWORD);
        handheldItem(ModItems.EMERALD_PICKAXE);
        handheldItem(ModItems.EMERALD_AXE);
        handheldItem(ModItems.EMERALD_SHOVEL);
        handheldItem(ModItems.EMERALD_HOE);

        simpleItem(ModItems.EMERALD_HELMET);
        simpleItem(ModItems.EMERALD_CHESTPLATE);
        simpleItem(ModItems.EMERALD_LEGGINGS);
        simpleItem(ModItems.EMERALD_BOOTS);

        // WOODEN TOOLS
        handheldItem(ModItems.OAK_SWORD);
        handheldItem(ModItems.OAK_PICKAXE);
        handheldItem(ModItems.OAK_AXE);
        handheldItem(ModItems.OAK_SHOVEL);
        handheldItem(ModItems.OAK_HOE);

        handheldItem(ModItems.BIRCH_SWORD);
        handheldItem(ModItems.BIRCH_PICKAXE);
        handheldItem(ModItems.BIRCH_AXE);
        handheldItem(ModItems.BIRCH_SHOVEL);
        handheldItem(ModItems.BIRCH_HOE);

        handheldItem(ModItems.JUNGLE_SWORD);
        handheldItem(ModItems.JUNGLE_PICKAXE);
        handheldItem(ModItems.JUNGLE_AXE);
        handheldItem(ModItems.JUNGLE_SHOVEL);
        handheldItem(ModItems.JUNGLE_HOE);

        handheldItem(ModItems.ACACIA_SWORD);
        handheldItem(ModItems.ACACIA_PICKAXE);
        handheldItem(ModItems.ACACIA_AXE);
        handheldItem(ModItems.ACACIA_SHOVEL);
        handheldItem(ModItems.ACACIA_HOE);

        handheldItem(ModItems.DARK_OAK_SWORD);
        handheldItem(ModItems.DARK_OAK_PICKAXE);
        handheldItem(ModItems.DARK_OAK_AXE);
        handheldItem(ModItems.DARK_OAK_SHOVEL);
        handheldItem(ModItems.DARK_OAK_HOE);

        handheldItem(ModItems.MANGROVE_SWORD);
        handheldItem(ModItems.MANGROVE_PICKAXE);
        handheldItem(ModItems.MANGROVE_AXE);
        handheldItem(ModItems.MANGROVE_SHOVEL);
        handheldItem(ModItems.MANGROVE_HOE);

        handheldItem(ModItems.CHERRY_SWORD);
        handheldItem(ModItems.CHERRY_PICKAXE);
        handheldItem(ModItems.CHERRY_AXE);
        handheldItem(ModItems.CHERRY_SHOVEL);
        handheldItem(ModItems.CHERRY_HOE);

        handheldItem(ModItems.BAMBOO_STICK);
        handheldItem(ModItems.BAMBOO_PICKAXE);
        handheldItem(ModItems.BAMBOO_AXE);
        handheldItem(ModItems.BAMBOO_SHOVEL);
        handheldItem(ModItems.BAMBOO_HOE);

        handheldItem(ModItems.CRIMSON_SWORD);
        handheldItem(ModItems.CRIMSON_PICKAXE);
        handheldItem(ModItems.CRIMSON_AXE);
        handheldItem(ModItems.CRIMSON_SHOVEL);
        handheldItem(ModItems.CRIMSON_HOE);

        handheldItem(ModItems.WARPED_SWORD);
        handheldItem(ModItems.WARPED_PICKAXE);
        handheldItem(ModItems.WARPED_AXE);
        handheldItem(ModItems.WARPED_SHOVEL);
        handheldItem(ModItems.WARPED_HOE);

    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(GhxstVanillaAddons.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(GhxstVanillaAddons.MOD_ID, "item/" + item.getId().getPath()));
    }

}
