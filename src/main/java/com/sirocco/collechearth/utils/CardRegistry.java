package com.sirocco.collechearth.utils;

import com.sirocco.collechearth.CollecHearth;
import com.sirocco.collechearth.items.CardItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Iterator;
import java.util.Vector;
public class CardRegistry
{
    public static final DeferredRegister<Item> CARDS = DeferredRegister.create(ForgeRegistries.ITEMS, CollecHearth.MODID);
    private Vector<CardInfo> cardList = new Vector<CardInfo>();

    public class CardInfo {
        public String cardClass = null;
        public String expansion = null;
        public String name = null;
        public String rarity = null;

        public CardInfo(String gatheredData) {
            String [] split = gatheredData.split("/");
            this.expansion = split[0];
            this.cardClass = split[1];
            this.name = split[2];
        }

        public String getCardClass() {
            return (this.cardClass);
        }

        public String getExpansion() {
            return (this.expansion);
        }

        public String getName() {
            return (this.name);
        }

        public String getRarity() {
            return (this.rarity);
        }
    }

    public CardRegistry()
    {
        this.barrens(this.cardList);

        for (Iterator<CardInfo> it = this.cardList.iterator(); it.hasNext();) {
            CardInfo info = it.next();
            CARDS.register(info.getExpansion() + "/" + info.getCardClass() + "/" + info.getName(), () -> new CardItem());
        }
        CardRegistry.CARDS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public void barrens(Vector<CardInfo> cardList) {
        //demonhunter
        cardList.add(new CardInfo("barrens/demonhunter/deathspeakerblackthorn/legendary"));
        cardList.add(new CardInfo("barrens/demonhunter/kurtrusashfallen/legendary"));
        cardList.add(new CardInfo("barrens/demonhunter/sigilofflame/epic"));
        cardList.add(new CardInfo("barrens/demonhunter/vengefulspirit/epic"));
        cardList.add(new CardInfo("barrens/demonhunter/tuskpiercer/rare"));
        cardList.add(new CardInfo("barrens/demonhunter/sigilofsilence/rare"));
        cardList.add(new CardInfo("barrens/demonhunter/razorfenbeastmaster/rare"));
        cardList.add(new CardInfo("barrens/demonhunter/furyrank1/common"));
        cardList.add(new CardInfo("barrens/demonhunter/razorboar/common"));
        cardList.add(new CardInfo("barrens/demonhunter/vilecall/common"));

        //druid
        cardList.add(new CardInfo("barrens/druid/guffrunetotem/legendary"));
        cardList.add(new CardInfo("barrens/druid/plaguemawtherotting/legendary"));
        cardList.add(new CardInfo("barrens/druid/celestialalignement/epic"));
        cardList.add(new CardInfo("barrens/druid/druidoftheplains/epic"));
        cardList.add(new CardInfo("barrens/druid/larkofthespikeshell/rare"));
        cardList.add(new CardInfo("barrens/druid/razormanebattleguard/rare"));
        cardList.add(new CardInfo("barrens/druid/livingseedrank1/rare"));
        cardList.add(new CardInfo("barrens/druid/thorngrowthsentries/common"));
        cardList.add(new CardInfo("barrens/druid/thickhidekodo/common"));
        cardList.add(new CardInfo("barrens/druid/pridesfury/common"));

        //hunter
        cardList.add(new CardInfo("barrens/hunter/barakkodobane/legendary"));
        cardList.add(new CardInfo("barrens/hunter/tavishstormpike/legendary"));
        cardList.add(new CardInfo("barrens/hunter/kolkarpackrunner/epic"));
        cardList.add(new CardInfo("barrens/hunter/warsongwrangler/epic"));
        cardList.add(new CardInfo("barrens/hunter/sunscaleraptor/rare"));
        cardList.add(new CardInfo("barrens/hunter/prospectorscaravan/rare"));
        cardList.add(new CardInfo("barrens/hunter/tamebeastrank1/rare"));
        cardList.add(new CardInfo("barrens/hunter/piercingshot/common"));
        cardList.add(new CardInfo("barrens/hunter/woundprey/common"));
        cardList.add(new CardInfo("barrens/hunter/packkodo/common"));

        //mage
        cardList.add(new CardInfo("barrens/mage/mordreshfireeye/legendary"));
        cardList.add(new CardInfo("barrens/mage/vardendawngrasp/legendary"));
        cardList.add(new CardInfo("barrens/mage/arcaneluminary/epic"));
        cardList.add(new CardInfo("barrens/mage/wildfire/epic"));
        cardList.add(new CardInfo("barrens/mage/flurryrank1/rare"));
        cardList.add(new CardInfo("barrens/mage/rimetongue/rare"));
        cardList.add(new CardInfo("barrens/mage/recklessapprentice/rare"));
        cardList.add(new CardInfo("barrens/mage/refreshingspringwater/common"));
        cardList.add(new CardInfo("barrens/mage/oasisally/common"));
        cardList.add(new CardInfo("barrens/mage/runedorb/common"));

        //paladin
        cardList.add(new CardInfo("barrens/paladin/cannonmastersmythe/legendary"));
        cardList.add(new CardInfo("barrens/paladin/carielroame/legendary"));
        cardList.add(new CardInfo("barrens/paladin/convictionrank1/epic"));
        cardList.add(new CardInfo("barrens/paladin/veteranwarmedic/epic"));
        cardList.add(new CardInfo("barrens/paladin/swordofthefallen/rare"));
        cardList.add(new CardInfo("barrens/paladin/soldierscaravan/rare"));
        cardList.add(new CardInfo("barrens/paladin/northwatchcommander/rare"));
        cardList.add(new CardInfo("barrens/paladin/knightofanointment/common"));
        cardList.add(new CardInfo("barrens/paladin/invigoratingsermon/common"));
        cardList.add(new CardInfo("barrens/paladin/gallopingsavior/common"));

        //priest
        cardList.add(new CardInfo("barrens/priest/xyrella/legendary"));
        cardList.add(new CardInfo("barrens/priest/serenabloodfeather/legendary"));
        cardList.add(new CardInfo("barrens/priest/condemnrank1/epic"));
        cardList.add(new CardInfo("barrens/priest/priestofanshe/epic"));
        cardList.add(new CardInfo("barrens/priest/soothsayerscaravan/rare"));
        cardList.add(new CardInfo("barrens/priest/voidflayer/rare"));
        cardList.add(new CardInfo("barrens/priest/lightshowerelemental/rare"));
        cardList.add(new CardInfo("barrens/priest/powerwordfortitude/common"));
        cardList.add(new CardInfo("barrens/priest/devouringplague/common"));
        cardList.add(new CardInfo("barrens/priest/desperateprayer/common"));

        //rogue
        cardList.add(new CardInfo("barrens/rogue/apothecaryhelbrim/legendary"));
        cardList.add(new CardInfo("barrens/rogue/scabbscutterbutter/legendary"));
        cardList.add(new CardInfo("barrens/rogue/yoink/epic"));
        cardList.add(new CardInfo("barrens/rogue/swinetuskshank/epic"));
        cardList.add(new CardInfo("barrens/rogue/paralyticpoison/rare"));
        cardList.add(new CardInfo("barrens/rogue/oilrigambusher/rare"));
        cardList.add(new CardInfo("barrens/rogue/fieldcontact/rare"));
        cardList.add(new CardInfo("barrens/rogue/wickedstabrank1/common"));
        cardList.add(new CardInfo("barrens/rogue/silverleafpoison/common"));
        cardList.add(new CardInfo("barrens/rogue/efficientoctobot/common"));

        //shaman
        cardList.add(new CardInfo("barrens/shaman/brukan/legendary"));
        cardList.add(new CardInfo("barrens/shaman/firemancerflurgl/legendary"));
        cardList.add(new CardInfo("barrens/shaman/chainlightningrank1/epic"));
        cardList.add(new CardInfo("barrens/shaman/lilypadlurker/epic"));
        cardList.add(new CardInfo("barrens/shaman/earthrevenant/rare"));
        cardList.add(new CardInfo("barrens/shaman/nofincanstopus/rare"));
        cardList.add(new CardInfo("barrens/shaman/tinyfinscaravan/rare"));
        cardList.add(new CardInfo("barrens/shaman/aridstormer/common"));
        cardList.add(new CardInfo("barrens/shaman/southcoastchieftain/common"));
        cardList.add(new CardInfo("barrens/shaman/spawnpoolforager/common"));

        //warlock
        cardList.add(new CardInfo("barrens/warlock/neerufireblade/legendary"));
        cardList.add(new CardInfo("barrens/warlock/tamsinroame/legendary"));
        cardList.add(new CardInfo("barrens/warlock/altaroffire/epic"));
        cardList.add(new CardInfo("barrens/warlock/barrensscavenger/epic"));
        cardList.add(new CardInfo("barrens/warlock/apothecaryscaravan/rare"));
        cardList.add(new CardInfo("barrens/warlock/soulrend/rare"));
        cardList.add(new CardInfo("barrens/warlock/bloodshardbrisleback/rare"));
        cardList.add(new CardInfo("barrens/warlock/grimoireofsacrifice/common"));
        cardList.add(new CardInfo("barrens/warlock/impswarmrank1/common"));
        cardList.add(new CardInfo("barrens/warlock/kabaloutfitter/common"));

        //warrior
        cardList.add(new CardInfo("barrens/warrior/overlordsaurfang/legendary"));
        cardList.add(new CardInfo("barrens/warrior/rokara/legendary"));
        cardList.add(new CardInfo("barrens/warrior/morshanelite/epic"));
        cardList.add(new CardInfo("barrens/warrior/rancor/epic"));
        cardList.add(new CardInfo("barrens/warrior/conditioningrank1/rare"));
        cardList.add(new CardInfo("barrens/warrior/outridersaxe/rare"));
        cardList.add(new CardInfo("barrens/warrior/warsongenvoy/rare"));
        cardList.add(new CardInfo("barrens/warrior/bulkup/common"));
        cardList.add(new CardInfo("barrens/warrior/stonemaulanchorman/common"));
        cardList.add(new CardInfo("barrens/warrior/whirlingcombatant/common"));

        //neutral
        cardList.add(new CardInfo("barrens/neutral/blademastersamuro/legendary"));
        cardList.add(new CardInfo("barrens/neutral/mankrik/legendary"));
        cardList.add(new CardInfo("barrens/neutral/shadowhuntervoljin/legendary"));
        cardList.add(new CardInfo("barrens/neutral/kazakusgolemshaper/legendary"));
        cardList.add(new CardInfo("barrens/neutral/kargalbattlescar/legendary"));
        cardList.add(new CardInfo("barrens/neutral/barrensblacksmith/epic"));
        cardList.add(new CardInfo("barrens/neutral/spirithealer/epic"));
        cardList.add(new CardInfo("barrens/neutral/southseascoundrel/epic"));
        cardList.add(new CardInfo("barrens/neutral/primordialprotector/epic"));
        cardList.add(new CardInfo("barrens/neutral/crossroadswatchpost/epic"));
        cardList.add(new CardInfo("barrens/neutral/morshanwatchpost/rare"));
        cardList.add(new CardInfo("barrens/neutral/hordeoperative/rare"));
        cardList.add(new CardInfo("barrens/neutral/hecklefanghyena/rare"));
        cardList.add(new CardInfo("barrens/neutral/burningbladeacolyte/rare"));
        cardList.add(new CardInfo("barrens/neutral/taurajobrave/rare"));
        cardList.add(new CardInfo("barrens/neutral/barrenstrapper/common"));
        cardList.add(new CardInfo("barrens/neutral/crossroadsgossiper/common"));
        cardList.add(new CardInfo("barrens/neutral/darkspearberserker/common"));
        cardList.add(new CardInfo("barrens/neutral/deathsheadcultist/common"));
        cardList.add(new CardInfo("barrens/neutral/farwatchpost/common"));
        cardList.add(new CardInfo("barrens/neutral/goldroadgrunt/common"));
        cardList.add(new CardInfo("barrens/neutral/gruntledpatron/common"));
        cardList.add(new CardInfo("barrens/neutral/hograncher/common"));
        cardList.add(new CardInfo("barrens/neutral/injuredmarauder/common"));
        cardList.add(new CardInfo("barrens/neutral/lushwatermurcenary/common"));
        cardList.add(new CardInfo("barrens/neutral/kindlingelemental/common"));
        cardList.add(new CardInfo("barrens/neutral/peon/common"));
        cardList.add(new CardInfo("barrens/neutral/oasisthrasher/common"));
        cardList.add(new CardInfo("barrens/neutral/ratchetprivateer/common"));
        cardList.add(new CardInfo("barrens/neutral/razormaneraider/common"));
        cardList.add(new CardInfo("barrens/neutral/sunwellinitiate/common"));
        cardList.add(new CardInfo("barrens/neutral/talentedarcanist/common"));
        cardList.add(new CardInfo("barrens/neutral/toadofthewilds/common"));
        cardList.add(new CardInfo("barrens/neutral/venomousscorpid/common"));
    }
}