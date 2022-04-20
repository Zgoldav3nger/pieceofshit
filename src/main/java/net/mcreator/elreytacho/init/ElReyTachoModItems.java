
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elreytacho.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ElReyTachoModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item DARK_MATTER = register(ElReyTachoModBlocks.DARK_MATTER, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item DARK_MATTER_WOOD = register(ElReyTachoModBlocks.DARK_MATTER_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item DARKSOIL = register(ElReyTachoModBlocks.DARKSOIL, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item DARK_MATTER_AMBIENTLOOP = register(new DarkMatterAmbientloopItem());
	public static final Item DARK_MATTER_DIMENSION = register(new DarkMatterDimensionItem());
	public static final Item DARKENED_MATTER = register(ElReyTachoModBlocks.DARKENED_MATTER, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item DARK_SAPLING = register(ElReyTachoModBlocks.DARK_SAPLING, CreativeModeTab.TAB_DECORATIONS);
	public static final Item DARKENED_LEAVES = register(ElReyTachoModBlocks.DARKENED_LEAVES, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item DARKENED_OAK = register(ElReyTachoModBlocks.DARKENED_OAK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item DARK_STICK = register(new DarkStickItem());
	public static final Item ABYSSAL_WOODEN_PICKAXE = register(new AbyssalWoodenPickaxeItem());
	public static final Item OROSHI_ORE = register(ElReyTachoModBlocks.OROSHI_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item OROSHI_ESSENCE = register(new OroshiEssenceItem());
	public static final Item OROSHI_PICKAXE = register(new OroshiPickaxeItem());
	public static final Item RAW_CITRINE = register(new RawCitrineItem());
	public static final Item CITRINE_ORE = register(ElReyTachoModBlocks.CITRINE_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item ICY_DISK = register(new IcyDiskItem());
	public static final Item COMPACTED_CITRINE = register(ElReyTachoModBlocks.COMPACTED_CITRINE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item CITRINE_SWORD = register(new CitrineSwordItem());
	public static final Item ICY_MATTER = register(ElReyTachoModBlocks.ICY_MATTER, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item CITRINE_PIACKAXE = register(new CitrinePiackaxeItem());
	public static final Item ICY_MATTERED_SNOWBALL = register(new IcyMatteredSnowballItem());
	public static final Item DARKENED_TABLE = register(ElReyTachoModBlocks.DARKENED_TABLE, CreativeModeTab.TAB_DECORATIONS);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
