package absolutelyaya.formidulus.rendering.entity;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.FormidulusClient;
import absolutelyaya.formidulus.entities.DeerGodEntity;
import absolutelyaya.formidulus.rendering.entity.feature.DeerGodEmissiveRenderFeature;
import absolutelyaya.formidulus.rendering.entity.feature.DeerGodEyesRenderFeature;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

public class DeerGodRenderer extends MobEntityRenderer<DeerGodEntity, DeerGodModel>
{
	static final Identifier TEX = Formidulus.identifier("textures/entity/deer_god.png");
	
	public DeerGodRenderer(EntityRendererFactory.Context ctx)
	{
		super(ctx, new DeerGodModel(ctx.getPart(FormidulusClient.DEER_GOD_LAYER)), 1f);
		addFeature(new DeerGodEmissiveRenderFeature(this));
		addFeature(new DeerGodEyesRenderFeature(this));
	}
	
	@Override
	public Identifier getTexture(DeerGodEntity entity)
	{
		return TEX;
	}
	
	@Override
	public void render(DeerGodEntity livingEntity, float f, float tickDelta, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i)
	{
		float vanishing = livingEntity.getVanishingPercent();
		if(vanishing >= 0.9f)
			return;
		float c = Math.max(1f - vanishing * 2f, 0f);
		RenderSystem.setShaderColor(c, c, c, Math.min(1f - (vanishing * 6 - 4), 1f));
		//RenderSystem.setShaderColor(0f, 0f, 0f, 1f);
		super.render(livingEntity, f, tickDelta, matrixStack, vertexConsumerProvider, i);
		RenderSystem.setShaderColor(1f, 1f, 1f, 1f);
	}
	
	@Nullable
	@Override
	protected RenderLayer getRenderLayer(DeerGodEntity entity, boolean showBody, boolean translucent, boolean showOutline)
	{
		return RenderLayer.getEntityTranslucent(getTexture(entity));
	}
}
