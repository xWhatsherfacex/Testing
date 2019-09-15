package rnh.home.Blocks.Blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.items.ItemHandlerHelper;
import rnh.home.Init.ModBlocks;
import rnh.home.Init.ModItems;

public class JuicePressBlock extends Block {

	
	public static final PropertyDirection FACING = BlockHorizontal.FACING;
    public static final PropertyEnum<JuicePressBlock.EnumHalf> HALF = PropertyEnum.<JuicePressBlock.EnumHalf>create("half", JuicePressBlock.EnumHalf.class);
	
	public JuicePressBlock(Material material, String name) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(SoundType.WOOD);
		setHardness(2.0f);
		setResistance(15.0f);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH).withProperty(HALF, JuicePressBlock.EnumHalf.LOWER));

		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));

	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos)
    {
        if (state.getValue(HALF) == JuicePressBlock.EnumHalf.UPPER)
        {
            BlockPos blockpos = pos.down();
            IBlockState iblockstate = worldIn.getBlockState(blockpos);

            if (iblockstate.getBlock() != this)
            {
                worldIn.setBlockToAir(pos);
            }
            else if (blockIn != this)
            {
                iblockstate.neighborChanged(worldIn, blockpos, blockIn, fromPos);
            }
        }
        else
        {
            boolean flag1 = false;
            BlockPos blockpos1 = pos.up();
            IBlockState iblockstate1 = worldIn.getBlockState(blockpos1);

            if (iblockstate1.getBlock() != this)
            {
                worldIn.setBlockToAir(pos);
                flag1 = true;
            }

            if (!worldIn.getBlockState(pos.down()).isSideSolid(worldIn,  pos.down(), EnumFacing.UP))
            {
                worldIn.setBlockToAir(pos);
                flag1 = true;

                if (iblockstate1.getBlock() == this)
                {
                    worldIn.setBlockToAir(blockpos1);
                }
            }

            if (flag1)
            {
                if (!worldIn.isRemote)
                {
                    this.dropBlockAsItem(worldIn, pos, state, 0);
                }
            }
        }
    }
    
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return state.getValue(HALF) == JuicePressBlock.EnumHalf.UPPER ? Items.AIR : this.getItem();
    }

    @Override
    public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
    {
        if (pos.getY() >= worldIn.getHeight() - 1)
        {
            return false;
        }
        else
        {
            IBlockState state = worldIn.getBlockState(pos.down());
            return (state.isTopSolid() || state.getBlockFaceShape(worldIn, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID) && super.canPlaceBlockAt(worldIn, pos) && super.canPlaceBlockAt(worldIn, pos.up());
        }
    }
    
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(this.getItem());
    }

    private Item getItem()
    {
        return ModItems.ITEM_JUICE_PRESS_BLOCK;
    }
	
    public void onBlockHarvested(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player)
    {
        BlockPos blockpos = pos.down();
        BlockPos blockpos1 = pos.up();

        if (player.capabilities.isCreativeMode && state.getValue(HALF) == JuicePressBlock.EnumHalf.UPPER && worldIn.getBlockState(blockpos).getBlock() == this)
        {
            worldIn.setBlockToAir(blockpos);
        }

        if (state.getValue(HALF) == JuicePressBlock.EnumHalf.LOWER && worldIn.getBlockState(blockpos1).getBlock() == this)
        {
            if (player.capabilities.isCreativeMode)
            {
                worldIn.setBlockToAir(pos);
            }

            worldIn.setBlockToAir(blockpos1);
        }
    }
	
    public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
    {
            IBlockState iblockstate1 = worldIn.getBlockState(pos.down());

            if (iblockstate1.getBlock() == this)
            {
                state = state.withProperty(FACING, iblockstate1.getValue(FACING));
            }

        return state;
    }

    public IBlockState getStateFromMeta(int meta)
    {
        return (meta & 8) > 0 ? this.getDefaultState().withProperty(HALF, JuicePressBlock.EnumHalf.UPPER) : this.getDefaultState().withProperty(HALF, JuicePressBlock.EnumHalf.LOWER).withProperty(FACING, EnumFacing.getHorizontal(meta & 3).rotateYCCW()); 
    }

    public int getMetaFromState(IBlockState state)
    {
        int i = 0;

        if (state.getValue(HALF) == JuicePressBlock.EnumHalf.UPPER)
        {
            i = i | 8;
        }
        else
        {
            i = i | ((EnumFacing)state.getValue(FACING)).rotateY().getHorizontalIndex();
      
        }

        return i;
    }
    
    protected static boolean isTop(int meta)
    {
        return (meta & 8) != 0;
    }

    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {HALF, FACING});
    }

    public static enum EnumHalf implements IStringSerializable
    {
        UPPER,
        LOWER;

        public String toString()
        {
            return this.getName();
        }

        public String getName()
        {
            return this == UPPER ? "upper" : "lower";
        }
    }
    
  //Placeholder meathod to turn sugarcane into sugarcane juice bucket...
	
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

  	            if (item == Items.REEDS)
  	            {
  	                if (!worldIn.isRemote)
  	                {
  	                    if (!playerIn.capabilities.isCreativeMode)
  	                    {
  	                    	ItemHandlerHelper.giveItemToPlayer(playerIn, new ItemStack(ModItems.SUGARCANE_JUICE_BUCKET));
                              itemstack.shrink(1);
  	                    }
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
