package com.enderio.base.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;

public class SilentPressurePlateBlock extends PressurePlateBlock {


    public SilentPressurePlateBlock(Properties pPropertiesn, PressurePlateBlock wrapped) {
        super(ObfuscationReflectionHelper.getPrivateValue(PressurePlateBlock.class, wrapped, "sensitivity"), BlockBehaviour.Properties.copy(wrapped));
    }

    @Override
    protected void playOnSound(LevelAccessor pLevel, BlockPos pPos) {

    }

    @Override
    protected void playOffSound(LevelAccessor pLevel, BlockPos pPos) {

    }

}
