package com.theis.tutorial.datagen;

import com.theis.tutorial.block.ModBlocks;
import com.theis.tutorial.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WAND.get())
                .pattern("  T")
                .pattern(" T ")
                .pattern("N  ")
                .define('T', ModBlocks.TOPAZ_BLOCK.get())
                .define('N', Blocks.NETHERITE_BLOCK)
                .unlockedBy(getHasName(ModBlocks.TOPAZ_BLOCK.get()), has(ModBlocks.TOPAZ_BLOCK.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TOPAZ_BLOCK.get())
                .pattern("TTT")
                .pattern("TTT")
                .pattern("TTT")
                .define('T', ModItems.TOPAZ.get())
                .unlockedBy(getHasName(ModItems.TOPAZ.get()), has(ModItems.TOPAZ.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RUBY_BLOCK.get())
                .pattern("TTT")
                .pattern("TTT")
                .pattern("TTT")
                .define('T', ModItems.RUBY.get())
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAPPHIRE_BLOCK.get())
                .pattern("TTT")
                .pattern("TTT")
                .pattern("TTT")
                .define('T', ModItems.SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get())).save(pRecipeOutput);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TOPAZ.get(), 9)
                .requires(ModBlocks.TOPAZ_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.TOPAZ_BLOCK.get()), has(ModBlocks.TOPAZ_BLOCK.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RUBY.get(), 9)
                .requires(ModBlocks.RUBY_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RUBY_BLOCK.get()), has(ModBlocks.RUBY_BLOCK.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 9)
                .requires(ModBlocks.SAPPHIRE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SAPPHIRE_BLOCK.get()), has(ModBlocks.SAPPHIRE_BLOCK.get())).save(pRecipeOutput);

        stairBuilder(ModBlocks.TOPAZ_STAIRS.get(), Ingredient.of(ModItems.TOPAZ.get())).group("topaz")
                .unlockedBy(getHasName(ModItems.TOPAZ.get()), has(ModItems.TOPAZ.get()));
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TOPAZ_SLAB.get(), ModItems.TOPAZ.get());

        buttonBuilder(ModBlocks.TOPAZ_BUTTON.get(), Ingredient.of(ModItems.TOPAZ.get())).group("alexandrite")
                .unlockedBy(getHasName(ModItems.TOPAZ.get()), has(ModItems.TOPAZ.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, ModBlocks.TOPAZ_PRESSURE_PLATE.get(), ModItems.TOPAZ.get());

        fenceBuilder(ModBlocks.TOPAZ_FENCE.get(), Ingredient.of(ModItems.TOPAZ.get())).group("alexandrite")
                .unlockedBy(getHasName(ModItems.TOPAZ.get()), has(ModItems.TOPAZ.get())).save(pRecipeOutput);
        fenceGateBuilder(ModBlocks.TOPAZ_FENCE_GATE.get(), Ingredient.of(ModItems.TOPAZ.get())).group("alexandrite")
                .unlockedBy(getHasName(ModItems.TOPAZ.get()), has(ModItems.TOPAZ.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TOPAZ_WALL.get(), ModItems.TOPAZ.get());


        stairBuilder(ModBlocks.RUBY_STAIRS.get(), Ingredient.of(ModItems.RUBY.get())).group("topaz")
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get()));
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBY_SLAB.get(), ModItems.RUBY.get());

        buttonBuilder(ModBlocks.RUBY_BUTTON.get(), Ingredient.of(ModItems.RUBY.get())).group("alexandrite")
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, ModBlocks.RUBY_PRESSURE_PLATE.get(), ModItems.RUBY.get());

        fenceBuilder(ModBlocks.RUBY_FENCE.get(), Ingredient.of(ModItems.RUBY.get())).group("alexandrite")
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get())).save(pRecipeOutput);
        fenceGateBuilder(ModBlocks.RUBY_FENCE_GATE.get(), Ingredient.of(ModItems.RUBY.get())).group("alexandrite")
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBY_WALL.get(), ModItems.RUBY.get());


        stairBuilder(ModBlocks.SAPPHIRE_STAIRS.get(), Ingredient.of(ModItems.SAPPHIRE.get())).group("topaz")
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()));
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SAPPHIRE_SLAB.get(), ModItems.SAPPHIRE.get());

        buttonBuilder(ModBlocks.SAPPHIRE_BUTTON.get(), Ingredient.of(ModItems.SAPPHIRE.get())).group("alexandrite")
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, ModBlocks.SAPPHIRE_PRESSURE_PLATE.get(), ModItems.SAPPHIRE.get());

        fenceBuilder(ModBlocks.SAPPHIRE_FENCE.get(), Ingredient.of(ModItems.SAPPHIRE.get())).group("alexandrite")
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get())).save(pRecipeOutput);
        fenceGateBuilder(ModBlocks.SAPPHIRE_FENCE_GATE.get(), Ingredient.of(ModItems.SAPPHIRE.get())).group("alexandrite")
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SAPPHIRE_WALL.get(), ModItems.SAPPHIRE.get());
    }
}
