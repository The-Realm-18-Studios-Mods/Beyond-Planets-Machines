package com.therealm18.beyond_planets_machines.machines.solar.tile;

import com.therealm18.beyond_planets_machines.guis.screens.solarpanels.SolarPanelT1Gui;
import com.therealm18.beyond_planets_machines.registries.BlockEntitiesRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.NonNullList;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.Heightmap;
import net.mrscauthd.beyond_earth.machines.tile.GeneratorBlockEntity;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.List;

public class SolarPanelT1BlockEntity extends GeneratorBlockEntity {

    public static int ENERGY_PER_TICK = 40;

    public SolarPanelT1BlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntitiesRegistry.SOLAR_PANEL_T1_BLOCK_ENTITY.get(), pos, state);
    }

    @Override
    protected Component getDefaultName() {
        return null;
    }

    @Override
    public AbstractContainerMenu createMenu(int id, Inventory inventory) {
        return new SolarPanelT1Gui.GuiContainer(id, inventory, this);
    }

    protected int getGenerationInTick() {
        return this.getMaxGeneration();
    }

    @Override
    public int getMaxGeneration() {
        return ENERGY_PER_TICK;
    }

    @Override
    protected boolean canGenerateEnergy() {
        Level level = this.getLevel();
        BlockPos blockPos = this.getBlockPos();

        return level.isDay() && level.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) Math.floor(blockPos.getX()), (int) Math.floor(blockPos.getZ())) <= Math.floor(blockPos.getY()) + 1;
    }

    @Override
    protected void generateEnergy() {
        this.generateEnergy(this.getGenerationInTick());
    }

    @Override
    protected List<Direction> getEjectDirections() {
        List<Direction> list = super.getEjectDirections();
        list.addAll(Arrays.stream(Direction.values()).filter(d -> d != Direction.UP).toList());
        return list;
    }

    @Override
    public int[] getSlotsForFace(Direction p_19238_) {
        return new int[0];
    }

    @Override
    public boolean canPlaceItemThroughFace(int p_19235_, ItemStack p_19236_, @Nullable Direction p_19237_) {
        return false;
    }

    @Override
    public boolean canTakeItemThroughFace(int p_19239_, ItemStack p_19240_, Direction p_19241_) {
        return false;
    }

    @Override
    protected NonNullList<ItemStack> getItems() {
        return null;
    }

    @Override
    protected void setItems(NonNullList<ItemStack> p_59625_) {

    }

    @Override
    public int getContainerSize() {
        return 0;
    }
}