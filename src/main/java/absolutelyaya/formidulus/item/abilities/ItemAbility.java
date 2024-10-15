package absolutelyaya.formidulus.item.abilities;

import absolutelyaya.formidulus.Formidulus;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;

import java.util.ArrayList;
import java.util.List;

public abstract class ItemAbility
{
	protected static final Style STYLE = Style.EMPTY.withItalic(false).withColor(Formatting.GRAY);
	
	public abstract String getName();
	
	public String getTranslationKey()
	{
		return "item-ability." + Formidulus.MOD_ID + "." + getName();
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
	
	public void onUse(ItemStack stack, LivingEntity user, Hand hand, TypedActionResult<ItemStack> result)
	{
	
	}
	
	public void onUseOnBlock(ItemStack stack, ItemUsageContext context, ActionResult result)
	{
	
	}
	
	public void onUseOnEntity(ItemStack stack, PlayerEntity user, LivingEntity target, Hand hand, ActionResult result)
	{
	
	}
}
