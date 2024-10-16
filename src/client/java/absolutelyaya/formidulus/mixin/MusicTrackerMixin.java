package absolutelyaya.formidulus.mixin;

import absolutelyaya.formidulus.FormidulusClient;
import net.minecraft.client.sound.MusicTracker;
import net.minecraft.client.sound.SoundInstance;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MusicTracker.class)
public abstract class MusicTrackerMixin
{
	@Shadow private @Nullable SoundInstance current;
	
	@Shadow public abstract void stop();
	
	@Inject(method = "tick", at = @At("HEAD"), cancellable = true)
	void onTick(CallbackInfo ci)
	{
		if(FormidulusClient.bossMusicHandler.isPlayingMusic())
		{
			if(current != null)
				stop();
			ci.cancel();
		}
	}
}
