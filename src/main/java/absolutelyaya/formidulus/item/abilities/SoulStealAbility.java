package absolutelyaya.formidulus.item.abilities;

import absolutelyaya.formidulus.damage.DamageSources;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.text.MutableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

public class SoulStealAbility extends VampirismAbility
{
	public SoulStealAbility(Identifier id)
	{
		super(id);
	}
	
	@Override
	public MutableText getNameText()
	{
		return super.getNameText().setStyle(STYLE.withColor(Formatting.AQUA));
	}
	
	@Override
	public int getDescriptionLines()
	{
		return 3;
	}
	
	@Override
	public void onDamageEntity(ItemStack stack, LivingEntity attacker, DamageSource source, float damage, LivingEntity target)
	{
		if(source.isOf(DamageSources.SOUL))
			return;
		super.onDamageEntity(stack, attacker, source, damage, target);
		target.timeUntilRegen = 0;
		target.damage(DamageSources.get(attacker.getWorld(), DamageSources.SOUL, attacker), 2);
	}
	
	@Override
	protected float getHealMultiplier()
	{
		return 0.4f;
	}
}
