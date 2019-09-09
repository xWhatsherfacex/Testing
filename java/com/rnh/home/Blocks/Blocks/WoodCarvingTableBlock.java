package com.rnh.home.Blocks.Blocks;

import com.rnh.home.Blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class WoodCarvingTableBlock extends BlockBase {

	public WoodCarvingTableBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.WOOD);
		setHardness(2.0f);
		setResistance(15.0f);
		
	}

}
