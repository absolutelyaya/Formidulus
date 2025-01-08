package absolutelyaya.formidulus.mixin.itemability;

import absolutelyaya.formidulus.item.abilities.ItemAbilities;
import absolutelyaya.formidulus.item.abilities.ItemAbility;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.UseAction;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(Item.class)
public class BulwarkItemMixin
{
	@ModifyReturnValue(method = "getUseAction", at = @At("RETURN"))
	UseAction onGetUseAction(UseAction original, @Local(argsOnly = true)ItemStack stack)
	{
		if(ItemAbility.hasAbility(stack, ItemAbilities.BULWARK))
			return UseAction.BLOCK;
		return original;
	}
}
