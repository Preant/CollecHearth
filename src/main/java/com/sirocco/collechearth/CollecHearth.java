package com.sirocco.collechearth;


import com.sirocco.collechearth.utils.CardRegistry;
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
        new CardRegistry();
        CardRegistry.CARDS.register(bus);
    }

    public void setup(FMLCommonSetupEvent e)
    {

    }

    public void clientSetup(FMLCommonSetupEvent e)
    {

    }

    /*public static final ItemGroup = new ItemGroup("collechearth") {
        @Override
                public ItemStack createIcon() {
            return new ItemStack()
        }
    }*/
}
