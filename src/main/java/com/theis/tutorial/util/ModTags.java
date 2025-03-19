package com.theis.tutorial.util;

import com.theis.tutorial.TutorialMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static final TagKey<Block> NEEDS_TOPAZ_TOOL = createTag("needs_topaz_tool");
    public static final TagKey<Block> INCORRECT_FOR_TOPAZ_TOOL = createTag("incorrect_for_topaz_tool");
    public static final TagKey<Block> NEEDS_SAPPHIRE_TOOL = createTag("needs_sapphire_tool");
    public static final TagKey<Block> INCORRECT_FOR_SAPPHIRE_TOOL = createTag("incorrect_for_sapphire_tool");
    public static final TagKey<Block> NEEDS_RUBY_TOOL = createTag("needs_ruby_tool");
    public static final TagKey<Block> INCORRECT_FOR_RUBY_TOOL = createTag("incorrect_for_ruby_tool");

    private static TagKey<Block> createTag(String name) {
        return BlockTags.create(ResourceLocation.fromNamespaceAndPath(TutorialMod.MOD_ID, name));
    }

}
