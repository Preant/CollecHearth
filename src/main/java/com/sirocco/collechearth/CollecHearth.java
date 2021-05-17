package com.sirocco.collechearth;


import com.sirocco.collechearth.utils.CardRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CollecHearth.MODID)
public class CollecHearth {
    public static final String MODID = "collechearth";

    public CollecHearth()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        bus.addListener(this::setup);
        bus.addListener(this::clientSetup);
        new CardRegistry().init();
    }

    public void setup(FMLCommonSetupEvent e)
    {

    }

    public void clientSetup(FMLCommonSetupEvent e)
    {
        CARDS_TAB.setRecipeFolderName("test");
    }

    public static final ItemGroup TAB = new ItemGroup("collechearth_misc") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(CardRegistry.CARIEL.get());
        }
    };

    public static final ItemGroup CARDS_TAB = new ItemGroup("collechearth_cards") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(CardRegistry.CARIEL.get());
        }
    };
}
