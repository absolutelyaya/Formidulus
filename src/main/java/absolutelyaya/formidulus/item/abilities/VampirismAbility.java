package absolutelyaya.formidulus.item.abilities;

import absolutelyaya.formidulus.damage.DamageSources;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.text.MutableText;
import net.minecraft.util.Formatting;

public class VampirismAbility extends ItemAbility
{
	@Override
	public String getName()
	{
		return "vampirism";
	}
	
	@Override
	public MutableText getNameText()
	{
		return super.getNameText().copy().setStyle(STYLE.withColor(Formatting.DARK_RED));
	}
	
	@Override
	public int getDescriptionLines()
	{
		return 1;
	}
	
	@Override
	public void onDamageEntity(ItemStack stack, LivingEntity attacker, DamageSource source, float damage, LivingEntity target)
	{
		if(source.isOf(DamageSources.SACRIFICE))
			attacker.heal(Math.min(damage, target.getMaxHealth()) * getHealMultiplier());
	}
	
	protected float getHealMultiplier()
	{
		return 0.4f;
	}
}
