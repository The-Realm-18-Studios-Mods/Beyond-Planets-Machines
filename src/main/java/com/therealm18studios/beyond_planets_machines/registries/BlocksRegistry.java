package com.therealm18studios.beyond_planets_machines.registries;

import com.therealm18studios.beyond_planets_machines.BeyondPlanetsMachines;
import com.therealm18studios.beyond_planets_machines.machines.solar.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlocksRegistry {

    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BeyondPlanetsMachines.MODID);


    //Solar Panels
    public static RegistryObject<Block> SOLAR_PANEL_BLOCK_T1 = BLOCKS.register("solar_panel_t1", () -> { return new SolarPanelT1Block(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> SOLAR_PANEL_BLOCK_T2 = BLOCKS.register("solar_panel_t2", () -> { return new SolarPanelT2Block(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> SOLAR_PANEL_BLOCK_T3 = BLOCKS.register("solar_panel_t3", () -> { return new SolarPanelT3Block(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> SOLAR_PANEL_BLOCK_T4 = BLOCKS.register("solar_panel_t4", () -> { return new SolarPanelT4Block(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).strength(5f, 1f).requiresCorrectToolForDrops());});
}
