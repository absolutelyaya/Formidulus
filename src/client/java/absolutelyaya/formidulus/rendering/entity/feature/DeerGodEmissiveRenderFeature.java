package absolutelyaya.formidulus.rendering.entity.feature;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.entities.DeerGodEntity;
import absolutelyaya.formidulus.rendering.entity.DeerGodModel;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class DeerGodEmissiveRenderFeature extends FeatureRenderer<DeerGodEntity, DeerGodModel>
{
	static final Identifier TEX = Formidulus.identifier("textures/entity/deer_god_emissive.png");
	int flickerTimer;
	boolean flicker;
	float brightness = 1f;
	
	public DeerGodEmissiveRenderFeature(FeatureRendererContext<DeerGodEntity, DeerGodModel> context)
	{
		super(context);
	}
	
	@Override
	public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, DeerGodEntity entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch)
	{
		if(entity.isInvisible())
			return;
		DeerGodModel model = getContextModel();
		model.animateModel(entity, limbAngle, limbDistance, tickDelta);
		if(!MinecraftClient.getInstance().isPaused() && flickerTimer-- == 0)
		{
			if(entity.getRandom().nextFloat() < 0.4f)
				brightness = 0.85f + entity.getRandom().nextFloat() * 0.05f;
			else
				brightness = 1f;
			flickerTimer = (int)(2 + entity.getRandom().nextFloat() * 5);
		}
		model.getPart().render(matrices, vertexConsumers.getBuffer(RenderLayer.getEntityCutoutNoCull(TEX)), (int)(LightmapTextureManager.MAX_BLOCK_LIGHT_COORDINATE * brightness), OverlayTexture.DEFAULT_UV);
	}
}
