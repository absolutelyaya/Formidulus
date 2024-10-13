package absolutelyaya.formidulus.mixin;

import absolutelyaya.formidulus.registries.BlockRegistry;
import absolutelyaya.formidulus.registries.SoundRegistry;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.block.BlockState;
import net.minecraft.block.CarvedPumpkinBlock;
import net.minecraft.block.PumpkinBlock;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import java.time.LocalDateTime;
import java.time.Month;

@Mixin(PumpkinBlock.class)
public class PumpkinMixin
{
	@WrapOperation(method = "onUseWithItem", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/World;setBlockState(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/BlockState;I)Z"))
	public boolean onSetCarvedBlock(World instance, BlockPos pos, BlockState state, int flags, Operation<Boolean> original)
	{
		LocalDateTime dateTime = LocalDateTime.now();
		float weenChance = 0.0001f;
		if(dateTime.getMonth().equals(Month.OCTOBER))
			weenChance = weenChance * 100f + (dateTime.getDayOfMonth() / 31f) * 0.1f;
		else
			weenChance = Math.max(weenChance * 10f * (1f - (Math.abs(dateTime.getMonthValue() - 10) / 10f)), weenChance);
		if(instance.getRandom().nextFloat() <= weenChance) //ween gets more likely the closer you get to halloween :D
		{
			instance.playSound(null, pos, SoundRegistry.WEEN, SoundCategory.BLOCKS, 1f, 1f);
			return instance.setBlockState(pos, BlockRegistry.WEEN.getDefaultState().with(CarvedPumpkinBlock.FACING, state.get(CarvedPumpkinBlock.FACING)), flags);
		}
		return original.call(instance, pos, state, flags);
	}
}
