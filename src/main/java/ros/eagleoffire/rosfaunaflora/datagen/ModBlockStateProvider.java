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
        // Register blockstate variants
        getVariantBuilder(ModBlocks.EDELWEISS.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("edelweiss", blockTexture(ModBlocks.EDELWEISS.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_EDELWEISS.get(), models().singleTexture("potted_edelweiss", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.EDELWEISS.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.ACHILEE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("achilee", blockTexture(ModBlocks.ACHILEE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_ACHILEE.get(), models().singleTexture("potted_achilee", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.ACHILEE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.AIL_DES_OURS.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("ail_des_ours", blockTexture(ModBlocks.AIL_DES_OURS.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_AIL_DES_OURS.get(), models().singleTexture("potted_ail_des_ours", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.AIL_DES_OURS.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.AMARYLLIS_JAUNE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("amaryllis_jaune", blockTexture(ModBlocks.AMARYLLIS_JAUNE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_AMARYLLIS_JAUNE.get(), models().singleTexture("potted_amaryllis_jaune", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.AMARYLLIS_JAUNE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.AMARYLLIS_ROUGE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("amaryllis_rouge", blockTexture(ModBlocks.AMARYLLIS_ROUGE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_AMARYLLIS_ROUGE.get(), models().singleTexture("potted_amaryllis_rouge", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.AMARYLLIS_ROUGE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.ANETH.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("aneth", blockTexture(ModBlocks.ANETH.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_ANETH.get(), models().singleTexture("potted_aneth", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.ANETH.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.ANIS.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("anis", blockTexture(ModBlocks.ANIS.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_ANIS.get(), models().singleTexture("potted_anis", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.ANIS.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.ARNICA.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("arnica", blockTexture(ModBlocks.ARNICA.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_ARNICA.get(), models().singleTexture("potted_arnica", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.ARNICA.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.ASTRAGALE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("astragale", blockTexture(ModBlocks.ASTRAGALE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_ASTRAGALE.get(), models().singleTexture("potted_astragale", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.ASTRAGALE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.AUBEPINE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("aubepine", blockTexture(ModBlocks.AUBEPINE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_AUBEPINE.get(), models().singleTexture("potted_aubepine", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.AUBEPINE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.BAPTISTA.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("baptista", blockTexture(ModBlocks.BAPTISTA.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_BAPTISTA.get(), models().singleTexture("potted_baptista", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.BAPTISTA.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.BELLADONE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("belladone", blockTexture(ModBlocks.BELLADONE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_BELLADONE.get(), models().singleTexture("potted_belladone", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.BELLADONE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.BENOITE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("benoite", blockTexture(ModBlocks.BENOITE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_BENOITE.get(), models().singleTexture("potted_benoite", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.BENOITE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.BERCE_GEANTE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("berce_geante", blockTexture(ModBlocks.BERCE_GEANTE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_BERCE_GEANTE.get(), models().singleTexture("potted_berce_geante", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.BERCE_GEANTE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.BOIS_JOLI.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("bois_joli", blockTexture(ModBlocks.BOIS_JOLI.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_BOIS_JOLI.get(), models().singleTexture("potted_bois_joli", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.BOIS_JOLI.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.BRUYERE_LOTR.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("bruyere_lotr", blockTexture(ModBlocks.BRUYERE_LOTR.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_BRUYERE_LOTR.get(), models().singleTexture("potted_bruyere_lotr", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.BRUYERE_LOTR.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.CAFEIER.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("cafeier", blockTexture(ModBlocks.CAFEIER.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_CAFEIER.get(), models().singleTexture("potted_cafeier", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.CAFEIER.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.CALENDULA.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("calendula", blockTexture(ModBlocks.CALENDULA.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_CALENDULA.get(), models().singleTexture("potted_calendula", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.CALENDULA.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.CAMELIA.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("camelia", blockTexture(ModBlocks.CAMELIA.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_CAMELIA.get(), models().singleTexture("potted_camelia", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.CAMELIA.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.CAPUCINE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("capucine", blockTexture(ModBlocks.CAPUCINE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_CAPUCINE.get(), models().singleTexture("potted_capucine", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.CAPUCINE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.CIGUE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("cigue", blockTexture(ModBlocks.CIGUE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_CIGUE.get(), models().singleTexture("potted_cigue", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.CIGUE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.CISTE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("ciste", blockTexture(ModBlocks.CISTE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_CISTE.get(), models().singleTexture("potted_ciste", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.CISTE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.CORRIANDRE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("corriandre", blockTexture(ModBlocks.CORRIANDRE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_CORRIANDRE.get(), models().singleTexture("potted_corriandre", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.CORRIANDRE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.COREOPSIS.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("coreopsis", blockTexture(ModBlocks.COREOPSIS.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_COREOPSIS.get(), models().singleTexture("potted_coreopsis", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.COREOPSIS.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.DIGITALE_POURPRE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("digitale_pourpre", blockTexture(ModBlocks.DIGITALE_POURPRE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_DIGITALE_POURPRE.get(), models().singleTexture("potted_digitale_pourpre", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.DIGITALE_POURPRE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.DRACULA_SIMIA.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("dracula_simia", blockTexture(ModBlocks.DRACULA_SIMIA.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_DRACULA_SIMIA.get(), models().singleTexture("potted_dracula_simia", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.DRACULA_SIMIA.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.ESTRAGON.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("estragon", blockTexture(ModBlocks.ESTRAGON.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_ESTRAGON.get(), models().singleTexture("potted_estragon", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.ESTRAGON.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.ETOILE_DE_NOEL.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("etoile_de_noel", blockTexture(ModBlocks.ETOILE_DE_NOEL.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_ETOILE_DE_NOEL.get(), models().singleTexture("potted_etoile_de_noel", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.ETOILE_DE_NOEL.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.EUPHORBE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("euphorbe", blockTexture(ModBlocks.EUPHORBE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_EUPHORBE.get(), models().singleTexture("potted_euphorbe", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.EUPHORBE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.FRITILLAIRE_PINTADE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("fritillaire_pintade", blockTexture(ModBlocks.FRITILLAIRE_PINTADE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_FRITILLAIRE_PINTADE.get(), models().singleTexture("potted_fritillaire_pintade", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.FRITILLAIRE_PINTADE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.GAILLET_GRATTERON.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("gaillet_gratteron", blockTexture(ModBlocks.GAILLET_GRATTERON.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_GAILLET_GRATTERON.get(), models().singleTexture("potted_gaillet_gratteron", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.GAILLET_GRATTERON.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.GINSENG.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("ginseng", blockTexture(ModBlocks.GINSENG.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_GINSENG.get(), models().singleTexture("potted_ginseng", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.GINSENG.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.HOUBLON.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("houblon", blockTexture(ModBlocks.HOUBLON.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_HOUBLON.get(), models().singleTexture("potted_houblon", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.HOUBLON.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.HOUX.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("houx", blockTexture(ModBlocks.HOUX.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_HOUX.get(), models().singleTexture("potted_houx", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.HOUX.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.IRIS_BLEU.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("iris_bleu", blockTexture(ModBlocks.IRIS_BLEU.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_IRIS_BLEU.get(), models().singleTexture("potted_iris_bleu", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.IRIS_BLEU.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.JACINTHE_DES_BOIS_LOTR.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("jacinthe_des_bois_lotr", blockTexture(ModBlocks.JACINTHE_DES_BOIS_LOTR.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_JACINTHE_DES_BOIS_LOTR.get(), models().singleTexture("potted_jacinthe_des_bois_lotr", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.JACINTHE_DES_BOIS_LOTR.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.JONQUILLE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("jonquille", blockTexture(ModBlocks.JONQUILLE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_JONQUILLE.get(), models().singleTexture("potted_jonquille", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.JONQUILLE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.LAVENDE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("lavende", blockTexture(ModBlocks.LAVENDE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_LAVENDE.get(), models().singleTexture("potted_lavende", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.LAVENDE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.LIERRE_TERRESTRE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("lierre_terrestre", blockTexture(ModBlocks.LIERRE_TERRESTRE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_LIERRE_TERRESTRE.get(), models().singleTexture("potted_lierre_terrestre", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.LIERRE_TERRESTRE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.LYCORIS_RADIATA.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("lycoris_radiata", blockTexture(ModBlocks.LYCORIS_RADIATA.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_LYCORIS_RADIATA.get(), models().singleTexture("potted_lycoris_radiata", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.LYCORIS_RADIATA.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.MAUVE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("mauve", blockTexture(ModBlocks.MAUVE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_MAUVE.get(), models().singleTexture("potted_mauve", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.MAUVE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.MENTHE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("menthe", blockTexture(ModBlocks.MENTHE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_MENTHE.get(), models().singleTexture("potted_menthe", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.MENTHE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.MUGUET.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("muguet", blockTexture(ModBlocks.MUGUET.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_MUGUET.get(), models().singleTexture("potted_muguet", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.MUGUET.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.MUSCARI.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("muscari", blockTexture(ModBlocks.MUSCARI.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_MUSCARI.get(), models().singleTexture("potted_muscari", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.MUSCARI.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.MYOSOTIS.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("myosotis", blockTexture(ModBlocks.MYOSOTIS.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_MYOSOTIS.get(), models().singleTexture("potted_myosotis", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.MYOSOTIS.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.MYRTILLE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("myrtille", blockTexture(ModBlocks.MYRTILLE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_MYRTILLE.get(), models().singleTexture("potted_myrtille", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.MYRTILLE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.MELISSE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("melisse", blockTexture(ModBlocks.MELISSE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_MELISSE.get(), models().singleTexture("potted_melisse", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.MELISSE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.NICOTINIA_TABACUM.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("nicotinia_tabacum", blockTexture(ModBlocks.NICOTINIA_TABACUM.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_NICOTINIA_TABACUM.get(), models().singleTexture("potted_nicotinia_tabacum", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.NICOTINIA_TABACUM.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.NOISETTE_DE_TERRE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("noisette_de_terre", blockTexture(ModBlocks.NOISETTE_DE_TERRE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_NOISETTE_DE_TERRE.get(), models().singleTexture("potted_noisette_de_terre", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.NOISETTE_DE_TERRE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.ORCHIDEE_ANGE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("orchidee_ange", blockTexture(ModBlocks.ORCHIDEE_ANGE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_ORCHIDEE_ANGE.get(), models().singleTexture("potted_orchidee_ange", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.ORCHIDEE_ANGE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.ORCHIDEE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("orchidee", blockTexture(ModBlocks.ORCHIDEE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_ORCHIDEE.get(), models().singleTexture("potted_orchidee", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.ORCHIDEE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.ORTIE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("ortie", blockTexture(ModBlocks.ORTIE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_ORTIE.get(), models().singleTexture("potted_ortie", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.ORTIE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.OSEILLE_SAUVAGE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("oseille_sauvage", blockTexture(ModBlocks.OSEILLE_SAUVAGE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_OSEILLE_SAUVAGE.get(), models().singleTexture("potted_oseille_sauvage", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.OSEILLE_SAUVAGE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.OXALIS_JAUNE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("oxalis_jaune", blockTexture(ModBlocks.OXALIS_JAUNE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_OXALIS_JAUNE.get(), models().singleTexture("potted_oxalis_jaune", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.OXALIS_JAUNE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.PELARGONIUM.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("pelargonium", blockTexture(ModBlocks.PELARGONIUM.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_PELARGONIUM.get(), models().singleTexture("potted_pelargonium", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.PELARGONIUM.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.PERCE_NEIGE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("perce_neige", blockTexture(ModBlocks.PERCE_NEIGE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_PERCE_NEIGE.get(), models().singleTexture("potted_perce_neige", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.PERCE_NEIGE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.PERISTERIA.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("peristeria", blockTexture(ModBlocks.PERISTERIA.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_PERISTERIA.get(), models().singleTexture("potted_peristeria", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.PERISTERIA.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.PERSIL.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("persil", blockTexture(ModBlocks.PERSIL.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_PERSIL.get(), models().singleTexture("potted_persil", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.PERSIL.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.PLANTIN.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("plantin", blockTexture(ModBlocks.PLANTIN.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_PLANTIN.get(), models().singleTexture("potted_plantin", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.PLANTIN.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.POIVRE_NOIR.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("poivre_noir", blockTexture(ModBlocks.POIVRE_NOIR.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_POIVRE_NOIR.get(), models().singleTexture("potted_poivre_noir", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.POIVRE_NOIR.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.PRIMEVERE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("primevere", blockTexture(ModBlocks.PRIMEVERE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_PRIMEVERE.get(), models().singleTexture("potted_primevere", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.PRIMEVERE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.PRELE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("prele", blockTexture(ModBlocks.PRELE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_PRELE.get(), models().singleTexture("potted_prele", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.PRELE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.RAFFLESIA.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("rafflesia", blockTexture(ModBlocks.RAFFLESIA.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_RAFFLESIA.get(), models().singleTexture("potted_rafflesia", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.RAFFLESIA.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.RAISIN_BLANC.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("raisin_blanc", blockTexture(ModBlocks.RAISIN_BLANC.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_RAISIN_BLANC.get(), models().singleTexture("potted_raisin_blanc", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.RAISIN_BLANC.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.RAISIN_ROUGE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("raisin_rouge", blockTexture(ModBlocks.RAISIN_ROUGE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_RAISIN_ROUGE.get(), models().singleTexture("potted_raisin_rouge", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.RAISIN_ROUGE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.RANUNCULUS_FICARIA.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("ranunculus_ficaria", blockTexture(ModBlocks.RANUNCULUS_FICARIA.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_RANUNCULUS_FICARIA.get(), models().singleTexture("potted_ranunculus_ficaria", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.RANUNCULUS_FICARIA.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.REINE_DES_PRES.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("reine_des_pres", blockTexture(ModBlocks.REINE_DES_PRES.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_REINE_DES_PRES.get(), models().singleTexture("potted_reine_des_pres", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.REINE_DES_PRES.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.RHODODENDRON.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("rhododendron", blockTexture(ModBlocks.RHODODENDRON.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_RHODODENDRON.get(), models().singleTexture("potted_rhododendron", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.RHODODENDRON.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.RICIN.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("ricin", blockTexture(ModBlocks.RICIN.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_RICIN.get(), models().singleTexture("potted_ricin", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.RICIN.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.ROMARIN.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("romarin", blockTexture(ModBlocks.ROMARIN.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_ROMARIN.get(), models().singleTexture("potted_romarin", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.ROMARIN.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.ROSE_BLANCHE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("rose_blanche", blockTexture(ModBlocks.ROSE_BLANCHE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_ROSE_BLANCHE.get(), models().singleTexture("potted_rose_blanche", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.ROSE_BLANCHE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.SARRACENE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("sarracene", blockTexture(ModBlocks.SARRACENE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_SARRACENE.get(), models().singleTexture("potted_sarracene", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.SARRACENE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.SILENE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("silene", blockTexture(ModBlocks.SILENE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_SILENE.get(), models().singleTexture("potted_silene", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.SILENE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.SUREAU_NOIR.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("sureau_noir", blockTexture(ModBlocks.SUREAU_NOIR.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_SUREAU_NOIR.get(), models().singleTexture("potted_sureau_noir", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.SUREAU_NOIR.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.SWEAT_WILLIAM_BLANCHE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("sweat_william_blanche", blockTexture(ModBlocks.SWEAT_WILLIAM_BLANCHE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_SWEAT_WILLIAM_BLANCHE.get(), models().singleTexture("potted_sweat_william_blanche", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.SWEAT_WILLIAM_BLANCHE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.SWEAT_WILLIAM_ROSE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("sweat_william_rose", blockTexture(ModBlocks.SWEAT_WILLIAM_ROSE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_SWEAT_WILLIAM_ROSE.get(), models().singleTexture("potted_sweat_william_rose", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.SWEAT_WILLIAM_ROSE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.THYM.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("thym", blockTexture(ModBlocks.THYM.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_THYM.get(), models().singleTexture("potted_thym", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.THYM.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.THEIER.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("theier", blockTexture(ModBlocks.THEIER.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_THEIER.get(), models().singleTexture("potted_theier", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.THEIER.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.UVULAIRES.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("uvulaires", blockTexture(ModBlocks.UVULAIRES.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_UVULAIRES.get(), models().singleTexture("potted_uvulaires", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.UVULAIRES.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.VIOLETTE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("violette", blockTexture(ModBlocks.VIOLETTE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_VIOLETTE.get(), models().singleTexture("potted_violette", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.VIOLETTE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.WEIGELA.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("weigela", blockTexture(ModBlocks.WEIGELA.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_WEIGELA.get(), models().singleTexture("potted_weigela", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.WEIGELA.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.YUCCA.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("yucca", blockTexture(ModBlocks.YUCCA.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_YUCCA.get(), models().singleTexture("potted_yucca", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.YUCCA.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.ZINNIA.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("zinnia", blockTexture(ModBlocks.ZINNIA.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_ZINNIA.get(), models().singleTexture("potted_zinnia", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.ZINNIA.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.AGARICUS_BISPORUS.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("agaricus_bisporus", blockTexture(ModBlocks.AGARICUS_BISPORUS.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_AGARICUS_BISPORUS.get(), models().singleTexture("potted_agaricus_bisporus", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.AGARICUS_BISPORUS.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.AMANITE_DES_CESARS.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("amanite_des_cesars", blockTexture(ModBlocks.AMANITE_DES_CESARS.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_AMANITE_DES_CESARS.get(), models().singleTexture("potted_amanite_des_cesars", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.AMANITE_DES_CESARS.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.BOLET_DE_SATAN.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("bolet_de_satan", blockTexture(ModBlocks.BOLET_DE_SATAN.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_BOLET_DE_SATAN.get(), models().singleTexture("potted_bolet_de_satan", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.BOLET_DE_SATAN.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.CALICE_DE_LA_MORT.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("calice_de_la_mort", blockTexture(ModBlocks.CALICE_DE_LA_MORT.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_CALICE_DE_LA_MORT.get(), models().singleTexture("potted_calice_de_la_mort", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.CALICE_DE_LA_MORT.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.CHANTERELLE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("chanterelle", blockTexture(ModBlocks.CHANTERELLE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_CHANTERELLE.get(), models().singleTexture("potted_chanterelle", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.CHANTERELLE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.COPRIN.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("coprin", blockTexture(ModBlocks.COPRIN.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_COPRIN.get(), models().singleTexture("potted_coprin", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.COPRIN.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.CORDYCEPS.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("cordyceps", blockTexture(ModBlocks.CORDYCEPS.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_CORDYCEPS.get(), models().singleTexture("potted_cordyceps", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.CORDYCEPS.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.CORTIANIRE_SI_JOLI.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("cortianire_si_joli", blockTexture(ModBlocks.CORTIANIRE_SI_JOLI.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_CORTIANIRE_SI_JOLI.get(), models().singleTexture("potted_cortianire_si_joli", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.CORTIANIRE_SI_JOLI.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.COULEMELLE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("coulemelle", blockTexture(ModBlocks.COULEMELLE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_COULEMELLE.get(), models().singleTexture("potted_coulemelle", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.COULEMELLE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.CRINIERE_DE_LION.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("criniere_de_lion", blockTexture(ModBlocks.CRINIERE_DE_LION.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_CRINIERE_DE_LION.get(), models().singleTexture("potted_criniere_de_lion", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.CRINIERE_DE_LION.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.CUDONIA_CIRCINAN.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("cudonia_circinan", blockTexture(ModBlocks.CUDONIA_CIRCINAN.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_CUDONIA_CIRCINAN.get(), models().singleTexture("potted_cudonia_circinan", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.CUDONIA_CIRCINAN.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.CEPE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("cepe", blockTexture(ModBlocks.CEPE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_CEPE.get(), models().singleTexture("potted_cepe", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.CEPE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.ENOKI.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("enoki", blockTexture(ModBlocks.ENOKI.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_ENOKI.get(), models().singleTexture("potted_enoki", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.ENOKI.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.ENTOMOLE_LIVIDE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("entomole_livide", blockTexture(ModBlocks.ENTOMOLE_LIVIDE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_ENTOMOLE_LIVIDE.get(), models().singleTexture("potted_entomole_livide", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.ENTOMOLE_LIVIDE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.FAUSSE_MORILLE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("fausse_morille", blockTexture(ModBlocks.FAUSSE_MORILLE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_FAUSSE_MORILLE.get(), models().singleTexture("potted_fausse_morille", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.FAUSSE_MORILLE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.MAITAKE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("maitake", blockTexture(ModBlocks.MAITAKE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_MAITAKE.get(), models().singleTexture("potted_maitake", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.MAITAKE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.MARASME_DES_OREADES.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("marasme_des_oreades", blockTexture(ModBlocks.MARASME_DES_OREADES.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_MARASME_DES_OREADES.get(), models().singleTexture("potted_marasme_des_oreades", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.MARASME_DES_OREADES.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.MORILLE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("morille", blockTexture(ModBlocks.MORILLE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_MORILLE.get(), models().singleTexture("potted_morille", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.MORILLE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.PIED_DE_MOUTON.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("pied_de_mouton", blockTexture(ModBlocks.PIED_DE_MOUTON.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_PIED_DE_MOUTON.get(), models().singleTexture("potted_pied_de_mouton", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.PIED_DE_MOUTON.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.REISHI.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("reishi", blockTexture(ModBlocks.REISHI.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_REISHI.get(), models().singleTexture("potted_reishi", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.REISHI.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.ROSE_DES_PRES.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("rose_des_pres", blockTexture(ModBlocks.ROSE_DES_PRES.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_ROSE_DES_PRES.get(), models().singleTexture("potted_rose_des_pres", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.ROSE_DES_PRES.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.SHIITAKE.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("shiitake", blockTexture(ModBlocks.SHIITAKE.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_SHIITAKE.get(), models().singleTexture("potted_shiitake", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.SHIITAKE.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.SHIMEJI.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("shimeji", blockTexture(ModBlocks.SHIMEJI.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_SHIMEJI.get(), models().singleTexture("potted_shimeji", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.SHIMEJI.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.TERMITOMYCES_TITAN.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("termitomyces_titan", blockTexture(ModBlocks.TERMITOMYCES_TITAN.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_TERMITOMYCES_TITAN.get(), models().singleTexture("potted_termitomyces_titan", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.TERMITOMYCES_TITAN.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.TROMPETTE_DE_LA_MORT.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("trompette_de_la_mort", blockTexture(ModBlocks.TROMPETTE_DE_LA_MORT.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_TROMPETTE_DE_LA_MORT.get(), models().singleTexture("potted_trompette_de_la_mort", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.TROMPETTE_DE_LA_MORT.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.CEREUS_HEANKENUS.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("cereus_heankenus", blockTexture(ModBlocks.CEREUS_HEANKENUS.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_CEREUS_HEANKENUS.get(), models().singleTexture("potted_cereus_heankenus", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.CEREUS_HEANKENUS.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.FEROCACTUS.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("ferocactus", blockTexture(ModBlocks.FEROCACTUS.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_FEROCACTUS.get(), models().singleTexture("potted_ferocactus", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.FEROCACTUS.get())).renderType("cutout"));

        getVariantBuilder(ModBlocks.FEROCACTUS_FLEUR.get())
                .partialState().with(Fauna.HARVESTABLE, true).modelForState().modelFile(models()
                        .cross("ferocactus_fleur", blockTexture(ModBlocks.FEROCACTUS_FLEUR.get()))
                        .renderType("cutout")).addModel()
                .partialState().with(Fauna.HARVESTABLE, false).modelForState().modelFile(models()
                        .cross("plante_unharvestable", modLoc("block/plante_unharvestable"))
                        .renderType("cutout")).addModel();
        simpleBlockWithItem(ModBlocks.POTTED_FEROCACTUS_FLEUR.get(), models().singleTexture("potted_ferocactus_fleur", new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.FEROCACTUS_FLEUR.get())).renderType("cutout"));
    }
}
