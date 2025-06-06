package ros.eagleoffire.rosfaunaflora.block;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.world.level.block.*;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.apache.commons.lang3.ObjectUtils;
import ros.eagleoffire.rosfaunaflora.ROSFaunaFlora;
import ros.eagleoffire.rosfaunaflora.block.custom.Fauna;
import ros.eagleoffire.rosfaunaflora.block.custom.Fauna.RarityLevel;
import ros.eagleoffire.rosfaunaflora.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ROSFaunaFlora.MODID);

    public static final RegistryObject<Block> EDELWEISS = registerBlock("edelweiss",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.INTROUVABLE, ModBlockEntities.EDELWEISS_BE));
    public static final RegistryObject<Block> POTTED_EDELWEISS = BLOCKS.register("potted_edelweiss",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.EDELWEISS,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> ACHILEE = registerBlock("achilee",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.ACHILEE_BE));
    public static final RegistryObject<Block> AIL_DES_OURS = registerBlock("ail_des_ours",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.AIL_DES_OURS_BE));
    public static final RegistryObject<Block> AMARYLLIS_JAUNE = registerBlock("amaryllis_jaune",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.TRES_RARE, ModBlockEntities.AMARYLLIS_JAUNE_BE));
    public static final RegistryObject<Block> AMARYLLIS_ROUGE = registerBlock("amaryllis_rouge",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.TRES_RARE, ModBlockEntities.AMARYLLIS_ROUGE_BE));
    public static final RegistryObject<Block> ANETH = registerBlock("aneth",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.ANETH_BE));
    public static final RegistryObject<Block> ANIS = registerBlock("anis",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.TRES_RARE, ModBlockEntities.ANIS_BE));
    public static final RegistryObject<Block> ARNICA = registerBlock("arnica",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.ARNICA_BE));
    public static final RegistryObject<Block> ASTRAGALE = registerBlock("astragale",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.ASTRAGALE_BE));
    public static final RegistryObject<Block> AUBEPINE = registerBlock("aubepine",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.AUBEPINE_BE));
    public static final RegistryObject<Block> BAPTISTA = registerBlock("baptista",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.TRES_RARE, ModBlockEntities.BAPTISTA_BE));
    public static final RegistryObject<Block> BELLADONE = registerBlock("belladone",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.TRES_RARE, ModBlockEntities.BELLADONE_BE));
    public static final RegistryObject<Block> BENOITE = registerBlock("benoite",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.BENOITE_BE));
    public static final RegistryObject<Block> BERCE_GEANTE = registerBlock("berce_geante",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.BERCE_GEANTE_BE));
    public static final RegistryObject<Block> BOIS_JOLI = registerBlock("bois_joli",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.TRES_RARE, ModBlockEntities.BOIS_JOLI_BE));
    public static final RegistryObject<Block> BRUYERE_LOTR = registerBlock("bruyere_lotr",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.BRUYERE_LOTR_BE));
    public static final RegistryObject<Block> CAFEIER = registerBlock("cafeier",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.TRES_RARE, ModBlockEntities.CAFEIER_BE));
    public static final RegistryObject<Block> CALENDULA = registerBlock("calendula",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.TRES_RARE, ModBlockEntities.CALENDULA_BE));
    public static final RegistryObject<Block> CAMELIA = registerBlock("camelia",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.INTROUVABLE, ModBlockEntities.CAMELIA_BE));
    public static final RegistryObject<Block> CAPUCINE = registerBlock("capucine",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.TRES_RARE, ModBlockEntities.CAPUCINE_BE));
    public static final RegistryObject<Block> CIGUE = registerBlock("cigue",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.CIGUE_BE));
    public static final RegistryObject<Block> CISTE = registerBlock("ciste",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.CISTE_BE));
    public static final RegistryObject<Block> CORRIANDRE = registerBlock("corriandre",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.TRES_RARE, ModBlockEntities.CORRIANDRE_BE));
    public static final RegistryObject<Block> COREOPSIS = registerBlock("coreopsis",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.COREOPSIS_BE));
    public static final RegistryObject<Block> DIGITALE_POURPRE = registerBlock("digitale_pourpre",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.DIGITALE_POURPRE_BE));
    public static final RegistryObject<Block> DRACULA_SIMIA = registerBlock("dracula_simia",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.INTROUVABLE, ModBlockEntities.DRACULA_SIMIA_BE));
    public static final RegistryObject<Block> ESTRAGON = registerBlock("estragon",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.TRES_RARE, ModBlockEntities.ESTRAGON_BE));
    public static final RegistryObject<Block> ETOILE_DE_NOEL = registerBlock("etoile_de_noel",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.INTROUVABLE, ModBlockEntities.ETOILE_DE_NOEL_BE));
    public static final RegistryObject<Block> EUPHORBE = registerBlock("euphorbe",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.EUPHORBE_BE));
    public static final RegistryObject<Block> FRITILLAIRE_PINTADE = registerBlock("fritillaire_pintade",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.FRITILLAIRE_PINTADE_BE));
    public static final RegistryObject<Block> GAILLET_GRATTERON = registerBlock("gaillet_gratteron",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.GAILLET_GRATTERON_BE));
    public static final RegistryObject<Block> GINSENG = registerBlock("ginseng",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.INTROUVABLE, ModBlockEntities.GINSENG_BE));
    public static final RegistryObject<Block> HOUBLON = registerBlock("houblon",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.HOUBLON_BE));
    public static final RegistryObject<Block> HOUX = registerBlock("houx",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.HOUX_BE));
    public static final RegistryObject<Block> IRIS_BLEU = registerBlock("iris_bleu",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.IRIS_BLEU_BE));
    public static final RegistryObject<Block> JACINTHE_DES_BOIS_LOTR = registerBlock("jacinthe_des_bois_lotr",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.JACINTHE_DES_BOIS_LOTR_BE));
    public static final RegistryObject<Block> JONQUILLE = registerBlock("jonquille",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.JONQUILLE_BE));
    public static final RegistryObject<Block> LAVENDE = registerBlock("lavende",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.LAVENDE_BE));
    public static final RegistryObject<Block> LIERRE_TERRESTRE = registerBlock("lierre_terrestre",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.LIERRE_TERRESTRE_BE));
    public static final RegistryObject<Block> LYCORIS_RADIATA = registerBlock("lycoris_radiata",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.INTROUVABLE, ModBlockEntities.LYCORIS_RADIATA_BE));
    public static final RegistryObject<Block> MAUVE = registerBlock("mauve",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.MAUVE_BE));
    public static final RegistryObject<Block> MENTHE = registerBlock("menthe",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.MENTHE_BE));
    public static final RegistryObject<Block> MUGUET = registerBlock("muguet",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.MUGUET_BE));
    public static final RegistryObject<Block> MUSCARI = registerBlock("muscari",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.MUSCARI_BE));
    public static final RegistryObject<Block> MYOSOTIS = registerBlock("myosotis",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.MYOSOTIS_BE));
    public static final RegistryObject<Block> MYRTILLE = registerBlock("myrtille",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.MYRTILLE_BE));
    public static final RegistryObject<Block> MELISSE = registerBlock("melisse",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.MELISSE_BE));
    public static final RegistryObject<Block> NICOTINIA_TABACUM = registerBlock("nicotinia_tabacum",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.NICOTINIA_TABACUM_BE));
    public static final RegistryObject<Block> NOISETTE_DE_TERRE = registerBlock("noisette_de_terre",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.TRES_RARE, ModBlockEntities.NOISETTE_DE_TERRE_BE));
    public static final RegistryObject<Block> ORCHIDEE_ANGE = registerBlock("orchidee_ange",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.INTROUVABLE, ModBlockEntities.ORCHIDEE_ANGE_BE));
    public static final RegistryObject<Block> ORCHIDEE = registerBlock("orchidee",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.TRES_RARE, ModBlockEntities.ORCHIDEE_BE));
    public static final RegistryObject<Block> ORTIE = registerBlock("ortie",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.ORTIE_BE));
    public static final RegistryObject<Block> OSEILLE_SAUVAGE = registerBlock("oseille_sauvage",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.OSEILLE_SAUVAGE_BE));
    public static final RegistryObject<Block> OXALIS_JAUNE = registerBlock("oxalis_jaune",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.OXALIS_JAUNE_BE));
    public static final RegistryObject<Block> PELARGONIUM = registerBlock("pelargonium",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.PELARGONIUM_BE));
    public static final RegistryObject<Block> PERCE_NEIGE = registerBlock("perce_neige",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.PERCE_NEIGE_BE));
    public static final RegistryObject<Block> PERISTERIA = registerBlock("peristeria",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.TRES_RARE, ModBlockEntities.PERISTERIA_BE));
    public static final RegistryObject<Block> PERSIL = registerBlock("persil",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.PERSIL_BE));
    public static final RegistryObject<Block> PLANTIN = registerBlock("plantin",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.PLANTIN_BE));
    public static final RegistryObject<Block> POIVRE_NOIR = registerBlock("poivre_noir",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.TRES_RARE, ModBlockEntities.POIVRE_NOIR_BE));
    public static final RegistryObject<Block> PRIMEVERE = registerBlock("primevere",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.PRIMEVERE_BE));
    public static final RegistryObject<Block> PRELE = registerBlock("prele",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.PRELE_BE));
    public static final RegistryObject<Block> RAFFLESIA = registerBlock("rafflesia",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.INTROUVABLE, ModBlockEntities.RAFFLESIA_BE));
    public static final RegistryObject<Block> RAISIN_BLANC = registerBlock("raisin_blanc",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.RAISIN_BLANC_BE));
    public static final RegistryObject<Block> RAISIN_ROUGE = registerBlock("raisin_rouge",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.RAISIN_ROUGE_BE));
    public static final RegistryObject<Block> RANUNCULUS_FICARIA = registerBlock("ranunculus_ficaria",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.RANUNCULUS_FICARIA_BE));
    public static final RegistryObject<Block> REINE_DES_PRES = registerBlock("reine_des_pres",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.REINE_DES_PRES_BE));
    public static final RegistryObject<Block> RHODODENDRON = registerBlock("rhododendron",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.RHODODENDRON_BE));
    public static final RegistryObject<Block> RICIN = registerBlock("ricin",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.RICIN_BE));
    public static final RegistryObject<Block> ROMARIN = registerBlock("romarin",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.ROMARIN_BE));
    public static final RegistryObject<Block> ROSE_BLANCHE = registerBlock("rose_blanche",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.INTROUVABLE, ModBlockEntities.ROSE_BLANCHE_BE));
    public static final RegistryObject<Block> SARRACENE = registerBlock("sarracene",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.SARRACENE_BE));
    public static final RegistryObject<Block> SILENE = registerBlock("silene",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.SILENE_BE));
    public static final RegistryObject<Block> SUREAU_NOIR = registerBlock("sureau_noir",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.SUREAU_NOIR_BE));
    public static final RegistryObject<Block> SWEAT_WILLIAM_BLANCHE = registerBlock("sweat_william_blanche",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.SWEAT_WILLIAM_BLANCHE_BE));
    public static final RegistryObject<Block> SWEAT_WILLIAM_ROSE = registerBlock("sweat_william_rose",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.SWEAT_WILLIAM_ROSE_BE));
    public static final RegistryObject<Block> THYM = registerBlock("thym",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.THYM_BE));
    public static final RegistryObject<Block> THEIER = registerBlock("theier",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.THEIER_BE));
    public static final RegistryObject<Block> UVULAIRES = registerBlock("uvulaires",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.UVULAIRES_BE));
    public static final RegistryObject<Block> VIOLETTE = registerBlock("violette",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.VIOLETTE_BE));
    public static final RegistryObject<Block> WEIGELA = registerBlock("weigela",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.WEIGELA_BE));
    public static final RegistryObject<Block> YUCCA = registerBlock("yucca",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.YUCCA_BE));
    public static final RegistryObject<Block> ZINNIA = registerBlock("zinnia",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.ZINNIA_BE));

    public static final RegistryObject<Block> AGARICUS_BISPORUS = registerBlock("agaricus_bisporus",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.AGARICUS_BISPORUS_BE));
    public static final RegistryObject<Block> AMANITE_DES_CESARS = registerBlock("amanite_des_cesars",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.AMANITE_DES_CESARS_BE));
    public static final RegistryObject<Block> BOLET_DE_SATAN = registerBlock("bolet_de_satan",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.TRES_RARE, ModBlockEntities.BOLET_DE_SATAN_BE));
    public static final RegistryObject<Block> CALICE_DE_LA_MORT = registerBlock("calice_de_la_mort",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.TRES_RARE, ModBlockEntities.CALICE_DE_LA_MORT_BE));
    public static final RegistryObject<Block> CHANTERELLE = registerBlock("chanterelle",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.CHANTERELLE_BE));
    public static final RegistryObject<Block> COPRIN = registerBlock("coprin",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.COPRIN_BE));
    public static final RegistryObject<Block> CORDYCEPS = registerBlock("cordyceps",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.TRES_RARE, ModBlockEntities.CORDYCEPS_BE));
    public static final RegistryObject<Block> CORTIANIRE_SI_JOLI = registerBlock("cortianire_si_joli",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.CORTIANIRE_SI_JOLI_BE));
    public static final RegistryObject<Block> COULEMELLE = registerBlock("coulemelle",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.COULEMELLE_BE));
    public static final RegistryObject<Block> CRINIERE_DE_LION = registerBlock("criniere_de_lion",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.CRINIERE_DE_LION_BE));
    public static final RegistryObject<Block> CUDONIA_CIRCINAN = registerBlock("cudonia_circinan",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.CUDONIA_CIRCINAN_BE));
    public static final RegistryObject<Block> CEPE = registerBlock("cepe",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.CEPE_BE));
    public static final RegistryObject<Block> ENOKI = registerBlock("enoki",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.ENOKI_BE));
    public static final RegistryObject<Block> ENTOMOLE_LIVIDE = registerBlock("entomole_livide",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.ENTOMOLE_LIVIDE_BE));
    public static final RegistryObject<Block> FAUSSE_MORILLE = registerBlock("fausse_morille",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.FAUSSE_MORILLE_BE));
    public static final RegistryObject<Block> MAITAKE = registerBlock("maitake",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.MAITAKE_BE));
    public static final RegistryObject<Block> MARASME_DES_OREADES = registerBlock("marasme_des_oreades",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.MARASME_DES_OREADES_BE));
    public static final RegistryObject<Block> MORILLE = registerBlock("morille",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.MORILLE_BE));
    public static final RegistryObject<Block> PIED_DE_MOUTON = registerBlock("pied_de_mouton",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.PIED_DE_MOUTON_BE));
    public static final RegistryObject<Block> REISHI = registerBlock("reishi",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.REISHI_BE));
    public static final RegistryObject<Block> ROSE_DES_PRES = registerBlock("rose_des_pres",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.COMMUN, ModBlockEntities.ROSE_DES_PRES_BE));
    public static final RegistryObject<Block> SHIITAKE = registerBlock("shiitake",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.SHIITAKE_BE));
    public static final RegistryObject<Block> SHIMEJI = registerBlock("shimeji",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.SHIMEJI_BE));
    public static final RegistryObject<Block> TERMITOMYCES_TITAN = registerBlock("termitomyces_titan",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.INTROUVABLE, ModBlockEntities.TERMITOMYCES_TITAN_BE));
    public static final RegistryObject<Block> TROMPETTE_DE_LA_MORT = registerBlock("trompette_de_la_mort",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.TROMPETTE_DE_LA_MORT_BE));

    public static final RegistryObject<Block> CEREUS_HEANKENUS = registerBlock("cereus_heankenus",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.CEREUS_HEANKENUS_BE));
    public static final RegistryObject<Block> FEROCACTUS = registerBlock("ferocactus",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.RARE, ModBlockEntities.FEROCACTUS_BE));
    public static final RegistryObject<Block> FEROCACTUS_FLEUR = registerBlock("ferocactus_fleur",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.TRES_RARE, ModBlockEntities.FEROCACTUS_FLEUR_BE));

    public static final RegistryObject<Block> MULDVARPHYTE = registerBlock("muldvarphyte",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.INTROUVABLE, ModBlockEntities.MULDVARPHYTE_BE));
    public static final RegistryObject<Block> SHI = registerBlock("shi",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.INTROUVABLE, ModBlockEntities.SHI_BE));
    public static final RegistryObject<Block> ARCANE_BLOOM = registerBlock("arcane_bloom",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.INTROUVABLE, ModBlockEntities.ARCANE_BLOOM_BE));
    public static final RegistryObject<Block> ATHELAS_LOTR = registerBlock("athelas_lotr",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.INTROUVABLE, ModBlockEntities.ATHELAS_LOTR_BE));
    public static final RegistryObject<Block> AURIFERE_MAUVE = registerBlock("aurifere_mauve",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.INTROUVABLE, ModBlockEntities.AURIFERE_MAUVE_BE));
    public static final RegistryObject<Block> BOUTTON_DES_NEIGES = registerBlock("boutton_des_neiges",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.INTROUVABLE, ModBlockEntities.BOUTTON_DES_NEIGES_BE));
    public static final RegistryObject<Block> CAMPANULE_MAGIQUE = registerBlock("campanule_magique",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.INTROUVABLE, ModBlockEntities.CAMPANULE_MAGIQUE_BE));
    public static final RegistryObject<Block> CHACANELITE = registerBlock("chacanelite",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.INTROUVABLE, ModBlockEntities.CHACANELITE_BE));
    public static final RegistryObject<Block> FLLORRINE = registerBlock("fllorrine",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.INTROUVABLE, ModBlockEntities.FLLORRINE_BE));
    public static final RegistryObject<Block> ICHTIL = registerBlock("ichtil",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.INTROUVABLE, ModBlockEntities.ICHTIL_BE));
    public static final RegistryObject<Block> SIMBELMYEN_LOTR = registerBlock("simbelmyen_lotr",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.INTROUVABLE, ModBlockEntities.SIMBELMYEN_LOTR_BE));
    public static final RegistryObject<Block> VICOTINE = registerBlock("vicotine",
            () -> new Fauna(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission(), RarityLevel.INTROUVABLE, ModBlockEntities.VICOTINE_BE));


    public static final RegistryObject<Block> POTTED_ACHILEE = BLOCKS.register("potted_achilee", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.ACHILEE, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_AIL_DES_OURS = BLOCKS.register("potted_ail_des_ours", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.AIL_DES_OURS, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_AMARYLLIS_JAUNE = BLOCKS.register("potted_amaryllis_jaune", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.AMARYLLIS_JAUNE, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_AMARYLLIS_ROUGE = BLOCKS.register("potted_amaryllis_rouge", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.AMARYLLIS_ROUGE, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_ANETH = BLOCKS.register("potted_aneth", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.ANETH, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_ANIS = BLOCKS.register("potted_anis", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.ANIS, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_ARNICA = BLOCKS.register("potted_arnica", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.ARNICA, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_ASTRAGALE = BLOCKS.register("potted_astragale", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.ASTRAGALE, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_AUBEPINE = BLOCKS.register("potted_aubepine", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.AUBEPINE, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_BAPTISTA = BLOCKS.register("potted_baptista", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.BAPTISTA, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_BELLADONE = BLOCKS.register("potted_belladone", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.BELLADONE, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_BENOITE = BLOCKS.register("potted_benoite", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.BENOITE, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_BERCE_GEANTE = BLOCKS.register("potted_berce_geante", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.BERCE_GEANTE, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_BOIS_JOLI = BLOCKS.register("potted_bois_joli", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.BOIS_JOLI, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_BRUYERE_LOTR = BLOCKS.register("potted_bruyere_lotr", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.BRUYERE_LOTR, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_CAFEIER = BLOCKS.register("potted_cafeier", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.CAFEIER, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_CALENDULA = BLOCKS.register("potted_calendula", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.CALENDULA, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_CAMELIA = BLOCKS.register("potted_camelia", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.CAMELIA, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_CAPUCINE = BLOCKS.register("potted_capucine", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.CAPUCINE, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_CIGUE = BLOCKS.register("potted_cigue", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.CIGUE, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_CISTE = BLOCKS.register("potted_ciste",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.CISTE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_CORRIANDRE = BLOCKS.register("potted_corriandre",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.CORRIANDRE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_COREOPSIS = BLOCKS.register("potted_coreopsis",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.COREOPSIS,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_DIGITALE_POURPRE = BLOCKS.register("potted_digitale_pourpre",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.DIGITALE_POURPRE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_DRACULA_SIMIA = BLOCKS.register("potted_dracula_simia",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.DRACULA_SIMIA,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_ESTRAGON = BLOCKS.register("potted_estragon",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.ESTRAGON,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_ETOILE_DE_NOEL = BLOCKS.register("potted_etoile_de_noel",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.ETOILE_DE_NOEL,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_EUPHORBE = BLOCKS.register("potted_euphorbe",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.EUPHORBE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_FRITILLAIRE_PINTADE = BLOCKS.register("potted_fritillaire_pintade",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.FRITILLAIRE_PINTADE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_GAILLET_GRATTERON = BLOCKS.register("potted_gaillet_gratteron",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.GAILLET_GRATTERON,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_GINSENG = BLOCKS.register("potted_ginseng",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.GINSENG,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_HOUBLON = BLOCKS.register("potted_houblon",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.HOUBLON,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_HOUX = BLOCKS.register("potted_houx",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.HOUX,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_IRIS_BLEU = BLOCKS.register("potted_iris_bleu",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.IRIS_BLEU,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_JACINTHE_DES_BOIS_LOTR = BLOCKS.register("potted_jacinthe_des_bois_lotr",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.JACINTHE_DES_BOIS_LOTR,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_JONQUILLE = BLOCKS.register("potted_jonquille",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.JONQUILLE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_LAVENDE = BLOCKS.register("potted_lavende",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.LAVENDE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_LIERRE_TERRESTRE = BLOCKS.register("potted_lierre_terrestre",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.LIERRE_TERRESTRE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_LYCORIS_RADIATA = BLOCKS.register("potted_lycoris_radiata",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.LYCORIS_RADIATA,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_MAUVE = BLOCKS.register("potted_mauve",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.MAUVE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_MENTHE = BLOCKS.register("potted_menthe",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.MENTHE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_MUGUET = BLOCKS.register("potted_muguet",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.MUGUET,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_MUSCARI = BLOCKS.register("potted_muscari",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.MUSCARI,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_MYOSOTIS = BLOCKS.register("potted_myosotis",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.MYOSOTIS,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_MYRTILLE = BLOCKS.register("potted_myrtille",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.MYRTILLE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_MELISSE = BLOCKS.register("potted_melisse",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.MELISSE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_NICOTINIA_TABACUM = BLOCKS.register("potted_nicotinia_tabacum",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.NICOTINIA_TABACUM,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_NOISETTE_DE_TERRE = BLOCKS.register("potted_noisette_de_terre",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.NOISETTE_DE_TERRE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_ORCHIDEE_ANGE = BLOCKS.register("potted_orchidee_ange",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.ORCHIDEE_ANGE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_ORCHIDEE = BLOCKS.register("potted_orchidee",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.ORCHIDEE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_ORTIE = BLOCKS.register("potted_ortie",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.ORTIE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_OSEILLE_SAUVAGE = BLOCKS.register("potted_oseille_sauvage",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.OSEILLE_SAUVAGE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_OXALIS_JAUNE = BLOCKS.register("potted_oxalis_jaune",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.OXALIS_JAUNE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_PELARGONIUM = BLOCKS.register("potted_pelargonium",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.PELARGONIUM,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_PERCE_NEIGE = BLOCKS.register("potted_perce_neige",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.PERCE_NEIGE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_PERISTERIA = BLOCKS.register("potted_peristeria",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.PERISTERIA,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_PERSIL = BLOCKS.register("potted_persil",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.PERSIL,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_PLANTIN = BLOCKS.register("potted_plantin",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.PLANTIN,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_POIVRE_NOIR = BLOCKS.register("potted_poivre_noir",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.POIVRE_NOIR,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_PRIMEVERE = BLOCKS.register("potted_primevere",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.PRIMEVERE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_PRELE = BLOCKS.register("potted_prele",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.PRELE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_RAFFLESIA = BLOCKS.register("potted_rafflesia",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.RAFFLESIA,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_RAISIN_BLANC = BLOCKS.register("potted_raisin_blanc",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.RAISIN_BLANC,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_RAISIN_ROUGE = BLOCKS.register("potted_raisin_rouge",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.RAISIN_ROUGE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_RANUNCULUS_FICARIA = BLOCKS.register("potted_ranunculus_ficaria",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.RANUNCULUS_FICARIA,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_REINE_DES_PRES = BLOCKS.register("potted_reine_des_pres",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.REINE_DES_PRES,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_RHODODENDRON = BLOCKS.register("potted_rhododendron",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.RHODODENDRON,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_RICIN = BLOCKS.register("potted_ricin",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.RICIN,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_ROMARIN = BLOCKS.register("potted_romarin",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.ROMARIN,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_ROSE_BLANCHE = BLOCKS.register("potted_rose_blanche",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.ROSE_BLANCHE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_SARRACENE = BLOCKS.register("potted_sarracene",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.SARRACENE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_SILENE = BLOCKS.register("potted_silene",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.SILENE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_SUREAU_NOIR = BLOCKS.register("potted_sureau_noir",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.SUREAU_NOIR,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_SWEAT_WILLIAM_BLANCHE = BLOCKS.register("potted_sweat_william_blanche",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.SWEAT_WILLIAM_BLANCHE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_SWEAT_WILLIAM_ROSE = BLOCKS.register("potted_sweat_william_rose",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.SWEAT_WILLIAM_ROSE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_THYM = BLOCKS.register("potted_thym",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.THYM,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_THEIER = BLOCKS.register("potted_theier",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.THEIER,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_UVULAIRES = BLOCKS.register("potted_uvulaires",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.UVULAIRES,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_VIOLETTE = BLOCKS.register("potted_violette",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.VIOLETTE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_WEIGELA = BLOCKS.register("potted_weigela",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.WEIGELA,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_YUCCA = BLOCKS.register("potted_yucca",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.YUCCA,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_ZINNIA = BLOCKS.register("potted_zinnia",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.ZINNIA,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));


    //champi
    public static final RegistryObject<Block> POTTED_AGARICUS_BISPORUS = BLOCKS.register("potted_agaricus_bisporus", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.AGARICUS_BISPORUS, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_AMANITE_DES_CESARS = BLOCKS.register("potted_amanite_des_cesars", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.AMANITE_DES_CESARS, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_BOLET_DE_SATAN = BLOCKS.register("potted_bolet_de_satan", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.BOLET_DE_SATAN, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_CALICE_DE_LA_MORT = BLOCKS.register("potted_calice_de_la_mort", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.CALICE_DE_LA_MORT, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_CHANTERELLE = BLOCKS.register("potted_chanterelle", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.CHANTERELLE, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_COPRIN = BLOCKS.register("potted_coprin", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.COPRIN, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_CORDYCEPS = BLOCKS.register("potted_cordyceps", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.CORDYCEPS, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_CORTIANIRE_SI_JOLI = BLOCKS.register("potted_cortianire_si_joli", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.CORTIANIRE_SI_JOLI, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_COULEMELLE = BLOCKS.register("potted_coulemelle", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.COULEMELLE, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_CRINIERE_DE_LION = BLOCKS.register("potted_criniere_de_lion", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.CRINIERE_DE_LION, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_CUDONIA_CIRCINAN = BLOCKS.register("potted_cudonia_circinan", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.CUDONIA_CIRCINAN, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_CEPE = BLOCKS.register("potted_cepe", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.CEPE, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_ENOKI = BLOCKS.register("potted_enoki", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.ENOKI, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_ENTOMOLE_LIVIDE = BLOCKS.register("potted_entomole_livide", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.ENTOMOLE_LIVIDE, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_FAUSSE_MORILLE = BLOCKS.register("potted_fausse_morille", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.FAUSSE_MORILLE, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_MAITAKE = BLOCKS.register("potted_maitake", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.MAITAKE, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_MARASME_DES_OREADES = BLOCKS.register("potted_marasme_des_oreades", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.MARASME_DES_OREADES, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_MORILLE = BLOCKS.register("potted_morille", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.MORILLE, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_PIED_DE_MOUTON = BLOCKS.register("potted_pied_de_mouton", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.PIED_DE_MOUTON, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_REISHI = BLOCKS.register("potted_reishi", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.REISHI, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_ROSE_DES_PRES = BLOCKS.register("potted_rose_des_pres", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.ROSE_DES_PRES, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_SHIITAKE = BLOCKS.register("potted_shiitake", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.SHIITAKE, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_SHIMEJI = BLOCKS.register("potted_shimeji", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.SHIMEJI, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_TERMITOMYCES_TITAN = BLOCKS.register("potted_termitomyces_titan", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.TERMITOMYCES_TITAN, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_TROMPETTE_DE_LA_MORT = BLOCKS.register("potted_trompette_de_la_mort", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.TROMPETTE_DE_LA_MORT, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    //cactus
    public static final RegistryObject<Block> POTTED_CEREUS_HEANKENUS = BLOCKS.register("potted_cereus_heankenus", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.CEREUS_HEANKENUS, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_FEROCACTUS = BLOCKS.register("potted_ferocactus", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.FEROCACTUS, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_FEROCACTUS_FLEUR = BLOCKS.register("potted_ferocactus_fleur", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.FEROCACTUS_FLEUR, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_MULDVARPHYTE = BLOCKS.register("potted_muldvarphyte", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.MULDVARPHYTE, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_SHI = BLOCKS.register("potted_shi", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.SHI, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_ARCANE_BLOOM = BLOCKS.register("potted_arcane_bloom", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.ARCANE_BLOOM, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_ATHELAS_LOTR = BLOCKS.register("potted_athelas_lotr", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.ATHELAS_LOTR, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_AURIFERE_MAUVE = BLOCKS.register("potted_aurifere_mauve", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.AURIFERE_MAUVE, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_BOUTTON_DES_NEIGES = BLOCKS.register("potted_boutton_des_neiges", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.BOUTTON_DES_NEIGES, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_CAMPANULE_MAGIQUE = BLOCKS.register("potted_campanule_magique", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.CAMPANULE_MAGIQUE, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_CHACANELITE = BLOCKS.register("potted_chacanelite", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.CHACANELITE, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_FLLORRINE = BLOCKS.register("potted_fllorrine", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.FLLORRINE, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_ICHTIL = BLOCKS.register("potted_ichtil", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.ICHTIL, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_SIMBELMYEN_LOTR = BLOCKS.register("potted_simbelmyen_lotr", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.SIMBELMYEN_LOTR, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_VICOTINE = BLOCKS.register("potted_vicotine", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.VICOTINE, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
