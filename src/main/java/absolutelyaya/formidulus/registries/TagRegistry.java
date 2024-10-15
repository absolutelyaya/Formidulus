package absolutelyaya.formidulus.registries;

import absolutelyaya.formidulus.Formidulus;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

public class TagRegistry
{
	public static final TagKey<StatusEffect> DEER_EFFECTS = TagKey.of(RegistryKeys.STATUS_EFFECT, Formidulus.identifier("deer"));
}
