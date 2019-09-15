package rnh.home;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import rnh.home.CreativeTabs.FoodTab;
import rnh.home.CreativeTabs.MainTab;
import rnh.home.Handlers.CowMilkingHandler;
import rnh.home.Init.ModItems;
import rnh.home.Init.ModRecipes;
import rnh.home.util.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

	@Instance
	public static Main instance;

	//@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	//public static CommonProxy proxy;
	
	public static final MainTab MAINTAB = new MainTab();
	public static final FoodTab FOODTAB = new FoodTab();

	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		System.out.println(Reference.NAME + " is loading!");
		ModItems.AddItemsToList();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {	
	
		
		
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {	
		
	}
	
	public static void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	}
	
	public static void registerItemVarientsRenderer(Item item, int meta, String filename, String id) {
	    	ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(Reference.MOD_ID, filename), id));
	}
	
	
}
