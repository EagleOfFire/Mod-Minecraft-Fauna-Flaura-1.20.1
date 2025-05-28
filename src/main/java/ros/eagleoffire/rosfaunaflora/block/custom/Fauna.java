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
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;

public class Fauna extends BushBlock {
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

    public Fauna(Properties properties, RarityLevel rarity) {
        super(properties.randomTicks());
        this.rarity = rarity;
        this.registerDefaultState(this.stateDefinition.any().setValue(HARVESTABLE, true));
    }

    public RarityLevel getRarity() {
        return rarity;
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
            scheduleRegrow(level, pos, this.getRarity());
            level.playSound(null, pos, SoundEvents.GRASS_BREAK, SoundSource.BLOCKS, 1.0F, 1.0F);
            return InteractionResult.CONSUME;
        }

        return InteractionResult.PASS;
    }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (!state.getValue(HARVESTABLE)) {
            BlockState newState = state.setValue(HARVESTABLE, true);
            if (!newState.equals(state)) {
                level.setBlock(pos, newState, 3); // 3 = update clients and neighbors
                System.out.println("Tick: growing plant at " + pos);
            }
        }
    }

    public void scheduleRegrow(Level level, BlockPos pos, RarityLevel rarity) {
        if (level instanceof ServerLevel serverLevel) {
            int minHours, maxHours;
            switch (rarity) {
                case COMMUN -> {
                    minHours = 2;
                    maxHours = 6;
                }
                case RARE -> {
                    minHours = 38;
                    maxHours = 58;
                }
                case TRES_RARE -> {
                    minHours = 66;
                    maxHours = 106;
                }
                case INTROUVABLE -> {
                    minHours = 138;
                    maxHours = 188;
                }
                default -> {
                    minHours = 0;
                    maxHours = 0;
                }
            }

            int ticks = (minHours * 72000) + serverLevel.getRandom().nextInt((maxHours - minHours) * 72000);
            serverLevel.scheduleTick(pos, this, ticks);
            System.out.println("Regrowth scheduled in " + ticks + " ticks (" + (ticks / 72000f) + " hours)");

        }
    }
}

