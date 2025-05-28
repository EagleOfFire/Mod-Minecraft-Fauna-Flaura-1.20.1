package ros.eagleoffire.rosfaunaflora.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import ros.eagleoffire.rosfaunaflora.ROSFaunaFlora;
import ros.eagleoffire.rosfaunaflora.block.ModBlocks;
import ros.eagleoffire.rosfaunaflora.block.custom.Fauna;

public class ModBlockStateProvider<Block> extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ROSFaunaFlora.MODID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // Assuming EDELWEISS is your custom Fauna block
        net.minecraft.world.level.block.Block edelweiss = ModBlocks.EDELWEISS.get();

        // Generate two models: one for each harvestable state
        ModelFile harvestableModel = models()
                .cross("edelweiss", blockTexture(edelweiss))
                .renderType("cutout");

        ModelFile unharvestableModel = models()
                .cross("edelweiss_unharvestable", modLoc("block/edelweiss_unharvestable"))
                .renderType("cutout");

        // Register blockstate variants
        getVariantBuilder(edelweiss)
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(harvestableModel).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(unharvestableModel).addModel();


        simpleBlockWithItem(ModBlocks.POTTED_EDELWEISS.get(), models().singleTexture("potted_edelweiss", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.EDELWEISS.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.ACHILEE.get(), models().cross(blockTexture(ModBlocks.ACHILEE.get()).getPath(),
                blockTexture(ModBlocks.ACHILEE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_ACHILEE.get(), models().singleTexture("potted_achilee", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.ACHILEE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.AIL_DES_OURS.get(), models().cross(blockTexture(ModBlocks.AIL_DES_OURS.get()).getPath(),
                blockTexture(ModBlocks.AIL_DES_OURS.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_AIL_DES_OURS.get(), models().singleTexture("potted_ail_des_ours", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.AIL_DES_OURS.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.AMARYLLIS_JAUNE.get(), models().cross(blockTexture(ModBlocks.AMARYLLIS_JAUNE.get()).getPath(),
                blockTexture(ModBlocks.AMARYLLIS_JAUNE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_AMARYLLIS_JAUNE.get(), models().singleTexture("potted_amaryllis_jaune", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.AMARYLLIS_JAUNE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.AMARYLLIS_ROUGE.get(), models().cross(blockTexture(ModBlocks.AMARYLLIS_ROUGE.get()).getPath(),
                blockTexture(ModBlocks.AMARYLLIS_ROUGE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_AMARYLLIS_ROUGE.get(), models().singleTexture("potted_amaryllis_rouge", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.AMARYLLIS_ROUGE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.ANETH.get(), models().cross(blockTexture(ModBlocks.ANETH.get()).getPath(),
                blockTexture(ModBlocks.ANETH.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_ANETH.get(), models().singleTexture("potted_aneth", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.ANETH.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.ANIS.get(), models().cross(blockTexture(ModBlocks.ANIS.get()).getPath(),
                blockTexture(ModBlocks.ANIS.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_ANIS.get(), models().singleTexture("potted_anis", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.ANIS.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.ARNICA.get(), models().cross(blockTexture(ModBlocks.ARNICA.get()).getPath(),
                blockTexture(ModBlocks.ARNICA.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_ARNICA.get(), models().singleTexture("potted_arnica", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.ARNICA.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.ASTRAGALE.get(), models().cross(blockTexture(ModBlocks.ASTRAGALE.get()).getPath(),
                blockTexture(ModBlocks.ASTRAGALE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_ASTRAGALE.get(), models().singleTexture("potted_astragale", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.ASTRAGALE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.AUBEPINE.get(), models().cross(blockTexture(ModBlocks.AUBEPINE.get()).getPath(),
                blockTexture(ModBlocks.AUBEPINE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_AUBEPINE.get(), models().singleTexture("potted_aubepine", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.AUBEPINE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.BAPTISTA.get(), models().cross(blockTexture(ModBlocks.BAPTISTA.get()).getPath(),
                blockTexture(ModBlocks.BAPTISTA.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_BAPTISTA.get(), models().singleTexture("potted_baptista", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.BAPTISTA.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.BELLADONE.get(), models().cross(blockTexture(ModBlocks.BELLADONE.get()).getPath(),
                blockTexture(ModBlocks.BELLADONE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_BELLADONE.get(), models().singleTexture("potted_belladone", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.BELLADONE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.BENOITE.get(), models().cross(blockTexture(ModBlocks.BENOITE.get()).getPath(),
                blockTexture(ModBlocks.BENOITE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_BENOITE.get(), models().singleTexture("potted_benoite", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.BENOITE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.BERCE_GEANTE.get(), models().cross(blockTexture(ModBlocks.BERCE_GEANTE.get()).getPath(),
                blockTexture(ModBlocks.BERCE_GEANTE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_BERCE_GEANTE.get(), models().singleTexture("potted_berce_geante", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.BERCE_GEANTE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.BOIS_JOLI.get(), models().cross(blockTexture(ModBlocks.BOIS_JOLI.get()).getPath(),
                blockTexture(ModBlocks.BOIS_JOLI.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_BOIS_JOLI.get(), models().singleTexture("potted_bois_joli", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.BOIS_JOLI.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.BRUYERE_LOTR.get(), models().cross(blockTexture(ModBlocks.BRUYERE_LOTR.get()).getPath(),
                blockTexture(ModBlocks.BRUYERE_LOTR.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_BRUYERE_LOTR.get(), models().singleTexture("potted_bruyere_lotr", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.BRUYERE_LOTR.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.CAFEIER.get(), models().cross(blockTexture(ModBlocks.CAFEIER.get()).getPath(),
                blockTexture(ModBlocks.CAFEIER.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_CAFEIER.get(), models().singleTexture("potted_cafeier", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.CAFEIER.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.CALENDULA.get(), models().cross(blockTexture(ModBlocks.CALENDULA.get()).getPath(),
                blockTexture(ModBlocks.CALENDULA.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_CALENDULA.get(), models().singleTexture("potted_calendula", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.CALENDULA.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.CAMELIA.get(), models().cross(blockTexture(ModBlocks.CAMELIA.get()).getPath(),
                blockTexture(ModBlocks.CAMELIA.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_CAMELIA.get(), models().singleTexture("potted_camelia", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.CAMELIA.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.CAPUCINE.get(), models().cross(blockTexture(ModBlocks.CAPUCINE.get()).getPath(),
                blockTexture(ModBlocks.CAPUCINE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_CAPUCINE.get(), models().singleTexture("potted_capucine", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.CAPUCINE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.CIGUE.get(), models().cross(blockTexture(ModBlocks.CIGUE.get()).getPath(),
                blockTexture(ModBlocks.CIGUE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_CIGUE.get(), models().singleTexture("potted_cigue", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.CIGUE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.CISTE.get(), models().cross(blockTexture(ModBlocks.CISTE.get()).getPath(), blockTexture(ModBlocks.CISTE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_CISTE.get(), models().singleTexture("potted_ciste", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.CISTE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.CORRIANDRE.get(), models().cross(blockTexture(ModBlocks.CORRIANDRE.get()).getPath(), blockTexture(ModBlocks.CORRIANDRE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_CORRIANDRE.get(), models().singleTexture("potted_corriandre", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.CORRIANDRE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.COREOPSIS.get(), models().cross(blockTexture(ModBlocks.COREOPSIS.get()).getPath(), blockTexture(ModBlocks.COREOPSIS.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_COREOPSIS.get(), models().singleTexture("potted_coreopsis", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.COREOPSIS.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.DIGITALE_POURPRE.get(), models().cross(blockTexture(ModBlocks.DIGITALE_POURPRE.get()).getPath(), blockTexture(ModBlocks.DIGITALE_POURPRE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_DIGITALE_POURPRE.get(), models().singleTexture("potted_digitale_pourpre", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.DIGITALE_POURPRE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.DRACULA_SIMIA.get(), models().cross(blockTexture(ModBlocks.DRACULA_SIMIA.get()).getPath(), blockTexture(ModBlocks.DRACULA_SIMIA.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_DRACULA_SIMIA.get(), models().singleTexture("potted_dracula_simia", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.DRACULA_SIMIA.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.ESTRAGON.get(), models().cross(blockTexture(ModBlocks.ESTRAGON.get()).getPath(), blockTexture(ModBlocks.ESTRAGON.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_ESTRAGON.get(), models().singleTexture("potted_estragon", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.ESTRAGON.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.ETOILE_DE_NOEL.get(), models().cross(blockTexture(ModBlocks.ETOILE_DE_NOEL.get()).getPath(), blockTexture(ModBlocks.ETOILE_DE_NOEL.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_ETOILE_DE_NOEL.get(), models().singleTexture("potted_etoile_de_noel", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.ETOILE_DE_NOEL.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.EUPHORBE.get(), models().cross(blockTexture(ModBlocks.EUPHORBE.get()).getPath(), blockTexture(ModBlocks.EUPHORBE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_EUPHORBE.get(), models().singleTexture("potted_euphorbe", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.EUPHORBE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.FRITILLAIRE_PINTADE.get(), models().cross(blockTexture(ModBlocks.FRITILLAIRE_PINTADE.get()).getPath(), blockTexture(ModBlocks.FRITILLAIRE_PINTADE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_FRITILLAIRE_PINTADE.get(), models().singleTexture("potted_fritillaire_pintade", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.FRITILLAIRE_PINTADE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.GAILLET_GRATTERON.get(), models().cross(blockTexture(ModBlocks.GAILLET_GRATTERON.get()).getPath(), blockTexture(ModBlocks.GAILLET_GRATTERON.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_GAILLET_GRATTERON.get(), models().singleTexture("potted_gaillet_gratteron", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.GAILLET_GRATTERON.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.GINSENG.get(), models().cross(blockTexture(ModBlocks.GINSENG.get()).getPath(), blockTexture(ModBlocks.GINSENG.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_GINSENG.get(), models().singleTexture("potted_ginseng", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.GINSENG.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.HOUBLON.get(), models().cross(blockTexture(ModBlocks.HOUBLON.get()).getPath(), blockTexture(ModBlocks.HOUBLON.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_HOUBLON.get(), models().singleTexture("potted_houblon", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.HOUBLON.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.HOUX.get(), models().cross(blockTexture(ModBlocks.HOUX.get()).getPath(), blockTexture(ModBlocks.HOUX.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_HOUX.get(), models().singleTexture("potted_houx", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.HOUX.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.IRIS_BLEU.get(), models().cross(blockTexture(ModBlocks.IRIS_BLEU.get()).getPath(), blockTexture(ModBlocks.IRIS_BLEU.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_IRIS_BLEU.get(), models().singleTexture("potted_iris_bleu", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.IRIS_BLEU.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.JACINTHE_DES_BOIS_LOTR.get(), models().cross(blockTexture(ModBlocks.JACINTHE_DES_BOIS_LOTR.get()).getPath(), blockTexture(ModBlocks.JACINTHE_DES_BOIS_LOTR.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_JACINTHE_DES_BOIS_LOTR.get(), models().singleTexture("potted_jacinthe_des_bois_lotr", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.JACINTHE_DES_BOIS_LOTR.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.JONQUILLE.get(), models().cross(blockTexture(ModBlocks.JONQUILLE.get()).getPath(), blockTexture(ModBlocks.JONQUILLE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_JONQUILLE.get(), models().singleTexture("potted_jonquille", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.JONQUILLE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.LAVENDE.get(), models().cross(blockTexture(ModBlocks.LAVENDE.get()).getPath(), blockTexture(ModBlocks.LAVENDE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_LAVENDE.get(), models().singleTexture("potted_lavende", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.LAVENDE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.LIERRE_TERRESTRE.get(), models().cross(blockTexture(ModBlocks.LIERRE_TERRESTRE.get()).getPath(), blockTexture(ModBlocks.LIERRE_TERRESTRE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_LIERRE_TERRESTRE.get(), models().singleTexture("potted_lierre_terrestre", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.LIERRE_TERRESTRE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.LYCORIS_RADIATA.get(), models().cross(blockTexture(ModBlocks.LYCORIS_RADIATA.get()).getPath(), blockTexture(ModBlocks.LYCORIS_RADIATA.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_LYCORIS_RADIATA.get(), models().singleTexture("potted_lycoris_radiata", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.LYCORIS_RADIATA.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.MAUVE.get(), models().cross(blockTexture(ModBlocks.MAUVE.get()).getPath(), blockTexture(ModBlocks.MAUVE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_MAUVE.get(), models().singleTexture("potted_mauve", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.MAUVE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.MENTHE.get(), models().cross(blockTexture(ModBlocks.MENTHE.get()).getPath(), blockTexture(ModBlocks.MENTHE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_MENTHE.get(), models().singleTexture("potted_menthe", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.MENTHE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.MUGUET.get(), models().cross(blockTexture(ModBlocks.MUGUET.get()).getPath(), blockTexture(ModBlocks.MUGUET.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_MUGUET.get(), models().singleTexture("potted_muguet", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.MUGUET.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.MUSCARI.get(), models().cross(blockTexture(ModBlocks.MUSCARI.get()).getPath(), blockTexture(ModBlocks.MUSCARI.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_MUSCARI.get(), models().singleTexture("potted_muscari", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.MUSCARI.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.MYOSOTIS.get(), models().cross(blockTexture(ModBlocks.MYOSOTIS.get()).getPath(), blockTexture(ModBlocks.MYOSOTIS.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_MYOSOTIS.get(), models().singleTexture("potted_myosotis", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.MYOSOTIS.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.MYRTILLE.get(), models().cross(blockTexture(ModBlocks.MYRTILLE.get()).getPath(), blockTexture(ModBlocks.MYRTILLE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_MYRTILLE.get(), models().singleTexture("potted_myrtille", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.MYRTILLE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.MELISSE.get(), models().cross(blockTexture(ModBlocks.MELISSE.get()).getPath(), blockTexture(ModBlocks.MELISSE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_MELISSE.get(), models().singleTexture("potted_melisse", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.MELISSE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.NICOTINIA_TABACUM.get(), models().cross(blockTexture(ModBlocks.NICOTINIA_TABACUM.get()).getPath(), blockTexture(ModBlocks.NICOTINIA_TABACUM.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_NICOTINIA_TABACUM.get(), models().singleTexture("potted_nicotinia_tabacum", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.NICOTINIA_TABACUM.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.NOISETTE_DE_TERRE.get(), models().cross(blockTexture(ModBlocks.NOISETTE_DE_TERRE.get()).getPath(), blockTexture(ModBlocks.NOISETTE_DE_TERRE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_NOISETTE_DE_TERRE.get(), models().singleTexture("potted_noisette_de_terre", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.NOISETTE_DE_TERRE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.ORCHIDEE_ANGE.get(), models().cross(blockTexture(ModBlocks.ORCHIDEE_ANGE.get()).getPath(), blockTexture(ModBlocks.ORCHIDEE_ANGE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_ORCHIDEE_ANGE.get(), models().singleTexture("potted_orchidee_ange", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.ORCHIDEE_ANGE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.ORCHIDEE.get(), models().cross(blockTexture(ModBlocks.ORCHIDEE.get()).getPath(), blockTexture(ModBlocks.ORCHIDEE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_ORCHIDEE.get(), models().singleTexture("potted_orchidee", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.ORCHIDEE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.ORTIE.get(), models().cross(blockTexture(ModBlocks.ORTIE.get()).getPath(), blockTexture(ModBlocks.ORTIE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_ORTIE.get(), models().singleTexture("potted_ortie", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.ORTIE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.OSEILLE_SAUVAGE.get(), models().cross(blockTexture(ModBlocks.OSEILLE_SAUVAGE.get()).getPath(), blockTexture(ModBlocks.OSEILLE_SAUVAGE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_OSEILLE_SAUVAGE.get(), models().singleTexture("potted_oseille_sauvage", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.OSEILLE_SAUVAGE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.OXALIS_JAUNE.get(), models().cross(blockTexture(ModBlocks.OXALIS_JAUNE.get()).getPath(), blockTexture(ModBlocks.OXALIS_JAUNE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_OXALIS_JAUNE.get(), models().singleTexture("potted_oxalis_jaune", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.OXALIS_JAUNE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.PELARGONIUM.get(), models().cross(blockTexture(ModBlocks.PELARGONIUM.get()).getPath(), blockTexture(ModBlocks.PELARGONIUM.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_PELARGONIUM.get(), models().singleTexture("potted_pelargonium", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.PELARGONIUM.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.PERCE_NEIGE.get(), models().cross(blockTexture(ModBlocks.PERCE_NEIGE.get()).getPath(), blockTexture(ModBlocks.PERCE_NEIGE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_PERCE_NEIGE.get(), models().singleTexture("potted_perce_neige", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.PERCE_NEIGE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.PERISTERIA.get(), models().cross(blockTexture(ModBlocks.PERISTERIA.get()).getPath(), blockTexture(ModBlocks.PERISTERIA.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_PERISTERIA.get(), models().singleTexture("potted_peristeria", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.PERISTERIA.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.PERSIL.get(), models().cross(blockTexture(ModBlocks.PERSIL.get()).getPath(), blockTexture(ModBlocks.PERSIL.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_PERSIL.get(), models().singleTexture("potted_persil", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.PERSIL.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.PLANTIN.get(), models().cross(blockTexture(ModBlocks.PLANTIN.get()).getPath(), blockTexture(ModBlocks.PLANTIN.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_PLANTIN.get(), models().singleTexture("potted_plantin", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.PLANTIN.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.POIVRE_NOIR.get(), models().cross(blockTexture(ModBlocks.POIVRE_NOIR.get()).getPath(), blockTexture(ModBlocks.POIVRE_NOIR.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_POIVRE_NOIR.get(), models().singleTexture("potted_poivre_noir", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.POIVRE_NOIR.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.PRIMEVERE.get(), models().cross(blockTexture(ModBlocks.PRIMEVERE.get()).getPath(), blockTexture(ModBlocks.PRIMEVERE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_PRIMEVERE.get(), models().singleTexture("potted_primevere", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.PRIMEVERE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.PRELE.get(), models().cross(blockTexture(ModBlocks.PRELE.get()).getPath(), blockTexture(ModBlocks.PRELE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_PRELE.get(), models().singleTexture("potted_prele", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.PRELE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.RAFFLESIA.get(), models().cross(blockTexture(ModBlocks.RAFFLESIA.get()).getPath(), blockTexture(ModBlocks.RAFFLESIA.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_RAFFLESIA.get(), models().singleTexture("potted_rafflesia", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.RAFFLESIA.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.RAISIN_BLANC.get(), models().cross(blockTexture(ModBlocks.RAISIN_BLANC.get()).getPath(), blockTexture(ModBlocks.RAISIN_BLANC.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_RAISIN_BLANC.get(), models().singleTexture("potted_raisin_blanc", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.RAISIN_BLANC.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.RAISIN_ROUGE.get(), models().cross(blockTexture(ModBlocks.RAISIN_ROUGE.get()).getPath(), blockTexture(ModBlocks.RAISIN_ROUGE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_RAISIN_ROUGE.get(), models().singleTexture("potted_raisin_rouge", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.RAISIN_ROUGE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.RANUNCULUS_FICARIA.get(), models().cross(blockTexture(ModBlocks.RANUNCULUS_FICARIA.get()).getPath(), blockTexture(ModBlocks.RANUNCULUS_FICARIA.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_RANUNCULUS_FICARIA.get(), models().singleTexture("potted_ranunculus_ficaria", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.RANUNCULUS_FICARIA.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.REINE_DES_PRES.get(), models().cross(blockTexture(ModBlocks.REINE_DES_PRES.get()).getPath(), blockTexture(ModBlocks.REINE_DES_PRES.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_REINE_DES_PRES.get(), models().singleTexture("potted_reine_des_pres", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.REINE_DES_PRES.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.RHODODENDRON.get(), models().cross(blockTexture(ModBlocks.RHODODENDRON.get()).getPath(), blockTexture(ModBlocks.RHODODENDRON.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_RHODODENDRON.get(), models().singleTexture("potted_rhododendron", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.RHODODENDRON.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.RICIN.get(), models().cross(blockTexture(ModBlocks.RICIN.get()).getPath(), blockTexture(ModBlocks.RICIN.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_RICIN.get(), models().singleTexture("potted_ricin", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.RICIN.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.ROMARIN.get(), models().cross(blockTexture(ModBlocks.ROMARIN.get()).getPath(), blockTexture(ModBlocks.ROMARIN.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_ROMARIN.get(), models().singleTexture("potted_romarin", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.ROMARIN.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.ROSE_BLANCHE.get(), models().cross(blockTexture(ModBlocks.ROSE_BLANCHE.get()).getPath(), blockTexture(ModBlocks.ROSE_BLANCHE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_ROSE_BLANCHE.get(), models().singleTexture("potted_rose_blanche", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.ROSE_BLANCHE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.SARRACENE.get(), models().cross(blockTexture(ModBlocks.SARRACENE.get()).getPath(), blockTexture(ModBlocks.SARRACENE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_SARRACENE.get(), models().singleTexture("potted_sarracene", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.SARRACENE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.SILENE.get(), models().cross(blockTexture(ModBlocks.SILENE.get()).getPath(), blockTexture(ModBlocks.SILENE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_SILENE.get(), models().singleTexture("potted_silene", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.SILENE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.SUREAU_NOIR.get(), models().cross(blockTexture(ModBlocks.SUREAU_NOIR.get()).getPath(), blockTexture(ModBlocks.SUREAU_NOIR.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_SUREAU_NOIR.get(), models().singleTexture("potted_sureau_noir", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.SUREAU_NOIR.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.SWEAT_WILLIAM_BLANCHE.get(), models().cross(blockTexture(ModBlocks.SWEAT_WILLIAM_BLANCHE.get()).getPath(), blockTexture(ModBlocks.SWEAT_WILLIAM_BLANCHE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_SWEAT_WILLIAM_BLANCHE.get(), models().singleTexture("potted_sweat_william_blanche", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.SWEAT_WILLIAM_BLANCHE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.SWEAT_WILLIAM_ROSE.get(), models().cross(blockTexture(ModBlocks.SWEAT_WILLIAM_ROSE.get()).getPath(), blockTexture(ModBlocks.SWEAT_WILLIAM_ROSE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_SWEAT_WILLIAM_ROSE.get(), models().singleTexture("potted_sweat_william_rose", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.SWEAT_WILLIAM_ROSE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.THYM.get(), models().cross(blockTexture(ModBlocks.THYM.get()).getPath(), blockTexture(ModBlocks.THYM.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_THYM.get(), models().singleTexture("potted_thym", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.THYM.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.THEIER.get(), models().cross(blockTexture(ModBlocks.THEIER.get()).getPath(), blockTexture(ModBlocks.THEIER.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_THEIER.get(), models().singleTexture("potted_theier", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.THEIER.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.UVULAIRES.get(), models().cross(blockTexture(ModBlocks.UVULAIRES.get()).getPath(), blockTexture(ModBlocks.UVULAIRES.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_UVULAIRES.get(), models().singleTexture("potted_uvulaires", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.UVULAIRES.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.VIOLETTE.get(), models().cross(blockTexture(ModBlocks.VIOLETTE.get()).getPath(), blockTexture(ModBlocks.VIOLETTE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_VIOLETTE.get(), models().singleTexture("potted_violette", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.VIOLETTE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.WEIGELA.get(), models().cross(blockTexture(ModBlocks.WEIGELA.get()).getPath(), blockTexture(ModBlocks.WEIGELA.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_WEIGELA.get(), models().singleTexture("potted_weigela", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.WEIGELA.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.YUCCA.get(), models().cross(blockTexture(ModBlocks.YUCCA.get()).getPath(), blockTexture(ModBlocks.YUCCA.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_YUCCA.get(), models().singleTexture("potted_yucca", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.YUCCA.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.ZINNIA.get(), models().cross(blockTexture(ModBlocks.ZINNIA.get()).getPath(), blockTexture(ModBlocks.ZINNIA.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_ZINNIA.get(), models().singleTexture("potted_zinnia", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.ZINNIA.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.AGARICUS_BISPORUS.get(), models().cross(blockTexture(ModBlocks.AGARICUS_BISPORUS.get()).getPath(), blockTexture(ModBlocks.AGARICUS_BISPORUS.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_AGARICUS_BISPORUS.get(), models().singleTexture("potted_agaricus_bisporus", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.AGARICUS_BISPORUS.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.AMANITE_DES_CESARS.get(), models().cross(blockTexture(ModBlocks.AMANITE_DES_CESARS.get()).getPath(), blockTexture(ModBlocks.AMANITE_DES_CESARS.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_AMANITE_DES_CESARS.get(), models().singleTexture("potted_amanite_des_cesars", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.AMANITE_DES_CESARS.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.BOLET_DE_SATAN.get(), models().cross(blockTexture(ModBlocks.BOLET_DE_SATAN.get()).getPath(), blockTexture(ModBlocks.BOLET_DE_SATAN.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_BOLET_DE_SATAN.get(), models().singleTexture("potted_bolet_de_satan", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.BOLET_DE_SATAN.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.CALICE_DE_LA_MORT.get(), models().cross(blockTexture(ModBlocks.CALICE_DE_LA_MORT.get()).getPath(), blockTexture(ModBlocks.CALICE_DE_LA_MORT.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_CALICE_DE_LA_MORT.get(), models().singleTexture("potted_calice_de_la_mort", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.CALICE_DE_LA_MORT.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.CHANTERELLE.get(), models().cross(blockTexture(ModBlocks.CHANTERELLE.get()).getPath(), blockTexture(ModBlocks.CHANTERELLE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_CHANTERELLE.get(), models().singleTexture("potted_chanterelle", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.CHANTERELLE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.COPRIN.get(), models().cross(blockTexture(ModBlocks.COPRIN.get()).getPath(), blockTexture(ModBlocks.COPRIN.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_COPRIN.get(), models().singleTexture("potted_coprin", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.COPRIN.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.CORDYCEPS.get(), models().cross(blockTexture(ModBlocks.CORDYCEPS.get()).getPath(), blockTexture(ModBlocks.CORDYCEPS.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_CORDYCEPS.get(), models().singleTexture("potted_cordyceps", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.CORDYCEPS.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.CORTIANIRE_SI_JOLI.get(), models().cross(blockTexture(ModBlocks.CORTIANIRE_SI_JOLI.get()).getPath(), blockTexture(ModBlocks.CORTIANIRE_SI_JOLI.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_CORTIANIRE_SI_JOLI.get(), models().singleTexture("potted_cortianire_si_joli", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.CORTIANIRE_SI_JOLI.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.COULEMELLE.get(), models().cross(blockTexture(ModBlocks.COULEMELLE.get()).getPath(), blockTexture(ModBlocks.COULEMELLE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_COULEMELLE.get(), models().singleTexture("potted_coulemelle", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.COULEMELLE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.CRINIERE_DE_LION.get(), models().cross(blockTexture(ModBlocks.CRINIERE_DE_LION.get()).getPath(), blockTexture(ModBlocks.CRINIERE_DE_LION.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_CRINIERE_DE_LION.get(), models().singleTexture("potted_criniere_de_lion", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.CRINIERE_DE_LION.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.CUDONIA_CIRCINAN.get(), models().cross(blockTexture(ModBlocks.CUDONIA_CIRCINAN.get()).getPath(), blockTexture(ModBlocks.CUDONIA_CIRCINAN.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_CUDONIA_CIRCINAN.get(), models().singleTexture("potted_cudonia_circinan", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.CUDONIA_CIRCINAN.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.CEPE.get(), models().cross(blockTexture(ModBlocks.CEPE.get()).getPath(), blockTexture(ModBlocks.CEPE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_CEPE.get(), models().singleTexture("potted_cepe", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.CEPE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.ENOKI.get(), models().cross(blockTexture(ModBlocks.ENOKI.get()).getPath(), blockTexture(ModBlocks.ENOKI.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_ENOKI.get(), models().singleTexture("potted_enoki", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.ENOKI.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.ENTOMOLE_LIVIDE.get(), models().cross(blockTexture(ModBlocks.ENTOMOLE_LIVIDE.get()).getPath(), blockTexture(ModBlocks.ENTOMOLE_LIVIDE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_ENTOMOLE_LIVIDE.get(), models().singleTexture("potted_entomole_livide", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.ENTOMOLE_LIVIDE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.FAUSSE_MORILLE.get(), models().cross(blockTexture(ModBlocks.FAUSSE_MORILLE.get()).getPath(), blockTexture(ModBlocks.FAUSSE_MORILLE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_FAUSSE_MORILLE.get(), models().singleTexture("potted_fausse_morille", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.FAUSSE_MORILLE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.MAITAKE.get(), models().cross(blockTexture(ModBlocks.MAITAKE.get()).getPath(), blockTexture(ModBlocks.MAITAKE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_MAITAKE.get(), models().singleTexture("potted_maitake", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.MAITAKE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.MARASME_DES_OREADES.get(), models().cross(blockTexture(ModBlocks.MARASME_DES_OREADES.get()).getPath(), blockTexture(ModBlocks.MARASME_DES_OREADES.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_MARASME_DES_OREADES.get(), models().singleTexture("potted_marasme_des_oreades", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.MARASME_DES_OREADES.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.MORILLE.get(), models().cross(blockTexture(ModBlocks.MORILLE.get()).getPath(), blockTexture(ModBlocks.MORILLE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_MORILLE.get(), models().singleTexture("potted_morille", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.MORILLE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.PIED_DE_MOUTON.get(), models().cross(blockTexture(ModBlocks.PIED_DE_MOUTON.get()).getPath(), blockTexture(ModBlocks.PIED_DE_MOUTON.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_PIED_DE_MOUTON.get(), models().singleTexture("potted_pied_de_mouton", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.PIED_DE_MOUTON.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.REISHI.get(), models().cross(blockTexture(ModBlocks.REISHI.get()).getPath(), blockTexture(ModBlocks.REISHI.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_REISHI.get(), models().singleTexture("potted_reishi", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.REISHI.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.ROSE_DES_PRES.get(), models().cross(blockTexture(ModBlocks.ROSE_DES_PRES.get()).getPath(), blockTexture(ModBlocks.ROSE_DES_PRES.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_ROSE_DES_PRES.get(), models().singleTexture("potted_rose_des_pres", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.ROSE_DES_PRES.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.SHIITAKE.get(), models().cross(blockTexture(ModBlocks.SHIITAKE.get()).getPath(), blockTexture(ModBlocks.SHIITAKE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_SHIITAKE.get(), models().singleTexture("potted_shiitake", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.SHIITAKE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.SHIMEJI.get(), models().cross(blockTexture(ModBlocks.SHIMEJI.get()).getPath(), blockTexture(ModBlocks.SHIMEJI.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_SHIMEJI.get(), models().singleTexture("potted_shimeji", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.SHIMEJI.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.TERMITOMYCES_TITAN.get(), models().cross(blockTexture(ModBlocks.TERMITOMYCES_TITAN.get()).getPath(), blockTexture(ModBlocks.TERMITOMYCES_TITAN.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_TERMITOMYCES_TITAN.get(), models().singleTexture("potted_termitomyces_titan", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.TERMITOMYCES_TITAN.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.TROMPETTE_DE_LA_MORT.get(), models().cross(blockTexture(ModBlocks.TROMPETTE_DE_LA_MORT.get()).getPath(), blockTexture(ModBlocks.TROMPETTE_DE_LA_MORT.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_TROMPETTE_DE_LA_MORT.get(), models().singleTexture("potted_trompette_de_la_mort", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.TROMPETTE_DE_LA_MORT.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.CEREUS_HEANKENUS.get(), models().cross(blockTexture(ModBlocks.CEREUS_HEANKENUS.get()).getPath(), blockTexture(ModBlocks.CEREUS_HEANKENUS.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_CEREUS_HEANKENUS.get(), models().singleTexture("potted_cereus_heankenus", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.CEREUS_HEANKENUS.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.FEROCACTUS.get(), models().cross(blockTexture(ModBlocks.FEROCACTUS.get()).getPath(), blockTexture(ModBlocks.FEROCACTUS.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_FEROCACTUS.get(), models().singleTexture("potted_ferocactus", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.FEROCACTUS.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.FEROCACTUS_FLEUR.get(), models().cross(blockTexture(ModBlocks.FEROCACTUS_FLEUR.get()).getPath(), blockTexture(ModBlocks.FEROCACTUS_FLEUR.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_FEROCACTUS_FLEUR.get(), models().singleTexture("potted_ferocactus_fleur", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.FEROCACTUS_FLEUR.get())).renderType("cutout"));

    }
}
