package absolutelyaya.formidulus.registries;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.block.BigLanternBlockEntity;
import absolutelyaya.formidulus.block.BossSpawnerBlockEntity;
import absolutelyaya.formidulus.block.DeerSkullBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;


public class BlockEntityRegistry
{
	public static final BlockEntityType<DeerSkullBlockEntity> DEER_SKULL = Registry.register(Registries.BLOCK_ENTITY_TYPE, Formidulus.identifier("deer_skull"),
			BlockEntityType.Builder.create(DeerSkullBlockEntity::new, BlockRegistry.DEER_SKULL).build());
	public static final BlockEntityType<BossSpawnerBlockEntity> BOSS_SPAWNER = Registry.register(Registries.BLOCK_ENTITY_TYPE, Formidulus.identifier("boss_spawner"),
			BlockEntityType.Builder.create(BossSpawnerBlockEntity::new, BlockRegistry.BOSS_SPAWNER).build());
	public static final BlockEntityType<BigLanternBlockEntity> BIG_LANTERN = Registry.register(Registries.BLOCK_ENTITY_TYPE, Formidulus.identifier("big_lantern"),
			BlockEntityType.Builder.create(BigLanternBlockEntity::new, BlockRegistry.GREAT_LANTERN).build());
	
	public static void register()
	{
	
	}
}
