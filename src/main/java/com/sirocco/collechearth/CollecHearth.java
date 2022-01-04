package com.sirocco.collechearth;


import com.sirocco.collechearth.utils.CardRegistry;
import com.sirocco.collechearth.utils.ItemRegistry;
import com.sirocco.collechearth.items.CardItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.Collections;
import java.util.Comparator;
import java.util.logging.LogManager;
import java.util.logging.Logger;

@Mod(CollecHearth.MODID)
public class CollecHearth {
    public static final String MODID = "collechearth";
    public static final Logger LOGGER = LogManager.getLogManager().getLogger(MODID);

    public CollecHearth()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        bus.addListener(this::setup);
        bus.addListener(this::clientSetup);
        new CardRegistry();
        new ItemRegistry();
    }

    public void setup(FMLCommonSetupEvent e)
    {

    }

    public void clientSetup(FMLCommonSetupEvent e)
    {
        CARDS_TAB.setRecipeFolderName("test");
    }

    public static final ItemGroup MISC = new ItemGroup("collechearth_misc") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(((RegistryObject<Item>)ItemRegistry.ALL.getEntries().toArray()[(int)(Math.random() * 100) % ItemRegistry.ALL.getEntries().size()]).get());
        }
    };

    public static final ItemGroup CARDS_TAB = new ItemGroup("collechearth_cards") {

        @Override
        @OnlyIn(Dist.CLIENT)
        public void fillItemList(NonNullList<ItemStack> list) {
            super.fillItemList(list);
            list.sort(new Comparator<ItemStack>() {
                @Override
                public int compare(ItemStack o1, ItemStack o2) {
                    if (((CardItem)o1.getItem()).getIdAsInt() > ((CardItem)o2.getItem()).getIdAsInt()) {
                        return (1);
                    } else {
                        return (0);
                    }
                }
            });
        }

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(((RegistryObject<Item>)CardRegistry.CARDS.getEntries().toArray()[(int)(Math.random() * 100) % CardRegistry.CARDS.getEntries().size()]).get());
        }
    };
}
