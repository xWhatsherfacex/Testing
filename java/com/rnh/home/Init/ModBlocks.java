package com.rnh.home.Init;

import java.util.ArrayList;
import java.util.List;

import com.rnh.home.Main;
import com.rnh.home.Blocks.BlockBase;
import com.rnh.home.Blocks.Blocks.CakeTurntableBlock;
import com.rnh.home.Blocks.Blocks.ChurnBlock;
import com.rnh.home.Blocks.Blocks.CompostBinBlock;
import com.rnh.home.Blocks.Blocks.JuicePressBlock;
import com.rnh.home.Blocks.Blocks.ScultpingTableBlock;
import com.rnh.home.Blocks.Blocks.SugarMoldBlock;
import com.rnh.home.Blocks.Blocks.SugarMoldBlockFull;
import com.rnh.home.Blocks.Blocks.SugarMoldBlockFullMolasses;
import com.rnh.home.Blocks.Blocks.SugarMoldBlockFullSugar;
import com.rnh.home.Blocks.Blocks.WoodCarvingTableBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block SCULTPING_TABLE_BLOCK = new ScultpingTableBlock("scultping_table_block", Material.WOOD).setCreativeTab(Main.MAINTAB);
	public static final Block WOOD_CARVING_TABLE_BLOCK = new WoodCarvingTableBlock("wood_carving_table_block", Material.WOOD).setCreativeTab(Main.MAINTAB);
	
	public static final Block CHURN_BLOCK = new ChurnBlock("churn_block", Material.WOOD).setCreativeTab(Main.MAINTAB);
	
	public static final Block JUICE_PRESS_BLOCK = new JuicePressBlock("juice_press_block", Material.WOOD).setCreativeTab(Main.MAINTAB);
	public static final Block SUGAR_MOLD_BLOCK = new SugarMoldBlock("sugar_mold_block", Material.WOOD).setCreativeTab(Main.MAINTAB);
	public static final Block SUGAR_MOLD_BLOCK_FULL = new SugarMoldBlockFull("sugar_mold_block_full", Material.WOOD).setCreativeTab(null);
	public static final Block SUGAR_MOLD_BLOCK_FULL_SUGAR = new SugarMoldBlockFullSugar("sugar_mold_block_full_sugar", Material.WOOD).setCreativeTab(null);
	public static final Block SUGAR_MOLD_BLOCK_FULL_MOLASSES = new SugarMoldBlockFullMolasses("sugar_mold_block_full_molasses", Material.WOOD).setCreativeTab(null);
	
	public static final Block CAKE_TURNTABLE_BLOCK = new CakeTurntableBlock("cake_turntable_block", Material.ROCK).setCreativeTab(Main.MAINTAB);
	
	public static final Block COMPOST_BIN_BLOCK = new CompostBinBlock("compost_bin_block", Material.WOOD).setCreativeTab(Main.MAINTAB);
}
