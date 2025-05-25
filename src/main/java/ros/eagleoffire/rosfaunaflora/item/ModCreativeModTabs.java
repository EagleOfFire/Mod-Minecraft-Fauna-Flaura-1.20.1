package ros.eagleoffire.rosfaunaflora.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import ros.eagleoffire.rosfaunaflora.ROSFaunaFlora;
import ros.eagleoffire.rosfaunaflora.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ROSFaunaFlora.MODID);

    public static final RegistryObject<CreativeModeTab> ROS_FAUNA_FLORA_TAB = CREATIVE_MODE_TABS.register("ros_fauna_flora_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.EDELWEISS.get()))
                    .title(Component.translatable("creativetab.ros_fauna_flora_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        //plante
                        pOutput.accept(ModBlocks.EDELWEISS.get());
                        pOutput.accept(ModBlocks.ACHILEE.get());
                        pOutput.accept(ModBlocks.AIL_DES_OURS.get());
                        pOutput.accept(ModBlocks.AMARYLLIS_JAUNE.get());
                        pOutput.accept(ModBlocks.AMARYLLIS_ROUGE.get());
                        pOutput.accept(ModBlocks.ANETH.get());
                        pOutput.accept(ModBlocks.ANIS.get());
                        pOutput.accept(ModBlocks.ARNICA.get());
                        pOutput.accept(ModBlocks.ASTRAGALE.get());
                        pOutput.accept(ModBlocks.AUBEPINE.get());
                        pOutput.accept(ModBlocks.BAPTISTA.get());
                        pOutput.accept(ModBlocks.BELLADONE.get());
                        pOutput.accept(ModBlocks.BENOITE.get());
                        pOutput.accept(ModBlocks.BERCE_GEANTE.get());
                        pOutput.accept(ModBlocks.BOIS_JOLI.get());
                        pOutput.accept(ModBlocks.BRUYERE_LOTR.get());
                        pOutput.accept(ModBlocks.CAFEIER.get());
                        pOutput.accept(ModBlocks.CALENDULA.get());
                        pOutput.accept(ModBlocks.CAMELIA.get());
                        pOutput.accept(ModBlocks.CAPUCINE.get());
                        pOutput.accept(ModBlocks.CIGUE.get());
                        pOutput.accept(ModBlocks.CISTE.get());
                        pOutput.accept(ModBlocks.CORRIANDRE.get());
                        pOutput.accept(ModBlocks.COREOPSIS.get());
                        pOutput.accept(ModBlocks.DIGITALE_POURPRE.get());
                        pOutput.accept(ModBlocks.DRACULA_SIMIA.get());
                        pOutput.accept(ModBlocks.ESTRAGON.get());
                        pOutput.accept(ModBlocks.ETOILE_DE_NOEL.get());
                        pOutput.accept(ModBlocks.EUPHORBE.get());
                        pOutput.accept(ModBlocks.FRITILLAIRE_PINTADE.get());
                        pOutput.accept(ModBlocks.GAILLET_GRATTERON.get());
                        pOutput.accept(ModBlocks.GINSENG.get());
                        pOutput.accept(ModBlocks.HOUBLON.get());
                        pOutput.accept(ModBlocks.HOUX.get());
                        pOutput.accept(ModBlocks.IRIS_BLEU.get());
                        pOutput.accept(ModBlocks.JACINTHE_DES_BOIS_LOTR.get());
                        pOutput.accept(ModBlocks.JONQUILLE.get());
                        pOutput.accept(ModBlocks.LAVENDE.get());
                        pOutput.accept(ModBlocks.LIERRE_TERRESTRE.get());
                        pOutput.accept(ModBlocks.LYCORIS_RADIATA.get());
                        pOutput.accept(ModBlocks.MAUVE.get());
                        pOutput.accept(ModBlocks.MENTHE.get());
                        pOutput.accept(ModBlocks.MUGUET.get());
                        pOutput.accept(ModBlocks.MUSCARI.get());
                        pOutput.accept(ModBlocks.MYOSOTIS.get());
                        pOutput.accept(ModBlocks.MYRTILLE.get());
                        pOutput.accept(ModBlocks.MELISSE.get());
                        pOutput.accept(ModBlocks.NICOTINIA_TABACUM.get());
                        pOutput.accept(ModBlocks.NOISETTE_DE_TERRE.get());
                        pOutput.accept(ModBlocks.ORCHIDEE_ANGE.get());
                        pOutput.accept(ModBlocks.ORCHIDEE.get());
                        pOutput.accept(ModBlocks.ORTIE.get());
                        pOutput.accept(ModBlocks.OSEILLE_SAUVAGE.get());
                        pOutput.accept(ModBlocks.OXALIS_JAUNE.get());
                        pOutput.accept(ModBlocks.PELARGONIUM.get());
                        pOutput.accept(ModBlocks.PERCE_NEIGE.get());
                        pOutput.accept(ModBlocks.PERISTERIA.get());
                        pOutput.accept(ModBlocks.PERSIL.get());
                        pOutput.accept(ModBlocks.PLANTIN.get());
                        pOutput.accept(ModBlocks.POIVRE_NOIR.get());
                        pOutput.accept(ModBlocks.PRIMEVERE.get());
                        pOutput.accept(ModBlocks.PRELE.get());
                        pOutput.accept(ModBlocks.RAFFLESIA.get());
                        pOutput.accept(ModBlocks.RAISIN_BLANC.get());
                        pOutput.accept(ModBlocks.RAISIN_ROUGE.get());
                        pOutput.accept(ModBlocks.RANUNCULUS_FICARIA.get());
                        pOutput.accept(ModBlocks.REINE_DES_PRES.get());
                        pOutput.accept(ModBlocks.RHODODENDRON.get());
                        pOutput.accept(ModBlocks.RICIN.get());
                        pOutput.accept(ModBlocks.ROMARIN.get());
                        pOutput.accept(ModBlocks.ROSE_BLANCHE.get());
                        pOutput.accept(ModBlocks.SARRACENE.get());
                        pOutput.accept(ModBlocks.SILENE.get());
                        pOutput.accept(ModBlocks.SUREAU_NOIR.get());
                        pOutput.accept(ModBlocks.SWEAT_WILLIAM_BLANCHE.get());
                        pOutput.accept(ModBlocks.SWEAT_WILLIAM_ROSE.get());
                        pOutput.accept(ModBlocks.THYM.get());
                        pOutput.accept(ModBlocks.THEIER.get());
                        pOutput.accept(ModBlocks.UVULAIRES.get());
                        pOutput.accept(ModBlocks.VIOLETTE.get());
                        pOutput.accept(ModBlocks.WEIGELA.get());
                        pOutput.accept(ModBlocks.YUCCA.get());
                        pOutput.accept(ModBlocks.ZINNIA.get());

                        //champi
                        pOutput.accept(ModBlocks.AGARICUS_BISPORUS.get());
                        pOutput.accept(ModBlocks.AMANITE_DES_CESARS.get());
                        pOutput.accept(ModBlocks.BOLET_DE_SATAN.get());
                        pOutput.accept(ModBlocks.CALICE_DE_LA_MORT.get());
                        pOutput.accept(ModBlocks.CHANTERELLE.get());
                        pOutput.accept(ModBlocks.COPRIN.get());
                        pOutput.accept(ModBlocks.CORDYCEPS.get());
                        pOutput.accept(ModBlocks.CORTIANIRE_SI_JOLI.get());
                        pOutput.accept(ModBlocks.COULEMELLE.get());
                        pOutput.accept(ModBlocks.CRINIERE_DE_LION.get());
                        pOutput.accept(ModBlocks.CUDONIA_CIRCINAN.get());
                        pOutput.accept(ModBlocks.CEPE.get());
                        pOutput.accept(ModBlocks.ENOKI.get());
                        pOutput.accept(ModBlocks.ENTOMOLE_LIVIDE.get());
                        pOutput.accept(ModBlocks.FAUSSE_MORILLE.get());
                        pOutput.accept(ModBlocks.MAITAKE.get());
                        pOutput.accept(ModBlocks.MARASME_DES_OREADES.get());
                        pOutput.accept(ModBlocks.MORILLE.get());
                        pOutput.accept(ModBlocks.PIED_DE_MOUTON.get());
                        pOutput.accept(ModBlocks.REISHI.get());
                        pOutput.accept(ModBlocks.ROSE_DES_PRES.get());
                        pOutput.accept(ModBlocks.SHIITAKE.get());
                        pOutput.accept(ModBlocks.SHIMEJI.get());
                        pOutput.accept(ModBlocks.TERMITOMYCES_TITAN.get());
                        pOutput.accept(ModBlocks.TROMPETTE_DE_LA_MORT.get());

                        //cactus
                        pOutput.accept(ModBlocks.CEREUS_HEANKENUS.get());
                        pOutput.accept(ModBlocks.FEROCACTUS.get());
                        pOutput.accept(ModBlocks.FEROCACTUS_FLEUR.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
