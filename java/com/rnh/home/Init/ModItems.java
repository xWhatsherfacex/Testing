package com.rnh.home.Init;

import java.util.ArrayList;
import java.util.List;

import com.rnh.home.Main;
import com.rnh.home.Items.ItemBase;
import com.rnh.home.Items.ItemFoodBase;
import com.rnh.home.Items.Items.ItemAppleVariants;
import com.rnh.home.Items.Items.ItemDishesDirtyVariants;
import com.rnh.home.Items.Items.ItemDishesVariants;
import com.rnh.home.Items.Items.ItemMilkBottle;
import com.rnh.home.Items.Items.ItemMortarAndPestle;
import com.rnh.home.Items.Items.ItemMortarAndPestleDirty;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	
	//Apples
	public static ItemAppleVariants VARIANT_APPLES = (ItemAppleVariants) new ItemAppleVariants(3, 0.6f, false, "variant_apples").setCreativeTab(Main.FOODTAB);
	public static ItemBase APPLE_RED_CORE = new ItemBase("apple_red_core").setCreativeTab(Main.FOODTAB);
	public static ItemBase APPLE_YELLOW_CORE = new ItemBase("apple_yellow_core").setCreativeTab(Main.FOODTAB);
	public static ItemBase APPLE_GREEN_CORE = new ItemBase("apple_green_core").setCreativeTab(Main.FOODTAB);
	public static ItemBase APPLE_RED_SLICE = new ItemBase("apple_red_slice").setCreativeTab(Main.FOODTAB);
	public static ItemBase APPLE_YELLOW_SLICE = new ItemBase("apple_yellow_slice").setCreativeTab(Main.FOODTAB);
	public static ItemBase APPLE_GREEN_SLICE = new ItemBase("apple_green_slice").setCreativeTab(Main.FOODTAB);

	public static ItemBase APPLE_JUICE_BUCKET = new ItemBase("apple_juice_bucket").setCreativeTab(Main.FOODTAB);
	public static ItemBase APPLE_JUICE_BOTTLE = new ItemBase("apple_juice_bottle").setCreativeTab(Main.FOODTAB);
	
	public static ItemBase APPLE_CIDER_BUCKET = new ItemBase("apple_cider_bucket").setCreativeTab(Main.FOODTAB);
	public static ItemBase APPLE_CIDER_BOTTLE = new ItemBase("apple_cider_bottle").setCreativeTab(Main.FOODTAB);
	
	public static ItemBase APPLE_PIE_FILLING = new ItemBase("apple_pie_filling").setCreativeTab(Main.FOODTAB);
	public static ItemBase APPLE_PIE_RAW = new ItemBase("apple_pie_raw").setCreativeTab(Main.FOODTAB);
	public static ItemBase APPLE_PIE = new ItemBase("apple_pie").setCreativeTab(Main.FOODTAB);
	public static ItemBase APPLE_PIE_SLICE = new ItemBase("apple_pie_slice").setCreativeTab(Main.FOODTAB);
	
	public static ItemBase APPLE_SAUCE_JAR = new ItemBase("apple_sauce_jar").setCreativeTab(Main.FOODTAB);
	public static ItemBase CARAMEL_APPLE = new ItemBase("caramel_apple").setCreativeTab(Main.FOODTAB);
	
	//Bread
	public static ItemBase YEAST = new ItemBase("yeast").setCreativeTab(Main.FOODTAB);
	public static ItemBase BREAD_DOUGH = new ItemBase("bread_dough").setCreativeTab(Main.FOODTAB);
	
	//Pumpkin
	public static ItemBase HOLLOW_PUMPKIN = new ItemBase("hollow_pumpkin").setCreativeTab(Main.FOODTAB);
	public static ItemBase ROASTED_PUMPKIN = new ItemBase("roasted_pumpkin").setCreativeTab(Main.FOODTAB);
	public static ItemBase PUMPKIN_SHELL = new ItemBase("pumpkin_shell").setCreativeTab(Main.FOODTAB);
	public static ItemBase PUMPKIN_PULP = new ItemBase("pumpkin_pulp").setCreativeTab(Main.FOODTAB);
	public static ItemBase MASHED_PUMPKIN = new ItemBase("mashed_pumpkin").setCreativeTab(Main.FOODTAB);

	public static ItemBase ROASTED_PUMPKIN_SEEDS = new ItemBase("roasted_pumpkin_seeds").setCreativeTab(Main.FOODTAB);
	
	public static ItemBase PUMPKIN_PIE_FILLING = new ItemBase("pumpkin_pie_filling").setCreativeTab(Main.FOODTAB);
	public static ItemBase PUMPKIN_PIE_RAW = new ItemBase("pumpkin_pie_raw").setCreativeTab(Main.FOODTAB);
	public static ItemBase PUMPKIN_PIE = new ItemBase("pumpkin_pie").setCreativeTab(Main.FOODTAB);
	public static ItemBase PUMPKIN_PIE_SLICE = new ItemBase("pumpkin_pie_slice").setCreativeTab(Main.FOODTAB);

	public static ItemBase PUMPKIN_BREAD = new ItemBase("pumpkin_bread").setCreativeTab(Main.FOODTAB);
	public static ItemBase PUMPKIN_BREAD_SLICE = new ItemBase("pumpkin_bread_slice").setCreativeTab(Main.FOODTAB);

	
	//Grains
	public static ItemBase WHEAT_STRAW = new ItemBase("wheat_straw").setCreativeTab(Main.FOODTAB);
	public static ItemBase WHEAT_KERNAL = new ItemBase("wheat_kernal").setCreativeTab(Main.FOODTAB);
	public static ItemBase WHEAT_FLOUR = new ItemBase("wheat_flour").setCreativeTab(Main.FOODTAB);

	//Eggs
	public static ItemFoodBase FRIED_EGG = new ItemFoodBase(6, 0.5f, false, "fried_egg").setCreativeTab(Main.FOODTAB);
	
	//Spices
	public static ItemBase SALTWATER_BUCKET = new ItemBase("saltwater_bucket").setCreativeTab(Main.FOODTAB);
	public static ItemBase SALT_BUCKET = new ItemBase("salt_bucket").setCreativeTab(Main.FOODTAB);
	public static ItemBase SALT = new ItemBase("salt").setCreativeTab(Main.FOODTAB);
	
	
	public static ItemBase CINNAMON_STICK = new ItemBase("cinnamon_stick").setCreativeTab(Main.FOODTAB);
	public static ItemBase CINNAMON_POWDER = new ItemBase("cinnamon_powder").setCreativeTab(Main.FOODTAB);
	public static ItemBase CINNAMON_SUGAR = new ItemBase("cinnamon_sugar").setCreativeTab(Main.FOODTAB);
	
	
	
	//Pie
	public static ItemBase PIE_DOUGH = new ItemBase("pie_dough").setCreativeTab(Main.FOODTAB);
	
	
	
	//Dairy
	public static ItemBase BUTTER = new ItemBase("butter").setCreativeTab(Main.FOODTAB);
	public static ItemBase MILK_BOTTLE = new ItemMilkBottle("milk_bottle").setCreativeTab(Main.FOODTAB);
	public static ItemBase BUTTERMILK_BOTTLE = new ItemBase("buttermilk_bottle").setCreativeTab(Main.FOODTAB);
	
	//Sugar
	public static ItemBase SUGARCANE_JUICE_BUCKET = new ItemBase("sugarcane_juice_bucket").setCreativeTab(Main.FOODTAB);
	public static ItemBase SUGARCANE_JUICE_BOTTLE = new ItemBase("sugarcane_juice_bottle").setCreativeTab(Main.FOODTAB);
	public static ItemBase SUGARCANE_JUICE_BUCKET_SUPERSATURATED = new ItemBase("sugarcane_juice_bucket_supersaturated").setMaxStackSize(1).setCreativeTab(Main.FOODTAB);
	public static ItemBase SUGAR_CONE = new ItemBase("sugar_cone").setCreativeTab(Main.FOODTAB);
	public static ItemBase SUGAR_POWDERED = new ItemBase("sugar_powdered").setCreativeTab(Main.FOODTAB);
	public static ItemBase MOLASSES_BOTTLE = new ItemBase("molasses_bottle").setCreativeTab(Main.FOODTAB);
	public static ItemBase MOLASSES_BUCKET = new ItemBase("molasses_bucket").setCreativeTab(Main.FOODTAB);
	
	public static ItemBase BROWN_SUGAR = new ItemBase("brown_sugar").setCreativeTab(Main.FOODTAB);

	//Dishes
	public static ItemDishesVariants VARIANT_DISHES = (ItemDishesVariants) new ItemDishesVariants("variant_dishes").setCreativeTab(Main.MAINTAB);
	public static ItemDishesDirtyVariants VARIANT_DISHES_DIRTY = (ItemDishesDirtyVariants) new ItemDishesDirtyVariants("variant_dishes_dirty").setCreativeTab(Main.MAINTAB);
	
	public static ItemBase MORTAR_AND_PESTLE = new ItemMortarAndPestle("mortar_and_pestle").setCreativeTab(Main.MAINTAB);
	public static ItemBase MORTAR_AND_PESTLE_DIRTY = new ItemMortarAndPestleDirty("mortar_and_pestle_dirty").setCreativeTab(Main.MAINTAB);
	
	public static ItemBase MIXING_BOWL = new ItemBase("mixing_bowl").setCreativeTab(Main.MAINTAB);
	public static ItemBase MIXING_BOWL_DIRTY = new ItemBase("mixing_bowl_dirty").setCreativeTab(Main.MAINTAB);
	
	
	//Chocolate
	public static ItemBase COCOA_POD = new ItemBase("cocoa_pod").setCreativeTab(Main.FOODTAB);
	public static ItemBase COCOA_POD_SHELL = new ItemBase("cocoa_pod_shell").setCreativeTab(Main.FOODTAB);
	public static ItemBase COCOA_BEANS_FERMENTED = new ItemBase("cocoa_beans_fermented").setCreativeTab(Main.FOODTAB);
	public static ItemBase COCOA_BEANS_DRIED = new ItemBase("cocoa_beans_dried").setCreativeTab(Main.FOODTAB);
	public static ItemBase COCOA_NIBS = new ItemBase("cocoa_nibs").setCreativeTab(Main.FOODTAB);
	public static ItemBase COCOA_HUSKS = new ItemBase("cocoa_husks").setCreativeTab(Main.FOODTAB);
	public static ItemBase COCOA_NIBS_ROASTED = new ItemBase("cocoa_nibs_roasted").setCreativeTab(Main.FOODTAB);
	public static ItemBase COCOA_MASS_BUCKET = new ItemBase("cocoa_mass_bucket").setCreativeTab(Main.FOODTAB);
	public static ItemBase COCOA_LIQUOR_BUCKET = new ItemBase("cocoa_liquor_bucket").setCreativeTab(Main.FOODTAB);
	public static ItemBase COCOA_LIQUOR_BOTTLE = new ItemBase("cocoa_liquor_bottle").setCreativeTab(Main.FOODTAB);
	public static ItemBase COCOA_BUTTER = new ItemBase("cocoa_butter").setCreativeTab(Main.FOODTAB);
	public static ItemBase COCOA_SOLIDS = new ItemBase("cocoa_solids").setCreativeTab(Main.FOODTAB);
	public static ItemBase COCOA_POWDER = new ItemBase("cocoa_powder").setCreativeTab(Main.FOODTAB);

	public static ItemBase CHOCOLATE_BUCKET_WHITE = new ItemBase("chocolate_bucket_white").setCreativeTab(Main.FOODTAB);
	public static ItemBase CHOCOLATE_BUCKET_MILK= new ItemBase("chocolate_bucket_milk").setCreativeTab(Main.FOODTAB);
	public static ItemBase CHOCOLATE_BUCKET_DARK = new ItemBase("chocolate_bucket_dark").setCreativeTab(Main.FOODTAB);
	public static ItemBase CHOCOLATE_MOLD_FILLED_WHITE_UNSET = new ItemBase("chocolate_mold_filled_white_unset").setCreativeTab(Main.FOODTAB);
	public static ItemBase CHOCOLATE_MOLD_FILLED_MILK_UNSET = new ItemBase("chocolate_mold_filled_milk_unset").setCreativeTab(Main.FOODTAB);
	public static ItemBase CHOCOLATE_MOLD_FILLED_DARK_UNSET = new ItemBase("chocolate_mold_filled_dark_unset").setCreativeTab(Main.FOODTAB);
	public static ItemBase CHOCOLATE_MOLD_FILLED_WHITE = new ItemBase("chocolate_mold_filled_white").setCreativeTab(Main.FOODTAB);
	public static ItemBase CHOCOLATE_MOLD_FILLED_MILK = new ItemBase("chocolate_mold_filled_milk").setCreativeTab(Main.FOODTAB);
	public static ItemBase CHOCOLATE_MOLD_FILLED_DARK = new ItemBase("chocolate_mold_filled_dark").setCreativeTab(Main.FOODTAB);
	public static ItemBase CHOCOLATE_BAR_WHITE = new ItemBase("chocolate_bar_white").setCreativeTab(Main.FOODTAB);
	public static ItemBase CHOCOLATE_BAR_MILK = new ItemBase("chocolate_bar_milk").setCreativeTab(Main.FOODTAB);
	public static ItemBase CHOCOLATE_BAR_DARK = new ItemBase("chocolate_bar_dark").setCreativeTab(Main.FOODTAB);
	public static ItemBase CHOCOLATE_CHUNKS_WHITE = new ItemBase("chocolate_chunks_white").setCreativeTab(Main.FOODTAB);
	public static ItemBase CHOCOLATE_CHUNKS_MILK = new ItemBase("chocolate_chunks_milk").setCreativeTab(Main.FOODTAB);
	public static ItemBase CHOCOLATE_CHUNKS_DARK = new ItemBase("chocolate_chunks_dark").setCreativeTab(Main.FOODTAB);
	public static ItemBase CHOCOLATE_BITS_WHITE = new ItemBase("chocolate_bits_white").setCreativeTab(Main.FOODTAB);
	public static ItemBase CHOCOLATE_BITS_MILK = new ItemBase("chocolate_bits_milk").setCreativeTab(Main.FOODTAB);
	public static ItemBase CHOCOLATE_BITS_DARK = new ItemBase("chocolate_bits_dark").setCreativeTab(Main.FOODTAB );
	
	
	//Clay
	public static ItemBase CLAY_BRICK_UNFIRED = new ItemBase("clay_brick_unfired").setCreativeTab(Main.MAINTAB);
	public static ItemBase CLAY_BOTTLE_MOLD_UNFIRED = new ItemBase("clay_bottle_mold_unfired").setCreativeTab(Main.MAINTAB);
	public static ItemBase CLAY_BOTTLE_MOLD = new ItemBase("clay_bottle_mold").setCreativeTab(Main.MAINTAB);
	public static ItemBase CLAY_JAR_MOLD_UNFIRED = new ItemBase("clay_jar_mold_unfired").setCreativeTab(Main.MAINTAB);
	public static ItemBase CLAY_JAR_MOLD = new ItemBase("clay_jar_mold").setCreativeTab(Main.MAINTAB);
	
	//GlassMAINTAB
	public static ItemBase BUCKET_OF_SAND = new ItemBase("bucket_of_sand").setCreativeTab(Main.MAINTAB);
	public static ItemBase MOLTEN_GLASS_BUCKET = new ItemBase("molten_glass_bucket").setCreativeTab(Main.MAINTAB);
	
	public static ItemBase EMPTY_GLASS_JAR = new ItemBase("empty_glass_jar").setCreativeTab(Main.MAINTAB);
	
	
	//misc
	public static ItemBase WOOD_SHAVINGS = new ItemBase("wood_shavings").setCreativeTab(Main.MAINTAB);
	public static ItemBase WOOD_CARVING_KNIFE = new ItemBase("wood_carving_knife").setCreativeTab(Main.MAINTAB);
	
	
	
}
