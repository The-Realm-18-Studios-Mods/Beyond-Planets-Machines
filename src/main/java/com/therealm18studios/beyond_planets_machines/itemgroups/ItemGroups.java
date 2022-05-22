package com.therealm18studios.beyond_planets_machines.itemgroups;

import com.therealm18studios.beyond_planets_machines.registries.ItemsRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

public class ItemGroups {

    public static CreativeModeTab TAB_MACHINES = new CreativeModeTab("beyond_planets_machines.tab_machines") {
        @OnlyIn(Dist.CLIENT)
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemsRegistry.SOLAR_PANEL_T1_ITEM.get(), 1);
        }
    };
}