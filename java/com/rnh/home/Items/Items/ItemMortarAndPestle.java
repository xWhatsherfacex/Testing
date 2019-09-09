package com.rnh.home.Items.Items;

import com.rnh.home.Init.ModItems;
import com.rnh.home.Items.ItemBase;

import net.minecraft.item.ItemStack;

public class ItemMortarAndPestle extends ItemBase{

	public ItemMortarAndPestle(String name) {
		super(name);
	}

	@Override
	 public boolean hasContainerItem(ItemStack stack)
   {
       return true;
   }
	
	@Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        return new ItemStack(ModItems.MORTAR_AND_PESTLE_DIRTY);
	}
}
