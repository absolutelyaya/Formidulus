package absolutelyaya.formidulus.mixin;

import absolutelyaya.formidulus.item.ExpandableLoreItem;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(ExpandableLoreItem.class)
public class ClientLoreItemMixin
{
	@ModifyReturnValue(remap = false, method = "Labsolutelyaya/formidulus/item/ExpandableLoreItem;shouldDisplayLore()Z", at = @At("RETURN"))
	boolean modifyShouldDisplayLore(boolean original)
	{
		return InputUtil.isKeyPressed(MinecraftClient.getInstance().getWindow().getHandle(), GLFW.GLFW_KEY_LEFT_SHIFT) ||
					   InputUtil.isKeyPressed(MinecraftClient.getInstance().getWindow().getHandle(), GLFW.GLFW_KEY_RIGHT_SHIFT);
	}
}
