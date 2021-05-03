package com.sirocco.collechearth.utils;

import com.sirocco.collechearth.CollecHearth;
import com.sirocco.collechearth.items.CardItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class CardRegistry
{
    public static final DeferredRegister<Item> CARDS = DeferredRegister.create(ForgeRegistries.ITEMS, CollecHearth.MODID);

    public static final RegistryObject<Item> CARIEL = CARDS.register("cariel", () -> new CardItem());

    public CardRegistry()
    {
    }
}