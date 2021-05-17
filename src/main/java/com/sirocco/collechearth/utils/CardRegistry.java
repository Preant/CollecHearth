package com.sirocco.collechearth.utils;

import com.sirocco.collechearth.CollecHearth;
import com.sirocco.collechearth.items.CardItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class CardRegistry
{
    public static final DeferredRegister<Item> CARDS = DeferredRegister.create(ForgeRegistries.ITEMS, CollecHearth.MODID);

    public static RegistryObject<Item> CARIEL;

    public CardRegistry()
    {
        //Barrens

        //Mage
        CARDS.register("barrens/mage/oasisally", () -> new CardItem());

        //Paladin
        CARDS.register("barrens/paladin/gallopingsavior", () -> new CardItem());
        CARDS.register("barrens/paladin/knightofanointment", () -> new CardItem());
        CARDS.register("barrens/paladin/invigoratingsermon", () -> new CardItem());
        CARDS.register("barrens/paladin/northwatchcommander", () -> new CardItem());
        CARDS.register("barrens/paladin/soldierscaravan", () -> new CardItem());
        CARDS.register("barrens/paladin/swordofthefallen", () -> new CardItem());
        CARDS.register("barrens/paladin/convictionrank1", () -> new CardItem());
        CARDS.register("barrens/paladin/veteranwarmedic", () -> new CardItem());
        CARDS.register("barrens/paladin/cannonmastersmythe", () -> new CardItem());
        CARIEL = CARDS.register("barrens/paladin/carielroame", () -> new CardItem());

        //Warlock
        CARDS.register("barrens/warlock/tamsinroame", () -> new CardItem());

        //Warrior
        CARDS.register("barrens/warrior/overlordsaurfang", () -> new CardItem());
    }

    public void init()
    {
        CardRegistry.CARDS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
