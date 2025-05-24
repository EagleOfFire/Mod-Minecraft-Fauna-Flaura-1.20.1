package ros.eagleoffire.rosfaunaflora.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import ros.eagleoffire.rosfaunaflora.ROSFaunaFlora;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ROSFaunaFlora.MODID);

    public static final RegistryObject<CreativeModeTab> ROS_FAUNA_FLORA_TAB = CREATIVE_MODE_TABS.register("ros_fauna_flora_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.EDELWEISS.get()))
                    .title(Component.translatable("creativetab.ros_fauna_flora_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        //plante
                        pOutput.accept(ModItems.EDELWEISS.get());
                        pOutput.accept(ModItems.ACHILEE.get());
                        pOutput.accept(ModItems.AIL_DES_OURS.get());
                        pOutput.accept(ModItems.AMARYLLIS_JAUNE.get());
                        pOutput.accept(ModItems.AMARYLLIS_ROUGE.get());
                        pOutput.accept(ModItems.ANETH.get());
                        pOutput.accept(ModItems.ANIS.get());
                        pOutput.accept(ModItems.ARNICA.get());
                        pOutput.accept(ModItems.ASTRAGALE.get());
                        pOutput.accept(ModItems.AUBEPINE.get());
                        pOutput.accept(ModItems.BAPTISTA.get());
                        pOutput.accept(ModItems.BELLADONE.get());
                        pOutput.accept(ModItems.BENOITE.get());
                        pOutput.accept(ModItems.BERCE_GEANTE.get());
                        pOutput.accept(ModItems.BOIS_JOLI.get());
                        pOutput.accept(ModItems.BRUYERE_LOTR.get());
                        pOutput.accept(ModItems.CAFEIER.get());
                        pOutput.accept(ModItems.CALENDULA.get());
                        pOutput.accept(ModItems.CAMELIA.get());
                        pOutput.accept(ModItems.CAPUCINE.get());
                        pOutput.accept(ModItems.CIGUE.get());
                        pOutput.accept(ModItems.CISTE.get());
                        pOutput.accept(ModItems.CORRIANDRE.get());
                        pOutput.accept(ModItems.COREOPSIS.get());
                        pOutput.accept(ModItems.DIGITALE_POURPRE.get());
                        pOutput.accept(ModItems.DRACULA_SIMIA.get());
                        pOutput.accept(ModItems.ESTRAGON.get());
                        pOutput.accept(ModItems.ETOILE_DE_NOEL.get());
                        pOutput.accept(ModItems.EUPHORBE.get());
                        pOutput.accept(ModItems.FRITILLAIRE_PINTADE.get());
                        pOutput.accept(ModItems.GAILLET_GRATTERON.get());
                        pOutput.accept(ModItems.GINSENG.get());
                        pOutput.accept(ModItems.HOUBLON.get());
                        pOutput.accept(ModItems.HOUX.get());
                        pOutput.accept(ModItems.IRIS_BLEU.get());
                        pOutput.accept(ModItems.JACINTHE_DES_BOIS_LOTR.get());
                        pOutput.accept(ModItems.JONQUILLE.get());
                        pOutput.accept(ModItems.LAVENDE.get());
                        pOutput.accept(ModItems.LIERRE_TERRESTRE.get());
                        pOutput.accept(ModItems.LYCORIS_RADIATA.get());
                        pOutput.accept(ModItems.MAUVE.get());
                        pOutput.accept(ModItems.MENTHE.get());
                        pOutput.accept(ModItems.MUGUET.get());
                        pOutput.accept(ModItems.MUSCARI.get());
                        pOutput.accept(ModItems.MYOSOTIS.get());
                        pOutput.accept(ModItems.MYRTILLE.get());
                        pOutput.accept(ModItems.MELISSE.get());
                        pOutput.accept(ModItems.NICOTINIA_TABACUM.get());
                        pOutput.accept(ModItems.NOISETTE_DE_TERRE.get());
                        pOutput.accept(ModItems.ORCHIDEE_ANGE.get());
                        pOutput.accept(ModItems.ORCHIDEE.get());
                        pOutput.accept(ModItems.ORTIE.get());
                        pOutput.accept(ModItems.OSEILLE_SAUVAGE.get());
                        pOutput.accept(ModItems.OXALIS_JAUNE.get());
                        pOutput.accept(ModItems.PELARGONIUM.get());
                        pOutput.accept(ModItems.PERCE_NEIGE.get());
                        pOutput.accept(ModItems.PERISTERIA.get());
                        pOutput.accept(ModItems.PERSIL.get());
                        pOutput.accept(ModItems.PLANTIN.get());
                        pOutput.accept(ModItems.POIVRE_NOIR.get());
                        pOutput.accept(ModItems.PRIMEVERE.get());
                        pOutput.accept(ModItems.PRELE.get());
                        pOutput.accept(ModItems.RAFFLESIA.get());
                        pOutput.accept(ModItems.RAISIN_BLANC.get());
                        pOutput.accept(ModItems.RAISIN_ROUGE.get());
                        pOutput.accept(ModItems.RANUNCULUS_FICARIA.get());
                        pOutput.accept(ModItems.REINE_DES_PRES.get());
                        pOutput.accept(ModItems.RHODODENDRON.get());
                        pOutput.accept(ModItems.RICIN.get());
                        pOutput.accept(ModItems.ROMARIN.get());
                        pOutput.accept(ModItems.ROSE_BLANCHE.get());
                        pOutput.accept(ModItems.SARRACENE.get());
                        pOutput.accept(ModItems.SILENE.get());
                        pOutput.accept(ModItems.SUREAU_NOIR.get());
                        pOutput.accept(ModItems.SWEAT_WILLIAM_BLANCHE.get());
                        pOutput.accept(ModItems.SWEAT_WILLIAM_ROSE.get());
                        pOutput.accept(ModItems.THYM.get());
                        pOutput.accept(ModItems.THEIER.get());
                        pOutput.accept(ModItems.UVULAIRES.get());
                        pOutput.accept(ModItems.VIOLETTE.get());
                        pOutput.accept(ModItems.WEIGELA.get());
                        pOutput.accept(ModItems.YUCCA.get());
                        pOutput.accept(ModItems.ZINNIA.get());

                        //champi
                        pOutput.accept(ModItems.AGARICUS_BISPORUS.get());
                        pOutput.accept(ModItems.AMANITE_DES_CESARS.get());
                        pOutput.accept(ModItems.BOLET_DE_SATAN.get());
                        pOutput.accept(ModItems.CALICE_DE_LA_MORT.get());
                        pOutput.accept(ModItems.CHANTERELLE.get());
                        pOutput.accept(ModItems.COPRIN.get());
                        pOutput.accept(ModItems.CORDYCEPS.get());
                        pOutput.accept(ModItems.CORTIANIRE_SI_JOLI.get());
                        pOutput.accept(ModItems.COULEMELLE.get());
                        pOutput.accept(ModItems.CRINIERE_DE_LION.get());
                        pOutput.accept(ModItems.CUDONIA_CIRCINAN.get());
                        pOutput.accept(ModItems.CEPE.get());
                        pOutput.accept(ModItems.ENOKI.get());
                        pOutput.accept(ModItems.ENTOMOLE_LIVIDE.get());
                        pOutput.accept(ModItems.FAUSSE_MORILLE.get());
                        pOutput.accept(ModItems.MAITAKE.get());
                        pOutput.accept(ModItems.MARASME_DES_OREADES.get());
                        pOutput.accept(ModItems.MORILLE.get());
                        pOutput.accept(ModItems.PIED_DE_MOUTON.get());
                        pOutput.accept(ModItems.REISHI.get());
                        pOutput.accept(ModItems.ROSE_DES_PRES.get());
                        pOutput.accept(ModItems.SHIITAKE.get());
                        pOutput.accept(ModItems.SHIMEJI.get());
                        pOutput.accept(ModItems.TERMITOMYCES_TITAN.get());
                        pOutput.accept(ModItems.TROMPETTE_DE_LA_MORT.get());

                        //cactus
                        pOutput.accept(ModItems.CEREUS_HEANKENUS.get());
                        pOutput.accept(ModItems.FEROCACTUS.get());
                        pOutput.accept(ModItems.FEROCACTUS_FLEUR.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
