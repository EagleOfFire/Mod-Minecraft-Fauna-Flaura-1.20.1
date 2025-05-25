package ros.eagleoffire.rosfaunaflora;

import com.mojang.logging.LogUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import ros.eagleoffire.rosfaunaflora.block.ModBlocks;
import ros.eagleoffire.rosfaunaflora.item.ModCreativeModTabs;
import ros.eagleoffire.rosfaunaflora.item.ModItems;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ROSFaunaFlora.MODID)
public class ROSFaunaFlora {
    public static final String MODID = "rosfaunaflora";
    private static final Logger LOGGER = LogUtils.getLogger();

    public ROSFaunaFlora() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.EDELWEISS.getId(), ModBlocks.POTTED_EDELWEISS);

            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.ACHILEE.getId(), ModBlocks.POTTED_ACHILEE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.AIL_DES_OURS.getId(), ModBlocks.POTTED_AIL_DES_OURS);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.AMARYLLIS_JAUNE.getId(), ModBlocks.POTTED_AMARYLLIS_JAUNE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.AMARYLLIS_ROUGE.getId(), ModBlocks.POTTED_AMARYLLIS_ROUGE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.ANETH.getId(), ModBlocks.POTTED_ANETH);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.ANIS.getId(), ModBlocks.POTTED_ANIS);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.ARNICA.getId(), ModBlocks.POTTED_ARNICA);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.ASTRAGALE.getId(), ModBlocks.POTTED_ASTRAGALE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.AUBEPINE.getId(), ModBlocks.POTTED_AUBEPINE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BAPTISTA.getId(), ModBlocks.POTTED_BAPTISTA);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BELLADONE.getId(), ModBlocks.POTTED_BELLADONE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BENOITE.getId(), ModBlocks.POTTED_BENOITE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BERCE_GEANTE.getId(), ModBlocks.POTTED_BERCE_GEANTE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BOIS_JOLI.getId(), ModBlocks.POTTED_BOIS_JOLI);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BRUYERE_LOTR.getId(), ModBlocks.POTTED_BRUYERE_LOTR);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CAFEIER.getId(), ModBlocks.POTTED_CAFEIER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CALENDULA.getId(), ModBlocks.POTTED_CALENDULA);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CAMELIA.getId(), ModBlocks.POTTED_CAMELIA);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CAPUCINE.getId(), ModBlocks.POTTED_CAPUCINE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CIGUE.getId(), ModBlocks.POTTED_CIGUE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CISTE.getId(), ModBlocks.POTTED_CISTE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CORRIANDRE.getId(), ModBlocks.POTTED_CORRIANDRE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.COREOPSIS.getId(), ModBlocks.POTTED_COREOPSIS);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.DIGITALE_POURPRE.getId(), ModBlocks.POTTED_DIGITALE_POURPRE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.DRACULA_SIMIA.getId(), ModBlocks.POTTED_DRACULA_SIMIA);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.ESTRAGON.getId(), ModBlocks.POTTED_ESTRAGON);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.ETOILE_DE_NOEL.getId(), ModBlocks.POTTED_ETOILE_DE_NOEL);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.EUPHORBE.getId(), ModBlocks.POTTED_EUPHORBE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.FRITILLAIRE_PINTADE.getId(), ModBlocks.POTTED_FRITILLAIRE_PINTADE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.GAILLET_GRATTERON.getId(), ModBlocks.POTTED_GAILLET_GRATTERON);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.GINSENG.getId(), ModBlocks.POTTED_GINSENG);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.HOUBLON.getId(), ModBlocks.POTTED_HOUBLON);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.HOUX.getId(), ModBlocks.POTTED_HOUX);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.IRIS_BLEU.getId(), ModBlocks.POTTED_IRIS_BLEU);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.JACINTHE_DES_BOIS_LOTR.getId(), ModBlocks.POTTED_JACINTHE_DES_BOIS_LOTR);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.JONQUILLE.getId(), ModBlocks.POTTED_JONQUILLE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.LAVENDE.getId(), ModBlocks.POTTED_LAVENDE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.LIERRE_TERRESTRE.getId(), ModBlocks.POTTED_LIERRE_TERRESTRE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.LYCORIS_RADIATA.getId(), ModBlocks.POTTED_LYCORIS_RADIATA);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.MAUVE.getId(), ModBlocks.POTTED_MAUVE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.MENTHE.getId(), ModBlocks.POTTED_MENTHE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.MUGUET.getId(), ModBlocks.POTTED_MUGUET);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.MUSCARI.getId(), ModBlocks.POTTED_MUSCARI);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.MYOSOTIS.getId(), ModBlocks.POTTED_MYOSOTIS);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.MYRTILLE.getId(), ModBlocks.POTTED_MYRTILLE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.MELISSE.getId(), ModBlocks.POTTED_MELISSE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.NICOTINIA_TABACUM.getId(), ModBlocks.POTTED_NICOTINIA_TABACUM);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.NOISETTE_DE_TERRE.getId(), ModBlocks.POTTED_NOISETTE_DE_TERRE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.ORCHIDEE_ANGE.getId(), ModBlocks.POTTED_ORCHIDEE_ANGE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.ORCHIDEE.getId(), ModBlocks.POTTED_ORCHIDEE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.ORTIE.getId(), ModBlocks.POTTED_ORTIE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.OSEILLE_SAUVAGE.getId(), ModBlocks.POTTED_OSEILLE_SAUVAGE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.OXALIS_JAUNE.getId(), ModBlocks.POTTED_OXALIS_JAUNE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PELARGONIUM.getId(), ModBlocks.POTTED_PELARGONIUM);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PERCE_NEIGE.getId(), ModBlocks.POTTED_PERCE_NEIGE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PERISTERIA.getId(), ModBlocks.POTTED_PERISTERIA);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PERSIL.getId(), ModBlocks.POTTED_PERSIL);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PLANTIN.getId(), ModBlocks.POTTED_PLANTIN);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.POIVRE_NOIR.getId(), ModBlocks.POTTED_POIVRE_NOIR);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PRIMEVERE.getId(), ModBlocks.POTTED_PRIMEVERE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PRELE.getId(), ModBlocks.POTTED_PRELE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.RAFFLESIA.getId(), ModBlocks.POTTED_RAFFLESIA);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.RAISIN_BLANC.getId(), ModBlocks.POTTED_RAISIN_BLANC);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.RAISIN_ROUGE.getId(), ModBlocks.POTTED_RAISIN_ROUGE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.RANUNCULUS_FICARIA.getId(), ModBlocks.POTTED_RANUNCULUS_FICARIA);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.REINE_DES_PRES.getId(), ModBlocks.POTTED_REINE_DES_PRES);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.RHODODENDRON.getId(), ModBlocks.POTTED_RHODODENDRON);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.RICIN.getId(), ModBlocks.POTTED_RICIN);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.ROMARIN.getId(), ModBlocks.POTTED_ROMARIN);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.ROSE_BLANCHE.getId(), ModBlocks.POTTED_ROSE_BLANCHE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.SARRACENE.getId(), ModBlocks.POTTED_SARRACENE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.SILENE.getId(), ModBlocks.POTTED_SILENE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.SUREAU_NOIR.getId(), ModBlocks.POTTED_SUREAU_NOIR);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.SWEAT_WILLIAM_BLANCHE.getId(), ModBlocks.POTTED_SWEAT_WILLIAM_BLANCHE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.SWEAT_WILLIAM_ROSE.getId(), ModBlocks.POTTED_SWEAT_WILLIAM_ROSE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.THYM.getId(), ModBlocks.POTTED_THYM);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.THEIER.getId(), ModBlocks.POTTED_THEIER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.UVULAIRES.getId(), ModBlocks.POTTED_UVULAIRES);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.VIOLETTE.getId(), ModBlocks.POTTED_VIOLETTE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.WEIGELA.getId(), ModBlocks.POTTED_WEIGELA);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.YUCCA.getId(), ModBlocks.POTTED_YUCCA);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.ZINNIA.getId(), ModBlocks.POTTED_ZINNIA);

        });
    }
}