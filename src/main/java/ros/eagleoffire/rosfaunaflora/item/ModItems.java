package ros.eagleoffire.rosfaunaflora.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import ros.eagleoffire.rosfaunaflora.ROSFaunaFlora;
import ros.eagleoffire.rosfaunaflora.block.ModBlocks;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ROSFaunaFlora.MODID);

    //plante
    public static final RegistryObject<Item> EDELWEISS = ITEMS.register("edelweiss", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ACHILEE = ITEMS.register("achilee", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AIL_DES_OURS = ITEMS.register("ail_des_ours", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMARYLLIS_JAUNE = ITEMS.register("amaryllis_jaune", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMARYLLIS_ROUGE = ITEMS.register("amaryllis_rouge", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ANETH = ITEMS.register("aneth", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ANIS = ITEMS.register("anis", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ARNICA = ITEMS.register("arnica", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ASTRAGALE = ITEMS.register("astragale", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AUBEPINE = ITEMS.register("aubepine", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BAPTISTA = ITEMS.register("baptista", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BELLADONE = ITEMS.register("belladone", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BENOITE = ITEMS.register("benoite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BERCE_GEANTE = ITEMS.register("berce_geante", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BOIS_JOLI = ITEMS.register("bois_joli", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRUYERE_LOTR = ITEMS.register("bruyere_lotr", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAFEIER = ITEMS.register("cafeier", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CALENDULA = ITEMS.register("calendula", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAMELIA = ITEMS.register("camelia", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAPUCINE = ITEMS.register("capucine", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CIGUE = ITEMS.register("cigue", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CISTE = ITEMS.register("ciste", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CORRIANDRE = ITEMS.register("corriandre", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COREOPSIS = ITEMS.register("coreopsis", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIGITALE_POURPRE = ITEMS.register("digitale_pourpre", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRACULA_SIMIA = ITEMS.register("dracula_simia", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ESTRAGON = ITEMS.register("estragon", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ETOILE_DE_NOEL = ITEMS.register("etoile_de_noel", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EUPHORBE = ITEMS.register("euphorbe", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FRITILLAIRE_PINTADE = ITEMS.register("fritillaire_pintade", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GAILLET_GRATTERON = ITEMS.register("gaillet_gratteron", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GINSENG = ITEMS.register("ginseng", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HOUBLON = ITEMS.register("houblon", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HOUX = ITEMS.register("houx", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRIS_BLEU = ITEMS.register("iris_bleu", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JACINTHE_DES_BOIS_LOTR = ITEMS.register("jacinthe_des_bois_lotr", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JONQUILLE = ITEMS.register("jonquille", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LAVENDE = ITEMS.register("lavende", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIERRE_TERRESTRE = ITEMS.register("lierre_terrestre", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LYCORIS_RADIATA = ITEMS.register("lycoris_radiata", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAUVE = ITEMS.register("mauve", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MENTHE = ITEMS.register("menthe", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MUGUET = ITEMS.register("muguet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MUSCARI = ITEMS.register("muscari", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MYOSOTIS = ITEMS.register("myosotis", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MYRTILLE = ITEMS.register("myrtille", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MELISSE = ITEMS.register("melisse", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NICOTINIA_TABACUM = ITEMS.register("nicotinia_tabacum", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NOISETTE_DE_TERRE = ITEMS.register("noisette_de_terre", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ORCHIDEE_ANGE = ITEMS.register("orchidee_ange", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ORCHIDEE = ITEMS.register("orchidee", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ORTIE = ITEMS.register("ortie", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OSEILLE_SAUVAGE = ITEMS.register("oseille_sauvage", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OXALIS_JAUNE = ITEMS.register("oxalis_jaune", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PELARGONIUM = ITEMS.register("pelargonium", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PERCE_NEIGE = ITEMS.register("perce_neige", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PERISTERIA = ITEMS.register("peristeria", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PERSIL = ITEMS.register("persil", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLANTIN = ITEMS.register("plantin", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POIVRE_NOIR = ITEMS.register("poivre_noir", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PRIMEVERE = ITEMS.register("primevere", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PRELE = ITEMS.register("prele", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAFFLESIA = ITEMS.register("rafflesia", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAISIN_BLANC = ITEMS.register("raisin_blanc", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAISIN_ROUGE = ITEMS.register("raisin_rouge", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RANUNCULUS_FICARIA = ITEMS.register("ranunculus_ficaria", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REINE_DES_PRES = ITEMS.register("reine_des_pres", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RHODODENDRON = ITEMS.register("rhododendron", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RICIN = ITEMS.register("ricin", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROMARIN = ITEMS.register("romarin", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROSE_BLANCHE = ITEMS.register("rose_blanche", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SARRACENE = ITEMS.register("sarracene", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILENE = ITEMS.register("silene", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUREAU_NOIR = ITEMS.register("sureau_noir", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SWEAT_WILLIAM_BLANCHE = ITEMS.register("sweat_william_blanche", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SWEAT_WILLIAM_ROSE = ITEMS.register("sweat_william_rose", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THYM = ITEMS.register("thym", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THEIER = ITEMS.register("theier", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UVULAIRES = ITEMS.register("uvulaires", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VIOLETTE = ITEMS.register("violette", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WEIGELA = ITEMS.register("weigela", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> YUCCA = ITEMS.register("yucca", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINNIA = ITEMS.register("zinnia", () -> new Item(new Item.Properties()));

    //champi
    public static final RegistryObject<Item> AGARICUS_BISPORUS = ITEMS.register("agaricus_bisporus", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMANITE_DES_CESARS = ITEMS.register("amanite_des_cesars", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BOLET_DE_SATAN = ITEMS.register("bolet_de_satan", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CALICE_DE_LA_MORT = ITEMS.register("calice_de_la_mort", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHANTERELLE = ITEMS.register("chanterelle", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPRIN = ITEMS.register("coprin", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CORDYCEPS = ITEMS.register("cordyceps", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CORTIANIRE_SI_JOLI = ITEMS.register("cortianire_si_joli", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COULEMELLE = ITEMS.register("coulemelle", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRINIERE_DE_LION = ITEMS.register("criniere_de_lion", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CUDONIA_CIRCINAN = ITEMS.register("cudonia_circinan", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CEPE = ITEMS.register("cepe", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENOKI = ITEMS.register("enoki", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENTOMOLE_LIVIDE = ITEMS.register("entomole_livide", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FAUSSE_MORILLE = ITEMS.register("fausse_morille", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAITAKE = ITEMS.register("maitake", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MARASME_DES_OREADES = ITEMS.register("marasme_des_oreades", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MORILLE = ITEMS.register("morille", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PIED_DE_MOUTON = ITEMS.register("pied_de_mouton", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REISHI = ITEMS.register("reishi", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROSE_DES_PRES = ITEMS.register("rose_des_pres", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHIITAKE = ITEMS.register("shiitake", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHIMEJI = ITEMS.register("shimeji", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TERMITOMYCES_TITAN = ITEMS.register("termitomyces_titan", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TROMPETTE_DE_LA_MORT = ITEMS.register("trompette_de_la_mort", () -> new Item(new Item.Properties()));

    //cactus
    public static final RegistryObject<Item> CEREUS_HEANKENUS = ITEMS.register("cereus_heankenus", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FEROCACTUS = ITEMS.register("ferocactus", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FEROCACTUS_FLEUR = ITEMS.register("fercactus_fleur", () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
