package absolutelyaya.formidulus.damage;

import absolutelyaya.formidulus.Formidulus;
import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.world.World;

public class DamageSources
{
	public static final RegistryKey<DamageType> LANTERN = RegistryKey.of(RegistryKeys.DAMAGE_TYPE, Formidulus.identifier("lantern"));
	public static final RegistryKey<DamageType> CLAW = RegistryKey.of(RegistryKeys.DAMAGE_TYPE, Formidulus.identifier("claw"));
	public static final RegistryKey<DamageType> SACRIFICE = RegistryKey.of(RegistryKeys.DAMAGE_TYPE, Formidulus.identifier("sacrifice"));
	public static final RegistryKey<DamageType> SOUL = RegistryKey.of(RegistryKeys.DAMAGE_TYPE, Formidulus.identifier("soul"));
	public static final RegistryKey<DamageType> TRAMPLE = RegistryKey.of(RegistryKeys.DAMAGE_TYPE, Formidulus.identifier("trample"));
	public static final RegistryKey<DamageType> SCORCH = RegistryKey.of(RegistryKeys.DAMAGE_TYPE, Formidulus.identifier("scorch"));
	
	public static DamageSource get(World world, RegistryKey<DamageType> type)
	{
		return new DamageSource(world.getRegistryManager().get(RegistryKeys.DAMAGE_TYPE).entryOf(type));
	}
	
	public static DamageSource get(World world, RegistryKey<DamageType> type, Entity attacker)
	{
		return new DamageSource(world.getRegistryManager().get(RegistryKeys.DAMAGE_TYPE).entryOf(type), attacker);
	}
	
	public static DamageSource get(World world, RegistryKey<DamageType> type, Entity source, Entity attacker)
	{
		return new DamageSource(world.getRegistryManager().get(RegistryKeys.DAMAGE_TYPE).entryOf(type), source, attacker);
	}
}
