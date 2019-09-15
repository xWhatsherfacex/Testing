package rnh.home.CreativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import rnh.home.Init.ModItems;

public class FoodTab extends CreativeTabs{

	public FoodTab() {
		super("foodtab");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.APPLE_RED_CORE);
	}

}
