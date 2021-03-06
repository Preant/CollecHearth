package com.sirocco.collechearth.utils;

import com.sirocco.collechearth.CollecHearth;
import com.sirocco.collechearth.items.ArcaneDust;
import com.sirocco.collechearth.items.PackItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import com.sirocco.collechearth.loot.LootInjection;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;

public class ItemRegistry
{
    public static final DeferredRegister<Item> ALL = DeferredRegister.create(ForgeRegistries.ITEMS, CollecHearth.MODID);
    public static final DeferredRegister<GlobalLootModifierSerializer<?>> GLMS = DeferredRegister.create(ForgeRegistries.LOOT_MODIFIER_SERIALIZERS, CollecHearth.MODID);

    public ItemRegistry()
    {
        //items
        ALL.register("packs/barrens", () -> new PackItem());
        ALL.register("arcane_dust", () -> new ArcaneDust());
        ALL.register("arcane_dust_block", () -> new BlockItem(BlockRegistry.ARCANE_DUST_BLOCK.get(), new Item.Properties().tab(CollecHearth.MISC)));

        ItemRegistry.ALL.register(FMLJavaModLoadingContext.get().getModEventBus());

        //global loot modifiers
        GLMS.register("loot_injection", LootInjection.LootInjectionSerializer::new);

        GLMS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }

}
