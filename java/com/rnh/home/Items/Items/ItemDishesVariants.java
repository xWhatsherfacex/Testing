package com.rnh.home.Items.Items;

import com.rnh.home.Main;
import com.rnh.home.Init.ModItems;
import com.rnh.home.Items.ItemBaseVarients;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemDishesVariants extends ItemBaseVarients{


	public ItemDishesVariants(String name) {
		super(name);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);	
		}
	
	@Override
	 public boolean hasContainerItem(ItemStack stack)
    {
        return true;
    }
	
	@Override
    public ItemStack getContainerItem(ItemStack itemStack) {
		if (itemStack.getMetadata() == 0) {
	        return new ItemStack(ModItems.VARIANT_DISHES_DIRTY, 1, 0);
		}
		if (itemStack.getMetadata() == 1) {
	        return new ItemStack(ModItems.VARIANT_DISHES_DIRTY, 1, 1);
		}
		if (itemStack.getMetadata() == 2) {
	        return new ItemStack(ModItems.VARIANT_DISHES_DIRTY, 1, 2);
		}
		if (itemStack.getMetadata() == 3) {
	        return new ItemStack(ModItems.VARIANT_DISHES_DIRTY, 1, 3);
		}	
		if (itemStack.getMetadata() == 4) {
	        return new ItemStack(ModItems.VARIANT_DISHES_DIRTY, 1, 4);
		}
		return itemStack;
    }
	
	
	@Override
	  public int getMetadata(int damage) {
	    return damage;
	  }
	
	@SideOnly(Side.CLIENT)
	@Override
	 public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items){
		if (isInCreativeTab(tab))  {
			for (EnumDishTypes variant : EnumDishTypes.values()){
        		items.add(new ItemStack(this, 1, variant.getMeta()));
			}
	 	}
	}
	
	  @Override
		public String getUnlocalizedName(ItemStack stack) {
			for(int i = 0; i < EnumDishTypes.values().length; i++) {
				if(stack.getItemDamage() == i) {
					return this.getUnlocalizedName() + "." + EnumDishTypes.values()[i].getName();
				}
				else {
					continue;
				}
			}
			return this.getUnlocalizedName() + "." + EnumDishTypes.WHISK.getName();
		}
	  
	  
	  @Override
	    public void registerModels()
	    {
	        for(int i = 0; i < EnumDishTypes.values().length; i++)
	        {
	            Main.proxy.registerItemVarientsRenderer(this, i, EnumDishTypes.values()[i].getName(), "inventory");
	            
	        }
	    }
	 
	  
	  public static enum EnumDishTypes implements IStringSerializable
	    {		 
		    WHISK(0, "whisk"),
		    GRATER(1, "cheesegrater"),
		    MASHER(2, "masher"),
		  	KNIFE(3, "cookingknife"),
		  	CANDYMOLD(4,"candy_bar_mold");

	 
	        private static final EnumDishTypes[] META_LOOKUP = new EnumDishTypes[values().length];
	        private final int meta;
	        private final String name, unlocalizedName;
	 
	        private EnumDishTypes(int meta, String name)
	        {
	            this(meta, name, name);
	        }
	 
	        private EnumDishTypes(int meta, String name, String unlocalizedName)
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
	 
	        public static EnumDishTypes byMetadata(int meta)
	        {
	            return META_LOOKUP[meta];
	        }
	 
	        static
	        {
	            for(EnumDishTypes EnumDishTypes : values())
	            {
	                META_LOOKUP[EnumDishTypes.getMeta()] = EnumDishTypes;
	            }
	        }
	    }

}