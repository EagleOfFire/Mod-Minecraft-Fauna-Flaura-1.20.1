package ros.eagleoffire.rosfaunaflora.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.RegistryObject;
import ros.eagleoffire.rosfaunaflora.block.ModBlockEntities;

public class FaunaBlockEntity extends BlockEntity {
    private long regrowTime = -1;

    public FaunaBlockEntity(BlockEntityType<FaunaBlockEntity> blockEntityType, BlockPos pos, BlockState state) {
        super(blockEntityType, pos, state);
    }

    public void setRegrowTime(long ticksFromNow) {
        if (level != null) {
            this.regrowTime = level.getGameTime() + ticksFromNow;
            setChanged();
        }
    }

    public static void tick(ServerLevel level, BlockPos pos, BlockState state, FaunaBlockEntity entity) {
        if (!level.isClientSide && !state.getValue(Fauna.HARVESTABLE)) {
            if (level.getGameTime() >= entity.regrowTime) {
                level.setBlock(pos, state.setValue(Fauna.HARVESTABLE, true), 3);
                entity.regrowTime = -1;
                level.removeBlockEntity(pos);
            }
        }
    }

    @Override
    public void load(CompoundTag tag) {
        super.load(tag);
        this.regrowTime = tag.getLong("RegrowTime");
    }

    @Override
    protected void saveAdditional(CompoundTag tag) {
        super.saveAdditional(tag);
        tag.putLong("RegrowTime", this.regrowTime);
    }
}
