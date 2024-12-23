package absolutelyaya.formidulus.entities.boss;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.entities.BossEntity;
import absolutelyaya.formidulus.registries.EntityRegistry;
import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public record BossType(Identifier id, List<EntityType<? extends BossEntity>> bossEntities, Class<? extends BossFight> fight, String spawnerModel, boolean requiresSolidFloor)
{
	static final Map<Identifier, BossType> types;
	
	public static final BossType DEER;
	
	public BossType(Identifier id, List<EntityType<? extends BossEntity>> bossEntities, Class<? extends BossFight> fight, String spawnerModel)
	{
		this(id, bossEntities, fight, spawnerModel, true);
	}
	
	public static @Nullable BossType fromId(Identifier id)
	{
		return types.get(id);
	}
	
	public @Nullable BossFight beginFight(BossEntity e, @Nullable UUID id)
	{
		if(e.getWorld().isClient)
			return null;
		try
		{
			return BossFightManager.INSTANCE.beginFight(fight().getConstructor(BossEntity.class, UUID.class).newInstance(e, id));
		}
		catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException exception)
		{
			Formidulus.LOGGER.error("Failed to start Boss Fight of type '{}': {}", this.id, exception);
		}
		return null;
	}
	
	public static Map<Identifier, BossType> getAllTypes()
	{
		return Map.copyOf(types);
	}
	
	public static void init()
	{
		DeerBossFight.init();
	}
	
	static {
		ImmutableMap.Builder<Identifier, BossType> builder = new ImmutableMap.Builder<>();
		DEER = new BossType(Formidulus.identifier("deer"), List.of(EntityRegistry.DEER_GOD), DeerBossFight.class, "boss_spawner_cruor");
		builder.put(DEER.id(), DEER);
		types = builder.build();
	}
}
