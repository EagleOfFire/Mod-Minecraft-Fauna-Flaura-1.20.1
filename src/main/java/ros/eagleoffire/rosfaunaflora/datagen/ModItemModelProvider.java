package ros.eagleoffire.rosfaunaflora.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import ros.eagleoffire.rosfaunaflora.ROSFaunaFlora;
import ros.eagleoffire.rosfaunaflora.block.ModBlocks;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ROSFaunaFlora.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleBlockItemBlockTexture(ModBlocks.EDELWEISS);

        simpleBlockItemBlockTexture(ModBlocks.ACHILEE);
        simpleBlockItemBlockTexture(ModBlocks.AIL_DES_OURS);
        simpleBlockItemBlockTexture(ModBlocks.AMARYLLIS_JAUNE);
        simpleBlockItemBlockTexture(ModBlocks.AMARYLLIS_ROUGE);
        simpleBlockItemBlockTexture(ModBlocks.ANETH);
        simpleBlockItemBlockTexture(ModBlocks.ANIS);
        simpleBlockItemBlockTexture(ModBlocks.ARNICA);
        simpleBlockItemBlockTexture(ModBlocks.ASTRAGALE);
        simpleBlockItemBlockTexture(ModBlocks.AUBEPINE);
        simpleBlockItemBlockTexture(ModBlocks.BAPTISTA);
        simpleBlockItemBlockTexture(ModBlocks.BELLADONE);
        simpleBlockItemBlockTexture(ModBlocks.BENOITE);
        simpleBlockItemBlockTexture(ModBlocks.BERCE_GEANTE);
        simpleBlockItemBlockTexture(ModBlocks.BOIS_JOLI);
        simpleBlockItemBlockTexture(ModBlocks.BRUYERE_LOTR);
        simpleBlockItemBlockTexture(ModBlocks.CAFEIER);
        simpleBlockItemBlockTexture(ModBlocks.CALENDULA);
        simpleBlockItemBlockTexture(ModBlocks.CAMELIA);
        simpleBlockItemBlockTexture(ModBlocks.CAPUCINE);
        simpleBlockItemBlockTexture(ModBlocks.CIGUE);
        simpleBlockItemBlockTexture(ModBlocks.CISTE);
        simpleBlockItemBlockTexture(ModBlocks.CORRIANDRE);
        simpleBlockItemBlockTexture(ModBlocks.COREOPSIS);
        simpleBlockItemBlockTexture(ModBlocks.DIGITALE_POURPRE);
        simpleBlockItemBlockTexture(ModBlocks.DRACULA_SIMIA);
        simpleBlockItemBlockTexture(ModBlocks.ESTRAGON);
        simpleBlockItemBlockTexture(ModBlocks.ETOILE_DE_NOEL);
        simpleBlockItemBlockTexture(ModBlocks.EUPHORBE);
        simpleBlockItemBlockTexture(ModBlocks.FRITILLAIRE_PINTADE);
        simpleBlockItemBlockTexture(ModBlocks.GAILLET_GRATTERON);
        simpleBlockItemBlockTexture(ModBlocks.GINSENG);
        simpleBlockItemBlockTexture(ModBlocks.HOUBLON);
        simpleBlockItemBlockTexture(ModBlocks.HOUX);
        simpleBlockItemBlockTexture(ModBlocks.IRIS_BLEU);
        simpleBlockItemBlockTexture(ModBlocks.JACINTHE_DES_BOIS_LOTR);
        simpleBlockItemBlockTexture(ModBlocks.JONQUILLE);
        simpleBlockItemBlockTexture(ModBlocks.LAVENDE);
        simpleBlockItemBlockTexture(ModBlocks.LIERRE_TERRESTRE);
        simpleBlockItemBlockTexture(ModBlocks.LYCORIS_RADIATA);
        simpleBlockItemBlockTexture(ModBlocks.MAUVE);
        simpleBlockItemBlockTexture(ModBlocks.MENTHE);
        simpleBlockItemBlockTexture(ModBlocks.MUGUET);
        simpleBlockItemBlockTexture(ModBlocks.MUSCARI);
        simpleBlockItemBlockTexture(ModBlocks.MYOSOTIS);
        simpleBlockItemBlockTexture(ModBlocks.MYRTILLE);
        simpleBlockItemBlockTexture(ModBlocks.MELISSE);
        simpleBlockItemBlockTexture(ModBlocks.NICOTINIA_TABACUM);
        simpleBlockItemBlockTexture(ModBlocks.NOISETTE_DE_TERRE);
        simpleBlockItemBlockTexture(ModBlocks.ORCHIDEE_ANGE);
        simpleBlockItemBlockTexture(ModBlocks.ORCHIDEE);
        simpleBlockItemBlockTexture(ModBlocks.ORTIE);
        simpleBlockItemBlockTexture(ModBlocks.OSEILLE_SAUVAGE);
        simpleBlockItemBlockTexture(ModBlocks.OXALIS_JAUNE);
        simpleBlockItemBlockTexture(ModBlocks.PELARGONIUM);
        simpleBlockItemBlockTexture(ModBlocks.PERCE_NEIGE);
        simpleBlockItemBlockTexture(ModBlocks.PERISTERIA);
        simpleBlockItemBlockTexture(ModBlocks.PERSIL);
        simpleBlockItemBlockTexture(ModBlocks.PLANTIN);
        simpleBlockItemBlockTexture(ModBlocks.POIVRE_NOIR);
        simpleBlockItemBlockTexture(ModBlocks.PRIMEVERE);
        simpleBlockItemBlockTexture(ModBlocks.PRELE);
        simpleBlockItemBlockTexture(ModBlocks.RAFFLESIA);
        simpleBlockItemBlockTexture(ModBlocks.RAISIN_BLANC);
        simpleBlockItemBlockTexture(ModBlocks.RAISIN_ROUGE);
        simpleBlockItemBlockTexture(ModBlocks.RANUNCULUS_FICARIA);
        simpleBlockItemBlockTexture(ModBlocks.REINE_DES_PRES);
        simpleBlockItemBlockTexture(ModBlocks.RHODODENDRON);
        simpleBlockItemBlockTexture(ModBlocks.RICIN);
        simpleBlockItemBlockTexture(ModBlocks.ROMARIN);
        simpleBlockItemBlockTexture(ModBlocks.ROSE_BLANCHE);
        simpleBlockItemBlockTexture(ModBlocks.SARRACENE);
        simpleBlockItemBlockTexture(ModBlocks.SILENE);
        simpleBlockItemBlockTexture(ModBlocks.SUREAU_NOIR);
        simpleBlockItemBlockTexture(ModBlocks.SWEAT_WILLIAM_BLANCHE);
        simpleBlockItemBlockTexture(ModBlocks.SWEAT_WILLIAM_ROSE);
        simpleBlockItemBlockTexture(ModBlocks.THYM);
        simpleBlockItemBlockTexture(ModBlocks.THEIER);
        simpleBlockItemBlockTexture(ModBlocks.UVULAIRES);
        simpleBlockItemBlockTexture(ModBlocks.VIOLETTE);
        simpleBlockItemBlockTexture(ModBlocks.WEIGELA);
        simpleBlockItemBlockTexture(ModBlocks.YUCCA);
        simpleBlockItemBlockTexture(ModBlocks.ZINNIA);

        //champi
        simpleBlockItemBlockTexture(ModBlocks.AGARICUS_BISPORUS);
        simpleBlockItemBlockTexture(ModBlocks.AMANITE_DES_CESARS);
        simpleBlockItemBlockTexture(ModBlocks.BOLET_DE_SATAN);
        simpleBlockItemBlockTexture(ModBlocks.CALICE_DE_LA_MORT);
        simpleBlockItemBlockTexture(ModBlocks.CHANTERELLE);
        simpleBlockItemBlockTexture(ModBlocks.COPRIN);
        simpleBlockItemBlockTexture(ModBlocks.CORDYCEPS);
        simpleBlockItemBlockTexture(ModBlocks.CORTIANIRE_SI_JOLI);
        simpleBlockItemBlockTexture(ModBlocks.COULEMELLE);
        simpleBlockItemBlockTexture(ModBlocks.CRINIERE_DE_LION);
        simpleBlockItemBlockTexture(ModBlocks.CUDONIA_CIRCINAN);
        simpleBlockItemBlockTexture(ModBlocks.CEPE);
        simpleBlockItemBlockTexture(ModBlocks.ENOKI);
        simpleBlockItemBlockTexture(ModBlocks.ENTOMOLE_LIVIDE);
        simpleBlockItemBlockTexture(ModBlocks.FAUSSE_MORILLE);
        simpleBlockItemBlockTexture(ModBlocks.MAITAKE);
        simpleBlockItemBlockTexture(ModBlocks.MARASME_DES_OREADES);
        simpleBlockItemBlockTexture(ModBlocks.MORILLE);
        simpleBlockItemBlockTexture(ModBlocks.PIED_DE_MOUTON);
        simpleBlockItemBlockTexture(ModBlocks.REISHI);
        simpleBlockItemBlockTexture(ModBlocks.ROSE_DES_PRES);
        simpleBlockItemBlockTexture(ModBlocks.SHIITAKE);
        simpleBlockItemBlockTexture(ModBlocks.SHIMEJI);
        simpleBlockItemBlockTexture(ModBlocks.TERMITOMYCES_TITAN);
        simpleBlockItemBlockTexture(ModBlocks.TROMPETTE_DE_LA_MORT);

        //cactus
        simpleBlockItemBlockTexture(ModBlocks.CEREUS_HEANKENUS);
        simpleBlockItemBlockTexture(ModBlocks.FEROCACTUS);
        simpleBlockItemBlockTexture(ModBlocks.FEROCACTUS_FLEUR);

        // special

        simpleBlockItemBlockTexture(ModBlocks.MULDVARPHYTE);
        simpleBlockItemBlockTexture(ModBlocks.SHI);
        simpleBlockItemBlockTexture(ModBlocks.ARCANE_BLOOM);
        simpleBlockItemBlockTexture(ModBlocks.ATHELAS_LOTR);
        simpleBlockItemBlockTexture(ModBlocks.AURIFERE_MAUVE);
        simpleBlockItemBlockTexture(ModBlocks.BOUTTON_DES_NEIGES);
        simpleBlockItemBlockTexture(ModBlocks.CAMPANULE_MAGIQUE);
        simpleBlockItemBlockTexture(ModBlocks.CHACANELITE);
        simpleBlockItemBlockTexture(ModBlocks.FLLORRINE);
        simpleBlockItemBlockTexture(ModBlocks.ICHTIL);
        simpleBlockItemBlockTexture(ModBlocks.SIMBELMYEN_LOTR);
        simpleBlockItemBlockTexture(ModBlocks.VICOTINE);
    }

    private ItemModelBuilder simpleBlockItemBlockTexture(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ROSFaunaFlora.MODID, "block/" + item.getId().getPath()));
    }
}
