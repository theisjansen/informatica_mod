package com.theis.tutorial.item;

import com.theis.tutorial.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModToolTiers {
    public static final Tier TOPAZ = new ForgeTier(1750, 11, 3f, 20,
            ModTags.NEEDS_TOPAZ_TOOL, () -> Ingredient.of(ModItems.TOPAZ.get()),
            ModTags.INCORRECT_FOR_TOPAZ_TOOL);
    public static final Tier SAPPHIRE = new ForgeTier(1000, 7, 3f, 15,
            ModTags.NEEDS_SAPPHIRE_TOOL, () -> Ingredient.of(ModItems.SAPPHIRE.get()),
            ModTags.INCORRECT_FOR_SAPPHIRE_TOOL);
    public static final Tier RUBY = new ForgeTier(500, 5, 5f, 10,
            ModTags.NEEDS_RUBY_TOOL, () -> Ingredient.of(ModItems.RUBY.get()),
            ModTags.INCORRECT_FOR_RUBY_TOOL);
}
