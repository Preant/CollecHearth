package com.sirocco.collechearth.items;

import com.sirocco.collechearth.CollecHearth;
import com.sirocco.collechearth.utils.CardInfo;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;


public class CardItem extends Item
{
    private CardInfo info;
    public CardItem(CardInfo info)
    {
        super(new Item.Properties().tab(CollecHearth.CARDS_TAB));
        this.info = info;
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return (info.getFoil());
    }

    @Override
    public Rarity getRarity(ItemStack p_77613_1_) {
        switch (this.info.getRarity()) {
            case "legendary":
                return (Rarity.UNCOMMON);
            case "epic":
                return (Rarity.EPIC);
            case "rare":
                return (Rarity.RARE);
            default:
                return (Rarity.COMMON);
        }
    }
}
