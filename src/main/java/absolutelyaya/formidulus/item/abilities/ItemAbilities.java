package absolutelyaya.formidulus.item.abilities;

import absolutelyaya.formidulus.Formidulus;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

public class ItemAbilities
{
	public static final Map<Identifier, ItemAbility> map = new HashMap<>();
	
	public static final ItemAbility NONE = register(Formidulus.identifier("none"), new ItemAbility()
	{
		@Override
		public String getName()
		{
			return "none";
		}
	});
	public static final ItemAbility VAMPIRISM = register(Formidulus.identifier("vampirism"), new VampirismAbility());
	
	public static ItemAbility register(Identifier id, ItemAbility ability)
	{
		map.put(id, ability);
		return ability;
	}
	
	public static @Nullable ItemAbility getFromId(Identifier id)
	{
		return map.get(id);
	}
}
