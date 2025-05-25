package ros.eagleoffire.rosfaunaflora.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import ros.eagleoffire.rosfaunaflora.ROSFaunaFlora;
import ros.eagleoffire.rosfaunaflora.block.ModBlocks;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ROSFaunaFlora.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
