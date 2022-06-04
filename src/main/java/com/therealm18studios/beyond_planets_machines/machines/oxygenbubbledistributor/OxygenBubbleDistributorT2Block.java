package com.therealm18studios.beyond_planets_machines.machines.oxygenbubbledistributor;

import com.therealm18studios.beyond_planets_machines.BeyondPlanetsMachines;
import com.therealm18studios.beyond_planets_machines.machines.oxygenbubbledistributor.tile.OxygenBubbleDistributorT1BlockEntity;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.mrscauthd.beyond_earth.machines.AbstractMachineBlock;

import java.util.List;

public class OxygenBubbleDistributorT2Block extends AbstractMachineBlock<OxygenBubbleDistributorT1BlockEntity> {

    public OxygenBubbleDistributorT2Block(Properties properties) {
        super(properties);
    }

    @Override
    protected boolean useFacing() {
        return true;
    }

    @Override
    protected boolean useLit() {
        return true;
    }

    @Override
    public void appendHoverText(ItemStack itemstack, BlockGetter level, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, level, list, flag);

        int min = OxygenBubbleDistributorT1BlockEntity.RANGE_MIN * 2 + 1;
        int max = OxygenBubbleDistributorT1BlockEntity.RANGE_MAX * 2 + 1;
        list.add(new TranslatableComponent("tooltip." + BeyondPlanetsMachines.MODID + ".oxygen_bubble_distributor_t1", min, max).setStyle(Style.EMPTY.withColor(ChatFormatting.GRAY)));
    }

    @Override
    public OxygenBubbleDistributorT1BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new OxygenBubbleDistributorT1BlockEntity(pos, state);
    }

}