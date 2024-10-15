package absolutelyaya.formidulus.registries;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.effects.DarknessStatusEffect;
import absolutelyaya.formidulus.effects.ReverenceStatusEffect;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class StatusEffectRegistry
{
	public static final RegistryEntry<StatusEffect> REVERENCE = Registry.registerReference(Registries.STATUS_EFFECT,
			Formidulus.identifier("reverence"), new ReverenceStatusEffect().addAttributeModifier(
					EntityAttributes.GENERIC_MOVEMENT_SPEED, Formidulus.identifier("effect.reverence"), -0.5f,
					EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
	
	public static final RegistryEntry<StatusEffect> DARKNESS = Registry.registerReference(Registries.STATUS_EFFECT,
			Formidulus.identifier("darkness"), new DarknessStatusEffect());
	
	public static void register()
	{
	
	}
}
