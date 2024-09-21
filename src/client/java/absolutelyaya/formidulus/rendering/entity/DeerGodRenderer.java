package absolutelyaya.formidulus.rendering.entity;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.FormidulusClient;
import absolutelyaya.formidulus.entities.DeerGodEntity;
import absolutelyaya.formidulus.rendering.entity.feature.DeerGodEyesRenderFeature;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

public class DeerGodRenderer extends MobEntityRenderer<DeerGodEntity, DeerGodModel>
{
	public DeerGodRenderer(EntityRendererFactory.Context ctx)
	{
		super(ctx, new DeerGodModel(ctx.getPart(FormidulusClient.DEER_GOD_LAYER)), 1f);
		addFeature(new DeerGodEyesRenderFeature(this));
	}
	
	@Override
	public Identifier getTexture(DeerGodEntity entity)
	{
		return Formidulus.identifier("textures/entity/deer_demon.png");
	}
	
	@Override
	public void render(DeerGodEntity livingEntity, float f, float tickDelta, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i)
	{
		//TODO: vanishing
		//float opacity = (float)Math.max(Math.sin(livingEntity.age / 20f), 0f);
		//RenderSystem.setShaderColor(0f, 0f, 0f, opacity);
		super.render(livingEntity, f, tickDelta, matrixStack, vertexConsumerProvider, i);
		//RenderSystem.setShaderColor(1f, 1f, 1f, 1f);
	}
	
	@Nullable
	@Override
	protected RenderLayer getRenderLayer(DeerGodEntity entity, boolean showBody, boolean translucent, boolean showOutline)
	{
		return RenderLayer.getEntityTranslucent(getTexture(entity));
	}
}
