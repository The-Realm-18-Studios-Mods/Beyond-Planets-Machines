package com.therealm18.beyond_planets_machines.machines.solar.tile;

import com.therealm18.beyond_planets_machines.guis.screens.solarpanels.SolarPanelT2Gui;
import com.therealm18.beyond_planets_machines.registries.BlockEntitiesRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.NonNullList;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;
import net.mrscauthd.beyond_earth.machines.tile.GeneratorBlockEntity;
import org.jetbrains.annotations.Nullable;

public class SolarPanelT2BlockEntity extends GeneratorBlockEntity {

    public static int ENERGY_PER_TICK = 320;

    public SolarPanelT2BlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntitiesRegistry.SOLAR_PANEL_T2_BLOCK_ENTITY.get(), pos, state);
    }

    @Override
    protected Component getDefaultName() {
        return null;
    }

    @Override
    public AbstractContainerMenu createMenu(int id, Inventory inventory) {
        return new SolarPanelT2Gui.GuiContainer(id, inventory, this);
    }

    @Override
    protected boolean canGenerateEnergy() {
        return false;
    }

    @Override
    protected void generateEnergy() {

    }

    @Override
    public int getMaxGeneration() {
        return ENERGY_PER_TICK;
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