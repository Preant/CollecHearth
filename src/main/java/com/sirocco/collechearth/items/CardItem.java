package com.sirocco.collechearth.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;


public class CardItem extends Item
{
    public CardItem()
    {
        super(new Item.Properties().tab(ItemGroup.TAB_DECORATIONS).stacksTo(2));
    }
}
