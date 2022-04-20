
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elreytacho.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ElReyTachoModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block DARK_MATTER = register(new DarkMatterBlock());
	public static final Block DARK_MATTER_WOOD = register(new DarkMatterWoodBlock());
	public static final Block DARKSOIL = register(new DarksoilBlock());
	public static final Block DARK_MATTER_DIMENSION_PORTAL = register(new DarkMatterDimensionPortalBlock());
	public static final Block DARKENED_MATTER = register(new DarkenedMatterBlock());
	public static final Block DARK_SAPLING = register(new DarkSaplingBlock());
	public static final Block DARKENED_LEAVES = register(new DarkenedLeavesBlock());
	public static final Block DARKENED_OAK = register(new DarkenedOakBlock());
	public static final Block OROSHI_ORE = register(new OroshiOreBlock());
	public static final Block CITRINE_ORE = register(new CitrineOreBlock());
	public static final Block COMPACTED_CITRINE = register(new CompactedCitrineBlock());
	public static final Block ICY_MATTER = register(new IcyMatterBlock());
	public static final Block DARKENED_TABLE = register(new DarkenedTableBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			DarkenedMatterBlock.registerRenderLayer();
			DarkSaplingBlock.registerRenderLayer();
			DarkenedLeavesBlock.registerRenderLayer();
			IcyMatterBlock.registerRenderLayer();
		}

		@SubscribeEvent
		public static void blockColorLoad(ColorHandlerEvent.Block event) {
			DarkSaplingBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(ColorHandlerEvent.Item event) {
			DarkSaplingBlock.itemColorLoad(event);
		}
	}
}
