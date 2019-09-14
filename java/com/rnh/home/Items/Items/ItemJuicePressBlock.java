package com.rnh.home.Items.Items;

import com.rnh.home.Blocks.Blocks.JuicePressBlock;
import com.rnh.home.Items.ItemBase;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemJuicePressBlock extends ItemBase{

	
    private final Block block;

	public ItemJuicePressBlock(String name, Block block) {
		super(name);
        this.block = block;
	}
	
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        if (facing != EnumFacing.UP)
        {
            return EnumActionResult.FAIL;
        }
        else
        {
            IBlockState iblockstate = worldIn.getBlockState(pos);
            Block block = iblockstate.getBlock();

            if (!block.isReplaceable(worldIn, pos))
            {
                pos = pos.offset(facing);
            }

            ItemStack itemstack = player.getHeldItem(hand);
            if (player.canPlayerEdit(pos, facing, itemstack) && this.block.canPlaceBlockAt(worldIn, pos))
            {
                EnumFacing enumfacing = EnumFacing.fromAngle((double)player.rotationYaw);
                int i = enumfacing.getFrontOffsetX();
                int j = enumfacing.getFrontOffsetZ();
                boolean flag = i < 0 && hitZ < 0.5F || i > 0 && hitZ > 0.5F || j < 0 && hitX > 0.5F || j > 0 && hitX < 0.5F;
                placeTestBlock(worldIn, pos, enumfacing, this.block);
                SoundType soundtype = worldIn.getBlockState(pos).getBlock().getSoundType(worldIn.getBlockState(pos), worldIn, pos, player);
                worldIn.playSound(player, pos, soundtype.getPlaceSound(), SoundCategory.BLOCKS, (soundtype.getVolume() + 1.0F) / 2.0F, soundtype.getPitch() * 0.8F);
                itemstack.shrink(1);
                return EnumActionResult.SUCCESS;
            }
            else
            {
                return EnumActionResult.FAIL;
            }
        }
    }

    public static void placeTestBlock(World worldIn, BlockPos pos, EnumFacing facing, Block press)
    {
        BlockPos blockpos = pos.offset(facing.rotateY());
        BlockPos blockpos1 = pos.offset(facing.rotateYCCW());
        int i = (worldIn.getBlockState(blockpos1).isNormalCube() ? 1 : 0) + (worldIn.getBlockState(blockpos1.up()).isNormalCube() ? 1 : 0);
        int j = (worldIn.getBlockState(blockpos).isNormalCube() ? 1 : 0) + (worldIn.getBlockState(blockpos.up()).isNormalCube() ? 1 : 0);
        boolean flag = worldIn.getBlockState(blockpos1).getBlock() == press || worldIn.getBlockState(blockpos1.up()).getBlock() == press;
        boolean flag1 = worldIn.getBlockState(blockpos).getBlock() == press || worldIn.getBlockState(blockpos.up()).getBlock() == press;
        
        BlockPos blockpos2 = pos.up();
        IBlockState iblockstate = press.getDefaultState().withProperty(JuicePressBlock.FACING, facing);
        worldIn.setBlockState(pos, iblockstate.withProperty(JuicePressBlock.HALF, JuicePressBlock.EnumHalf.LOWER), 2);
        worldIn.setBlockState(blockpos2, iblockstate.withProperty(JuicePressBlock.HALF, JuicePressBlock.EnumHalf.UPPER), 2);
        worldIn.notifyNeighborsOfStateChange(pos, press, false);
        worldIn.notifyNeighborsOfStateChange(blockpos2, press, false);
    }
}
