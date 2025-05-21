package ros.eagleoffire.roshud;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ROSFaunaFlora.MODID)
public class ROSFaunaFlora
{
    public static final String MODID = "rosfaunaflora";
    private static final Logger LOGGER = LogUtils.getLogger();

    public ROSFaunaFlora()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
        });
    }
}