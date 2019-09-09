package com.rnh.home.CreativeTabs;

import com.rnh.home.Main;
import com.rnh.home.Init.ModItems;
import com.rnh.home.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class FoodTab extends CreativeTabs{

	public FoodTab() {
		super("foodtab");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.APPLE_RED_CORE);
	}

}
