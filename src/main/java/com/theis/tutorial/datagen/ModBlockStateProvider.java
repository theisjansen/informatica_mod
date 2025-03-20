package com.theis.tutorial.datagen;

import com.theis.tutorial.TutorialMod;
import com.theis.tutorial.block.ModBlocks;
import com.theis.tutorial.block.custom.TopazLampBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TutorialMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.RUBY_BLOCK);
        blockWithItem(ModBlocks.TOPAZ_BLOCK);
        blockWithItem(ModBlocks.SAPPHIRE_BLOCK);
        blockWithItem(ModBlocks.RUBY_ORE);
        blockWithItem(ModBlocks.TOPAZ_ORE);
        blockWithItem(ModBlocks.SAPPHIRE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_TOPAZ_ORE);

        stairsBlock(ModBlocks.TOPAZ_STAIRS.get(), blockTexture(ModBlocks.TOPAZ_BLOCK.get()));
        slabBlock(ModBlocks.TOPAZ_SLAB.get(), blockTexture(ModBlocks.TOPAZ_BLOCK.get()), blockTexture(ModBlocks.TOPAZ_BLOCK.get()));
        buttonBlock(ModBlocks.TOPAZ_BUTTON.get(), blockTexture(ModBlocks.TOPAZ_BLOCK.get()));
        pressurePlateBlock(ModBlocks.TOPAZ_PRESSURE_PLATE.get(), blockTexture(ModBlocks.TOPAZ_BLOCK.get()));
        fenceBlock(ModBlocks.TOPAZ_FENCE.get(), blockTexture(ModBlocks.TOPAZ_BLOCK.get()));
        fenceGateBlock(ModBlocks.TOPAZ_FENCE_GATE.get(), blockTexture(ModBlocks.TOPAZ_BLOCK.get()));
        wallBlock(ModBlocks.TOPAZ_WALL.get(), blockTexture(ModBlocks.TOPAZ_BLOCK.get()));

        blockItem(ModBlocks.TOPAZ_STAIRS);
        blockItem(ModBlocks.TOPAZ_SLAB);
        blockItem(ModBlocks.TOPAZ_PRESSURE_PLATE);
        blockItem(ModBlocks.TOPAZ_FENCE_GATE);

        stairsBlock(ModBlocks.RUBY_STAIRS.get(), blockTexture(ModBlocks.RUBY_BLOCK.get()));
        slabBlock(ModBlocks.RUBY_SLAB.get(), blockTexture(ModBlocks.RUBY_BLOCK.get()), blockTexture(ModBlocks.RUBY_BLOCK.get()));
        buttonBlock(ModBlocks.RUBY_BUTTON.get(), blockTexture(ModBlocks.RUBY_BLOCK.get()));
        pressurePlateBlock(ModBlocks.RUBY_PRESSURE_PLATE.get(), blockTexture(ModBlocks.RUBY_BLOCK.get()));
        fenceBlock(ModBlocks.RUBY_FENCE.get(), blockTexture(ModBlocks.RUBY_BLOCK.get()));
        fenceGateBlock(ModBlocks.RUBY_FENCE_GATE.get(), blockTexture(ModBlocks.RUBY_BLOCK.get()));
        wallBlock(ModBlocks.RUBY_WALL.get(), blockTexture(ModBlocks.RUBY_BLOCK.get()));

        blockItem(ModBlocks.RUBY_STAIRS);
        blockItem(ModBlocks.RUBY_SLAB);
        blockItem(ModBlocks.RUBY_PRESSURE_PLATE);
        blockItem(ModBlocks.RUBY_FENCE_GATE);

        stairsBlock(ModBlocks.SAPPHIRE_STAIRS.get(), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        slabBlock(ModBlocks.SAPPHIRE_SLAB.get(), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        buttonBlock(ModBlocks.SAPPHIRE_BUTTON.get(), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        pressurePlateBlock(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        fenceBlock(ModBlocks.SAPPHIRE_FENCE.get(), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        fenceGateBlock(ModBlocks.SAPPHIRE_FENCE_GATE.get(), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        wallBlock(ModBlocks.SAPPHIRE_WALL.get(), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));

        blockItem(ModBlocks.SAPPHIRE_STAIRS);
        blockItem(ModBlocks.SAPPHIRE_SLAB);
        blockItem(ModBlocks.SAPPHIRE_PRESSURE_PLATE);
        blockItem(ModBlocks.SAPPHIRE_FENCE_GATE);

        customLamp(ModBlocks.TOPAZ_LAMP, "topaz");
        customLamp(ModBlocks.SAPPHIRE_LAMP, "sapphire");
        customLamp(ModBlocks.RUBY_LAMP, "ruby");
    }

    private void customLamp(RegistryObject<Block> lampHoofd, String lampLaag) {
        getVariantBuilder(lampHoofd.get()).forAllStates(state -> {
            if(state.getValue(TopazLampBlock.CLICKED)) {
                return new ConfiguredModel[]{new ConfiguredModel(models().cubeAll(lampLaag + "_lamp_on",
                        ResourceLocation.fromNamespaceAndPath(TutorialMod.MOD_ID, "block/" + lampLaag + "_lamp_on")))};
            } else {
                return new ConfiguredModel[]{new ConfiguredModel(models().cubeAll(lampLaag + "_lamp_off",
                        ResourceLocation.fromNamespaceAndPath(TutorialMod.MOD_ID, "block/" + lampLaag + "_lamp_off")))};
            }
        });
        simpleBlockItem(lampHoofd.get(), models().cubeAll(lampLaag + "_lamp_on",
                ResourceLocation.fromNamespaceAndPath(TutorialMod.MOD_ID, "block/" + lampLaag + "_lamp_on")));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("modvantheis:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }
}
