package absolutelyaya.formidulus.rendering.entity;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.FormidulusClient;
import absolutelyaya.formidulus.entities.IrrlichtEntity;
import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

public class IrrlichtRenderer extends MobEntityRenderer<IrrlichtEntity, IrrlichtModel>
{
	public IrrlichtRenderer(EntityRendererFactory.Context ctx)
	{
		super(ctx, new IrrlichtModel(ctx.getPart(FormidulusClient.IRRLICHT_LAYER)), 0.1f);
	}
	
	@Override
	public Identifier getTexture(IrrlichtEntity entity)
	{
		return Formidulus.identifier("textures/entity/irrlicht_" + (entity.age / 5 % 6 + 1) + ".png");
	}
	
	@Override
	protected int getBlockLight(IrrlichtEntity entity, BlockPos pos)
	{
		return 15;
	}
}
