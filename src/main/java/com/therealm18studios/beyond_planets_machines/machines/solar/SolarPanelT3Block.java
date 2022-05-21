package com.therealm18studios.beyond_planets_machines.machines.solar;

import com.therealm18studios.beyond_planets_machines.machines.solar.tile.SolarPanelT3BlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.mrscauthd.beyond_earth.gauge.GaugeTextHelper;
import net.mrscauthd.beyond_earth.gauge.GaugeValueHelper;
import net.mrscauthd.beyond_earth.machines.AbstractMachineBlock;

import java.util.List;

public class SolarPanelT3Block extends AbstractMachineBlock<SolarPanelT3BlockEntity> {

    public SolarPanelT3Block(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack itemstack, BlockGetter level, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, level, list, flag);
        list.add(GaugeTextHelper.buildBlockTooltip(GaugeTextHelper.getGeneratingPerTickText(GaugeValueHelper.getEnergy(SolarPanelT3BlockEntity.ENERGY_PER_TICK))));
    }

    @Override
    public boolean propagatesSkylightDown(BlockState state, BlockGetter level, BlockPos pos) {
        return true;
    }

    @Override
    public SolarPanelT3BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new SolarPanelT3BlockEntity(pos, state);
    }

}