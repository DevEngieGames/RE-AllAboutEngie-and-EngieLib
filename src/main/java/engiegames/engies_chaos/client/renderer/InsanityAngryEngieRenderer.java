package engiegames.engies_chaos.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.procedures.MobModelScalingProcedure;
import engiegames.engies_chaos.entity.InsanityAngryEngieEntity;
import engiegames.engies_chaos.client.model.Modelinsanityhostile;

import com.mojang.blaze3d.vertex.PoseStack;

public class InsanityAngryEngieRenderer extends MobRenderer<InsanityAngryEngieEntity, Modelinsanityhostile<InsanityAngryEngieEntity>> {
	public InsanityAngryEngieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelinsanityhostile<InsanityAngryEngieEntity>(context.bakeLayer(Modelinsanityhostile.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(InsanityAngryEngieEntity entity, PoseStack poseStack, float f) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		float scale = (float) MobModelScalingProcedure.execute();
		poseStack.scale(scale, scale, scale);
	}

	@Override
	public ResourceLocation getTextureLocation(InsanityAngryEngieEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/insanityangryengie.png");
	}
}