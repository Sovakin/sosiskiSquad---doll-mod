
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.sovakin.sosiskisquad.init;

import net.sovakin.sosiskisquad.SosiskisquadMod;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SosiskisquadModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SosiskisquadMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(SosiskisquadModBlocks.DEPOHA.get().asItem());
			tabData.accept(SosiskisquadModBlocks.BABYZARG.get().asItem());
			tabData.accept(SosiskisquadModBlocks.WANG.get().asItem());
			tabData.accept(SosiskisquadModBlocks.VLADROGOVSKY.get().asItem());
			tabData.accept(SosiskisquadModBlocks.KOKOSHKA.get().asItem());
		}
	}
}
