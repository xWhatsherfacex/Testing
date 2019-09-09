package com.rnh.home.Init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		GameRegistry.addSmelting(Items.EGG, new ItemStack(ModItems.FRIED_EGG), 1.0f);
		GameRegistry.addSmelting(ModItems.SUGARCANE_JUICE_BUCKET, new ItemStack(ModItems.SUGARCANE_JUICE_BUCKET_SUPERSATURATED), 1.0f);
	}
}
