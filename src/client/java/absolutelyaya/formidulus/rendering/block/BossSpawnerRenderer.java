package absolutelyaya.formidulus.rendering.block;

import absolutelyaya.formidulus.block.BossSpawnerBlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.BlockRenderManager;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.random.Random;
import org.joml.Matrix4f;

public class BossSpawnerRenderer implements BlockEntityRenderer<BossSpawnerBlockEntity>
{
	static final Random random = Random.create();
	BlockRenderManager blockRenderer;
	TextRenderer textRenderer;
	
	public BossSpawnerRenderer(BlockEntityRendererFactory.Context ctx)
	{
		blockRenderer = ctx.getRenderManager();
		textRenderer = ctx.getTextRenderer();
	}
	
	@Override
	public void render(BossSpawnerBlockEntity spawner, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay)
	{
		if(MinecraftClient.getInstance().player instanceof PlayerEntity player && player.isCreative())
		{
			blockRenderer.renderBlock(spawner.getCachedState(), spawner.getPos(), spawner.getWorld(), matrices,
					vertexConsumers.getBuffer(RenderLayer.getSolid()), true, random);
			if(spawner.getBossType() != null)
			{
				matrices.push();
				matrices.translate(0, 1, 0);
				matrices.multiply(MinecraftClient.getInstance().gameRenderer.getCamera().getRotation().invert());
				Matrix4f matrix = matrices.peek().getPositionMatrix();
				Text t = Text.of(spawner.getBossType().id().toString());
				textRenderer.draw(t, -textRenderer.getWidth(t) / 2f, 0, 0xffffff, false, matrix, vertexConsumers, TextRenderer.TextLayerType.NORMAL, 0x88000000, LightmapTextureManager.MAX_LIGHT_COORDINATE);
				matrices.pop();
			}
		}
	}
}
