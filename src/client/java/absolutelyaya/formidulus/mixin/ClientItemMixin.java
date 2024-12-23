package absolutelyaya.formidulus.mixin;

import absolutelyaya.formidulus.datagen.Lang;
import absolutelyaya.formidulus.item.components.AbilityComponent;
import absolutelyaya.formidulus.item.components.AccessoryComponent;
import absolutelyaya.formidulus.item.components.DependencyInfoComponent;
import absolutelyaya.formidulus.item.components.ExpandableLoreComponent;
import absolutelyaya.formidulus.registries.DataComponentRegistry;
import absolutelyaya.formidulus.registries.SoundRegistry;
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
public abstract class ClientItemMixin
{
	@Inject(method = "appendTooltip", at = @At("TAIL"))
	void afterAppendToolTip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type, CallbackInfo ci)
	{
		if(stack.getComponents().contains(DataComponentRegistry.DEPENDENCY_INFO))
		{
			DependencyInfoComponent dependencyComponent = stack.getComponents().get(DataComponentRegistry.DEPENDENCY_INFO);
			if(dependencyComponent != null)
				dependencyComponent.appendTooltip(context, tooltip::add, type);
			return;
		}
		boolean displayLore = (stack.contains(DataComponentRegistry.EXPANDABLE_LORE)) && shouldDisplayLore();
		AbilityComponent abilityComponent = null;
		
		if(stack.contains(DataComponentRegistry.ABILITY))
		{
			abilityComponent = stack.getComponents().getOrDefault(DataComponentRegistry.ABILITY, AbilityComponent.DEFAULT);
			tooltip.add(abilityComponent.ability().getNameText());
		}
		
		if(stack.contains(DataComponentRegistry.ACCESSORY) && !displayLore)
		{
			AccessoryComponent component = stack.getComponents().getOrDefault(DataComponentRegistry.ACCESSORY, AccessoryComponent.DEFAULT);
			int accessoryMode = component.activeMode() % component.modes().size();
			tooltip.add(Text.translatable(Lang.ACCESSORY_MODE_PREFIX,
					Text.translatable("item.accessory_mode." + component.modes().get(accessoryMode))));
			tooltip.add(Text.translatable(Lang.ACCESSORY_MODE_HINT).setStyle(Style.EMPTY.withColor(Formatting.GRAY)));
		}
		
		boolean hasAbilityDescription = abilityComponent != null && abilityComponent.ability().getDescriptionLines() > 0;
		if(!stack.contains(DataComponentRegistry.EXPANDABLE_LORE) && !hasAbilityDescription)
			return;
		if(shouldDisplayLore())
		{
			if(hasAbilityDescription)
			{
				tooltip.addAll(abilityComponent.ability().makeDescriptionLines());
				tooltip.add(Text.empty()); //line break
			}
			if(stack.getComponents().get(DataComponentRegistry.EXPANDABLE_LORE) instanceof ExpandableLoreComponent component)
				tooltip.addAll(component.lines());
		}
		else
			tooltip.add(Text.translatable(Lang.EXPANDABLE_LORE_HINT).setStyle(Style.EMPTY.withColor(Formatting.GRAY)));
	}
	
	@Inject(method = "onClicked", at = @At("TAIL"), cancellable = true)
	void onClicked(ItemStack stack, ItemStack otherStack, Slot slot, ClickType clickType, PlayerEntity player, StackReference cursorStackReference, CallbackInfoReturnable<Boolean> cir)
	{
		if(!otherStack.isEmpty() || clickType == ClickType.LEFT)
			return;
		if(!stack.contains(DataComponentRegistry.ACCESSORY))
			return;
		cir.setReturnValue(true);
		if(stack.get(DataComponentRegistry.ACCESSORY) instanceof AccessoryComponent component)
			stack.set(DataComponentRegistry.ACCESSORY, component.cycle());
		if(!player.getWorld().isClient && slot.id >= 5 && slot.id <= 8)
		{
			RegistryEntry<SoundEvent> sound = RegistryEntry.of(SoundRegistry.ACCESSORY_CHANGE_MODE);
			if(stack.getItem() instanceof Equipment equipment)
				sound = equipment.getEquipSound();
			player.getWorld().playSound(null, player.getX(), player.getY(), player.getZ(), sound,
					SoundCategory.PLAYERS, 1f, 1f, player.getRandom().nextLong());
		}
	}
	
	@Unique boolean shouldDisplayLore()
	{
		long windowHandle = MinecraftClient.getInstance().getWindow().getHandle();
		return InputUtil.isKeyPressed(windowHandle, GLFW.GLFW_KEY_LEFT_SHIFT) || InputUtil.isKeyPressed(windowHandle, GLFW.GLFW_KEY_RIGHT_SHIFT);
	}
}
