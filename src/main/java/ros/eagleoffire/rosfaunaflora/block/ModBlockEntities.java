package ros.eagleoffire.rosfaunaflora.block;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import ros.eagleoffire.rosfaunaflora.ROSFaunaFlora;
import ros.eagleoffire.rosfaunaflora.block.custom.FaunaBlockEntity;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ROSFaunaFlora.MODID);

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> EDELWEISS_BE =
            BLOCK_ENTITIES.register("edelweiss_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.EDELWEISS_BE.get(), pos, state),
                            ModBlocks.EDELWEISS.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> ACHILEE_BE =
            BLOCK_ENTITIES.register("achilee_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.ACHILEE_BE.get(), pos, state),
                            ModBlocks.ACHILEE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> AIL_DES_OURS_BE =
            BLOCK_ENTITIES.register("ail_des_ours_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.AIL_DES_OURS_BE.get(), pos, state),
                            ModBlocks.AIL_DES_OURS.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> AMARYLLIS_JAUNE_BE =
            BLOCK_ENTITIES.register("amaryllis_jaune_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.AMARYLLIS_JAUNE_BE.get(), pos, state),
                            ModBlocks.AMARYLLIS_JAUNE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> AMARYLLIS_ROUGE_BE =
            BLOCK_ENTITIES.register("amaryllis_rouge_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.AMARYLLIS_ROUGE_BE.get(), pos, state),
                            ModBlocks.AMARYLLIS_ROUGE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> ANETH_BE =
            BLOCK_ENTITIES.register("aneth_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.ANETH_BE.get(), pos, state),
                            ModBlocks.ANETH.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> ANIS_BE =
            BLOCK_ENTITIES.register("anis_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.ANIS_BE.get(), pos, state),
                            ModBlocks.ANIS.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> ARNICA_BE =
            BLOCK_ENTITIES.register("arnica_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.ARNICA_BE.get(), pos, state),
                            ModBlocks.ARNICA.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> ASTRAGALE_BE =
            BLOCK_ENTITIES.register("astragale_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.ASTRAGALE_BE.get(), pos, state),
                            ModBlocks.ASTRAGALE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> AUBEPINE_BE =
            BLOCK_ENTITIES.register("aubepine_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.AUBEPINE_BE.get(), pos, state),
                            ModBlocks.AUBEPINE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> BAPTISTA_BE =
            BLOCK_ENTITIES.register("baptista_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.BAPTISTA_BE.get(), pos, state),
                            ModBlocks.BAPTISTA.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> BELLADONE_BE =
            BLOCK_ENTITIES.register("belladone_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.BELLADONE_BE.get(), pos, state),
                            ModBlocks.BELLADONE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> BENOITE_BE =
            BLOCK_ENTITIES.register("benoite_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.BENOITE_BE.get(), pos, state),
                            ModBlocks.BENOITE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> BERCE_GEANTE_BE =
            BLOCK_ENTITIES.register("berce_geante_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.BERCE_GEANTE_BE.get(), pos, state),
                            ModBlocks.BERCE_GEANTE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> BOIS_JOLI_BE =
            BLOCK_ENTITIES.register("bois_joli_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.BOIS_JOLI_BE.get(), pos, state),
                            ModBlocks.BOIS_JOLI.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> BRUYERE_LOTR_BE =
            BLOCK_ENTITIES.register("bruyere_lotr_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.BRUYERE_LOTR_BE.get(), pos, state),
                            ModBlocks.BRUYERE_LOTR.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> CAFEIER_BE =
            BLOCK_ENTITIES.register("cafeier_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.CAFEIER_BE.get(), pos, state),
                            ModBlocks.CAFEIER.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> CALENDULA_BE =
            BLOCK_ENTITIES.register("calendula_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.CALENDULA_BE.get(), pos, state),
                            ModBlocks.CALENDULA.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> CAMELIA_BE =
            BLOCK_ENTITIES.register("camelia_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.CAMELIA_BE.get(), pos, state),
                            ModBlocks.CAMELIA.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> CAPUCINE_BE =
            BLOCK_ENTITIES.register("capucine_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.CAPUCINE_BE.get(), pos, state),
                            ModBlocks.CAPUCINE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> CIGUE_BE =
            BLOCK_ENTITIES.register("cigue_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.CIGUE_BE.get(), pos, state),
                            ModBlocks.CIGUE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> CISTE_BE =
            BLOCK_ENTITIES.register("ciste_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.CISTE_BE.get(), pos, state),
                            ModBlocks.CISTE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> CORRIANDRE_BE =
            BLOCK_ENTITIES.register("corriandre_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.CORRIANDRE_BE.get(), pos, state),
                            ModBlocks.CORRIANDRE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> COREOPSIS_BE =
            BLOCK_ENTITIES.register("coreopsis_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.COREOPSIS_BE.get(), pos, state),
                            ModBlocks.COREOPSIS.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> DIGITALE_POURPRE_BE =
            BLOCK_ENTITIES.register("digitale_pourpre_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.DIGITALE_POURPRE_BE.get(), pos, state),
                            ModBlocks.DIGITALE_POURPRE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> DRACULA_SIMIA_BE =
            BLOCK_ENTITIES.register("dracula_simia_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.DRACULA_SIMIA_BE.get(), pos, state),
                            ModBlocks.DRACULA_SIMIA.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> ESTRAGON_BE =
            BLOCK_ENTITIES.register("estragon_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.ESTRAGON_BE.get(), pos, state),
                            ModBlocks.ESTRAGON.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> ETOILE_DE_NOEL_BE =
            BLOCK_ENTITIES.register("etoile_de_noel_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.ETOILE_DE_NOEL_BE.get(), pos, state),
                            ModBlocks.ETOILE_DE_NOEL.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> EUPHORBE_BE =
            BLOCK_ENTITIES.register("euphorbe_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.EUPHORBE_BE.get(), pos, state),
                            ModBlocks.EUPHORBE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> FRITILLAIRE_PINTADE_BE =
            BLOCK_ENTITIES.register("fritillaire_pintade_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.FRITILLAIRE_PINTADE_BE.get(), pos, state),
                            ModBlocks.FRITILLAIRE_PINTADE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> GAILLET_GRATTERON_BE =
            BLOCK_ENTITIES.register("gaillet_gratteron_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.GAILLET_GRATTERON_BE.get(), pos, state),
                            ModBlocks.GAILLET_GRATTERON.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> GINSENG_BE =
            BLOCK_ENTITIES.register("ginseng_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.GINSENG_BE.get(), pos, state),
                            ModBlocks.GINSENG.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> HOUBLON_BE =
            BLOCK_ENTITIES.register("houblon_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.HOUBLON_BE.get(), pos, state),
                            ModBlocks.HOUBLON.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> HOUX_BE =
            BLOCK_ENTITIES.register("houx_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.HOUX_BE.get(), pos, state),
                            ModBlocks.HOUX.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> IRIS_BLEU_BE =
            BLOCK_ENTITIES.register("iris_bleu_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.IRIS_BLEU_BE.get(), pos, state),
                            ModBlocks.IRIS_BLEU.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> JACINTHE_DES_BOIS_LOTR_BE =
            BLOCK_ENTITIES.register("jacinthe_des_bois_lotr_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.JACINTHE_DES_BOIS_LOTR_BE.get(), pos, state),
                            ModBlocks.JACINTHE_DES_BOIS_LOTR.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> JONQUILLE_BE =
            BLOCK_ENTITIES.register("jonquille_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.JONQUILLE_BE.get(), pos, state),
                            ModBlocks.JONQUILLE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> LAVENDE_BE =
            BLOCK_ENTITIES.register("lavende_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.LAVENDE_BE.get(), pos, state),
                            ModBlocks.LAVENDE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> LIERRE_TERRESTRE_BE =
            BLOCK_ENTITIES.register("lierre_terrestre_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.LIERRE_TERRESTRE_BE.get(), pos, state),
                            ModBlocks.LIERRE_TERRESTRE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> LYCORIS_RADIATA_BE =
            BLOCK_ENTITIES.register("lycoris_radiata_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.LYCORIS_RADIATA_BE.get(), pos, state),
                            ModBlocks.LYCORIS_RADIATA.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> MAUVE_BE =
            BLOCK_ENTITIES.register("mauve_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.MAUVE_BE.get(), pos, state),
                            ModBlocks.MAUVE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> MENTHE_BE =
            BLOCK_ENTITIES.register("menthe_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.MENTHE_BE.get(), pos, state),
                            ModBlocks.MENTHE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> MUGUET_BE =
            BLOCK_ENTITIES.register("muguet_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.MUGUET_BE.get(), pos, state),
                            ModBlocks.MUGUET.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> MUSCARI_BE =
            BLOCK_ENTITIES.register("muscari_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.MUSCARI_BE.get(), pos, state),
                            ModBlocks.MUSCARI.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> MYOSOTIS_BE =
            BLOCK_ENTITIES.register("myosotis_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.MYOSOTIS_BE.get(), pos, state),
                            ModBlocks.MYOSOTIS.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> MYRTILLE_BE =
            BLOCK_ENTITIES.register("myrtille_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.MYRTILLE_BE.get(), pos, state),
                            ModBlocks.MYRTILLE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> MELISSE_BE =
            BLOCK_ENTITIES.register("melisse_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.MELISSE_BE.get(), pos, state),
                            ModBlocks.MELISSE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> NICOTINIA_TABACUM_BE =
            BLOCK_ENTITIES.register("nicotinia_tabacum_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.NICOTINIA_TABACUM_BE.get(), pos, state),
                            ModBlocks.NICOTINIA_TABACUM.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> NOISETTE_DE_TERRE_BE =
            BLOCK_ENTITIES.register("noisette_de_terre_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.NOISETTE_DE_TERRE_BE.get(), pos, state),
                            ModBlocks.NOISETTE_DE_TERRE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> ORCHIDEE_ANGE_BE =
            BLOCK_ENTITIES.register("orchidee_ange_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.ORCHIDEE_ANGE_BE.get(), pos, state),
                            ModBlocks.ORCHIDEE_ANGE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> ORCHIDEE_BE =
            BLOCK_ENTITIES.register("orchidee_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.ORCHIDEE_BE.get(), pos, state),
                            ModBlocks.ORCHIDEE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> ORTIE_BE =
            BLOCK_ENTITIES.register("ortie_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.ORTIE_BE.get(), pos, state),
                            ModBlocks.ORTIE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> OSEILLE_SAUVAGE_BE =
            BLOCK_ENTITIES.register("oseille_sauvage_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.OSEILLE_SAUVAGE_BE.get(), pos, state),
                            ModBlocks.OSEILLE_SAUVAGE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> OXALIS_JAUNE_BE =
            BLOCK_ENTITIES.register("oxalis_jaune_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.OXALIS_JAUNE_BE.get(), pos, state),
                            ModBlocks.OXALIS_JAUNE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> PELARGONIUM_BE =
            BLOCK_ENTITIES.register("pelargonium_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.PELARGONIUM_BE.get(), pos, state),
                            ModBlocks.PELARGONIUM.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> PERCE_NEIGE_BE =
            BLOCK_ENTITIES.register("perce_neige_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.PERCE_NEIGE_BE.get(), pos, state),
                            ModBlocks.PERCE_NEIGE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> PERISTERIA_BE =
            BLOCK_ENTITIES.register("peristeria_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.PERISTERIA_BE.get(), pos, state),
                            ModBlocks.PERISTERIA.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> PERSIL_BE =
            BLOCK_ENTITIES.register("persil_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.PERSIL_BE.get(), pos, state),
                            ModBlocks.PERSIL.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> PLANTIN_BE =
            BLOCK_ENTITIES.register("plantin_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.PLANTIN_BE.get(), pos, state),
                            ModBlocks.PLANTIN.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> POIVRE_NOIR_BE =
            BLOCK_ENTITIES.register("poivre_noir_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.POIVRE_NOIR_BE.get(), pos, state),
                            ModBlocks.POIVRE_NOIR.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> PRIMEVERE_BE =
            BLOCK_ENTITIES.register("primevere_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.PRIMEVERE_BE.get(), pos, state),
                            ModBlocks.PRIMEVERE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> PRELE_BE =
            BLOCK_ENTITIES.register("prele_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.PRELE_BE.get(), pos, state),
                            ModBlocks.PRELE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> RAFFLESIA_BE =
            BLOCK_ENTITIES.register("rafflesia_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.RAFFLESIA_BE.get(), pos, state),
                            ModBlocks.RAFFLESIA.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> RAISIN_BLANC_BE =
            BLOCK_ENTITIES.register("raisin_blanc_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.RAISIN_BLANC_BE.get(), pos, state),
                            ModBlocks.RAISIN_BLANC.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> RAISIN_ROUGE_BE =
            BLOCK_ENTITIES.register("raisin_rouge_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.RAISIN_ROUGE_BE.get(), pos, state),
                            ModBlocks.RAISIN_ROUGE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> RANUNCULUS_FICARIA_BE =
            BLOCK_ENTITIES.register("ranunculus_ficaria_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.RANUNCULUS_FICARIA_BE.get(), pos, state),
                            ModBlocks.RANUNCULUS_FICARIA.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> REINE_DES_PRES_BE =
            BLOCK_ENTITIES.register("reine_des_pres_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.REINE_DES_PRES_BE.get(), pos, state),
                            ModBlocks.REINE_DES_PRES.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> RHODODENDRON_BE =
            BLOCK_ENTITIES.register("rhododendron_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.RHODODENDRON_BE.get(), pos, state),
                            ModBlocks.RHODODENDRON.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> RICIN_BE =
            BLOCK_ENTITIES.register("ricin_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.RICIN_BE.get(), pos, state),
                            ModBlocks.RICIN.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> ROMARIN_BE =
            BLOCK_ENTITIES.register("romarin_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.ROMARIN_BE.get(), pos, state),
                            ModBlocks.ROMARIN.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> ROSE_BLANCHE_BE =
            BLOCK_ENTITIES.register("rose_blanche_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.ROSE_BLANCHE_BE.get(), pos, state),
                            ModBlocks.ROSE_BLANCHE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> SARRACENE_BE =
            BLOCK_ENTITIES.register("sarracene_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.SARRACENE_BE.get(), pos, state),
                            ModBlocks.SARRACENE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> SILENE_BE =
            BLOCK_ENTITIES.register("silene_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.SILENE_BE.get(), pos, state),
                            ModBlocks.SILENE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> SUREAU_NOIR_BE =
            BLOCK_ENTITIES.register("sureau_noir_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.SUREAU_NOIR_BE.get(), pos, state),
                            ModBlocks.SUREAU_NOIR.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> SWEAT_WILLIAM_BLANCHE_BE =
            BLOCK_ENTITIES.register("sweat_william_blanche_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.SWEAT_WILLIAM_BLANCHE_BE.get(), pos, state),
                            ModBlocks.SWEAT_WILLIAM_BLANCHE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> SWEAT_WILLIAM_ROSE_BE =
            BLOCK_ENTITIES.register("sweat_william_rose_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.SWEAT_WILLIAM_ROSE_BE.get(), pos, state),
                            ModBlocks.SWEAT_WILLIAM_ROSE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> THYM_BE =
            BLOCK_ENTITIES.register("thym_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.THYM_BE.get(), pos, state),
                            ModBlocks.THYM.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> THEIER_BE =
            BLOCK_ENTITIES.register("theier_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.THEIER_BE.get(), pos, state),
                            ModBlocks.THEIER.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> UVULAIRES_BE =
            BLOCK_ENTITIES.register("uvulaires_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.UVULAIRES_BE.get(), pos, state),
                            ModBlocks.UVULAIRES.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> VIOLETTE_BE =
            BLOCK_ENTITIES.register("violette_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.VIOLETTE_BE.get(), pos, state),
                            ModBlocks.VIOLETTE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> WEIGELA_BE =
            BLOCK_ENTITIES.register("weigela_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.WEIGELA_BE.get(), pos, state),
                            ModBlocks.WEIGELA.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> YUCCA_BE =
            BLOCK_ENTITIES.register("yucca_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.YUCCA_BE.get(), pos, state),
                            ModBlocks.YUCCA.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> ZINNIA_BE =
            BLOCK_ENTITIES.register("zinnia_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.ZINNIA_BE.get(), pos, state),
                            ModBlocks.ZINNIA.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> AGARICUS_BISPORUS_BE =
            BLOCK_ENTITIES.register("agaricus_bisporus_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.AGARICUS_BISPORUS_BE.get(), pos, state),
                            ModBlocks.AGARICUS_BISPORUS.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> AMANITE_DES_CESARS_BE =
            BLOCK_ENTITIES.register("amanite_des_cesars_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.AMANITE_DES_CESARS_BE.get(), pos, state),
                            ModBlocks.AMANITE_DES_CESARS.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> BOLET_DE_SATAN_BE =
            BLOCK_ENTITIES.register("bolet_de_satan_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.BOLET_DE_SATAN_BE.get(), pos, state),
                            ModBlocks.BOLET_DE_SATAN.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> CALICE_DE_LA_MORT_BE =
            BLOCK_ENTITIES.register("calice_de_la_mort_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.CALICE_DE_LA_MORT_BE.get(), pos, state),
                            ModBlocks.CALICE_DE_LA_MORT.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> CHANTERELLE_BE =
            BLOCK_ENTITIES.register("chanterelle_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.CHANTERELLE_BE.get(), pos, state),
                            ModBlocks.CHANTERELLE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> COPRIN_BE =
            BLOCK_ENTITIES.register("coprin_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.COPRIN_BE.get(), pos, state),
                            ModBlocks.COPRIN.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> CORDYCEPS_BE =
            BLOCK_ENTITIES.register("cordyceps_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.CORDYCEPS_BE.get(), pos, state),
                            ModBlocks.CORDYCEPS.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> CORTIANIRE_SI_JOLI_BE =
            BLOCK_ENTITIES.register("cortianire_si_joli_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.CORTIANIRE_SI_JOLI_BE.get(), pos, state),
                            ModBlocks.CORTIANIRE_SI_JOLI.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> COULEMELLE_BE =
            BLOCK_ENTITIES.register("coulemelle_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.COULEMELLE_BE.get(), pos, state),
                            ModBlocks.COULEMELLE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> CRINIERE_DE_LION_BE =
            BLOCK_ENTITIES.register("criniere_de_lion_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.CRINIERE_DE_LION_BE.get(), pos, state),
                            ModBlocks.CRINIERE_DE_LION.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> CUDONIA_CIRCINAN_BE =
            BLOCK_ENTITIES.register("cudonia_circinan_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.CUDONIA_CIRCINAN_BE.get(), pos, state),
                            ModBlocks.CUDONIA_CIRCINAN.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> CEPE_BE =
            BLOCK_ENTITIES.register("cepe_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.CEPE_BE.get(), pos, state),
                            ModBlocks.CEPE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> ENOKI_BE =
            BLOCK_ENTITIES.register("enoki_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.ENOKI_BE.get(), pos, state),
                            ModBlocks.ENOKI.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> ENTOMOLE_LIVIDE_BE =
            BLOCK_ENTITIES.register("entomole_livide_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.ENTOMOLE_LIVIDE_BE.get(), pos, state),
                            ModBlocks.ENTOMOLE_LIVIDE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> FAUSSE_MORILLE_BE =
            BLOCK_ENTITIES.register("fausse_morille_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.FAUSSE_MORILLE_BE.get(), pos, state),
                            ModBlocks.FAUSSE_MORILLE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> MAITAKE_BE =
            BLOCK_ENTITIES.register("maitake_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.MAITAKE_BE.get(), pos, state),
                            ModBlocks.MAITAKE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> MARASME_DES_OREADES_BE =
            BLOCK_ENTITIES.register("marasme_des_oreades_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.MARASME_DES_OREADES_BE.get(), pos, state),
                            ModBlocks.MARASME_DES_OREADES.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> MORILLE_BE =
            BLOCK_ENTITIES.register("morille_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.MORILLE_BE.get(), pos, state),
                            ModBlocks.MORILLE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> PIED_DE_MOUTON_BE =
            BLOCK_ENTITIES.register("pied_de_mouton_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.PIED_DE_MOUTON_BE.get(), pos, state),
                            ModBlocks.PIED_DE_MOUTON.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> REISHI_BE =
            BLOCK_ENTITIES.register("reishi_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.REISHI_BE.get(), pos, state),
                            ModBlocks.REISHI.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> ROSE_DES_PRES_BE =
            BLOCK_ENTITIES.register("rose_des_pres_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.ROSE_DES_PRES_BE.get(), pos, state),
                            ModBlocks.ROSE_DES_PRES.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> SHIITAKE_BE =
            BLOCK_ENTITIES.register("shiitake_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.SHIITAKE_BE.get(), pos, state),
                            ModBlocks.SHIITAKE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> SHIMEJI_BE =
            BLOCK_ENTITIES.register("shimeji_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.SHIMEJI_BE.get(), pos, state),
                            ModBlocks.SHIMEJI.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> TERMITOMYCES_TITAN_BE =
            BLOCK_ENTITIES.register("termitomyces_titan_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.TERMITOMYCES_TITAN_BE.get(), pos, state),
                            ModBlocks.TERMITOMYCES_TITAN.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> TROMPETTE_DE_LA_MORT_BE =
            BLOCK_ENTITIES.register("trompette_de_la_mort_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.TROMPETTE_DE_LA_MORT_BE.get(), pos, state),
                            ModBlocks.TROMPETTE_DE_LA_MORT.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> CEREUS_HEANKENUS_BE =
            BLOCK_ENTITIES.register("cereus_heankenus_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.CEREUS_HEANKENUS_BE.get(), pos, state),
                            ModBlocks.CEREUS_HEANKENUS.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> FEROCACTUS_BE =
            BLOCK_ENTITIES.register("ferocactus_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.FEROCACTUS_BE.get(), pos, state),
                            ModBlocks.FEROCACTUS.get()).build(null));

    public static final RegistryObject<BlockEntityType<FaunaBlockEntity>> FEROCACTUS_FLEUR_BE =
            BLOCK_ENTITIES.register("ferocactus_fleur_be",
                    () -> BlockEntityType.Builder.of((pos, state)
                                    -> new FaunaBlockEntity(ModBlockEntities.FEROCACTUS_FLEUR_BE.get(), pos, state),
                            ModBlocks.FEROCACTUS_FLEUR.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
