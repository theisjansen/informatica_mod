package com.theis.tutorial.datagen;

import com.theis.tutorial.TutorialMod;
import com.theis.tutorial.block.ModBlocks;
import com.theis.tutorial.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TutorialMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.TOPAZ_BLOCK.get())
                .add(ModBlocks.TOPAZ_ORE.get())
                .add(ModBlocks.RUBY_BLOCK.get())
                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.SAPPHIRE_BLOCK.get())
                .add(ModBlocks.SAPPHIRE_ORE.get())
                .add(ModBlocks.TOPAZ_STAIRS.get())
                .add(ModBlocks.TOPAZ_SLAB.get())
                .add(ModBlocks.TOPAZ_PRESSURE_PLATE.get())
                .add(ModBlocks.TOPAZ_BUTTON.get())
                .add(ModBlocks.TOPAZ_FENCE.get())
                .add(ModBlocks.TOPAZ_FENCE_GATE.get())
                .add(ModBlocks.TOPAZ_WALL.get())
                .add(ModBlocks.RUBY_STAIRS.get())
                .add(ModBlocks.RUBY_SLAB.get())
                .add(ModBlocks.RUBY_PRESSURE_PLATE.get())
                .add(ModBlocks.RUBY_BUTTON.get())
                .add(ModBlocks.RUBY_FENCE.get())
                .add(ModBlocks.RUBY_FENCE_GATE.get())
                .add(ModBlocks.RUBY_WALL.get())
                .add(ModBlocks.SAPPHIRE_STAIRS.get())
                .add(ModBlocks.SAPPHIRE_SLAB.get())
                .add(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get())
                .add(ModBlocks.SAPPHIRE_BUTTON.get())
                .add(ModBlocks.SAPPHIRE_FENCE.get())
                .add(ModBlocks.SAPPHIRE_FENCE_GATE.get())
                .add(ModBlocks.SAPPHIRE_WALL.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RUBY_BLOCK.get())
                .add(ModBlocks.TOPAZ_STAIRS.get())
                .add(ModBlocks.TOPAZ_SLAB.get())
                .add(ModBlocks.TOPAZ_PRESSURE_PLATE.get())
                .add(ModBlocks.TOPAZ_BUTTON.get())
                .add(ModBlocks.TOPAZ_FENCE.get())
                .add(ModBlocks.TOPAZ_FENCE_GATE.get())
                .add(ModBlocks.TOPAZ_WALL.get())
                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get())
                .add(ModBlocks.DEEPSLATE_RUBY_ORE.get())
                .add(ModBlocks.SAPPHIRE_BLOCK.get())
                .add(ModBlocks.SAPPHIRE_ORE.get())
                .add(ModBlocks.RUBY_STAIRS.get())
                .add(ModBlocks.RUBY_SLAB.get())
                .add(ModBlocks.RUBY_PRESSURE_PLATE.get())
                .add(ModBlocks.RUBY_BUTTON.get())
                .add(ModBlocks.RUBY_FENCE.get())
                .add(ModBlocks.RUBY_FENCE_GATE.get())
                .add(ModBlocks.RUBY_WALL.get())
                .add(ModBlocks.SAPPHIRE_STAIRS.get())
                .add(ModBlocks.SAPPHIRE_SLAB.get())
                .add(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get())
                .add(ModBlocks.SAPPHIRE_BUTTON.get())
                .add(ModBlocks.SAPPHIRE_FENCE.get())
                .add(ModBlocks.SAPPHIRE_FENCE_GATE.get())
                .add(ModBlocks.SAPPHIRE_WALL.get());
        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.TOPAZ_BLOCK.get())
                .add(ModBlocks.TOPAZ_ORE.get())
                .add(ModBlocks.DEEPSLATE_TOPAZ_ORE.get());
        tag(BlockTags.FENCES).add(ModBlocks.TOPAZ_FENCE.get());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.TOPAZ_FENCE_GATE.get());
        tag(BlockTags.WALLS).add(ModBlocks.TOPAZ_WALL.get());
        tag(BlockTags.FENCES).add(ModBlocks.RUBY_FENCE.get());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.RUBY_FENCE_GATE.get());
        tag(BlockTags.WALLS).add(ModBlocks.RUBY_WALL.get());
        tag(BlockTags.FENCES).add(ModBlocks.SAPPHIRE_FENCE.get());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.SAPPHIRE_FENCE_GATE.get());
        tag(BlockTags.WALLS).add(ModBlocks.SAPPHIRE_WALL.get());


        tag(ModTags.NEEDS_TOPAZ_TOOL)
                .add(Blocks.BEDROCK)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(ModTags.INCORRECT_FOR_TOPAZ_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .remove(ModTags.NEEDS_TOPAZ_TOOL);

        tag(ModTags.NEEDS_RUBY_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        tag(ModTags.INCORRECT_FOR_RUBY_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .remove(ModTags.NEEDS_RUBY_TOOL);

        tag(ModTags.NEEDS_SAPPHIRE_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        tag(ModTags.INCORRECT_FOR_SAPPHIRE_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .remove(ModTags.NEEDS_SAPPHIRE_TOOL);
    }
}
