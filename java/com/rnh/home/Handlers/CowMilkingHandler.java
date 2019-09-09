package com.rnh.home.Handlers;

import com.rnh.home.Init.ModItems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CowMilkingHandler {
	
	@SubscribeEvent
    public void bottleMilk(final PlayerInteractEvent.EntityInteract event) {
		
		EntityAgeable targ = (EntityAgeable) event.getTarget();
			
        if (!targ.isChild() && event.getEntityPlayer().getHeldItem(event.getHand()).getItem().equals(Items.GLASS_BOTTLE)) {
        	if(targ instanceof EntityCow)
				{ 
				event.getEntityPlayer().playSound(SoundEvents.ENTITY_COW_MILK, 1.0f, 1.0f);
	            event.getItemStack().shrink(1);
	            if (event.getItemStack().isEmpty()) {
	                event.getEntityPlayer().setHeldItem(event.getHand(), new ItemStack(ModItems.MILK_BOTTLE));
	            }
	            else if (!event.getEntityPlayer().inventory.addItemStackToInventory(new ItemStack(ModItems.MILK_BOTTLE))) {
	                event.getEntityPlayer().dropItem(new ItemStack(ModItems.MILK_BOTTLE), false);
	            }
			} 
        }
	}

}
