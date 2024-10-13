package absolutelyaya.formidulus.mixin;

import absolutelyaya.formidulus.registries.BlockRegistry;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.block.BlockState;
import net.minecraft.block.CarvedPumpkinBlock;
import net.minecraft.block.PumpkinBlock;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(PumpkinBlock.class)
public class PumpkinMixin
{
	@WrapOperation(method = "onUseWithItem", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/World;setBlockState(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/BlockState;I)Z"))
	public boolean onSetCarvedBlock(World instance, BlockPos pos, BlockState state, int flags, Operation<Boolean> original)
	{
		if(instance.getRandom().nextFloat() <= 0.5f)
		{
			//TODO: ween sound effect
			instance.playSound(null, pos, SoundEvents.ENTITY_PLAYER_BURP, SoundCategory.BLOCKS, 1f, 1f);
			return instance.setBlockState(pos, BlockRegistry.WEEN.getDefaultState().with(CarvedPumpkinBlock.FACING, state.get(CarvedPumpkinBlock.FACING)), flags);
		}
		return original.call(instance, pos, state, flags);
	}
}
