package com.rnh.home.Items;

import com.rnh.home.Main;
import com.rnh.home.Init.ModItems;
import com.rnh.home.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		ModItems.ITEMS.add(this);
	}

	
	@Override
	public void registerModels() {	
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
	
	@Override 
	public ItemBase setMaxStackSize(int maxStackSize) {
		super.setMaxStackSize(maxStackSize);
		return this;
		
	}
}
