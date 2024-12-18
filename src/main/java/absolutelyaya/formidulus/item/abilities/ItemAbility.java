package absolutelyaya.formidulus.item.abilities;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.*;
import net.minecraft.util.math.Vec3d;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ItemAbility
{
	protected static final Style STYLE = Style.EMPTY.withItalic(false).withColor(Formatting.GRAY);
	public final Identifier id;
	
	public ItemAbility(Identifier id)
	{
		this.id = id;
	}
	
	public String getTranslationKey()
	{
		return "item-ability." + id.getNamespace() + "." + id.getPath();
	}
	
	public int getDescriptionLines()
	{
		return 0;
	}
	
	public List<MutableText> makeDescriptionLines()
	{
		if(getDescriptionLines() == 0)
			return List.of();
		List<MutableText> list = new ArrayList<>();
		for (int i = 0; i < getDescriptionLines(); i++)
			list.add(Text.translatable(getTranslationKey() + ".desc" + i).setStyle(STYLE));
		return list;
	}
	
	public MutableText getNameText()
	{
		return Text.translatable(getTranslationKey()).setStyle(STYLE);
	}
	
	public void onDamageEntity(ItemStack stack, LivingEntity attacker, DamageSource source, float damage, LivingEntity target)
	{
	
	}
	
	public Optional<TypedActionResult<ItemStack>> onUse(ItemStack stack, LivingEntity user, Hand hand, TypedActionResult<ItemStack> result)
	{
		return Optional.empty();
	}
	
	public Optional<ActionResult> onUseOnBlock(ItemStack stack, ItemUsageContext context, ActionResult result)
	{
		return Optional.empty();
	}
	
	public Optional<ActionResult> onUseOnEntity(ItemStack stack, PlayerEntity user, LivingEntity target, Hand hand, ActionResult result)
	{
		return Optional.empty();
	}
	
	public void castActiveAbility(LivingEntity caster, ItemStack stack, Vec3d pos)
	{
	
	}
}
