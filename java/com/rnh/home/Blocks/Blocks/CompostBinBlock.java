package com.rnh.home.Blocks.Blocks;

import com.rnh.home.Blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CompostBinBlock extends BlockBase {

	public CompostBinBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.WOOD);
		setHardness(2.0f);
		setResistance(15.0f);
		
	}

}
