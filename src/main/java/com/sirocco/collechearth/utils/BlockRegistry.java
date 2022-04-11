package com.sirocco.collechearth.utils;

import com.sirocco.collechearth.CollecHearth;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CollecHearth.MODID);
    public static final RegistryObject<Block> ARCANE_DUST_BLOCK = BLOCKS.register("arcane_dust_block", () -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_BLOCK)));

    public BlockRegistry() {
        BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
