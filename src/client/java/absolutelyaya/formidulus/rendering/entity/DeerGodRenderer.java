package absolutelyaya.formidulus.rendering.entity;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.FormidulusClient;
import absolutelyaya.formidulus.entities.DeerGodEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class DeerGodRenderer extends MobEntityRenderer<DeerGodEntity, DeerGodModel>
{
	public DeerGodRenderer(EntityRendererFactory.Context ctx)
	{
		super(ctx, new DeerGodModel(ctx.getPart(FormidulusClient.DEER_GOD_LAYER)), 1f);
	}
	
	@Override
	public Identifier getTexture(DeerGodEntity entity)
	{
		return Formidulus.identifier("textures/entity/deer_demon.png");
	}
}
