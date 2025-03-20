package com.theis.tutorial.item;

import com.theis.tutorial.TutorialMod;
import com.theis.tutorial.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MOD_ITEMS_TAB = CREATIVE_MODE_TABS.register("mod_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TOPAZ.get()))
                    .title(Component.translatable("creativetab.modvantheis.mod_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.TOPAZ.get());
                        output.accept(ModItems.TOPAZ_SWORD.get());
                        output.accept(ModItems.TOPAZ_PICKAXE.get());
                        output.accept(ModItems.TOPAZ_SHOVEL.get());
                        output.accept(ModItems.TOPAZ_AXE.get());
                        output.accept(ModItems.TOPAZ_HOE.get());
                        output.accept(ModItems.TOPAZ_HAMMER.get());

                        output.accept(ModItems.TOPAZ_HELMET.get());
                        output.accept(ModItems.TOPAZ_CHESTPLATE.get());
                        output.accept(ModItems.TOPAZ_LEGGINGS.get());
                        output.accept(ModItems.TOPAZ_BOOTS.get());


                        output.accept(ModItems.SAPPHIRE.get());
                        output.accept(ModItems.SAPPHIRE_SWORD.get());
                        output.accept(ModItems.SAPPHIRE_PICKAXE.get());
                        output.accept(ModItems.SAPPHIRE_SHOVEL.get());
                        output.accept(ModItems.SAPPHIRE_AXE.get());
                        output.accept(ModItems.SAPPHIRE_HOE.get());
                        output.accept(ModItems.SAPPHIRE_HAMMER.get());

                        output.accept(ModItems.SAPPHIRE_HELMET.get());
                        output.accept(ModItems.SAPPHIRE_CHESTPLATE.get());
                        output.accept(ModItems.SAPPHIRE_LEGGINGS.get());
                        output.accept(ModItems.SAPPHIRE_BOOTS.get());

                        output.accept(ModItems.RUBY.get());
                        output.accept(ModItems.RUBY_SWORD.get());
                        output.accept(ModItems.RUBY_PICKAXE.get());
                        output.accept(ModItems.RUBY_SHOVEL.get());
                        output.accept(ModItems.RUBY_AXE.get());
                        output.accept(ModItems.RUBY_HOE.get());
                        output.accept(ModItems.RUBY_HAMMER.get());

                        output.accept(ModItems.RUBY_HELMET.get());
                        output.accept(ModItems.RUBY_CHESTPLATE.get());
                        output.accept(ModItems.RUBY_LEGGINGS.get());
                        output.accept(ModItems.RUBY_BOOTS.get());

                        output.accept(ModItems.WAND.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> MOD_BLOCKS_TAB = CREATIVE_MODE_TABS.register("mod_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.TOPAZ_BLOCK.get()))
                    .withTabsBefore(MOD_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.modvantheis.mod_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.TOPAZ_BLOCK.get());
                        output.accept(ModBlocks.TOPAZ_STAIRS.get());
                        output.accept(ModBlocks.TOPAZ_SLAB.get());
                        output.accept(ModBlocks.TOPAZ_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.TOPAZ_BUTTON.get());
                        output.accept(ModBlocks.TOPAZ_FENCE.get());
                        output.accept(ModBlocks.TOPAZ_FENCE_GATE.get());
                        output.accept(ModBlocks.TOPAZ_WALL.get());
                        output.accept(ModBlocks.TOPAZ_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_TOPAZ_ORE.get());
                        output.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        output.accept(ModBlocks.SAPPHIRE_STAIRS.get());
                        output.accept(ModBlocks.SAPPHIRE_SLAB.get());
                        output.accept(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.SAPPHIRE_BUTTON.get());
                        output.accept(ModBlocks.SAPPHIRE_FENCE.get());
                        output.accept(ModBlocks.SAPPHIRE_FENCE_GATE.get());
                        output.accept(ModBlocks.SAPPHIRE_WALL.get());
                        output.accept(ModBlocks.SAPPHIRE_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                        output.accept(ModBlocks.RUBY_BLOCK.get());
                        output.accept(ModBlocks.RUBY_BLOCK.get());
                        output.accept(ModBlocks.RUBY_STAIRS.get());
                        output.accept(ModBlocks.RUBY_SLAB.get());
                        output.accept(ModBlocks.RUBY_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.RUBY_BUTTON.get());
                        output.accept(ModBlocks.RUBY_FENCE.get());
                        output.accept(ModBlocks.RUBY_FENCE_GATE.get());
                        output.accept(ModBlocks.RUBY_WALL.get());
                        output.accept(ModBlocks.RUBY_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_RUBY_ORE.get());
                        output.accept(ModBlocks.TOPAZ_LAMP.get());
                        output.accept(ModBlocks.SAPPHIRE_LAMP.get());
                        output.accept(ModBlocks.RUBY_LAMP.get());


                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
