package rnh.home.Init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import rnh.home.Main;
import rnh.home.Blocks.Blocks.CakeTurntableBlock;
import rnh.home.Blocks.Blocks.ChurnBlock;
import rnh.home.Blocks.Blocks.CompostBinBlock;
import rnh.home.Blocks.Blocks.JuicePressBlock;
import rnh.home.Blocks.Blocks.ScultpingTableBlock;
import rnh.home.Blocks.Blocks.SugarMoldBlock;
import rnh.home.Blocks.Blocks.SugarMoldBlockFull;
import rnh.home.Blocks.Blocks.SugarMoldBlockFullMolasses;
import rnh.home.Blocks.Blocks.SugarMoldBlockFullSugar;
import rnh.home.Blocks.Blocks.WoodCarvingTableBlock;

public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	
	public static final Block JUICE_PRESS_BLOCK = new JuicePressBlock(Material.WOOD, "juice_press_block").setCreativeTab(null);
	
}
