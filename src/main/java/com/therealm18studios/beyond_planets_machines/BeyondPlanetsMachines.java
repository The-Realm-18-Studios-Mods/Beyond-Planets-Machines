package com.therealm18studios.beyond_planets_machines;

import com.therealm18studios.beyond_planets_machines.registries.BlockEntitiesRegistry;
import com.therealm18studios.beyond_planets_machines.registries.BlocksRegistry;
import com.therealm18studios.beyond_planets_machines.registries.ItemsRegistry;
import com.therealm18studios.beyond_planets_machines.registries.ScreensRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BeyondPlanetsMachines.MODID)
public class BeyondPlanetsMachines
{
    public static final String MODID = "beyond_planets_machines";

    public BeyondPlanetsMachines() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.register(this);

        ItemsRegistry.ITEMS.register(bus);
        BlocksRegistry.BLOCKS.register(bus);
        BlockEntitiesRegistry.BLOCK_ENTITIES.register(bus);
        ScreensRegistry.SCREENS.register(bus);
    }
}
