package net.marshal.ghxstvanillaaddons.datagen;

import net.marshal.ghxstvanillaaddons.GhxstVanillaAddons;
import net.marshal.ghxstvanillaaddons.item.ModItems;
import net.marshal.ghxstvanillaaddons.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, GhxstVanillaAddons.MOD_ID);
    }

    @Override
    protected void start() {
        // Add porkchop drops to all piglin types
        add("pork_from_piglins", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entities/piglin")).build() }, Items.PORKCHOP ));
        add("pork_from_piglin_brutes", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entities/piglin_brute")).build() }, Items.PORKCHOP ));
        add("pork_from_zombified_piglin", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entities/zombified_piglin")).build() }, Items.PORKCHOP));
        // Add food item drop to spiders
        add("meat_chunks_from_spiders", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entities/spider")).build() }, ModItems.MEAT_CHUNKS_RAW.get()));
    }
}
