package absolutelyaya.formidulus.rendering.entity.feature;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.entities.DeerGodEntity;
import absolutelyaya.formidulus.rendering.entity.DeerGodModel;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.*;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.ColorHelper;
import net.minecraft.util.math.MathHelper;

public class DeerGodEyesRenderFeature extends FeatureRenderer<DeerGodEntity, DeerGodModel>
{
	static final Identifier TEX = Formidulus.identifier("textures/entity/deer_god_eyes.png");
	
	public DeerGodEyesRenderFeature(FeatureRendererContext<DeerGodEntity, DeerGodModel> context)
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
		int c = ColorHelper.Argb.getArgb((int)(255 * entity.getEyeGlow()), 255, 255, 255);
		model.getPart().render(matrices, vertexConsumers.getBuffer(RenderLayer.getEntityTranslucentEmissive(TEX)), LightmapTextureManager.MAX_BLOCK_LIGHT_COORDINATE, OverlayTexture.DEFAULT_UV, c);
	}
}
