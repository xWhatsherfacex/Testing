package com.rnh.home.Items.Items;

import com.rnh.home.Main;
import com.rnh.home.Init.ModItems;
import com.rnh.home.Items.ItemFoodBaseVarients;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.ItemHandlerHelper;

public class ItemAppleVariants extends ItemFoodBaseVarients{

	public ItemAppleVariants(int amount, float saturation, boolean isWolfFood, String name) {
		super(amount, amount, isWolfFood, name);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		    
	}
	
	public void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) { 
		if (!worldIn.isRemote)
        {
            if (stack.getMetadata() == 0)
            {
            	ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(ModItems.APPLE_RED_CORE, 1));
            }
            else if (stack.getMetadata() == 1)
            {
            	ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(ModItems.APPLE_GREEN_CORE, 1));
            }
            else if (stack.getMetadata() == 2)
            {
            	ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(ModItems.APPLE_YELLOW_CORE, 1));
            }  	
        }		
	}
	
	
	@Override
	  public int getMetadata(int damage) {
	    return damage;
	  }
	
	@SideOnly(Side.CLIENT)
	@Override
	 public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items){
		if (isInCreativeTab(tab))  {
			for (EnumAppleTypes variant : EnumAppleTypes.values()){
        		items.add(new ItemStack(this, 1, variant.getMeta()));
			}
	 	}
	}
	
	  @Override
		public String getUnlocalizedName(ItemStack stack) {
			for(int i = 0; i < EnumAppleTypes.values().length; i++) {
				if(stack.getItemDamage() == i) {
					return this.getUnlocalizedName() + "." + EnumAppleTypes.values()[i].getName();
				}
				else {
					continue;
				}
			}
			return this.getUnlocalizedName() + "." + EnumAppleTypes.RED.getName();
		}
	  
	  
	  @Override
	    public void registerModels()
	    {
	        for(int i = 0; i < EnumAppleTypes.values().length; i++)
	        {
	        	Main.proxy.registerItemVarientsRenderer(this, i, EnumAppleTypes.values()[i].getName(), "inventory");
	            
	        }
	    }
	 
	  
	  public static enum EnumAppleTypes implements IStringSerializable
	    {
		  	RED(0, "apple_red"),
		    GREEN(1, "apple_green"),
		    YELLOW(2, "apple_yellow");
	 
	 
	        private static final EnumAppleTypes[] META_LOOKUP = new EnumAppleTypes[values().length];
	        private final int meta;
	        private final String name, unlocalizedName;
	 
	        private EnumAppleTypes(int meta, String name)
	        {
	            this(meta, name, name);
	        }
	 
	        private EnumAppleTypes(int meta, String name, String unlocalizedName)
	        {
	           this.meta = meta;
	           this.name = name;
	           this.unlocalizedName = unlocalizedName;
	        }
	 
	        @Override
	        public String getName()
	        {
	            return this.name;
	        }
	 
	        public int getMeta()
	        {
	            return this.meta;
	        }
	 
	        public String getUnlocalizedName()
	        {
	            return this.unlocalizedName;
	        }
	 
	        @Override
	        public String toString()
	        {
	            return this.name;
	        }
	 
	        public static EnumAppleTypes byMetadata(int meta)
	        {
	            return META_LOOKUP[meta];
	        }
	 
	        static
	        {
	            for(EnumAppleTypes enumAppleTypes : values())
	            {
	                META_LOOKUP[enumAppleTypes.getMeta()] = enumAppleTypes;
	            }
	        }
	    }

}