package com.rnh.home.Blocks.Blocks;

import com.rnh.home.Blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ChurnBlock extends BlockBase {

	public ChurnBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.WOOD);
		setHardness(2.0f);
		setResistance(15.0f);
		
	}

}
