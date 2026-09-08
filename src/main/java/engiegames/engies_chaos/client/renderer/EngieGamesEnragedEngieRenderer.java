package engiegames.engies_chaos.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.procedures.MobModelScalingProcedure;
import engiegames.engies_chaos.entity.EngieGamesEnragedEngieEntity;
import engiegames.engies_chaos.client.model.Modelengiegameshostile;

import com.mojang.blaze3d.vertex.PoseStack;

public class EngieGamesEnragedEngieRenderer extends MobRenderer<EngieGamesEnragedEngieEntity, Modelengiegameshostile<EngieGamesEnragedEngieEntity>> {
	public EngieGamesEnragedEngieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelengiegameshostile<EngieGamesEnragedEngieEntity>(context.bakeLayer(Modelengiegameshostile.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(EngieGamesEnragedEngieEntity entity, PoseStack poseStack, float f) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		float scale = (float) MobModelScalingProcedure.execute();
		poseStack.scale(scale, scale, scale);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieGamesEnragedEngieEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/engiegamesenragedengie.png");
	}
}