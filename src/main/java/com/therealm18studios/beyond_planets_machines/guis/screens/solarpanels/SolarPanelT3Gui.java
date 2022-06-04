package com.therealm18studios.beyond_planets_machines.guis.screens.solarpanels;

import com.therealm18studios.beyond_planets_machines.machines.solar.tile.SolarPanelT3BlockEntity;
import com.therealm18studios.beyond_planets_machines.registries.ContainerRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.network.IContainerFactory;
import net.mrscauthd.beyond_earth.guis.helper.ContainerHelper;

public class SolarPanelT3Gui {

    public static class GuiContainerFactory implements IContainerFactory<GuiContainer> {
        public GuiContainer create(int id, Inventory inv, FriendlyByteBuf extraData) {
            BlockPos pos = extraData.readBlockPos();
            SolarPanelT3BlockEntity blockEntity = (SolarPanelT3BlockEntity) inv.player.level.getBlockEntity(pos);
            return new GuiContainer(id, inv, blockEntity);
        }
    }

    public static class GuiContainer extends AbstractContainerMenu {
        private SolarPanelT3BlockEntity blockEntity;

        public GuiContainer(int id, Inventory inv, SolarPanelT3BlockEntity blockEntity) {
            super(ContainerRegistry.SOLAR_PANEL_T3_GUI.get(), id);
            this.blockEntity = blockEntity;

            ContainerHelper.addInventorySlots(this, inv, 8, 84, this::addSlot);
        }

        public SolarPanelT3BlockEntity getBlockEntity() {
            return this.blockEntity;
        }

        @Override
        public boolean stillValid(Player p_38874_) {
            return !this.getBlockEntity().isRemoved();
        }

        @Override
        public ItemStack quickMoveStack(Player playerIn, int index) {
            return ContainerHelper.transferStackInSlot(this, playerIn, index, this.getBlockEntity(), this::moveItemStackTo);
        }
    }
}