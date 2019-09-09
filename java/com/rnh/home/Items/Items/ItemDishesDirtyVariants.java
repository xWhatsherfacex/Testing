package com.rnh.home.Items.Items;

import com.rnh.home.Main;
import com.rnh.home.Init.ModItems;
import com.rnh.home.Items.Items.ItemDishesVariants.EnumDishTypes;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.ItemHandlerHelper;

public class ItemDishesDirtyVariants extends com.rnh.home.Items.ItemBaseVarients{


	public ItemDishesDirtyVariants(String name) {
		super(name);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);	
		
		}
	 	
	  public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	  {
	        ItemStack itemstack = playerIn.getHeldItem(handIn);
	            RayTraceResult raytraceresult = this.rayTrace(worldIn, playerIn, true);

	            if (raytraceresult == null)
	            {
	                return new ActionResult<ItemStack>(EnumActionResult.PASS, itemstack);
	            }
	            else
	            {
	                if (raytraceresult.typeOfHit == RayTraceResult.Type.BLOCK)
	                {
	                    BlockPos blockpos = raytraceresult.getBlockPos();

	                    if (!worldIn.isBlockModifiable(playerIn, blockpos) || !playerIn.canPlayerEdit(blockpos.offset(raytraceresult.sideHit), raytraceresult.sideHit, itemstack))
	                    {
	                        return new ActionResult<ItemStack>(EnumActionResult.PASS, itemstack);
	                    }

	                    if (worldIn.getBlockState(blockpos).getMaterial() == Material.WATER)
	                    {
	                    	if (!worldIn.isRemote)
	                        {
	                            if (itemstack.getMetadata() == 0)
	                            {	                               	                                                          
	                                ItemHandlerHelper.giveItemToPlayer(playerIn, new ItemStack(ModItems.VARIANT_DISHES, 1 , 0));
	                                itemstack.shrink(1);
	                            }
	                            if (itemstack.getMetadata() == 1)
	                            {
	                                ItemHandlerHelper.giveItemToPlayer(playerIn, new ItemStack(ModItems.VARIANT_DISHES, 1 , 1));
	                                itemstack.shrink(1);	                                                          

	                            }
	                            if (itemstack.getMetadata() == 2)
	                            {
	                                ItemHandlerHelper.giveItemToPlayer(playerIn, new ItemStack(ModItems.VARIANT_DISHES, 1 , 2));
	                                itemstack.shrink(1);	                                                          

	                            }
	                            if (itemstack.getMetadata() == 3)
	                            {
	                                ItemHandlerHelper.giveItemToPlayer(playerIn, new ItemStack(ModItems.VARIANT_DISHES, 1 , 3));
	                                itemstack.shrink(1);	                                                          

	                            } 
	                            if (itemstack.getMetadata() == 4)
	                            {
	                                ItemHandlerHelper.giveItemToPlayer(playerIn, new ItemStack(ModItems.VARIANT_DISHES, 1 , 4));
	                                itemstack.shrink(1);	                                                          

	                            }
	                    }
	                }

	            }
	         }
	         return new ActionResult<ItemStack>(EnumActionResult.PASS, itemstack);

	    }

	
	@Override
	  public int getMetadata(int damage) {
	    return damage;
	  }
	
	@SideOnly(Side.CLIENT)
	@Override
	 public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items){
		if (isInCreativeTab(tab))  {
			for (EnumDirtyDishTypes variant : EnumDirtyDishTypes.values()){
        		items.add(new ItemStack(this, 1, variant.getMeta()));
			}
	 	}
	}
	
	  @Override
		public String getUnlocalizedName(ItemStack stack) {
			for(int i = 0; i < EnumDirtyDishTypes.values().length; i++) {
				if(stack.getItemDamage() == i) {
					return this.getUnlocalizedName() + "." + EnumDirtyDishTypes.values()[i].getName();
				}
				else {
					continue;
				}
			}
			return this.getUnlocalizedName() + "." + EnumDirtyDishTypes.WHISK.getName();
		}
	  
	  
	  @Override
	    public void registerModels()
	    {
	        for(int i = 0; i < EnumDirtyDishTypes.values().length; i++)
	        {
	        	  Main.proxy.registerItemVarientsRenderer(this, i, EnumDirtyDishTypes.values()[i].getName(), "inventory");
	            
	        }
	    } 
	  
	  public static enum EnumDirtyDishTypes implements IStringSerializable
	    {
		  	WHISK(0, "whiskdirty"),
		    GRATER(1, "cheesegraterdirty"),
		    MASHER(2, "masherdirty"),
		  	KNIFE(3, "cookingknifedirty"),
		  	CANDYMOLD(4,"candy_bar_mold_dirty");
	 
	 
	        private static final EnumDirtyDishTypes[] META_LOOKUP = new EnumDirtyDishTypes[values().length];
	        private final int meta;
	        private final String name, unlocalizedName;
	 
	        private EnumDirtyDishTypes(int meta, String name)
	        {
	            this(meta, name, name);
	        }
	 
	        private EnumDirtyDishTypes(int meta, String name, String unlocalizedName)
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
	 
	        public static EnumDirtyDishTypes byMetadata(int meta)
	        {
	            return META_LOOKUP[meta];
	        }
	 
	        static
	        {
	            for(EnumDirtyDishTypes EnumDirtyDishTypes : values())
	            {
	                META_LOOKUP[EnumDirtyDishTypes.getMeta()] = EnumDirtyDishTypes;
	            }
	        }
	    }

}