package rnh.home.Init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import rnh.home.Main;
import rnh.home.Items.Items.ItemAppleGreen;
import rnh.home.Items.Items.ItemAppleRed;
import rnh.home.Items.Items.ItemAppleYellow;
import rnh.home.Items.Items.ItemJuicePressBlock;
import rnh.home.Items.Items.ItemMilkBottle;
import scala.actors.threadpool.Arrays;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static Item ITEM_JUICE_PRESS_BLOCK = new ItemJuicePressBlock(ModBlocks.JUICE_PRESS_BLOCK)
			.setUnlocalizedName("item_juice_press_block")
			.setRegistryName("item_juice_press_block")
			.setCreativeTab(Main.MAINTAB);

	public static void AddItemsToList() {

		ITEMS.add(ITEM_JUICE_PRESS_BLOCK);
	}
	
}
