package absolutelyaya.formidulus.item;

import absolutelyaya.formidulus.item.components.ChargeComponent;
import absolutelyaya.formidulus.registries.BlockRegistry;
import absolutelyaya.formidulus.registries.DataComponentRegistry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;

public class BigLanternItem extends BlockItem
{
	public BigLanternItem(Settings settings)
	{
		super(BlockRegistry.BIG_LANTERN, settings);
	}
	
	@Override
	public ActionResult useOnBlock(ItemUsageContext context)
	{
		ChargeComponent charge = context.getStack().get(DataComponentRegistry.CHARGE);
		if((charge == null || !charge.isCharged(1f)) || (context.getPlayer() != null && context.getPlayer().isSneaking()))
			return super.useOnBlock(context);
		return use(context.getWorld(), context.getPlayer(), context.getHand()).getResult();
	}
}
