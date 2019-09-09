package com.rnh.home.Items;

import java.util.List;

import com.rnh.home.Main;
import com.rnh.home.Init.ModItems;
import com.rnh.home.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ItemFoodBaseVarients extends ItemFood implements IHasModel{
	
	private String name;

	public ItemFoodBaseVarients(int amount, float saturation, boolean isWolfFood, String name) {
		super(amount, saturation, isWolfFood);
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	
	public ItemFoodBaseVarients setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
	
	public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> items) {
		
	}

}
