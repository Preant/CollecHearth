package com.sirocco.collechearth.utils;

import com.sirocco.collechearth.CollecHearth;
import com.sirocco.collechearth.items.PackItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry
{
    public static final DeferredRegister<Item> ALL = DeferredRegister.create(ForgeRegistries.ITEMS, CollecHearth.MODID);
    public ItemRegistry()
    {
        ALL.register("packs/barrens", () -> new PackItem());

        ItemRegistry.ALL.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
