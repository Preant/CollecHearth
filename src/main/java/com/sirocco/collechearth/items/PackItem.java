package com.sirocco.collechearth.items;

import com.sirocco.collechearth.CollecHearth;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class PackItem extends Item
{
    public PackItem()
    {
        super(new Item.Properties().tab(CollecHearth.TAB));
    }

    /*public ActionResult<ItemStack> use(World worldIn, PlayerEntity playerIn, Hand handIn) {
        return ActionResult.consume()
    }*/
}
