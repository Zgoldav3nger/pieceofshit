
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elreytacho.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ElReyTachoModFeatures {
	private static final Map<Feature<?>, FeatureRegistration> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(DarkMatterFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DarkMatterFeature.GENERATE_BIOMES,
				DarkMatterFeature.CONFIGURED_FEATURE));
		REGISTRY.put(DarkMatterWoodFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				DarkMatterWoodFeature.GENERATE_BIOMES, DarkMatterWoodFeature.CONFIGURED_FEATURE));
		REGISTRY.put(DarksoilFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DarksoilFeature.GENERATE_BIOMES,
				DarksoilFeature.CONFIGURED_FEATURE));
		REGISTRY.put(DarkenedMatterFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				DarkenedMatterFeature.GENERATE_BIOMES, DarkenedMatterFeature.CONFIGURED_FEATURE));
		REGISTRY.put(DarkenedLeavesFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				DarkenedLeavesFeature.GENERATE_BIOMES, DarkenedLeavesFeature.CONFIGURED_FEATURE));
		REGISTRY.put(DarkCabinFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, DarkCabinFeature.GENERATE_BIOMES,
				DarkCabinFeature.CONFIGURED_FEATURE));
		REGISTRY.put(OroshiOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, OroshiOreFeature.GENERATE_BIOMES,
				OroshiOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(Darkmattertree1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Darkmattertree1Feature.GENERATE_BIOMES, Darkmattertree1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(DarkcabinnotrareFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				DarkcabinnotrareFeature.GENERATE_BIOMES, DarkcabinnotrareFeature.CONFIGURED_FEATURE));
		REGISTRY.put(Darkcabinnotrare2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Darkcabinnotrare2Feature.GENERATE_BIOMES, Darkcabinnotrare2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Darkmattercabin2witherskeletonsFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Darkmattercabin2witherskeletonsFeature.GENERATE_BIOMES, Darkmattercabin2witherskeletonsFeature.CONFIGURED_FEATURE));
		REGISTRY.put(NetherbreakinFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				NetherbreakinFeature.GENERATE_BIOMES, NetherbreakinFeature.CONFIGURED_FEATURE));
		REGISTRY.put(CitrineOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CitrineOreFeature.GENERATE_BIOMES,
				CitrineOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(IcyMatterFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, IcyMatterFeature.GENERATE_BIOMES,
				IcyMatterFeature.CONFIGURED_FEATURE));
	}

	@SubscribeEvent
	public static void registerFeature(RegistryEvent.Register<Feature<?>> event) {
		event.getRegistry().registerAll(REGISTRY.keySet().toArray(new Feature[0]));
		REGISTRY.forEach((feature, registration) -> Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, feature.getRegistryName(),
				registration.configuredFeature()));
	}

	@Mod.EventBusSubscriber
	private static class BiomeFeatureLoader {
		@SubscribeEvent
		public static void addFeatureToBiomes(BiomeLoadingEvent event) {
			for (FeatureRegistration registration : REGISTRY.values()) {
				if (registration.biomes() == null || registration.biomes().contains(event.getName())) {
					event.getGeneration().getFeatures(registration.stage()).add(() -> registration.configuredFeature());
				}
			}
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			ConfiguredFeature<?, ?> configuredFeature) {
	}
}
