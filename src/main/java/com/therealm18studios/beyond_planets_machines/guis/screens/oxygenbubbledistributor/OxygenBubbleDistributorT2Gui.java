package com.therealm18studios.beyond_planets_machines.guis.screens.oxygenbubbledistributor;

import com.therealm18studios.beyond_planets_machines.machines.oxygenbubbledistributor.tile.OxygenBubbleDistributorT2BlockEntity;
import com.therealm18studios.beyond_planets_machines.registries.ContainerRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.SlotItemHandler;
import net.minecraftforge.network.IContainerFactory;
import net.mrscauthd.beyond_earth.guis.helper.ContainerHelper;
import net.mrscauthd.beyond_earth.machines.tile.OxygenMakingBlockEntity;

public class OxygenBubbleDistributorT2Gui {

    public static class GuiContainerFactory implements IContainerFactory<GuiContainer> {
        public GuiContainer create(int id, Inventory inv, FriendlyByteBuf extraData) {
            BlockPos pos = extraData.readBlockPos();
            OxygenBubbleDistributorT2BlockEntity blockEntity = (OxygenBubbleDistributorT2BlockEntity) inv.player.level.getBlockEntity(pos);
            return new GuiContainer(id, inv, blockEntity);
        }
    }

    public static class GuiContainer extends AbstractContainerMenu {
        private OxygenBubbleDistributorT2BlockEntity blockEntity;

        public GuiContainer(int id, Inventory inv, OxygenBubbleDistributorT2BlockEntity blockEntity) {
            super(ContainerRegistry.OXYGEN_BUBBLE_DISTRIBUTOR_T2_GUI.get(), id);
            this.blockEntity = blockEntity;

            IItemHandlerModifiable internal = blockEntity.getItemHandler();
            this.addSlot(new SlotItemHandler(internal, OxygenMakingBlockEntity.SLOT_INPUT_SOURCE, 26, 22));
            this.addSlot(new SlotItemHandler(internal, OxygenMakingBlockEntity.SLOT_INPUT_SINK, 26, 52));

            ContainerHelper.addInventorySlots(this, inv, 8, 90, this::addSlot);
        }

        public OxygenBubbleDistributorT2BlockEntity getBlockEntity() {
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