
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elreytacho.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ElReyTachoModBlockEntities {
	private static final List<BlockEntityType<?>> REGISTRY = new ArrayList<>();
	public static final BlockEntityType<?> DARKENED_MATTER = register("el_rey_tacho:darkened_matter", ElReyTachoModBlocks.DARKENED_MATTER,
			DarkenedMatterBlockEntity::new);
	public static final BlockEntityType<?> DARK_SAPLING = register("el_rey_tacho:dark_sapling", ElReyTachoModBlocks.DARK_SAPLING,
			DarkSaplingBlockEntity::new);
	public static final BlockEntityType<?> DARKENED_TABLE = register("el_rey_tacho:darkened_table", ElReyTachoModBlocks.DARKENED_TABLE,
			DarkenedTableBlockEntity::new);

	private static BlockEntityType<?> register(String registryname, Block block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		BlockEntityType<?> blockEntityType = BlockEntityType.Builder.of(supplier, block).build(null).setRegistryName(registryname);
		REGISTRY.add(blockEntityType);
		return blockEntityType;
	}

	@SubscribeEvent
	public static void registerTileEntity(RegistryEvent.Register<BlockEntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new BlockEntityType[0]));
	}
}
