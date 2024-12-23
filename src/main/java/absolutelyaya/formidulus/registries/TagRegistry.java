package absolutelyaya.formidulus.registries;

import absolutelyaya.formidulus.Formidulus;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.world.gen.structure.Structure;

public class TagRegistry
{
	public static final TagKey<StatusEffect> DEER_EFFECTS = TagKey.of(RegistryKeys.STATUS_EFFECT, Formidulus.identifier("deer"));
	
	public static final TagKey<Structure> CULT_HIDEOUT = TagKey.of(RegistryKeys.STRUCTURE, Formidulus.identifier("cult_hideout"));
	
	public static final TagKey<DamageType> BOSS_DAMAGE = TagKey.of(RegistryKeys.DAMAGE_TYPE, Formidulus.identifier("boss_damage"));
	public static final TagKey<DamageType> SOUL_DAMAGE = TagKey.of(RegistryKeys.DAMAGE_TYPE, Formidulus.identifier("soul_damage"));
	
	public static final TagKey<Block> PUMPKIN = TagKey.of(RegistryKeys.BLOCK, Formidulus.identifier("pumpkin"));
	
	public static final TagKey<EntityType<?>> JOLLY_MOBS = TagKey.of(RegistryKeys.ENTITY_TYPE, Formidulus.identifier("jolly_mobs"));
}
