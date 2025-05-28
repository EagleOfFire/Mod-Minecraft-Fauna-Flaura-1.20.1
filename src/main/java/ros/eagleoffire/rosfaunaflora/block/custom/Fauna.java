package ros.eagleoffire.rosfaunaflora.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.util.RandomSource;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.TickingBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;
import ros.eagleoffire.rosfaunaflora.block.ModBlockEntities;

public class Fauna extends BushBlock implements EntityBlock {
    public enum RarityLevel {
        COMMUN("commun"),
        RARE("rare"),
        TRES_RARE("tres_rare"),
        INTROUVABLE("introuvable");

        private final String name;

        RarityLevel(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static final BooleanProperty HARVESTABLE = BooleanProperty.create("harvestable");
    private final RarityLevel rarity;
    private final RegistryObject<BlockEntityType<FaunaBlockEntity>> blockEntityType;

    public Fauna(Properties properties, RarityLevel rarity, RegistryObject<BlockEntityType<FaunaBlockEntity>> blockEntityType) {
        super(properties.randomTicks());
        this.rarity = rarity;
        this.blockEntityType = blockEntityType;
        this.registerDefaultState(this.stateDefinition.any().setValue(HARVESTABLE, true));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(HARVESTABLE);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player,
                                 InteractionHand hand, BlockHitResult hitResult) {
        if (level.isClientSide) {
            return InteractionResult.SUCCESS;
        }

        if (hand == InteractionHand.MAIN_HAND && state.getValue(HARVESTABLE)) {
            popResource(level, pos, new ItemStack(this.asItem()));
            BlockState newState = state.setValue(HARVESTABLE, false);
            level.setBlock(pos, newState, 3);
            //scheduleRegrow(level, pos, this.getRarity());
            BlockEntity blockEntity = level.getBlockEntity(pos);
            if (blockEntity instanceof FaunaBlockEntity faunaEntity) {
                faunaEntity.setRegrowTime(getRegrowTicks(level, rarity));
            }
            level.playSound(null, pos, SoundEvents.GRASS_BREAK, SoundSource.BLOCKS, 1.0F, 1.0F);
            return InteractionResult.CONSUME;
        }

        return InteractionResult.PASS;
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
        if (!level.isClientSide && type == blockEntityType.get()) {
            return (lvl, pos, blockState, blockEntity) ->
                    FaunaBlockEntity.tick((ServerLevel) lvl, pos, blockState, (FaunaBlockEntity) blockEntity);
        }
        return null;
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new FaunaBlockEntity(blockEntityType.get(), pos, state);
    }

    private int getRegrowTicks(Level level, RarityLevel rarity) {
        return switch (rarity) {
            case COMMUN -> 2 * 72000 + level.random.nextInt(4 * 72000); // 2-6 hours
            case RARE -> 38 * 72000 + level.random.nextInt(20 * 72000);
            case TRES_RARE -> 66 * 72000 + level.random.nextInt(40 * 72000);
            case INTROUVABLE -> 138 * 72000 + level.random.nextInt(50 * 72000);
        };
    }


    public RarityLevel getRarity() {
        return rarity;
    }
}

