package com.therealm18studios.beyond_planets_machines.registries;

import com.therealm18studios.beyond_planets_machines.BeyondPlanetsMachines;
import com.therealm18studios.beyond_planets_machines.guis.screens.oxygenbubbledistributor.*;
import com.therealm18studios.beyond_planets_machines.guis.screens.solarpanels.*;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = BeyondPlanetsMachines.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ScreenRegistry {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        MenuScreens.register(ContainerRegistry.SOLAR_PANEL_T1_GUI.get(), SolarPanelT1GuiWindow::new);
        MenuScreens.register(ContainerRegistry.SOLAR_PANEL_T2_GUI.get(), SolarPanelT2GuiWindow::new);
        MenuScreens.register(ContainerRegistry.SOLAR_PANEL_T3_GUI.get(), SolarPanelT3GuiWindow::new);
        MenuScreens.register(ContainerRegistry.SOLAR_PANEL_T4_GUI.get(), SolarPanelT4GuiWindow::new);

//        MenuScreens.register(ContainerRegistry.OXYGEN_BUBBLE_DISTRIBUTOR_T1_GUI.get(), OxygenBubbleDistributorT1GuiWindow::new);
//        MenuScreens.register(ContainerRegistry.OXYGEN_BUBBLE_DISTRIBUTOR_T2_GUI.get(), OxygenBubbleDistributorT2GuiWindow::new);
//        MenuScreens.register(ContainerRegistry.SOLAR_PANEL_T3_GUI.get(), OxygenBubbleDistributorT3GuiWindow::new);
//        MenuScreens.register(ContainerRegistry.SOLAR_PANEL_T4_GUI.get(), OxygenBubbleDistributorT4GuiWindow::new);
    }
}
