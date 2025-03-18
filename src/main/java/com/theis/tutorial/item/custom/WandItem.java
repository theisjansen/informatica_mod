package com.theis.tutorial.item.custom;

import com.theis.tutorial.block.ModBlocks;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.Map;

public class WandItem extends Item {
    private static final Map<Block, Block> WAND_MAP =
            Map.of(
                    ModBlocks.SAPPHIRE_BLOCK.get(), ModBlocks.TOPAZ_ORE.get(),
                    ModBlocks.RUBY_BLOCK.get(), ModBlocks.SAPPHIRE_ORE.get(),
                    ModBlocks.TOPAZ_BLOCK.get(), Blocks.DIAMOND_BLOCK,
                    Blocks.DIAMOND_BLOCK, Blocks.ANCIENT_DEBRIS,
                    Blocks.IRON_BLOCK, Blocks.DIAMOND_ORE,
                    Blocks.EMERALD_BLOCK, Blocks.IRON_ORE,
                    Blocks.GOLD_BLOCK, Blocks.EMERALD_ORE
            );

    public WandItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        Block clickedBlock = level.getBlockState(pContext.getClickedPos()).getBlock();

        if(WAND_MAP.containsKey(clickedBlock)) {
            if(!level.isClientSide()) {
                level.setBlockAndUpdate(pContext.getClickedPos(), WAND_MAP.get(clickedBlock).defaultBlockState());

                pContext.getItemInHand().hurtAndBreak(1, ((ServerLevel) level), ((ServerPlayer) pContext.getPlayer()),
                        item -> pContext.getPlayer().onEquippedItemBroken(item, EquipmentSlot.MAINHAND));

                level.playSound(null, pContext.getClickedPos(), SoundEvents.GRINDSTONE_USE, SoundSource.BLOCKS);
            }
        }

        return super.useOn(pContext);
    }
}
