package absolutelyaya.formidulus.registries;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.entities.DeerGodEntity;
import absolutelyaya.formidulus.entities.FireballProjectile;
import absolutelyaya.formidulus.entities.IrrlichtEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.*;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class EntityRegistry
{
	public static final EntityType<DeerGodEntity> DEER_GOD = Registry.register(Registries.ENTITY_TYPE, Formidulus.identifier("deer_god"),
			EntityType.Builder.create(DeerGodEntity::new, SpawnGroup.MONSTER).dimensions(1f, 3.65f).build("deer_god"));
	public static final EntityType<IrrlichtEntity> IRRLICHT = Registry.register(Registries.ENTITY_TYPE, Formidulus.identifier("irrlicht"),
			EntityType.Builder.create(IrrlichtEntity::new, SpawnGroup.MISC).dimensions(0.2f, 0.4f).build("irrlicht"));
	public static final EntityType<FireballProjectile> PUMPKIN = Registry.register(Registries.ENTITY_TYPE, Formidulus.identifier("pumpkin"),
			EntityType.Builder.create(FireballProjectile::new, SpawnGroup.MISC).dimensions(0.4f, 0.4f).build("pumpkin"));
	
	public static void register()
	{
		FabricDefaultAttributeRegistry.register(DEER_GOD, DeerGodEntity.createMobAttributes()
																  .add(EntityAttributes.GENERIC_MAX_HEALTH, 300)
																  .add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, 1)
																  .add(EntityAttributes.GENERIC_ARMOR, 10)
																  .add(EntityAttributes.GENERIC_ARMOR_TOUGHNESS, 5)
																  .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 32));
		FabricDefaultAttributeRegistry.register(IRRLICHT, IrrlichtEntity.createMobAttributes()
																  .add(EntityAttributes.GENERIC_MAX_HEALTH, 1));
	}
}
