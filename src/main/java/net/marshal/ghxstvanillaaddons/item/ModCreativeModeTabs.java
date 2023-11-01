package net.marshal.ghxstvanillaaddons.item;

import net.marshal.ghxstvanillaaddons.GhxstVanillaAddons;
import net.marshal.ghxstvanillaaddons.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GhxstVanillaAddons.MOD_ID);

    public static final RegistryObject<CreativeModeTab> GVA_TAB = CREATIVE_MODE_TABS.register("gva_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack((ModItems.AMETHYST_ALLOY.get())))
                    .title(Component.translatable("creativetab.gva_tab"))
                    .displayItems(((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.GLISTENING_CARROT.get());
                        pOutput.accept(ModItems.MEAT_CHUNKS_RAW.get());
                        pOutput.accept(ModItems.MEAT_CHUNKS_COOKED.get());

                        pOutput.accept(ModItems.COPPER_SWORD.get());
                        pOutput.accept(ModItems.COPPER_PICKAXE.get());
                        pOutput.accept(ModItems.COPPER_AXE.get());
                        pOutput.accept(ModItems.COPPER_SHOVEL.get());
                        pOutput.accept(ModItems.COPPER_HOE.get());

                        pOutput.accept(ModItems.COPPER_HELMET.get());
                        pOutput.accept(ModItems.COPPER_CHESTPLATE.get());
                        pOutput.accept(ModItems.COPPER_LEGGINGS.get());
                        pOutput.accept(ModItems.COPPER_BOOTS.get());

                        pOutput.accept(ModItems.AMETHYST_ALLOY.get());
                        pOutput.accept(ModItems.AMETHYST_SWORD.get());
                        pOutput.accept(ModItems.AMETHYST_PICKAXE.get());
                        pOutput.accept(ModItems.AMETHYST_AXE.get());
                        pOutput.accept(ModItems.AMETHYST_SHOVEL.get());
                        pOutput.accept(ModItems.AMETHYST_HOE.get());

                        pOutput.accept(ModItems.AMETHYST_HELMET.get());
                        pOutput.accept(ModItems.AMETHYST_CHESTPLATE.get());
                        pOutput.accept(ModItems.AMETHYST_LEGGINGS.get());
                        pOutput.accept(ModItems.AMETHYST_BOOTS.get());

                        pOutput.accept(ModItems.EMERALD_SWORD.get());
                        pOutput.accept(ModItems.EMERALD_PICKAXE.get());
                        pOutput.accept(ModItems.EMERALD_AXE.get());
                        pOutput.accept(ModItems.EMERALD_SHOVEL.get());
                        pOutput.accept(ModItems.EMERALD_HOE.get());

                        pOutput.accept(ModItems.EMERALD_HELMET.get());
                        pOutput.accept(ModItems.EMERALD_CHESTPLATE.get());
                        pOutput.accept(ModItems.EMERALD_LEGGINGS.get());
                        pOutput.accept(ModItems.EMERALD_BOOTS.get());

                        // WOODEN TOOLS
                        pOutput.accept(ModItems.OAK_SWORD.get());
                        pOutput.accept(ModItems.OAK_PICKAXE.get());
                        pOutput.accept(ModItems.OAK_AXE.get());
                        pOutput.accept(ModItems.OAK_SHOVEL.get());
                        pOutput.accept(ModItems.OAK_HOE.get());

                        pOutput.accept(ModItems.BIRCH_SWORD.get());
                        pOutput.accept(ModItems.BIRCH_PICKAXE.get());
                        pOutput.accept(ModItems.BIRCH_AXE.get());
                        pOutput.accept(ModItems.BIRCH_SHOVEL.get());
                        pOutput.accept(ModItems.BIRCH_HOE.get());

                        pOutput.accept(ModItems.JUNGLE_SWORD.get());
                        pOutput.accept(ModItems.JUNGLE_PICKAXE.get());
                        pOutput.accept(ModItems.JUNGLE_AXE.get());
                        pOutput.accept(ModItems.JUNGLE_SHOVEL.get());
                        pOutput.accept(ModItems.JUNGLE_HOE.get());

                        pOutput.accept(ModItems.ACACIA_SWORD.get());
                        pOutput.accept(ModItems.ACACIA_PICKAXE.get());
                        pOutput.accept(ModItems.ACACIA_AXE.get());
                        pOutput.accept(ModItems.ACACIA_SHOVEL.get());
                        pOutput.accept(ModItems.ACACIA_HOE.get());

                        pOutput.accept(ModItems.DARK_OAK_SWORD.get());
                        pOutput.accept(ModItems.DARK_OAK_PICKAXE.get());
                        pOutput.accept(ModItems.DARK_OAK_AXE.get());
                        pOutput.accept(ModItems.DARK_OAK_SHOVEL.get());
                        pOutput.accept(ModItems.DARK_OAK_HOE.get());

                        pOutput.accept(ModItems.MANGROVE_SWORD.get());
                        pOutput.accept(ModItems.MANGROVE_PICKAXE.get());
                        pOutput.accept(ModItems.MANGROVE_AXE.get());
                        pOutput.accept(ModItems.MANGROVE_SHOVEL.get());
                        pOutput.accept(ModItems.MANGROVE_HOE.get());

                        pOutput.accept(ModItems.CHERRY_SWORD.get());
                        pOutput.accept(ModItems.CHERRY_PICKAXE.get());
                        pOutput.accept(ModItems.CHERRY_AXE.get());
                        pOutput.accept(ModItems.CHERRY_SHOVEL.get());
                        pOutput.accept(ModItems.CHERRY_HOE.get());

                        pOutput.accept(ModItems.BAMBOO_STICK.get());
                        pOutput.accept(ModItems.BAMBOO_PICKAXE.get());
                        pOutput.accept(ModItems.BAMBOO_AXE.get());
                        pOutput.accept(ModItems.BAMBOO_SHOVEL.get());
                        pOutput.accept(ModItems.BAMBOO_HOE.get());

                        pOutput.accept(ModItems.CRIMSON_SWORD.get());
                        pOutput.accept(ModItems.CRIMSON_PICKAXE.get());
                        pOutput.accept(ModItems.CRIMSON_AXE.get());
                        pOutput.accept(ModItems.CRIMSON_SHOVEL.get());
                        pOutput.accept(ModItems.CRIMSON_HOE.get());

                        pOutput.accept(ModItems.WARPED_SWORD.get());
                        pOutput.accept(ModItems.WARPED_PICKAXE.get());
                        pOutput.accept(ModItems.WARPED_AXE.get());
                        pOutput.accept(ModItems.WARPED_SHOVEL.get());
                        pOutput.accept(ModItems.WARPED_HOE.get());


//                        pOutput.accept(ModItems.SAPPHIRE.get());
//                        pOutput.accept(ModItems.RAW_SAPPHIRE.get());

//                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
//
//                        pOutput.accept(ModBlocks.SAPPHIRE_ORE.get());

                    }))
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
