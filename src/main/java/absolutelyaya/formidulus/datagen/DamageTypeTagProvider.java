package absolutelyaya.formidulus.datagen;

import absolutelyaya.formidulus.damage.DamageSources;
import absolutelyaya.formidulus.registries.TagRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.entity.damage.DamageTypes;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class DamageTypeTagProvider extends FabricTagProvider<DamageType>
{
	public DamageTypeTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
	{
		super(output, RegistryKeys.DAMAGE_TYPE, registriesFuture);
	}
	
	@Override
	protected void configure(RegistryWrapper.WrapperLookup wrapper)
	{
		getOrCreateTagBuilder(TagRegistry.BOSS_DAMAGE).add(DamageSources.CLAW, DamageSources.LANTERN);
		getOrCreateTagBuilder(TagRegistry.SOUL_DAMAGE).add(DamageSources.SOUL);
		getOrCreateTagBuilder(TagRegistry.SHIELD_DISABLING_DAMAGE).add(DamageSources.CLAW, DamageSources.LANTERN, DamageSources.TRAMPLE);
		getOrCreateTagBuilder(TagRegistry.BULWARK_UNBLOCKABLE_DAMAGE)
				.add(DamageTypes.CRAMMING, DamageTypes.MAGIC, DamageTypes.INDIRECT_MAGIC, DamageTypes.DRAGON_BREATH,
						DamageTypes.BAD_RESPAWN_POINT, DamageTypes.GENERIC_KILL, DamageTypes.FLY_INTO_WALL, DamageTypes.FALL,
						DamageTypes.DROWN, DamageTypes.DRY_OUT, DamageTypes.WITHER, DamageTypes.HOT_FLOOR, DamageTypes.FREEZE, DamageTypes.LAVA,
						DamageTypes.IN_WALL, DamageTypes.OUT_OF_WORLD, DamageTypes.OUTSIDE_BORDER, DamageTypes.STARVE, DamageTypes.ON_FIRE);
	}
}
