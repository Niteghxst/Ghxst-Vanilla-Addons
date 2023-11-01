package net.marshal.ghxstvanillaaddons.util;

import net.marshal.ghxstvanillaaddons.GhxstVanillaAddons;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> COPPER_MINEABLES = tag("copper_mineables");
        public static final TagKey<Block> AMETHYST_MINEABLES = tag("amethyst_mineables");
        public static final TagKey<Block> EMERALD_MINEABLES = tag("emerald_mineables");

        public static final TagKey<Block> NEEDS_COPPER_TOOL = tag("needs_copper_tool");
        public static final TagKey<Block> NEEDS_AMETHYST_TOOL = tag("needs_amethyst_tool");
        public static final TagKey<Block> NEEDS_EMERALD_TOOL = tag("needs_emerald_tool");

        public static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(GhxstVanillaAddons.MOD_ID, name));
        }
    }

    public static class Items {
        public static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(GhxstVanillaAddons.MOD_ID, name));
        }
    }

}
