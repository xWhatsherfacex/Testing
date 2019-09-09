package com.rnh.home.Blocks.Blocks;

import java.util.Random;

import com.rnh.home.Blocks.BlockBase;
import com.rnh.home.Init.ModBlocks;
import com.rnh.home.Init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBanner;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionUtils;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntityBanner;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class SugarMoldBlockFullMolasses extends BlockBase {
	
	public static final AxisAlignedBB SUGAR_MOLD_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D);

	public SugarMoldBlockFullMolasses(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.WOOD);
		setHardness(2.0f);
		setResistance(15.0f);
	}
    
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return SUGAR_MOLD_AABB;
	}
	
	
	 /**
     * Called when the block is right clicked by a player.
     */
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        ItemStack itemstack = playerIn.getHeldItem(hand);

        if (itemstack.isEmpty())
        {
            return true;
        }
        else
        {            
            Item item = itemstack.getItem();

            if (item == Items.BUCKET)
            {
                if (!worldIn.isRemote)
                {
                    if (!playerIn.capabilities.isCreativeMode)
                    {
                        playerIn.setHeldItem(hand, new ItemStack(ModItems.MOLASSES_BUCKET));
                        
                        Block blk = ModBlocks.SUGAR_MOLD_BLOCK;
                        state = blk.getDefaultState();
                        worldIn.setBlockState(pos, state);                
                    }
                    worldIn.playSound((EntityPlayer)null, pos, SoundEvents.ITEM_BUCKET_FILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
                }

                return true;
            }
                else
                {
                    return false;
                }
            }
    }
}