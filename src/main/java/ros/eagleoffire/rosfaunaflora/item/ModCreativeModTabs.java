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
                        pOutput.accept(ModItems.EDELWEISS.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
