package absolutelyaya.formidulus.rendering.entity;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.FormidulusClient;
import absolutelyaya.formidulus.entities.DeerFollowerEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.feature.HeldItemFeatureRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class DeerFollowerRenderer extends MobEntityRenderer<DeerFollowerEntity, DeerFollowerModel>
{
	static final Identifier TEX = Formidulus.identifier("textures/entity/deer_follower0.png");
	
	public DeerFollowerRenderer(EntityRendererFactory.Context context)
	{
		super(context, new DeerFollowerModel(context.getPart(FormidulusClient.DEER_FOLLOWER_LAYER)), 0.25f);
		addFeature(new HeldItemFeatureRenderer<>(this, context.getHeldItemRenderer()) {
			@Override
			public void render(MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, DeerFollowerEntity livingEntity, float f, float g, float h, float j, float k, float l)
			{
				if(livingEntity.isAttacking())
					super.render(matrixStack, vertexConsumerProvider, i, livingEntity, f, g, h, j, k, l);
			}
		});
	}
	
	@Override
	public Identifier getTexture(DeerFollowerEntity entity)
	{
		return TEX;
	}
}
