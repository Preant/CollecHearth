package com.sirocco.collechearth.items;

import com.sirocco.collechearth.CollecHearth;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class PackItem extends Item
{
    public PackItem()
    {
        super(new Item.Properties().tab(CollecHearth.MISC));
    }

    @Override
    public Rarity getRarity(ItemStack p_77613_1_) {
        return Rarity.RARE;
    }

    @Override
    public ActionResult<ItemStack> use(World p_77659_1_, PlayerEntity p_77659_2_, Hand p_77659_3_) {
        return super.use(p_77659_1_, p_77659_2_, p_77659_3_);
    }
}
