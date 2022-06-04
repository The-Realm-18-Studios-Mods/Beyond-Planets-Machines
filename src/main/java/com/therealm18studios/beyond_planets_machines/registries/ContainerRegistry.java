package com.therealm18studios.beyond_planets_machines.registries;

import com.therealm18studios.beyond_planets_machines.BeyondPlanetsMachines;
import com.therealm18studios.beyond_planets_machines.guis.screens.oxygenbubbledistributor.*;
import com.therealm18studios.beyond_planets_machines.guis.screens.solarpanels.*;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ContainerRegistry {

    public static final DeferredRegister<MenuType<?>> SCREENS = DeferredRegister.create(ForgeRegistries.CONTAINERS, BeyondPlanetsMachines.MODID);


    /** Solar Panels */
    public static final RegistryObject<MenuType<SolarPanelT1Gui.GuiContainer>> SOLAR_PANEL_T1_GUI = SCREENS.register("solar_panel_t1_gui", () -> new MenuType(new SolarPanelT1Gui.GuiContainerFactory()));
    public static final RegistryObject<MenuType<SolarPanelT2Gui.GuiContainer>> SOLAR_PANEL_T2_GUI = SCREENS.register("solar_panel_t2_gui", () -> new MenuType(new SolarPanelT2Gui.GuiContainerFactory()));
    public static final RegistryObject<MenuType<SolarPanelT3Gui.GuiContainer>> SOLAR_PANEL_T3_GUI = SCREENS.register("solar_panel_t3_gui", () -> new MenuType(new SolarPanelT3Gui.GuiContainerFactory()));
    public static final RegistryObject<MenuType<SolarPanelT4Gui.GuiContainer>> SOLAR_PANEL_T4_GUI = SCREENS.register("solar_panel_t4_gui", () -> new MenuType(new SolarPanelT4Gui.GuiContainerFactory()));

    /** Oxygen Bubble Distributor */
    public static final RegistryObject<MenuType<SolarPanelT1Gui.GuiContainer>> OXYGEN_BUBBLE_DISTRIBUTOR_T1_GUI = SCREENS.register("oxygen_bubble_distributor_t1_gui", () -> new MenuType(new OxygenBubbleDistributorT1Gui.GuiContainerFactory()));
    public static final RegistryObject<MenuType<SolarPanelT2Gui.GuiContainer>> OXYGEN_BUBBLE_DISTRIBUTOR_T2_GUI = SCREENS.register("oxygen_bubble_distributor_t2_gui", () -> new MenuType(new OxygenBubbleDistributorT2Gui.GuiContainerFactory()));
//    public static final RegistryObject<MenuType<SolarPanelT3Gui.GuiContainer>> OXYGEN_BUBBLE_DISTRIBUTOR_T3_GUI = SCREENS.register("oxygen_bubble_distributor_t3_gui", () -> new MenuType(new OxygenBubbleDistributorT3Gui.GuiContainerFactory()));
//    public static final RegistryObject<MenuType<SolarPanelT4Gui.GuiContainer>> OXYGEN_BUBBLE_DISTRIBUTOR_T4_GUI = SCREENS.register("oxygen_bubble_distributor_t4_gui", () -> new MenuType(new OxygenBubbleDistributorT4Gui.GuiContainerFactory()));
}
