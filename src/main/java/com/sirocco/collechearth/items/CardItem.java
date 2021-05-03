package com.sirocco.collechearth.items;

import com.sirocco.collechearth.CollecHearth;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;


public class CardItem extends Item
{
    public CardItem()
    {
        super(new Item.Properties().tab(CollecHearth.CARDS_TAB));
    }
}
