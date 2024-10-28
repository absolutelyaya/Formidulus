package absolutelyaya.formidulus.registries;

import absolutelyaya.formidulus.Formidulus;
import net.minecraft.loot.LootTable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

public class FormidableLootTables
{
	public static final RegistryKey<LootTable> CULT_HIDEOUT_HOUSE_CHEST =
			RegistryKey.of(RegistryKeys.LOOT_TABLE, Formidulus.identifier("chests/cult_hideout_house"));
	public static final RegistryKey<LootTable> CULT_HIDEOUT_CAVE_CHEST =
			RegistryKey.of(RegistryKeys.LOOT_TABLE, Formidulus.identifier("chests/cult_hideout_cave"));
	public static final RegistryKey<LootTable> CULT_HIDEOUT_TREE_CHEST =
			RegistryKey.of(RegistryKeys.LOOT_TABLE, Formidulus.identifier("chests/cult_hideout_tree"));
	
	public static void register()
	{
	
	}
}
