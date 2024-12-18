package absolutelyaya.formidulus.block;

import absolutelyaya.formidulus.registries.BlockEntityRegistry;
import absolutelyaya.formidulus.registries.BlockRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public class BigLanternBlockEntity extends BlockEntity
{
	private int rechargeTimer = 600;
	
	public BigLanternBlockEntity(BlockPos pos, BlockState state)
	{
		super(BlockEntityRegistry.BIG_LANTERN, pos, state);
	}
	
	@Override
	public NbtCompound toInitialChunkDataNbt(RegistryWrapper.WrapperLookup registryLookup)
	{
		return createNbt(registryLookup);
	}
	
	@Nullable
	@Override
	public Packet<ClientPlayPacketListener> toUpdatePacket()
	{
		return BlockEntityUpdateS2CPacket.create(this);
	}
	
	public static <T extends BlockEntity> void tick(T t)
	{
		if(t instanceof BigLanternBlockEntity lantern)
			lantern.tick();
	}
	
	void tick()
	{
		if(world == null)
			return;
		if(!getCachedState().isOf(BlockRegistry.GREAT_LANTERN))
			return;
		if(rechargeTimer > 0 && getCachedState().get(BigLanternBlock.CHARGE) < 4)
		{
			rechargeTimer--;
			return;
		}
		if(rechargeTimer <= -1)
			return;
		int charge = getCachedState().get(BigLanternBlock.CHARGE);
		world.setBlockState(pos, getCachedState().with(BigLanternBlock.CHARGE, Math.min(charge + 1, 4)));
		rechargeTimer = 600;
	}
	
	public void startRechargeTimer()
	{
		if(rechargeTimer < 0)
			rechargeTimer = 600;
	}
	
	@Override
	protected void writeNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup)
	{
		super.writeNbt(nbt, registryLookup);
		nbt.putInt("RechargeTimer", rechargeTimer);
	}
	
	@Override
	protected void readNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup)
	{
		super.readNbt(nbt, registryLookup);
		if(nbt.contains("RechargeTimer", NbtElement.INT_TYPE))
			rechargeTimer = nbt.getInt("RechargeTimer");
	}
}
