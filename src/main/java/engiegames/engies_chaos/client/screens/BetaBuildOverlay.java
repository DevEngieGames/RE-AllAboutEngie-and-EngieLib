package engiegames.engies_chaos.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.ScreenEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.PauseScreen;
import net.minecraft.client.Minecraft;

import engiegames.engies_chaos.procedures.BetaBuildDisplayProcedure;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class BetaBuildOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(ScreenEvent.Render.Post event) {
		if (event.getScreen() instanceof PauseScreen) {
			int w = event.getScreen().width;
			int h = event.getScreen().height;
			Level world = null;
			double x = 0;
			double y = 0;
			double z = 0;
			Player entity = Minecraft.getInstance().player;
			if (entity != null) {
				world = entity.level;
				x = entity.getX();
				y = entity.getY();
				z = entity.getZ();
			}
			if (BetaBuildDisplayProcedure.execute()) {
				Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.engies_chaos.beta_build.label_beta_build_expect_bugs"), 3, h - 12, -65536);
			}
		}
	}
}