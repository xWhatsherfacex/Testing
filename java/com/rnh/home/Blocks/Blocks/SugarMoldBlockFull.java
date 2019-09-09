package com.rnh.home.Blocks.Blocks;

import java.util.Random;

import com.rnh.home.Blocks.BlockBase;
import com.rnh.home.Init.ModBlocks;
import com.rnh.home.Init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
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

public class SugarMoldBlockFull extends BlockBase {
	
	public static final PropertyInteger AGE = PropertyInteger.create("age", 0, 15);
	public static final AxisAlignedBB SUGAR_MOLD_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D);

	public SugarMoldBlockFull(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.WOOD);
		setHardness(2.0f);
		setResistance(15.0f);
        this.setDefaultState(this.blockState.getBaseState().withProperty(AGE, Integer.valueOf(0)));
        this.setTickRandomly(true);
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
     * Convert the given metadata into a BlockState for this Block
     */
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(AGE, Integer.valueOf(meta));
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    public int getMetaFromState(IBlockState state)
    {
        return ((Integer)state.getValue(AGE)).intValue();
    }

    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {AGE});
    }
    
    protected PropertyInteger getAgeProperty()
    {
        return AGE;
    }
    
    protected int getAge(IBlockState state)
    {
        return ((Integer)state.getValue(this.getAgeProperty())).intValue();
    }
    
    public IBlockState withAge(int age)
    {
        return this.getDefaultState().withProperty(this.getAgeProperty(), Integer.valueOf(age));
    }
    
    public int tickRate(World worldIn)
    {
        return 30;
    }
    
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {           
        super.updateTick(worldIn, pos, state, rand);        
        	    	
        int i = ((Integer)state.getValue(AGE)).intValue();
        if (i < 15)
                {
        			Block blk = ModBlocks.SUGAR_MOLD_BLOCK_FULL_SUGAR;
                    state = blk.getDefaultState();
                    worldIn.setBlockState(pos, state);
                }
            worldIn.scheduleUpdate(pos, this, this.tickRate(worldIn) + rand.nextInt(10));
    }
  
}


