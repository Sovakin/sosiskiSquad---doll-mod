
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.sovakin.sosiskisquad.init;

import net.sovakin.sosiskisquad.block.entity.WangBlockEntity;
import net.sovakin.sosiskisquad.block.entity.VladrogovskyBlockEntity;
import net.sovakin.sosiskisquad.block.entity.KokoshkaBlockEntity;
import net.sovakin.sosiskisquad.block.entity.DepohaBlockEntity;
import net.sovakin.sosiskisquad.block.entity.BabyzargBlockEntity;
import net.sovakin.sosiskisquad.SosiskisquadMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

public class SosiskisquadModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, SosiskisquadMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> DEPOHA = register("depoha", SosiskisquadModBlocks.DEPOHA, DepohaBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BABYZARG = register("babyzarg", SosiskisquadModBlocks.BABYZARG, BabyzargBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WANG = register("wang", SosiskisquadModBlocks.WANG, WangBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> VLADROGOVSKY = register("vladrogovsky", SosiskisquadModBlocks.VLADROGOVSKY, VladrogovskyBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> KOKOSHKA = register("kokoshka", SosiskisquadModBlocks.KOKOSHKA, KokoshkaBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
