package com.enderio.base.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;

public class SilentPressurePlateBlock extends PressurePlateBlock {


    public SilentPressurePlateBlock(PressurePlateBlock wrapped) {
        super(getSensitivity(wrapped), BlockBehaviour.Properties.copy(wrapped));
    }

    private static Sensitivity getSensitivity(PressurePlateBlock from) {
        Sensitivity result = null;
        try {
            result = ObfuscationReflectionHelper.getPrivateValue(PressurePlateBlock.class, from, "sensitivity");
        } catch (Exception e) {
            //TODO: Log
        }
        return result == null ? Sensitivity.EVERYTHING : result;
    }

    @Override
    protected void playOnSound(LevelAccessor pLevel, BlockPos pPos) {

    }

    @Override
    protected void playOffSound(LevelAccessor pLevel, BlockPos pPos) {

    }

}
