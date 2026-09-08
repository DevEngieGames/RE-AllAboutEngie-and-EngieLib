package engiegames.engies_chaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import engiegames.engies_chaos.entity.InsanityEntity;
import engiegames.engies_chaos.client.model.Modelinsanity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class InsanityRenderer extends MobRenderer<InsanityEntity, Modelinsanity<InsanityEntity>> {
	public InsanityRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelinsanity<InsanityEntity>(context.bakeLayer(Modelinsanity.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<InsanityEntity, Modelinsanity<InsanityEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/insanity.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, InsanityEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	protected void scale(InsanityEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.93f, 0.93f, 0.93f);
	}

	@Override
	public ResourceLocation getTextureLocation(InsanityEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/insanity.png");
	}

	@Override
	protected boolean isShaking(InsanityEntity entity) {
		return true;
	}
}