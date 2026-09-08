package engiegames.engies_chaos.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.procedures.MobModelScalingProcedure;
import engiegames.engies_chaos.entity.EngieGamesOutragedEngieEntity;
import engiegames.engies_chaos.client.model.Modelengiegameshostile;

import com.mojang.blaze3d.vertex.PoseStack;

public class EngieGamesOutragedEngieRenderer extends MobRenderer<EngieGamesOutragedEngieEntity, Modelengiegameshostile<EngieGamesOutragedEngieEntity>> {
	public EngieGamesOutragedEngieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelengiegameshostile<EngieGamesOutragedEngieEntity>(context.bakeLayer(Modelengiegameshostile.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(EngieGamesOutragedEngieEntity entity, PoseStack poseStack, float f) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		float scale = (float) MobModelScalingProcedure.execute();
		poseStack.scale(scale, scale, scale);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieGamesOutragedEngieEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/engiegamesoutragedengie.png");
	}
}