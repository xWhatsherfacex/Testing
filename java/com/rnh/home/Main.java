package com.rnh.home;

import com.rnh.home.CreativeTabs.FoodTab;
import com.rnh.home.CreativeTabs.MainTab;
import com.rnh.home.Handlers.CowMilkingHandler;
import com.rnh.home.Init.ModRecipes;
import com.rnh.home.proxy.CommonProxy;
import com.rnh.home.util.Reference;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

	@Instance
	public static Main instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final MainTab MAINTAB = new MainTab();
	public static final FoodTab FOODTAB = new FoodTab();

	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		System.out.println(Reference.NAME + " is loading!");
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {	
		ModRecipes.init();	
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {	
		MinecraftForge.EVENT_BUS.register(new CowMilkingHandler());
	}
	
	
	
	
}
