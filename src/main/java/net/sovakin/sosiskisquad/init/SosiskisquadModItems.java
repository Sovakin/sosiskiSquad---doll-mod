
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.sovakin.sosiskisquad.init;

import net.sovakin.sosiskisquad.SosiskisquadMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class SosiskisquadModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SosiskisquadMod.MODID);
	public static final RegistryObject<Item> DEPOHA = block(SosiskisquadModBlocks.DEPOHA);
	public static final RegistryObject<Item> BABYZARG = block(SosiskisquadModBlocks.BABYZARG);
	public static final RegistryObject<Item> WANG = block(SosiskisquadModBlocks.WANG);
	public static final RegistryObject<Item> VLADROGOVSKY = block(SosiskisquadModBlocks.VLADROGOVSKY);
	public static final RegistryObject<Item> KOKOSHKA = block(SosiskisquadModBlocks.KOKOSHKA);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
