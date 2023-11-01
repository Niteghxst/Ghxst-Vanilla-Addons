package net.marshal.ghxstvanillaaddons.item;

import net.marshal.ghxstvanillaaddons.GhxstVanillaAddons;
import net.minecraft.ChatFormatting;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item>ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GhxstVanillaAddons.MOD_ID);

//    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
//            () -> new Item(new Item.Properties()));
//
//    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
//            () -> new Item(new Item.Properties()));

    // COPPER TOOLS

    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new SwordItem(ModToolTiers.COPPER, 4, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(ModToolTiers.COPPER, 2, -3.2f, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(ModToolTiers.COPPER, 1, -3.0f, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(ModToolTiers.COPPER, 7, -3.5f, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(ModToolTiers.COPPER, -1, -1.5f, new Item.Properties()));

    // COPPER ARMOR
    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet",
            () -> new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",
            () -> new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings",
            () -> new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots",
            () -> new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new Item.Properties()));

    // AMETHYST TOOLS
    public static final RegistryObject<Item> AMETHYST_ALLOY = ITEMS.register("amethyst_alloy",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword",
            () -> new SwordItem(ModToolTiers.AMETHYST, 4, -2f, new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel",
            () -> new ShovelItem(ModToolTiers.AMETHYST, 2, -2.6f, new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe",
            () -> new PickaxeItem(ModToolTiers.AMETHYST, 2, -2.4f, new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe",
            () -> new AxeItem(ModToolTiers.AMETHYST, 6, -2.6f, new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> AMETHYST_HOE = ITEMS.register("amethyst_hoe",
            () -> new HoeItem(ModToolTiers.AMETHYST, -1, -1.4f, new Item.Properties().rarity(Rarity.RARE)));

    // AMETHYST ARMOR
    public static final RegistryObject<Item> AMETHYST_HELMET = ITEMS.register("amethyst_helmet",
            () -> new ArmorItem(ModArmorMaterials.AMETHYST_ALLOY, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate",
            () -> new ArmorItem(ModArmorMaterials.AMETHYST_ALLOY, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings",
            () -> new ArmorItem(ModArmorMaterials.AMETHYST_ALLOY, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_BOOTS = ITEMS.register("amethyst_boots",
            () -> new ArmorItem(ModArmorMaterials.AMETHYST_ALLOY, ArmorItem.Type.BOOTS, new Item.Properties()));

    // EMERALD TOOLS
    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword",
            () -> new SwordItem(ModToolTiers.EMERALD, 3, -2.4f, new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel",
            () -> new ShovelItem(ModToolTiers.EMERALD, 1.5F, -3.0F, new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe",
            () -> new PickaxeItem(ModToolTiers.EMERALD, 1, -2.8F, new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe",
            () -> new AxeItem(ModToolTiers.EMERALD, 6, -3.0F, new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe",
            () -> new HoeItem(ModToolTiers.EMERALD, 0, -3.0F, new Item.Properties().rarity(Rarity.UNCOMMON)));

    // EMERALD ARMOR
    public static final RegistryObject<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet",
            () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate",
            () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings",
            () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_BOOTS = ITEMS.register("emerald_boots",
            () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.BOOTS, new Item.Properties()));

    // ==================================================================================================================

    // OAK TOOL
    public static final RegistryObject<Item> OAK_SWORD = ITEMS.register("oak_sword",
            () -> new SwordItem(ModToolTiers.OAK_WOOD, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> OAK_SHOVEL = ITEMS.register("oak_shovel",
            () -> new ShovelItem(ModToolTiers.OAK_WOOD, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> OAK_PICKAXE = ITEMS.register("oak_pickaxe",
            () -> new PickaxeItem(ModToolTiers.OAK_WOOD, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> OAK_AXE = ITEMS.register("oak_axe",
            () -> new AxeItem(ModToolTiers.OAK_WOOD, 6.0F, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> OAK_HOE = ITEMS.register("oak_hoe",
            () -> new HoeItem(ModToolTiers.OAK_WOOD, 0, -3.0F, new Item.Properties()));

    // BIRCH TOOL
    public static final RegistryObject<Item> BIRCH_SWORD = ITEMS.register("birch_sword",
            () -> new SwordItem(ModToolTiers.BIRCH_WOOD, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_SHOVEL = ITEMS.register("birch_shovel",
            () -> new ShovelItem(ModToolTiers.BIRCH_WOOD, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_PICKAXE = ITEMS.register("birch_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BIRCH_WOOD, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_AXE = ITEMS.register("birch_axe",
            () -> new AxeItem(ModToolTiers.BIRCH_WOOD, 6.0F, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_HOE = ITEMS.register("birch_hoe",
            () -> new HoeItem(ModToolTiers.BIRCH_WOOD, 0, -3.0F, new Item.Properties()));

    // JUNGLE TOOL
    public static final RegistryObject<Item> JUNGLE_SWORD = ITEMS.register("jungle_sword",
            () -> new SwordItem(ModToolTiers.JUNGLE_WOOD, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_SHOVEL = ITEMS.register("jungle_shovel",
            () -> new ShovelItem(ModToolTiers.JUNGLE_WOOD, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_PICKAXE = ITEMS.register("jungle_pickaxe",
            () -> new PickaxeItem(ModToolTiers.JUNGLE_WOOD, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_AXE = ITEMS.register("jungle_axe",
            () -> new AxeItem(ModToolTiers.JUNGLE_WOOD, 6.0F, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_HOE = ITEMS.register("jungle_hoe",
            () -> new HoeItem(ModToolTiers.JUNGLE_WOOD, 0, -3.0F, new Item.Properties()));

    // ACACIA TOOL
    public static final RegistryObject<Item> ACACIA_SWORD = ITEMS.register("acacia_sword",
            () -> new SwordItem(ModToolTiers.ACACIA_WOOD, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_SHOVEL = ITEMS.register("acacia_shovel",
            () -> new ShovelItem(ModToolTiers.ACACIA_WOOD, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_PICKAXE = ITEMS.register("acacia_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ACACIA_WOOD, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_AXE = ITEMS.register("acacia_axe",
            () -> new AxeItem(ModToolTiers.ACACIA_WOOD, 6.0F, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_HOE = ITEMS.register("acacia_hoe",
            () -> new HoeItem(ModToolTiers.ACACIA_WOOD, 0, -3.0F, new Item.Properties()));

    // DARK_OAK TOOL
    public static final RegistryObject<Item> DARK_OAK_SWORD = ITEMS.register("dark_oak_sword",
            () -> new SwordItem(ModToolTiers.DARK_OAK_WOOD, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_SHOVEL = ITEMS.register("dark_oak_shovel",
            () -> new ShovelItem(ModToolTiers.DARK_OAK_WOOD, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_PICKAXE = ITEMS.register("dark_oak_pickaxe",
            () -> new PickaxeItem(ModToolTiers.DARK_OAK_WOOD, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_AXE = ITEMS.register("dark_oak_axe",
            () -> new AxeItem(ModToolTiers.DARK_OAK_WOOD, 6.0F, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_HOE = ITEMS.register("dark_oak_hoe",
            () -> new HoeItem(ModToolTiers.DARK_OAK_WOOD, 0, -3.0F, new Item.Properties()));

    // MANGROVE TOOL
    public static final RegistryObject<Item> MANGROVE_SWORD = ITEMS.register("mangrove_sword",
            () -> new SwordItem(ModToolTiers.MANGROVE_WOOD, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_SHOVEL = ITEMS.register("mangrove_shovel",
            () -> new ShovelItem(ModToolTiers.MANGROVE_WOOD, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_PICKAXE = ITEMS.register("mangrove_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MANGROVE_WOOD, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_AXE = ITEMS.register("mangrove_axe",
            () -> new AxeItem(ModToolTiers.MANGROVE_WOOD, 6.0F, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_HOE = ITEMS.register("mangrove_hoe",
            () -> new HoeItem(ModToolTiers.MANGROVE_WOOD, 0, -3.0F, new Item.Properties()));

    // CHERRY TOOL
    public static final RegistryObject<Item> CHERRY_SWORD = ITEMS.register("cherry_sword",
            () -> new SwordItem(ModToolTiers.CHERRY_WOOD, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_SHOVEL = ITEMS.register("cherry_shovel",
            () -> new ShovelItem(ModToolTiers.CHERRY_WOOD, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_PICKAXE = ITEMS.register("cherry_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CHERRY_WOOD, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_AXE = ITEMS.register("cherry_axe",
            () -> new AxeItem(ModToolTiers.CHERRY_WOOD, 6.0F, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_HOE = ITEMS.register("cherry_hoe",
            () -> new HoeItem(ModToolTiers.CHERRY_WOOD, 0, -3.0F, new Item.Properties()));

    // BAMBOO TOOL
    public static final RegistryObject<Item> BAMBOO_STICK = ITEMS.register("bamboo_stick",
            () -> new SwordItem(ModToolTiers.BAMBOO_WOOD, 4, -2.0F, new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_SHOVEL = ITEMS.register("bamboo_shovel",
            () -> new ShovelItem(ModToolTiers.BAMBOO_WOOD, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_PICKAXE = ITEMS.register("bamboo_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BAMBOO_WOOD, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_AXE = ITEMS.register("bamboo_axe",
            () -> new AxeItem(ModToolTiers.BAMBOO_WOOD, 6.0F, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_HOE = ITEMS.register("bamboo_hoe",
            () -> new HoeItem(ModToolTiers.BAMBOO_WOOD, 0, -3.0F, new Item.Properties()));

    // CRIMSON TOOL
    public static final RegistryObject<Item> CRIMSON_SWORD = ITEMS.register("crimson_sword",
            () -> new SwordItem(ModToolTiers.CRIMSON_WOOD, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_SHOVEL = ITEMS.register("crimson_shovel",
            () -> new ShovelItem(ModToolTiers.CRIMSON_WOOD, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_PICKAXE = ITEMS.register("crimson_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CRIMSON_WOOD, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_AXE = ITEMS.register("crimson_axe",
            () -> new AxeItem(ModToolTiers.CRIMSON_WOOD, 6.0F, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_HOE = ITEMS.register("crimson_hoe",
            () -> new HoeItem(ModToolTiers.CRIMSON_WOOD, 0, -3.0F, new Item.Properties()));

    // WARPED TOOL
    public static final RegistryObject<Item> WARPED_SWORD = ITEMS.register("warped_sword",
            () -> new SwordItem(ModToolTiers.WARPED_WOOD, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> WARPED_SHOVEL = ITEMS.register("warped_shovel",
            () -> new ShovelItem(ModToolTiers.WARPED_WOOD, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> WARPED_PICKAXE = ITEMS.register("warped_pickaxe",
            () -> new PickaxeItem(ModToolTiers.WARPED_WOOD, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> WARPED_AXE = ITEMS.register("warped_axe",
            () -> new AxeItem(ModToolTiers.WARPED_WOOD, 6.0F, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> WARPED_HOE = ITEMS.register("warped_hoe",
            () -> new HoeItem(ModToolTiers.WARPED_WOOD, 0, -3.0F, new Item.Properties()));

    // ==================================================================================================================

    public static final RegistryObject<Item> GLISTENING_CARROT = ITEMS.register("glistening_carrot",
            () -> new EnchantedGoldenAppleItem(new Item.Properties().rarity(Rarity.EPIC).food(ModFoods.GLISTENING_CARROT)));
    public static final RegistryObject<Item> MEAT_CHUNKS_RAW = ITEMS.register("meat_chunks_raw",
            () -> new Item(new Item.Properties().food(ModFoods.MEAT_CHUNKS_RAW)));
    public static final RegistryObject<Item> MEAT_CHUNKS_COOKED = ITEMS.register("meat_chunks_cooked",
            () -> new Item(new Item.Properties().food(ModFoods.MEAT_CHUNKS_COOKED)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
