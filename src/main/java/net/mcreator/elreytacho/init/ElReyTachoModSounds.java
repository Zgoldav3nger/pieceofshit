
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elreytacho.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ElReyTachoModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("el_rey_tacho", "darkrealmtheme"), new SoundEvent(new ResourceLocation("el_rey_tacho", "darkrealmtheme")));
		REGISTRY.put(new ResourceLocation("el_rey_tacho", "insectsdarkrealm"),
				new SoundEvent(new ResourceLocation("el_rey_tacho", "insectsdarkrealm")));
		REGISTRY.put(new ResourceLocation("el_rey_tacho", "iceydark"), new SoundEvent(new ResourceLocation("el_rey_tacho", "iceydark")));
		REGISTRY.put(new ResourceLocation("el_rey_tacho", "icedisk"), new SoundEvent(new ResourceLocation("el_rey_tacho", "icedisk")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
