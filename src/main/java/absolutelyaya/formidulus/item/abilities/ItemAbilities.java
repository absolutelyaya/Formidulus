package absolutelyaya.formidulus.item.abilities;

import absolutelyaya.formidulus.Formidulus;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

public class ItemAbilities
{
	public static final Map<Identifier, ItemAbility> map = new HashMap<>();
	
	public static final ItemAbility NONE = register(new ItemAbility(Formidulus.identifier("none")));
	public static final ItemAbility VAMPIRISM = register(new VampirismAbility(Formidulus.identifier("vampirism")));
	public static final ItemAbility SOULSTEAL = register(new SoulStealAbility(Formidulus.identifier("soulsteal")));
	public static final ItemAbility HEALWAVE = register(new HealwaveAbility(Formidulus.identifier("healwave")));
	
	public static ItemAbility register(ItemAbility ability)
	{
		map.put(ability.id, ability);
		return ability;
	}
	
	public static @Nullable ItemAbility getFromId(Identifier id)
	{
		return map.get(id);
	}
}
