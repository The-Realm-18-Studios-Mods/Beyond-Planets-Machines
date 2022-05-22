package com.therealm18studios.beyond_planets_machines.registries;

import com.therealm18studios.beyond_planets_machines.BeyondPlanetsMachines;
import com.therealm18studios.beyond_planets_machines.itemgroups.ItemGroups;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemsRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BeyondPlanetsMachines.MODID);

    //Solar Panels
    public static final RegistryObject<BlockItem> SOLAR_PANEL_T1_ITEM = ITEMS.register("solar_panel_t1", () -> new BlockItem(BlocksRegistry.SOLAR_PANEL_BLOCK_T1.get(), new Item.Properties().tab(ItemGroups.TAB_MACHINES)));
    public static final RegistryObject<BlockItem> SOLAR_PANEL_T2_ITEM = ITEMS.register("solar_panel_t2", () -> new BlockItem(BlocksRegistry.SOLAR_PANEL_BLOCK_T2.get(), new Item.Properties().tab(ItemGroups.TAB_MACHINES)));
    public static final RegistryObject<BlockItem> SOLAR_PANEL_T3_ITEM = ITEMS.register("solar_panel_t3", () -> new BlockItem(BlocksRegistry.SOLAR_PANEL_BLOCK_T3.get(), new Item.Properties().tab(ItemGroups.TAB_MACHINES)));
    public static final RegistryObject<BlockItem> SOLAR_PANEL_T4_ITEM = ITEMS.register("solar_panel_t4", () -> new BlockItem(BlocksRegistry.SOLAR_PANEL_BLOCK_T4.get(), new Item.Properties().tab(ItemGroups.TAB_MACHINES)));
}
