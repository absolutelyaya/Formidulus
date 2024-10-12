package absolutelyaya.formidulus.mixin;

import absolutelyaya.formidulus.datagen.Lang;
import absolutelyaya.formidulus.item.components.AccessoryComponent;
import absolutelyaya.formidulus.item.components.ExpandableLoreComponent;
import absolutelyaya.formidulus.registries.DataComponentRegistry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.StackReference;
import net.minecraft.item.Equipment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.screen.slot.Slot;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.ClickType;
import net.minecraft.util.Formatting;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin(Item.class)
public abstract class ItemMixin
{
	@Inject(method = "appendTooltip", at = @At("TAIL"))
	void afterAppendToolTip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type, CallbackInfo ci)
	{
		if(stack.contains(DataComponentRegistry.EXPANDABLE_LORE))
		{
			if(shouldDisplayLore())
			{
				if(stack.getComponents().get(DataComponentRegistry.EXPANDABLE_LORE) instanceof ExpandableLoreComponent component)
					tooltip.addAll(component.lines());
				return;
			}
			else
				tooltip.add(Text.translatable(Lang.EXPANDABLE_LORE_HINT).getWithStyle(Style.EMPTY.withColor(Formatting.GRAY)).getFirst());
		}
		if(stack.contains(DataComponentRegistry.ACCESSORY))
		{
			AccessoryComponent component = stack.getComponents().getOrDefault(DataComponentRegistry.ACCESSORY, AccessoryComponent.DEFAULT);
			int accessoryMode = component.activeMode() % component.modes().size();
			tooltip.add(Text.translatable(Lang.ACCESSORY_MODE_PREFIX,
					Text.translatable("item.accessory_mode." + component.modes().get(accessoryMode))));
			tooltip.add(Text.translatable(Lang.ACCESSORY_MODE_HINT)
								.getWithStyle(Style.EMPTY.withColor(shouldCycleAccessoryMode() ? Formatting.LIGHT_PURPLE : Formatting.GRAY)).getFirst());
		}
	}
	
	@Inject(method = "onClicked", at = @At("TAIL"), cancellable = true)
	void onClicked(ItemStack stack, ItemStack otherStack, Slot slot, ClickType clickType, PlayerEntity player, StackReference cursorStackReference, CallbackInfoReturnable<Boolean> cir)
	{
		if(!shouldCycleAccessoryMode() || !otherStack.isEmpty())
			return;
		cir.setReturnValue(true);
		if(!stack.contains(DataComponentRegistry.ACCESSORY))
			return;
		if(stack.get(DataComponentRegistry.ACCESSORY) instanceof AccessoryComponent component)
			stack.set(DataComponentRegistry.ACCESSORY, component.cycle());
		if(!player.getWorld().isClient && slot.id >= 5 && slot.id <= 8)
		{
			RegistryEntry<SoundEvent> sound = SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
			if(stack.getItem() instanceof Equipment equipment)
				sound = equipment.getEquipSound();
			player.getWorld().playSound(null, player.getX(), player.getY(), player.getZ(), sound,
					SoundCategory.PLAYERS, 1f, 1f, player.getRandom().nextLong());
		}
	}
	
	@Unique boolean shouldCycleAccessoryMode()
	{
		long windowHandle = MinecraftClient.getInstance().getWindow().getHandle();
		return InputUtil.isKeyPressed(windowHandle, GLFW.GLFW_KEY_LEFT_ALT) || InputUtil.isKeyPressed(windowHandle, GLFW.GLFW_KEY_RIGHT_ALT);
	}
	
	@Unique boolean shouldDisplayLore()
	{
		long windowHandle = MinecraftClient.getInstance().getWindow().getHandle();
		return InputUtil.isKeyPressed(windowHandle, GLFW.GLFW_KEY_LEFT_SHIFT) || InputUtil.isKeyPressed(windowHandle, GLFW.GLFW_KEY_RIGHT_SHIFT);
	}
}
