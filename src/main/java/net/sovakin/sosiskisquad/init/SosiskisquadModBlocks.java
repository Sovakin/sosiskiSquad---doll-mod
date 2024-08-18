
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.sovakin.sosiskisquad.init;

import net.sovakin.sosiskisquad.block.WangBlock;
import net.sovakin.sosiskisquad.block.VladrogovskyBlock;
import net.sovakin.sosiskisquad.block.KokoshkaBlock;
import net.sovakin.sosiskisquad.block.DepohaBlock;
import net.sovakin.sosiskisquad.block.BabyzargBlock;
import net.sovakin.sosiskisquad.SosiskisquadMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class SosiskisquadModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SosiskisquadMod.MODID);
	public static final RegistryObject<Block> DEPOHA = REGISTRY.register("depoha", () -> new DepohaBlock());
	public static final RegistryObject<Block> BABYZARG = REGISTRY.register("babyzarg", () -> new BabyzargBlock());
	public static final RegistryObject<Block> WANG = REGISTRY.register("wang", () -> new WangBlock());
	public static final RegistryObject<Block> VLADROGOVSKY = REGISTRY.register("vladrogovsky", () -> new VladrogovskyBlock());
	public static final RegistryObject<Block> KOKOSHKA = REGISTRY.register("kokoshka", () -> new KokoshkaBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
