package com.sirocco.collechearth.items;

import com.sirocco.collechearth.CollecHearth;
import com.sirocco.collechearth.utils.CardRegistry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.world.World;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.util.NonNullList;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public class PackItem extends Item
{
    public PackItem()
    {
        super(new Item.Properties().tab(CollecHearth.MISC));
    }

    @Override
    public Rarity getRarity(ItemStack p_77613_1_) {
        return Rarity.RARE;
    }

    @Override
    public ActionResult<ItemStack> use(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if(worldIn instanceof ServerWorld) {
            playerIn.getItemInHand(handIn).shrink(1);

            NonNullList<ItemStack> cards = NonNullList.create();

            //0.9% leg, 4.8% epic, 5.8% rare, 88.5% common
            boolean hasRareCard = false;
            List<Rarity> rarities = new ArrayList<Rarity>();
            for (int i = 0; i < 5; i++) {
                float rand = worldIn.random.nextFloat();
                if (rand < .885) {
                    rarities.add(Rarity.COMMON);
                } else if (rand < .943) {
                    hasRareCard = true;
                    rarities.add(Rarity.RARE);
                } else if (rand < .991) {
                    hasRareCard = true;
                    rarities.add(Rarity.EPIC);
                } else {
                    hasRareCard = true;
                    rarities.add(Rarity.UNCOMMON);
                }
            }
            if (!hasRareCard) {
               rarities.remove(0);
               rarities.add(Rarity.RARE);
            }


            for (int i = 0; i < 5; i++) {
                ItemStack card;

                float rand = worldIn.random.nextFloat();
                if ((rarities.get(i) == Rarity.COMMON && rand <=.0228)
                || (rarities.get(i) == Rarity.RARE && rand <=.0640)
                || (rarities.get(i) == Rarity.EPIC && rand <=.0671)
                || (rarities.get(i) == Rarity.UNCOMMON && rand <=.0909)) {
                    card = new ItemStack(getRandomCardOfRarity(CardRegistry.FOILCARDLIST, rarities.get(i)));
                } else {
                    card = new ItemStack(getRandomCardOfRarity(CardRegistry.CARDLIST, rarities.get(i)));
                }
                cards.add(card);
            }
            cards.forEach((card) -> {
                ItemHandlerHelper.giveItemToPlayer(playerIn, card);
            });
            return ActionResult.consume(playerIn.getItemInHand(handIn));
        }
        return ActionResult.success(playerIn.getItemInHand(handIn));
    }

    public static CardItem getRandomCardOfRarity(ArrayList<RegistryObject<CardItem>> cards, Rarity rarity) {
        CardItem card = cards.get((int)(Math.random() * cards.size())).get();
        for (; card.getRarity() != rarity;) {
            card = cards.get((int)(Math.random() * cards.size())).get();
        }
        return card;
    }

}
