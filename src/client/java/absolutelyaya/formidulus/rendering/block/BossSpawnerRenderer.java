package absolutelyaya.formidulus.rendering.block;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.block.BossSpawnerBlockEntity;
import absolutelyaya.formidulus.entities.boss.BossType;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.render.*;
import net.minecraft.client.render.block.BlockRenderManager;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.BakedModelManager;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.random.Random;
import org.joml.Matrix4f;

import java.util.HashMap;
import java.util.Map;

public class BossSpawnerRenderer implements BlockEntityRenderer<BossSpawnerBlockEntity>
{
	static final Random random = Random.create();
	BlockRenderManager blockRenderer;
	TextRenderer textRenderer;
	static final Map<BossType, BakedModel> spawnerModels = new HashMap<>();
	static boolean modelsInitialized;
	
	public BossSpawnerRenderer(BlockEntityRendererFactory.Context ctx)
	{
		blockRenderer = ctx.getRenderManager();
		textRenderer = ctx.getTextRenderer();
	}
	
	@Override
	public void render(BossSpawnerBlockEntity spawner, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay)
	{
		if(!modelsInitialized)
			initSpawnerModels();
		if(MinecraftClient.getInstance().player instanceof PlayerEntity player && player.isCreative())
		{
			float distance = (float)MinecraftClient.getInstance().gameRenderer.getCamera().getPos().distanceTo(spawner.getPos().toCenterPos());
			RenderSystem.setShaderColor(1f, 1f, 1f, MathHelper.clamp(distance / 4f - 1f, 0.1f, 1f));
			blockRenderer.renderBlock(spawner.getCachedState(), spawner.getPos(), spawner.getWorld(), matrices,
					vertexConsumers.getBuffer(RenderLayer.getTranslucent()), true, random);
			if(spawner.getBossType() != null && distance < 16f)
			{
				matrices.push();
				matrices.translate(0.5f, 1.5f, 0.5f);
				matrices.scale(0.025f, -0.025f, -0.025f);
				Camera cam = MinecraftClient.getInstance().gameRenderer.getCamera();
				matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(cam.getYaw() - 180));
				matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-cam.getPitch()));
				Matrix4f matrix = matrices.peek().getPositionMatrix();
				Text t = Text.of(spawner.getBossType().id().toString());
				textRenderer.draw(t, -textRenderer.getWidth(t) / 2f, 0, 0xffffff, false, matrix, vertexConsumers,
						TextRenderer.TextLayerType.NORMAL, 0x88000000, LightmapTextureManager.MAX_LIGHT_COORDINATE);
				matrices.pop();
			}
			RenderSystem.setShaderColor(1f, 1f, 1f, 1f);
		}
		if(spawnerModels.containsKey(spawner.getBossType()) && spawnerModels.get(spawner.getBossType()) instanceof BakedModel model)
		{
			blockRenderer.getModelRenderer().render(spawner.getWorld(), model,
					spawner.getCachedState(), spawner.getPos(), matrices, vertexConsumers.getBuffer(RenderLayer.getSolid()), false, random, 0,
					OverlayTexture.DEFAULT_UV);
		}
	}
	
	public static void initSpawnerModels()
	{
		BakedModelManager manager = MinecraftClient.getInstance().getBakedModelManager();
		BossType.getAllTypes().forEach((id, type) -> {
			if(!type.spawnerModel().isEmpty())
				spawnerModels.put(BossType.DEER, manager.getModel(Formidulus.identifier("block/" + type.spawnerModel())));
		});
	}
}
