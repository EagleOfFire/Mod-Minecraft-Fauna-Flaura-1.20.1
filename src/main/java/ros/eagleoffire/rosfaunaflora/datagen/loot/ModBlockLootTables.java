package ros.eagleoffire.rosfaunaflora.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import ros.eagleoffire.rosfaunaflora.block.ModBlocks;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.EDELWEISS.get());
        this.add(ModBlocks.POTTED_EDELWEISS.get(), createPotFlowerItemTable(ModBlocks.EDELWEISS.get()));

        this.dropSelf(ModBlocks.ACHILEE.get());
        this.add(ModBlocks.POTTED_ACHILEE.get(), createPotFlowerItemTable(ModBlocks.ACHILEE.get()));

        this.dropSelf(ModBlocks.AIL_DES_OURS.get());
        this.add(ModBlocks.POTTED_AIL_DES_OURS.get(), createPotFlowerItemTable(ModBlocks.AIL_DES_OURS.get()));

        this.dropSelf(ModBlocks.AMARYLLIS_JAUNE.get());
        this.add(ModBlocks.POTTED_AMARYLLIS_JAUNE.get(), createPotFlowerItemTable(ModBlocks.AMARYLLIS_JAUNE.get()));

        this.dropSelf(ModBlocks.AMARYLLIS_ROUGE.get());
        this.add(ModBlocks.POTTED_AMARYLLIS_ROUGE.get(), createPotFlowerItemTable(ModBlocks.AMARYLLIS_ROUGE.get()));

        this.dropSelf(ModBlocks.ANETH.get());
        this.add(ModBlocks.POTTED_ANETH.get(), createPotFlowerItemTable(ModBlocks.ANETH.get()));

        this.dropSelf(ModBlocks.ANIS.get());
        this.add(ModBlocks.POTTED_ANIS.get(), createPotFlowerItemTable(ModBlocks.ANIS.get()));

        this.dropSelf(ModBlocks.ARNICA.get());
        this.add(ModBlocks.POTTED_ARNICA.get(), createPotFlowerItemTable(ModBlocks.ARNICA.get()));

        this.dropSelf(ModBlocks.ASTRAGALE.get());
        this.add(ModBlocks.POTTED_ASTRAGALE.get(), createPotFlowerItemTable(ModBlocks.ASTRAGALE.get()));

        this.dropSelf(ModBlocks.AUBEPINE.get());
        this.add(ModBlocks.POTTED_AUBEPINE.get(), createPotFlowerItemTable(ModBlocks.AUBEPINE.get()));

        this.dropSelf(ModBlocks.BAPTISTA.get());
        this.add(ModBlocks.POTTED_BAPTISTA.get(), createPotFlowerItemTable(ModBlocks.BAPTISTA.get()));

        this.dropSelf(ModBlocks.BELLADONE.get());
        this.add(ModBlocks.POTTED_BELLADONE.get(), createPotFlowerItemTable(ModBlocks.BELLADONE.get()));

        this.dropSelf(ModBlocks.BENOITE.get());
        this.add(ModBlocks.POTTED_BENOITE.get(), createPotFlowerItemTable(ModBlocks.BENOITE.get()));

        this.dropSelf(ModBlocks.BERCE_GEANTE.get());
        this.add(ModBlocks.POTTED_BERCE_GEANTE.get(), createPotFlowerItemTable(ModBlocks.BERCE_GEANTE.get()));

        this.dropSelf(ModBlocks.BOIS_JOLI.get());
        this.add(ModBlocks.POTTED_BOIS_JOLI.get(), createPotFlowerItemTable(ModBlocks.BOIS_JOLI.get()));

        this.dropSelf(ModBlocks.BRUYERE_LOTR.get());
        this.add(ModBlocks.POTTED_BRUYERE_LOTR.get(), createPotFlowerItemTable(ModBlocks.BRUYERE_LOTR.get()));

        this.dropSelf(ModBlocks.CAFEIER.get());
        this.add(ModBlocks.POTTED_CAFEIER.get(), createPotFlowerItemTable(ModBlocks.CAFEIER.get()));

        this.dropSelf(ModBlocks.CALENDULA.get());
        this.add(ModBlocks.POTTED_CALENDULA.get(), createPotFlowerItemTable(ModBlocks.CALENDULA.get()));

        this.dropSelf(ModBlocks.CAMELIA.get());
        this.add(ModBlocks.POTTED_CAMELIA.get(), createPotFlowerItemTable(ModBlocks.CAMELIA.get()));

        this.dropSelf(ModBlocks.CAPUCINE.get());
        this.add(ModBlocks.POTTED_CAPUCINE.get(), createPotFlowerItemTable(ModBlocks.CAPUCINE.get()));

        this.dropSelf(ModBlocks.CIGUE.get());
        this.add(ModBlocks.POTTED_CIGUE.get(), createPotFlowerItemTable(ModBlocks.CIGUE.get()));

        this.dropSelf(ModBlocks.CISTE.get());
        this.add(ModBlocks.POTTED_CISTE.get(), createPotFlowerItemTable(ModBlocks.CISTE.get()));

        this.dropSelf(ModBlocks.CORRIANDRE.get());
        this.add(ModBlocks.POTTED_CORRIANDRE.get(), createPotFlowerItemTable(ModBlocks.CORRIANDRE.get()));

        this.dropSelf(ModBlocks.COREOPSIS.get());
        this.add(ModBlocks.POTTED_COREOPSIS.get(), createPotFlowerItemTable(ModBlocks.COREOPSIS.get()));

        this.dropSelf(ModBlocks.DIGITALE_POURPRE.get());
        this.add(ModBlocks.POTTED_DIGITALE_POURPRE.get(), createPotFlowerItemTable(ModBlocks.DIGITALE_POURPRE.get()));

        this.dropSelf(ModBlocks.DRACULA_SIMIA.get());
        this.add(ModBlocks.POTTED_DRACULA_SIMIA.get(), createPotFlowerItemTable(ModBlocks.DRACULA_SIMIA.get()));

        this.dropSelf(ModBlocks.ESTRAGON.get());
        this.add(ModBlocks.POTTED_ESTRAGON.get(), createPotFlowerItemTable(ModBlocks.ESTRAGON.get()));

        this.dropSelf(ModBlocks.ETOILE_DE_NOEL.get());
        this.add(ModBlocks.POTTED_ETOILE_DE_NOEL.get(), createPotFlowerItemTable(ModBlocks.ETOILE_DE_NOEL.get()));

        this.dropSelf(ModBlocks.EUPHORBE.get());
        this.add(ModBlocks.POTTED_EUPHORBE.get(), createPotFlowerItemTable(ModBlocks.EUPHORBE.get()));

        this.dropSelf(ModBlocks.FRITILLAIRE_PINTADE.get());
        this.add(ModBlocks.POTTED_FRITILLAIRE_PINTADE.get(), createPotFlowerItemTable(ModBlocks.FRITILLAIRE_PINTADE.get()));

        this.dropSelf(ModBlocks.GAILLET_GRATTERON.get());
        this.add(ModBlocks.POTTED_GAILLET_GRATTERON.get(), createPotFlowerItemTable(ModBlocks.GAILLET_GRATTERON.get()));

        this.dropSelf(ModBlocks.GINSENG.get());
        this.add(ModBlocks.POTTED_GINSENG.get(), createPotFlowerItemTable(ModBlocks.GINSENG.get()));

        this.dropSelf(ModBlocks.HOUBLON.get());
        this.add(ModBlocks.POTTED_HOUBLON.get(), createPotFlowerItemTable(ModBlocks.HOUBLON.get()));

        this.dropSelf(ModBlocks.HOUX.get());
        this.add(ModBlocks.POTTED_HOUX.get(), createPotFlowerItemTable(ModBlocks.HOUX.get()));

        this.dropSelf(ModBlocks.IRIS_BLEU.get());
        this.add(ModBlocks.POTTED_IRIS_BLEU.get(), createPotFlowerItemTable(ModBlocks.IRIS_BLEU.get()));

        this.dropSelf(ModBlocks.JACINTHE_DES_BOIS_LOTR.get());
        this.add(ModBlocks.POTTED_JACINTHE_DES_BOIS_LOTR.get(), createPotFlowerItemTable(ModBlocks.JACINTHE_DES_BOIS_LOTR.get()));

        this.dropSelf(ModBlocks.JONQUILLE.get());
        this.add(ModBlocks.POTTED_JONQUILLE.get(), createPotFlowerItemTable(ModBlocks.JONQUILLE.get()));

        this.dropSelf(ModBlocks.LAVENDE.get());
        this.add(ModBlocks.POTTED_LAVENDE.get(), createPotFlowerItemTable(ModBlocks.LAVENDE.get()));

        this.dropSelf(ModBlocks.LIERRE_TERRESTRE.get());
        this.add(ModBlocks.POTTED_LIERRE_TERRESTRE.get(), createPotFlowerItemTable(ModBlocks.LIERRE_TERRESTRE.get()));

        this.dropSelf(ModBlocks.LYCORIS_RADIATA.get());
        this.add(ModBlocks.POTTED_LYCORIS_RADIATA.get(), createPotFlowerItemTable(ModBlocks.LYCORIS_RADIATA.get()));

        this.dropSelf(ModBlocks.MAUVE.get());
        this.add(ModBlocks.POTTED_MAUVE.get(), createPotFlowerItemTable(ModBlocks.MAUVE.get()));

        this.dropSelf(ModBlocks.MENTHE.get());
        this.add(ModBlocks.POTTED_MENTHE.get(), createPotFlowerItemTable(ModBlocks.MENTHE.get()));

        this.dropSelf(ModBlocks.MUGUET.get());
        this.add(ModBlocks.POTTED_MUGUET.get(), createPotFlowerItemTable(ModBlocks.MUGUET.get()));

        this.dropSelf(ModBlocks.MUSCARI.get());
        this.add(ModBlocks.POTTED_MUSCARI.get(), createPotFlowerItemTable(ModBlocks.MUSCARI.get()));

        this.dropSelf(ModBlocks.MYOSOTIS.get());
        this.add(ModBlocks.POTTED_MYOSOTIS.get(), createPotFlowerItemTable(ModBlocks.MYOSOTIS.get()));

        this.dropSelf(ModBlocks.MYRTILLE.get());
        this.add(ModBlocks.POTTED_MYRTILLE.get(), createPotFlowerItemTable(ModBlocks.MYRTILLE.get()));

        this.dropSelf(ModBlocks.MELISSE.get());
        this.add(ModBlocks.POTTED_MELISSE.get(), createPotFlowerItemTable(ModBlocks.MELISSE.get()));

        this.dropSelf(ModBlocks.NICOTINIA_TABACUM.get());
        this.add(ModBlocks.POTTED_NICOTINIA_TABACUM.get(), createPotFlowerItemTable(ModBlocks.NICOTINIA_TABACUM.get()));

        this.dropSelf(ModBlocks.NOISETTE_DE_TERRE.get());
        this.add(ModBlocks.POTTED_NOISETTE_DE_TERRE.get(), createPotFlowerItemTable(ModBlocks.NOISETTE_DE_TERRE.get()));

        this.dropSelf(ModBlocks.ORCHIDEE_ANGE.get());
        this.add(ModBlocks.POTTED_ORCHIDEE_ANGE.get(), createPotFlowerItemTable(ModBlocks.ORCHIDEE_ANGE.get()));

        this.dropSelf(ModBlocks.ORCHIDEE.get());
        this.add(ModBlocks.POTTED_ORCHIDEE.get(), createPotFlowerItemTable(ModBlocks.ORCHIDEE.get()));

        this.dropSelf(ModBlocks.ORTIE.get());
        this.add(ModBlocks.POTTED_ORTIE.get(), createPotFlowerItemTable(ModBlocks.ORTIE.get()));

        this.dropSelf(ModBlocks.OSEILLE_SAUVAGE.get());
        this.add(ModBlocks.POTTED_OSEILLE_SAUVAGE.get(), createPotFlowerItemTable(ModBlocks.OSEILLE_SAUVAGE.get()));

        this.dropSelf(ModBlocks.OXALIS_JAUNE.get());
        this.add(ModBlocks.POTTED_OXALIS_JAUNE.get(), createPotFlowerItemTable(ModBlocks.OXALIS_JAUNE.get()));

        this.dropSelf(ModBlocks.PELARGONIUM.get());
        this.add(ModBlocks.POTTED_PELARGONIUM.get(), createPotFlowerItemTable(ModBlocks.PELARGONIUM.get()));

        this.dropSelf(ModBlocks.PERCE_NEIGE.get());
        this.add(ModBlocks.POTTED_PERCE_NEIGE.get(), createPotFlowerItemTable(ModBlocks.PERCE_NEIGE.get()));

        this.dropSelf(ModBlocks.PERISTERIA.get());
        this.add(ModBlocks.POTTED_PERISTERIA.get(), createPotFlowerItemTable(ModBlocks.PERISTERIA.get()));

        this.dropSelf(ModBlocks.PERSIL.get());
        this.add(ModBlocks.POTTED_PERSIL.get(), createPotFlowerItemTable(ModBlocks.PERSIL.get()));

        this.dropSelf(ModBlocks.PLANTIN.get());
        this.add(ModBlocks.POTTED_PLANTIN.get(), createPotFlowerItemTable(ModBlocks.PLANTIN.get()));

        this.dropSelf(ModBlocks.LAVENDE.get());
        this.add(ModBlocks.POTTED_LAVENDE.get(), createPotFlowerItemTable(ModBlocks.LAVENDE.get()));

        this.dropSelf(ModBlocks.LIERRE_TERRESTRE.get());
        this.add(ModBlocks.POTTED_LIERRE_TERRESTRE.get(), createPotFlowerItemTable(ModBlocks.LIERRE_TERRESTRE.get()));

        this.dropSelf(ModBlocks.POIVRE_NOIR.get());
        this.add(ModBlocks.POTTED_POIVRE_NOIR.get(), createPotFlowerItemTable(ModBlocks.POIVRE_NOIR.get()));

        this.dropSelf(ModBlocks.PRIMEVERE.get());
        this.add(ModBlocks.POTTED_PRIMEVERE.get(), createPotFlowerItemTable(ModBlocks.PRIMEVERE.get()));

        this.dropSelf(ModBlocks.PRELE.get());
        this.add(ModBlocks.POTTED_PRELE.get(), createPotFlowerItemTable(ModBlocks.PRELE.get()));

        this.dropSelf(ModBlocks.RAFFLESIA.get());
        this.add(ModBlocks.POTTED_RAFFLESIA.get(), createPotFlowerItemTable(ModBlocks.RAFFLESIA.get()));

        this.dropSelf(ModBlocks.RAISIN_BLANC.get());
        this.add(ModBlocks.POTTED_RAISIN_BLANC.get(), createPotFlowerItemTable(ModBlocks.RAISIN_BLANC.get()));

        this.dropSelf(ModBlocks.RAISIN_ROUGE.get());
        this.add(ModBlocks.POTTED_RAISIN_ROUGE.get(), createPotFlowerItemTable(ModBlocks.RAISIN_ROUGE.get()));

        this.dropSelf(ModBlocks.RANUNCULUS_FICARIA.get());
        this.add(ModBlocks.POTTED_RANUNCULUS_FICARIA.get(), createPotFlowerItemTable(ModBlocks.RANUNCULUS_FICARIA.get()));

        this.dropSelf(ModBlocks.REINE_DES_PRES.get());
        this.add(ModBlocks.POTTED_REINE_DES_PRES.get(), createPotFlowerItemTable(ModBlocks.REINE_DES_PRES.get()));

        this.dropSelf(ModBlocks.RHODODENDRON.get());
        this.add(ModBlocks.POTTED_RHODODENDRON.get(), createPotFlowerItemTable(ModBlocks.RHODODENDRON.get()));

        this.dropSelf(ModBlocks.RICIN.get());
        this.add(ModBlocks.POTTED_RICIN.get(), createPotFlowerItemTable(ModBlocks.RICIN.get()));

        this.dropSelf(ModBlocks.ROMARIN.get());
        this.add(ModBlocks.POTTED_ROMARIN.get(), createPotFlowerItemTable(ModBlocks.ROMARIN.get()));

        this.dropSelf(ModBlocks.ROSE_BLANCHE.get());
        this.add(ModBlocks.POTTED_ROSE_BLANCHE.get(), createPotFlowerItemTable(ModBlocks.ROSE_BLANCHE.get()));

        this.dropSelf(ModBlocks.SARRACENE.get());
        this.add(ModBlocks.POTTED_SARRACENE.get(), createPotFlowerItemTable(ModBlocks.SARRACENE.get()));

        this.dropSelf(ModBlocks.SILENE.get());
        this.add(ModBlocks.POTTED_SILENE.get(), createPotFlowerItemTable(ModBlocks.SILENE.get()));

        this.dropSelf(ModBlocks.SUREAU_NOIR.get());
        this.add(ModBlocks.POTTED_SUREAU_NOIR.get(), createPotFlowerItemTable(ModBlocks.SUREAU_NOIR.get()));

        this.dropSelf(ModBlocks.SWEAT_WILLIAM_BLANCHE.get());
        this.add(ModBlocks.POTTED_SWEAT_WILLIAM_BLANCHE.get(), createPotFlowerItemTable(ModBlocks.SWEAT_WILLIAM_BLANCHE.get()));

        this.dropSelf(ModBlocks.SWEAT_WILLIAM_ROSE.get());
        this.add(ModBlocks.POTTED_SWEAT_WILLIAM_ROSE.get(), createPotFlowerItemTable(ModBlocks.SWEAT_WILLIAM_ROSE.get()));

        this.dropSelf(ModBlocks.THYM.get());
        this.add(ModBlocks.POTTED_THYM.get(), createPotFlowerItemTable(ModBlocks.THYM.get()));

        this.dropSelf(ModBlocks.THEIER.get());
        this.add(ModBlocks.POTTED_THEIER.get(), createPotFlowerItemTable(ModBlocks.THEIER.get()));

        this.dropSelf(ModBlocks.UVULAIRES.get());
        this.add(ModBlocks.POTTED_UVULAIRES.get(), createPotFlowerItemTable(ModBlocks.UVULAIRES.get()));

        this.dropSelf(ModBlocks.VIOLETTE.get());
        this.add(ModBlocks.POTTED_VIOLETTE.get(), createPotFlowerItemTable(ModBlocks.VIOLETTE.get()));

        this.dropSelf(ModBlocks.WEIGELA.get());
        this.add(ModBlocks.POTTED_WEIGELA.get(), createPotFlowerItemTable(ModBlocks.WEIGELA.get()));

        this.dropSelf(ModBlocks.YUCCA.get());
        this.add(ModBlocks.POTTED_YUCCA.get(), createPotFlowerItemTable(ModBlocks.YUCCA.get()));

        this.dropSelf(ModBlocks.ZINNIA.get());
        this.add(ModBlocks.POTTED_ZINNIA.get(), createPotFlowerItemTable(ModBlocks.ZINNIA.get()));

        this.dropSelf(ModBlocks.AGARICUS_BISPORUS.get());
        this.add(ModBlocks.POTTED_AGARICUS_BISPORUS.get(), createPotFlowerItemTable(ModBlocks.AGARICUS_BISPORUS.get()));

        this.dropSelf(ModBlocks.AMANITE_DES_CESARS.get());
        this.add(ModBlocks.POTTED_AMANITE_DES_CESARS.get(), createPotFlowerItemTable(ModBlocks.AMANITE_DES_CESARS.get()));

        this.dropSelf(ModBlocks.BOLET_DE_SATAN.get());
        this.add(ModBlocks.POTTED_BOLET_DE_SATAN.get(), createPotFlowerItemTable(ModBlocks.BOLET_DE_SATAN.get()));

        this.dropSelf(ModBlocks.CALICE_DE_LA_MORT.get());
        this.add(ModBlocks.POTTED_CALICE_DE_LA_MORT.get(), createPotFlowerItemTable(ModBlocks.CALICE_DE_LA_MORT.get()));

        this.dropSelf(ModBlocks.CHANTERELLE.get());
        this.add(ModBlocks.POTTED_CHANTERELLE.get(), createPotFlowerItemTable(ModBlocks.CHANTERELLE.get()));

        this.dropSelf(ModBlocks.COPRIN.get());
        this.add(ModBlocks.POTTED_COPRIN.get(), createPotFlowerItemTable(ModBlocks.COPRIN.get()));

        this.dropSelf(ModBlocks.CORDYCEPS.get());
        this.add(ModBlocks.POTTED_CORDYCEPS.get(), createPotFlowerItemTable(ModBlocks.CORDYCEPS.get()));

        this.dropSelf(ModBlocks.CORTIANIRE_SI_JOLI.get());
        this.add(ModBlocks.POTTED_CORTIANIRE_SI_JOLI.get(), createPotFlowerItemTable(ModBlocks.CORTIANIRE_SI_JOLI.get()));

        this.dropSelf(ModBlocks.COULEMELLE.get());
        this.add(ModBlocks.POTTED_COULEMELLE.get(), createPotFlowerItemTable(ModBlocks.COULEMELLE.get()));

        this.dropSelf(ModBlocks.CRINIERE_DE_LION.get());
        this.add(ModBlocks.POTTED_CRINIERE_DE_LION.get(), createPotFlowerItemTable(ModBlocks.CRINIERE_DE_LION.get()));

        this.dropSelf(ModBlocks.CUDONIA_CIRCINAN.get());
        this.add(ModBlocks.POTTED_CUDONIA_CIRCINAN.get(), createPotFlowerItemTable(ModBlocks.CUDONIA_CIRCINAN.get()));

        this.dropSelf(ModBlocks.CEPE.get());
        this.add(ModBlocks.POTTED_CEPE.get(), createPotFlowerItemTable(ModBlocks.CEPE.get()));

        this.dropSelf(ModBlocks.ENOKI.get());
        this.add(ModBlocks.POTTED_ENOKI.get(), createPotFlowerItemTable(ModBlocks.ENOKI.get()));

        this.dropSelf(ModBlocks.ENTOMOLE_LIVIDE.get());
        this.add(ModBlocks.POTTED_ENTOMOLE_LIVIDE.get(), createPotFlowerItemTable(ModBlocks.ENTOMOLE_LIVIDE.get()));

        this.dropSelf(ModBlocks.FAUSSE_MORILLE.get());
        this.add(ModBlocks.POTTED_FAUSSE_MORILLE.get(), createPotFlowerItemTable(ModBlocks.FAUSSE_MORILLE.get()));

        this.dropSelf(ModBlocks.MAITAKE.get());
        this.add(ModBlocks.POTTED_MAITAKE.get(), createPotFlowerItemTable(ModBlocks.MAITAKE.get()));

        this.dropSelf(ModBlocks.MARASME_DES_OREADES.get());
        this.add(ModBlocks.POTTED_MARASME_DES_OREADES.get(), createPotFlowerItemTable(ModBlocks.MARASME_DES_OREADES.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

}
