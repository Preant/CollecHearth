package com.sirocco.collechearth.utils;

import com.sirocco.collechearth.CollecHearth;
import com.sirocco.collechearth.items.CardItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.RegistryObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class CardRegistry
{
    public static final DeferredRegister<Item> CARDS = DeferredRegister.create(ForgeRegistries.ITEMS, CollecHearth.MODID);
    public static final DeferredRegister<Item> FOILCARDS = DeferredRegister.create(ForgeRegistries.ITEMS, CollecHearth.MODID);

    public static final ArrayList<RegistryObject<CardItem>> CARDLIST = new ArrayList<>();
    public static final ArrayList<RegistryObject<CardItem>> FOILCARDLIST = new ArrayList<>();
    private Vector<CardInfo> cardListInfo = new Vector<CardInfo>();

    public CardRegistry()
    {
        this.barrens(this.cardListInfo);

        for (Iterator<CardInfo> it = this.cardListInfo.iterator(); it.hasNext();) {
            CardInfo info = it.next();
            CARDLIST.add(CARDS.register(info.getExpansion() + "/" + info.getCardClass() + "/" + info.getName(), () -> new CardItem(info)));
            CardInfo foil = new CardInfo(info);
            foil.setFoil(true);
            FOILCARDLIST.add(FOILCARDS.register(foil.getExpansion() + "/" + foil.getCardClass() + "/" + foil.getName() + "-f", () -> new CardItem(foil)));
        }
        CardRegistry.CARDS.register(FMLJavaModLoadingContext.get().getModEventBus());
        CardRegistry.FOILCARDS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public void barrens(Vector<CardInfo> cardListInfo) {
        //demonhunter
        cardListInfo.add(new CardInfo("barrens/demonhunter/deathspeakerblackthorn/legendary/1-1-1"));
        cardListInfo.add(new CardInfo("barrens/demonhunter/kurtrusashfallen/legendary/1-1-2"));
        cardListInfo.add(new CardInfo("barrens/demonhunter/sigilofflame/epic/1-1-3"));
        cardListInfo.add(new CardInfo("barrens/demonhunter/vengefulspirit/epic/1-1-4"));
        cardListInfo.add(new CardInfo("barrens/demonhunter/razorfenbeastmaster/rare/1-1-5"));
        cardListInfo.add(new CardInfo("barrens/demonhunter/sigilofsilence/rare/1-1-6"));
        cardListInfo.add(new CardInfo("barrens/demonhunter/tuskpiercer/rare/1-1-7"));
        cardListInfo.add(new CardInfo("barrens/demonhunter/furyrank1/common/1-1-8"));
        cardListInfo.add(new CardInfo("barrens/demonhunter/razorboar/common/1-1-9"));
        cardListInfo.add(new CardInfo("barrens/demonhunter/vilecall/common/1-1-10"));

        //druid
        cardListInfo.add(new CardInfo("barrens/druid/guffrunetotem/legendary/1-2-1"));
        cardListInfo.add(new CardInfo("barrens/druid/plaguemawtherotting/legendary/1-2-2"));
        cardListInfo.add(new CardInfo("barrens/druid/celestialalignment/epic/1-2-3"));
        cardListInfo.add(new CardInfo("barrens/druid/druidoftheplains/epic/1-2-4"));
        cardListInfo.add(new CardInfo("barrens/druid/livingseedrank1/rare/1-2-6"));
        cardListInfo.add(new CardInfo("barrens/druid/markofthespikeshell/rare/1-2-5"));
        cardListInfo.add(new CardInfo("barrens/druid/razormanebattleguard/rare/1-2-7"));
        cardListInfo.add(new CardInfo("barrens/druid/pridesfury/common/1-2-8"));
        cardListInfo.add(new CardInfo("barrens/druid/thickhidekodo/common/1-2-9"));
        cardListInfo.add(new CardInfo("barrens/druid/thorngrowthsentries/common/1-2-10"));

        //hunter
        cardListInfo.add(new CardInfo("barrens/hunter/barakkodobane/legendary/1-3-1"));
        cardListInfo.add(new CardInfo("barrens/hunter/tavishstormpike/legendary/1-3-2"));
        cardListInfo.add(new CardInfo("barrens/hunter/kolkarpackrunner/epic/1-3-3"));
        cardListInfo.add(new CardInfo("barrens/hunter/warsongwrangler/epic/1-3-4"));
        cardListInfo.add(new CardInfo("barrens/hunter/prospectorscaravan/rare/1-3-5"));
        cardListInfo.add(new CardInfo("barrens/hunter/sunscaleraptor/rare/1-3-6"));
        cardListInfo.add(new CardInfo("barrens/hunter/tamebeastrank1/rare/1-3-7"));
        cardListInfo.add(new CardInfo("barrens/hunter/packkodo/common/1-3-8"));
        cardListInfo.add(new CardInfo("barrens/hunter/piercingshot/common/1-3-9"));
        cardListInfo.add(new CardInfo("barrens/hunter/woundprey/common/1-3-10"));

        //mage
        cardListInfo.add(new CardInfo("barrens/mage/mordreshfireeye/legendary/1-4-1"));
        cardListInfo.add(new CardInfo("barrens/mage/vardendawngrasp/legendary/1-4-2"));
        cardListInfo.add(new CardInfo("barrens/mage/arcaneluminary/epic/1-4-3"));
        cardListInfo.add(new CardInfo("barrens/mage/wildfire/epic/1-4-4"));
        cardListInfo.add(new CardInfo("barrens/mage/flurryrank1/rare/1-4-5"));
        cardListInfo.add(new CardInfo("barrens/mage/recklessapprentice/rare/1-4-7"));
        cardListInfo.add(new CardInfo("barrens/mage/rimetongue/rare/1-4-8"));
        cardListInfo.add(new CardInfo("barrens/mage/oasisally/common/1-4-6"));
        cardListInfo.add(new CardInfo("barrens/mage/refreshingspringwater/common/1-4-9"));
        cardListInfo.add(new CardInfo("barrens/mage/runedorb/common/1-4-10"));

        //paladin
        cardListInfo.add(new CardInfo("barrens/paladin/cannonmastersmythe/legendary/1-5-1"));
        cardListInfo.add(new CardInfo("barrens/paladin/carielroame/legendary/1-5-2"));
        cardListInfo.add(new CardInfo("barrens/paladin/convictionrank1/epic/1-5-3"));
        cardListInfo.add(new CardInfo("barrens/paladin/veteranwarmedic/epic/1-5-4"));
        cardListInfo.add(new CardInfo("barrens/paladin/northwatchcommander/rare/1-5-5"));
        cardListInfo.add(new CardInfo("barrens/paladin/soldierscaravan/rare/1-5-6"));
        cardListInfo.add(new CardInfo("barrens/paladin/swordofthefallen/rare/1-5-7"));
        cardListInfo.add(new CardInfo("barrens/paladin/gallopingsavior/common/1-5-8"));
        cardListInfo.add(new CardInfo("barrens/paladin/knightofanointment/common/1-5-9"));
        cardListInfo.add(new CardInfo("barrens/paladin/invigoratingsermon/common/1-5-10"));

        //priest
        cardListInfo.add(new CardInfo("barrens/priest/serenabloodfeather/legendary/1-6-1"));
        cardListInfo.add(new CardInfo("barrens/priest/xyrella/legendary/1-6-2"));
        cardListInfo.add(new CardInfo("barrens/priest/condemnrank1/epic/1-6-3"));
        cardListInfo.add(new CardInfo("barrens/priest/priestofanshe/epic/1-6-4"));
        cardListInfo.add(new CardInfo("barrens/priest/lightshowerelemental/rare/1-6-5"));
        cardListInfo.add(new CardInfo("barrens/priest/soothsayerscaravan/rare/1-6-6"));
        cardListInfo.add(new CardInfo("barrens/priest/voidflayer/rare/1-6-7"));
        cardListInfo.add(new CardInfo("barrens/priest/desperateprayer/common/1-6-8"));
        cardListInfo.add(new CardInfo("barrens/priest/devouringplague/common/1-6-9"));
        cardListInfo.add(new CardInfo("barrens/priest/powerwordfortitude/common/1-6-10"));

        //rogue
        cardListInfo.add(new CardInfo("barrens/rogue/apothecaryhelbrim/legendary/1-7-1"));
        cardListInfo.add(new CardInfo("barrens/rogue/scabbscutterbutter/legendary/1-7-2"));
        cardListInfo.add(new CardInfo("barrens/rogue/swinetuskshank/epic/1-7-3"));
        cardListInfo.add(new CardInfo("barrens/rogue/yoink/epic/1-7-4"));
        cardListInfo.add(new CardInfo("barrens/rogue/fieldcontact/rare/1-7-5"));
        cardListInfo.add(new CardInfo("barrens/rogue/oilrigambusher/rare/1-7-6"));
        cardListInfo.add(new CardInfo("barrens/rogue/paralyticpoison/rare/1-7-7"));
        cardListInfo.add(new CardInfo("barrens/rogue/efficientoctobot/common/1-7-8"));
        cardListInfo.add(new CardInfo("barrens/rogue/silverleafpoison/common/1-7-9"));
        cardListInfo.add(new CardInfo("barrens/rogue/wickedstabrank1/common/1-7-10"));

        //shaman
        cardListInfo.add(new CardInfo("barrens/shaman/brukan/legendary/1-8-1"));
        cardListInfo.add(new CardInfo("barrens/shaman/firemancerflurgl/legendary/1-8-2"));
        cardListInfo.add(new CardInfo("barrens/shaman/chainlightningrank1/epic/1-8-3"));
        cardListInfo.add(new CardInfo("barrens/shaman/lilypadlurker/epic/1-8-4"));
        cardListInfo.add(new CardInfo("barrens/shaman/earthrevenant/rare/1-8-5"));
        cardListInfo.add(new CardInfo("barrens/shaman/nofincanstopus/rare/1-8-6"));
        cardListInfo.add(new CardInfo("barrens/shaman/tinyfinscaravan/rare/1-8-7"));
        cardListInfo.add(new CardInfo("barrens/shaman/aridstormer/common/1-8-8"));
        cardListInfo.add(new CardInfo("barrens/shaman/southcoastchieftain/common/1-8-9"));
        cardListInfo.add(new CardInfo("barrens/shaman/spawnpoolforager/common/1-8-10"));

        //warlock
        cardListInfo.add(new CardInfo("barrens/warlock/neerufireblade/legendary/1-9-1"));
        cardListInfo.add(new CardInfo("barrens/warlock/tamsinroame/legendary/1-9-2"));
        cardListInfo.add(new CardInfo("barrens/warlock/altaroffire/epic/1-9-3"));
        cardListInfo.add(new CardInfo("barrens/warlock/barrensscavenger/epic/1-9-4"));
        cardListInfo.add(new CardInfo("barrens/warlock/apothecaryscaravan/rare/1-9-5"));
        cardListInfo.add(new CardInfo("barrens/warlock/bloodshardbrisleback/rare/1-9-6"));
        cardListInfo.add(new CardInfo("barrens/warlock/soulrend/rare/1-9-7"));
        cardListInfo.add(new CardInfo("barrens/warlock/impswarmrank1/common/1-9-8"));
        cardListInfo.add(new CardInfo("barrens/warlock/grimoireofsacrifice/common/1-9-9"));
        cardListInfo.add(new CardInfo("barrens/warlock/kabaloutfitter/common/1-9-10"));

        //warrior
        cardListInfo.add(new CardInfo("barrens/warrior/overlordsaurfang/legendary/1-10-1"));
        cardListInfo.add(new CardInfo("barrens/warrior/rokara/legendary/1-10-2"));
        cardListInfo.add(new CardInfo("barrens/warrior/morshanelite/epic/1-10-3"));
        cardListInfo.add(new CardInfo("barrens/warrior/rancor/epic/1-10-4"));
        cardListInfo.add(new CardInfo("barrens/warrior/conditioningrank1/rare/1-10-5"));
        cardListInfo.add(new CardInfo("barrens/warrior/outridersaxe/rare/1-10-6"));
        cardListInfo.add(new CardInfo("barrens/warrior/warsongenvoy/rare/1-10-7"));
        cardListInfo.add(new CardInfo("barrens/warrior/bulkup/common/1-10-8"));
        cardListInfo.add(new CardInfo("barrens/warrior/stonemaulanchorman/common/1-10-9"));
        cardListInfo.add(new CardInfo("barrens/warrior/whirlingcombatant/common/1-10-10"));

        //neutral
        cardListInfo.add(new CardInfo("barrens/neutral/blademastersamuro/legendary/1-11-1"));
        cardListInfo.add(new CardInfo("barrens/neutral/kargalbattlescar/legendary/1-11-2"));
        cardListInfo.add(new CardInfo("barrens/neutral/kazakusgolemshaper/legendary/1-11-3"));
        cardListInfo.add(new CardInfo("barrens/neutral/mankrik/legendary/1-11-4"));
        cardListInfo.add(new CardInfo("barrens/neutral/shadowhuntervoljin/legendary/1-11-5"));
        cardListInfo.add(new CardInfo("barrens/neutral/barrensblacksmith/epic/1-11-6"));
        cardListInfo.add(new CardInfo("barrens/neutral/crossroadswatchpost/epic/1-11-7"));
        cardListInfo.add(new CardInfo("barrens/neutral/primordialprotector/epic/1-11-8"));
        cardListInfo.add(new CardInfo("barrens/neutral/southseascoundrel/epic/1-11-9"));
        cardListInfo.add(new CardInfo("barrens/neutral/spirithealer/epic/1-11-10"));
        cardListInfo.add(new CardInfo("barrens/neutral/burningbladeacolyte/rare/1-11-11"));
        cardListInfo.add(new CardInfo("barrens/neutral/hecklefanghyena/rare/1-11-12"));
        cardListInfo.add(new CardInfo("barrens/neutral/hordeoperative/rare/1-11-13"));
        cardListInfo.add(new CardInfo("barrens/neutral/morshanwatchpost/rare/1-11-14"));
        cardListInfo.add(new CardInfo("barrens/neutral/taurajobrave/rare/1-11-15"));
        cardListInfo.add(new CardInfo("barrens/neutral/barrenstrapper/common/1-11-16"));
        cardListInfo.add(new CardInfo("barrens/neutral/crossroadsgossiper/common/1-11-17"));
        cardListInfo.add(new CardInfo("barrens/neutral/darkspearberserker/common/1-11-18"));
        cardListInfo.add(new CardInfo("barrens/neutral/deathsheadcultist/common/1-11-19"));
        cardListInfo.add(new CardInfo("barrens/neutral/farwatchpost/common/1-11-20"));
        cardListInfo.add(new CardInfo("barrens/neutral/goldroadgrunt/common/1-11-21"));
        cardListInfo.add(new CardInfo("barrens/neutral/gruntledpatron/common/1-11-22"));
        cardListInfo.add(new CardInfo("barrens/neutral/hograncher/common/1-11-23"));
        cardListInfo.add(new CardInfo("barrens/neutral/injuredmarauder/common/1-11-24"));
        cardListInfo.add(new CardInfo("barrens/neutral/kindlingelemental/common/1-11-25"));
        cardListInfo.add(new CardInfo("barrens/neutral/lushwatermurcenary/common/1-11-26"));
        cardListInfo.add(new CardInfo("barrens/neutral/lushwaterscout/common/1-11-27"));
        cardListInfo.add(new CardInfo("barrens/neutral/oasisthrasher/common/1-11-28"));
        cardListInfo.add(new CardInfo("barrens/neutral/peon/common/1-11-29"));
        cardListInfo.add(new CardInfo("barrens/neutral/ratchetprivateer/common/1-11-30"));
        cardListInfo.add(new CardInfo("barrens/neutral/razormaneraider/common/1-11-31"));
        cardListInfo.add(new CardInfo("barrens/neutral/sunwellinitiate/common/1-11-32"));
        cardListInfo.add(new CardInfo("barrens/neutral/talentedarcanist/common/1-11-33"));
        cardListInfo.add(new CardInfo("barrens/neutral/toadofthewilds/common/1-11-34"));
        cardListInfo.add(new CardInfo("barrens/neutral/venomousscorpid/common/1-11-35"));
    }
}