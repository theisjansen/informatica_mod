package com.theis.tutorial.datagen;

import com.theis.tutorial.block.ModBlocks;
import com.theis.tutorial.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider pRegistries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.RUBY_BLOCK.get());
        dropSelf(ModBlocks.TOPAZ_BLOCK.get());
        dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());

        dropSelf(ModBlocks.TOPAZ_STAIRS.get());
        this.add(ModBlocks.TOPAZ_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.TOPAZ_SLAB.get()));
        dropSelf(ModBlocks.TOPAZ_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.TOPAZ_BUTTON.get());
        dropSelf(ModBlocks.TOPAZ_FENCE.get());
        dropSelf(ModBlocks.TOPAZ_FENCE_GATE.get());
        dropSelf(ModBlocks.TOPAZ_WALL.get());

        dropSelf(ModBlocks.RUBY_STAIRS.get());
        this.add(ModBlocks.RUBY_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.RUBY_SLAB.get()));
        dropSelf(ModBlocks.RUBY_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.RUBY_BUTTON.get());
        dropSelf(ModBlocks.RUBY_FENCE.get());
        dropSelf(ModBlocks.RUBY_FENCE_GATE.get());
        dropSelf(ModBlocks.RUBY_WALL.get());

        dropSelf(ModBlocks.SAPPHIRE_STAIRS.get());
        this.add(ModBlocks.SAPPHIRE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.RUBY_SLAB.get()));
        dropSelf(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.SAPPHIRE_BUTTON.get());
        dropSelf(ModBlocks.SAPPHIRE_FENCE.get());
        dropSelf(ModBlocks.SAPPHIRE_FENCE_GATE.get());
        dropSelf(ModBlocks.SAPPHIRE_WALL.get());

        this.add(ModBlocks.TOPAZ_ORE.get(),
                block -> createOreDrop(ModBlocks.TOPAZ_ORE.get(), ModItems.TOPAZ.get()));
        this.add(ModBlocks.RUBY_ORE.get(),
                block -> createOreDrop(ModBlocks.RUBY_ORE.get(), ModItems.RUBY.get()));
        this.add(ModBlocks.SAPPHIRE_ORE.get(),
                block -> createOreDrop(ModBlocks.SAPPHIRE_ORE.get(), ModItems.SAPPHIRE.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
