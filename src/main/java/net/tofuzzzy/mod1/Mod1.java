package net.tofuzzzy.mod1;

import com.mojang.logging.LogUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file

// test comment. End me

@Mod(Mod1.MOD_ID)
public class Mod1 {
    public static final String MOD_ID = "mod1";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public Mod1()
    {
        // Register the setup method for modloading
        //FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(itemheld.class);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
   // @SubscribeEvent
    public void TrigerMyShit(){
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        eventBus.addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(itemheld.class);

        MinecraftForge.EVENT_BUS.register(this);
    }

}
