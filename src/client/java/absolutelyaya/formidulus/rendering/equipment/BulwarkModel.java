package absolutelyaya.formidulus.rendering.equipment;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.entities.BulwarkEntity;
import absolutelyaya.formidulus.rendering.entity.BulwarkAnimations;
import absolutelyaya.formidulus.rendering.entity.DeerGodAnimations;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class BulwarkModel extends SinglePartEntityModel<BulwarkEntity>
{
	public static final Identifier TEXTURE = Formidulus.identifier("textures/entity/bulwark.png");
	private final ModelPart root;
	
	public BulwarkModel(ModelPart root)
	{
		this.root = root.getChild("root");
	}
	
	public static TexturedModelData getTexturedModelData()
	{
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData root = modelPartData.addChild("root", ModelPartBuilder.create().uv(15, 15).cuboid(-7.5F, -9.0F, -4.0F, 15.0F, 19.0F, 1.0F, new Dilation(0.0F))
																	.uv(48, 12).cuboid(-1.5F, -3.0F, -3.0F, 3.0F, 6.0F, 4.0F, new Dilation(0.0F))
																	.uv(13, 36).cuboid(-8.5F, 10.0F, -5.0F, 17.0F, 5.0F, 2.0F, new Dilation(0.0F))
																	.uv(15, 43).cuboid(-8.5F, 15.0F, -4.0F, 17.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 9.0F, -4.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color)
	{
		root.render(matrices, vertices, light, overlay, color);
	}
	
	@Override
	public ModelPart getPart()
	{
		return root;
	}
	
	@Override
	public void setAngles(BulwarkEntity entity, float limbAngle, float limbDistance, float ageInTicks, float headYaw, float headPitch)
	{
		root.traverse().forEach(ModelPart::resetTransform);
		updateAnimation(entity.placeAnimationState, BulwarkAnimations.place, ageInTicks);
		updateAnimation(entity.hitAnimationState, BulwarkAnimations.hit, ageInTicks);
		updateAnimation(entity.removeAnimationState, BulwarkAnimations.unplace, ageInTicks);
	}
}