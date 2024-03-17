package com.FuKarl7.bettervanilla;

import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(bettervanilla.MODID)
public class bettervanilla {

    public static final String MODID = "bettervanilla";

    private static final Logger LOGGER = LogUtils.getLogger();


    public bettervanilla() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        //BLOCKS.register(modEventBus);
        //ITEMS.register(modEventBus);
        //CREATIVE_MODE_TABS.register(modEventBus);

    }
}