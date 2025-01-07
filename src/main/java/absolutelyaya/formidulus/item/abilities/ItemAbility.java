package absolutelyaya.formidulus.item.abilities;

import absolutelyaya.formidulus.item.components.AbilityComponent;
import absolutelyaya.formidulus.registries.DataComponentRegistry;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.*;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ItemAbility
{
	public static final PacketCodec<ByteBuf, ItemAbility> PACKET_CODEC = PacketCodec.tuple(
			Identifier.PACKET_CODEC,
			i -> i.id,
			PacketCodecs.BOOL,
			i -> i.active,
			ItemAbility::new
	);
	protected static final Style STYLE = Style.EMPTY.withItalic(false).withColor(Formatting.GRAY);
	public final Identifier id;
	
	public boolean active;
	
	public ItemAbility(Identifier id, boolean active)
	{
		this.id = id;
		this.active = active;
	}
	
	public ItemAbility(Identifier id)
	{
		this.id = id;
		active = false;
	}
	
	public static boolean hasAbility(ItemStack stack, @NotNull ItemAbility ability)
	{
		AbilityComponent comp = stack.getComponents().getOrDefault(DataComponentRegistry.ABILITY, null);
		if(comp == null)
			return false;
		return ability.equals(comp.ability());
	}
	
	public boolean isActive()
	{
		return active;
	}
	
	public void setActive(boolean b)
	{
		this.active = b;
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
	
	public void onTickUsing(ItemStack stack, LivingEntity user, Hand hand)
	{
	
	}
	
	public void onStopUsing(ItemStack stack, LivingEntity user, Hand hand)
	{
	
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
