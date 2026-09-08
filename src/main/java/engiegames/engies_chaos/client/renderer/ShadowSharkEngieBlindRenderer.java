package engiegames.engies_chaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import engiegames.engies_chaos.entity.ShadowSharkEngieBlindEntity;
import engiegames.engies_chaos.client.model.ModelShadowEngieSharkEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ShadowSharkEngieBlindRenderer extends MobRenderer<ShadowSharkEngieBlindEntity, ModelShadowEngieSharkEntity<ShadowSharkEngieBlindEntity>> {
	public ShadowSharkEngieBlindRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelShadowEngieSharkEntity<ShadowSharkEngieBlindEntity>(context.bakeLayer(ModelShadowEngieSharkEntity.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<ShadowSharkEngieBlindEntity, ModelShadowEngieSharkEntity<ShadowSharkEngieBlindEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/blindshadowsharkengie.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, ShadowSharkEngieBlindEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
			}
		});
	}

	@Override
	protected void scale(ShadowSharkEngieBlindEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.93f, 0.93f, 0.93f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShadowSharkEngieBlindEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/blindshadowsharkengie.png");
	}
}