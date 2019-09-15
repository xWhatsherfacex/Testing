package rnh.home.CreativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import rnh.home.Init.ModItems;

public class MainTab extends CreativeTabs{

	public MainTab() {
		super("maintab");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.ITEM_JUICE_PRESS_BLOCK);
	}

}
