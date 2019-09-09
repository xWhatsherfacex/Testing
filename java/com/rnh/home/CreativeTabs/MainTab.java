package com.rnh.home.CreativeTabs;

import com.rnh.home.Main;
import com.rnh.home.Init.ModItems;
import com.rnh.home.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MainTab extends CreativeTabs{

	public MainTab() {
		super("maintab");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.MIXING_BOWL);
	}

}
