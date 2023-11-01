package net.marshal.ghxstvanillaaddons.datagen;

import net.marshal.ghxstvanillaaddons.GhxstVanillaAddons;
import net.marshal.ghxstvanillaaddons.block.ModBlocks;
import net.marshal.ghxstvanillaaddons.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {


    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, GhxstVanillaAddons.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

//        this.tag(ModTags.Blocks.COPPER_MINEABLES)
//                .add(ModBlocks.SAPPHIRE_ORE.get()).addTag(Tags.Blocks.ORES);
//
//        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
//                .add(ModBlocks.SAPPHIRE_BLOCK.get(),
//                        ModBlocks.RAW_SAPPHIRE_BLOCK.get(),
//                        ModBlocks.SAPPHIRE_ORE.get(),
//                        ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
//
//        this.tag(ModTags.Blocks.NEEDS_COPPER_TOOL)
//                .add(ModBlocks.SAPPHIRE_BLOCK.get(),
//                        ModBlocks.RAW_SAPPHIRE_BLOCK.get(),
//                        ModBlocks.SAPPHIRE_ORE.get(),
//                        ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());

//        this.tag(ModTags.Blocks.NEEDS_COPPER_TOOL)
//
//        this.tag(ModTags.Blocks.NEEDS_AMETHYST_TOOL)
//                .add(ModBlocks.SAPPHIRE_BLOCK.get(),
//                        ModBlocks.RAW_SAPPHIRE_BLOCK.get(),
//                        ModBlocks.SAPPHIRE_ORE.get(),
//                        ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());

//        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
//                .add(ModBlocks.SAPPHIRE_BLOCK.get());
    }
}
