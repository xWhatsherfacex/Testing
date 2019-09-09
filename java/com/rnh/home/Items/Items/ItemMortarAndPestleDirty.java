package com.rnh.home.Items.Items;

import com.rnh.home.Init.ModItems;
import com.rnh.home.Items.ItemBase;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.items.ItemHandlerHelper;

public class ItemMortarAndPestleDirty extends ItemBase{

	public ItemMortarAndPestleDirty(String name) {
		super(name);
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
	                    		System.out.println("Test");
	                    		ItemHandlerHelper.giveItemToPlayer(playerIn, new ItemStack(ModItems.MORTAR_AND_PESTLE));	
	                    		itemstack.shrink(1);                           
	                        }
	                    }
	                }

	            }
	         
	         return new ActionResult<ItemStack>(EnumActionResult.PASS, itemstack);

	    }

}
