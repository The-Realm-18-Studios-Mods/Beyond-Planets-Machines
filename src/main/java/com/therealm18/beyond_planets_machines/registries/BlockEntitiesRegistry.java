package com.therealm18.beyond_planets_machines.registries;

import com.therealm18.beyond_planets_machines.BeyondPlanetsMachines;
import com.therealm18.beyond_planets_machines.machines.solar.tile.SolarPanelT1BlockEntity;
import com.therealm18.beyond_planets_machines.machines.solar.tile.SolarPanelT2BlockEntity;
import com.therealm18.beyond_planets_machines.machines.solar.tile.SolarPanelT3BlockEntity;
import com.therealm18.beyond_planets_machines.machines.solar.tile.SolarPanelT4BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockEntitiesRegistry {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, BeyondPlanetsMachines.MODID);

    public static final RegistryObject<BlockEntityType<?>> SOLAR_PANEL_T1_BLOCK_ENTITY = BLOCK_ENTITIES.register("solar_panel_t1", () -> BlockEntityType.Builder.of(SolarPanelT1BlockEntity::new, BlocksRegistry.SOLAR_PANEL_BLOCK_T1.get()).build(null));
    public static final RegistryObject<BlockEntityType<?>> SOLAR_PANEL_T2_BLOCK_ENTITY = BLOCK_ENTITIES.register("solar_panel_t2", () -> BlockEntityType.Builder.of(SolarPanelT2BlockEntity::new, BlocksRegistry.SOLAR_PANEL_BLOCK_T2.get()).build(null));
    public static final RegistryObject<BlockEntityType<?>> SOLAR_PANEL_T3_BLOCK_ENTITY = BLOCK_ENTITIES.register("solar_panel_t3", () -> BlockEntityType.Builder.of(SolarPanelT3BlockEntity::new, BlocksRegistry.SOLAR_PANEL_BLOCK_T3.get()).build(null));
    public static final RegistryObject<BlockEntityType<?>> SOLAR_PANEL_T4_BLOCK_ENTITY = BLOCK_ENTITIES.register("solar_panel_t4", () -> BlockEntityType.Builder.of(SolarPanelT4BlockEntity::new, BlocksRegistry.SOLAR_PANEL_BLOCK_T4.get()).build(null));
}
