package engiegames.engies_chaos.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Button;

import engiegames.engies_chaos.world.inventory.ConfigMenu;
import engiegames.engies_chaos.procedures.MobHPBaseMultToggledOnCheckProcedure;
import engiegames.engies_chaos.procedures.MobHPBaseMultToggledOffCheckProcedure;
import engiegames.engies_chaos.procedures.HealthOverlayButtonDisplayProcedure;
import engiegames.engies_chaos.procedures.EngiesTrueWrathToggleOnProcedure;
import engiegames.engies_chaos.procedures.EngiesTrueWrathToggleOffProcedure;
import engiegames.engies_chaos.procedures.DifficultyToggledOnCheckProcedure;
import engiegames.engies_chaos.procedures.DifficultyToggledOnCheck3Procedure;
import engiegames.engies_chaos.procedures.DifficultyToggledOnCheck2Procedure;
import engiegames.engies_chaos.procedures.DifficultyToggledOffCheckProcedure;
import engiegames.engies_chaos.procedures.ConfigShowDiffProcedure;
import engiegames.engies_chaos.procedures.ConfigCheckForOPProcedure;
import engiegames.engies_chaos.procedures.ConfigButton9ShowProcedure;
import engiegames.engies_chaos.procedures.ConfigButton8ShowProcedure;
import engiegames.engies_chaos.procedures.ConfigButton7ShowProcedure;
import engiegames.engies_chaos.procedures.ConfigButton6ShowProcedure;
import engiegames.engies_chaos.procedures.AttributeFixCheckProcedure;
import engiegames.engies_chaos.network.ConfigButtonMessage;
import engiegames.engies_chaos.init.EngiesChaosModScreens;
import engiegames.engies_chaos.EngiesChaosMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class ConfigScreen extends AbstractContainerScreen<ConfigMenu> implements EngiesChaosModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	Button button_1;
	Button button_2;
	Button button_3;
	Button button_4;
	Button button_x;
	Button button_toggle_off;
	Button button_toggle_off1;
	Button button_empty;
	Button button_empty1;
	Button button_raise;
	Button button_lower;
	Button button_toggle;
	Button button_untrack_risk;
	Button button_untrack_risk1;
	Button button_untrack;
	Button button_untrack1;
	Button button_0;
	Button button_off1;
	Button button_off;
	ImageButton imagebutton_denymark;
	ImageButton imagebutton_checkmark;

	public ConfigScreen(ConfigMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 250;
		this.imageHeight = 166;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = new ResourceLocation("engies_chaos:textures/screens/config.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(PoseStack ms, int mouseX, int mouseY) {
		this.font.draw(ms, Component.translatable("gui.engies_chaos.config.label_reall_about_engie_configuration"), 4, 4, -16777216);
		this.font.draw(ms, Component.translatable("gui.engies_chaos.config.label_difficulty_overlay"), 4, 17, -16777216);
		this.font.draw(ms, Component.translatable("gui.engies_chaos.config.label_doomsday"), 4, 48, -16777216);
		if (ConfigCheckForOPProcedure.execute(entity))
			this.font.draw(ms, ConfigShowDiffProcedure.execute(world), 4, 79, -16777216);
		if (AttributeFixCheckProcedure.execute())
			this.font.draw(ms, Component.translatable("gui.engies_chaos.config.label_you_do_not_have_attributefix_ins"), 4, 88, -16777216);
		if (AttributeFixCheckProcedure.execute())
			this.font.draw(ms, Component.translatable("gui.engies_chaos.config.label_this_config_is_disabled_until_th"), 4, 98, -16777216);
		this.font.draw(ms, Component.translatable("gui.engies_chaos.config.label_toggle_custom_hp_hud"), 174, 48, -16777216);
		if (ConfigCheckForOPProcedure.execute(entity))
			this.font.draw(ms, Component.translatable("gui.engies_chaos.config.label_mob_base_hp_mults"), 4, 110, -16777216);
	}

	@Override
	public void init() {
		super.init();
		button_1 = new Button(this.leftPos + 4, this.topPos + 26, 30, 20, Component.translatable("gui.engies_chaos.config.button_1"), e -> {
			int x = ConfigScreen.this.x;
			int y = ConfigScreen.this.y;
			if (true) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new ConfigButtonMessage(0, x, y, z));
				ConfigButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		this.addRenderableWidget(button_1);
		button_2 = new Button(this.leftPos + 35, this.topPos + 26, 30, 20, Component.translatable("gui.engies_chaos.config.button_2"), e -> {
			int x = ConfigScreen.this.x;
			int y = ConfigScreen.this.y;
			if (true) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new ConfigButtonMessage(1, x, y, z));
				ConfigButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		this.addRenderableWidget(button_2);
		button_3 = new Button(this.leftPos + 66, this.topPos + 26, 30, 20, Component.translatable("gui.engies_chaos.config.button_3"), e -> {
			int x = ConfigScreen.this.x;
			int y = ConfigScreen.this.y;
			if (true) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new ConfigButtonMessage(2, x, y, z));
				ConfigButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		this.addRenderableWidget(button_3);
		button_4 = new Button(this.leftPos + 97, this.topPos + 26, 30, 20, Component.translatable("gui.engies_chaos.config.button_4"), e -> {
			int x = ConfigScreen.this.x;
			int y = ConfigScreen.this.y;
			if (true) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new ConfigButtonMessage(3, x, y, z));
				ConfigButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		this.addRenderableWidget(button_4);
		button_x = new Button(this.leftPos + 216, this.topPos + 4, 30, 20, Component.translatable("gui.engies_chaos.config.button_x"), e -> {
			int x = ConfigScreen.this.x;
			int y = ConfigScreen.this.y;
			if (true) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new ConfigButtonMessage(4, x, y, z));
				ConfigButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		this.addRenderableWidget(button_x);
		button_toggle_off = new Button(this.leftPos + 4, this.topPos + 88, 77, 20, Component.translatable("gui.engies_chaos.config.button_toggle_off"), e -> {
			int x = ConfigScreen.this.x;
			int y = ConfigScreen.this.y;
			if (DifficultyToggledOnCheckProcedure.execute(world, entity)) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new ConfigButtonMessage(5, x, y, z));
				ConfigButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		this.addRenderableWidget(button_toggle_off);
		button_toggle_off1 = new Button(this.leftPos + 4, this.topPos + 88, 77, 20, Component.translatable("gui.engies_chaos.config.button_toggle_off1"), e -> {
			int x = ConfigScreen.this.x;
			int y = ConfigScreen.this.y;
			if (DifficultyToggledOffCheckProcedure.execute(world, entity)) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new ConfigButtonMessage(6, x, y, z));
				ConfigButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		this.addRenderableWidget(button_toggle_off1);
		button_empty = new Button(this.leftPos + 218, this.topPos + 142, 28, 20, Component.translatable("gui.engies_chaos.config.button_empty"), e -> {
			int x = ConfigScreen.this.x;
			int y = ConfigScreen.this.y;
			if (true) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new ConfigButtonMessage(7, x, y, z));
				ConfigButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		this.addRenderableWidget(button_empty);
		button_empty1 = new Button(this.leftPos + 4, this.topPos + 142, 28, 20, Component.translatable("gui.engies_chaos.config.button_empty1"), e -> {
			int x = ConfigScreen.this.x;
			int y = ConfigScreen.this.y;
			if (true) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new ConfigButtonMessage(8, x, y, z));
				ConfigButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		this.addRenderableWidget(button_empty1);
		button_raise = new Button(this.leftPos + 82, this.topPos + 88, 51, 20, Component.translatable("gui.engies_chaos.config.button_raise"), e -> {
			int x = ConfigScreen.this.x;
			int y = ConfigScreen.this.y;
			if (DifficultyToggledOnCheck2Procedure.execute(world, entity)) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new ConfigButtonMessage(9, x, y, z));
				ConfigButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		});
		this.addRenderableWidget(button_raise);
		button_lower = new Button(this.leftPos + 134, this.topPos + 88, 51, 20, Component.translatable("gui.engies_chaos.config.button_lower"), e -> {
			int x = ConfigScreen.this.x;
			int y = ConfigScreen.this.y;
			if (DifficultyToggledOnCheck3Procedure.execute(world, entity)) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new ConfigButtonMessage(10, x, y, z));
				ConfigButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		});
		this.addRenderableWidget(button_lower);
		button_toggle = new Button(this.leftPos + 174, this.topPos + 57, 56, 20, Component.translatable("gui.engies_chaos.config.button_toggle"), e -> {
			int x = ConfigScreen.this.x;
			int y = ConfigScreen.this.y;
			if (HealthOverlayButtonDisplayProcedure.execute(entity)) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new ConfigButtonMessage(11, x, y, z));
				ConfigButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		});
		this.addRenderableWidget(button_toggle);
		button_untrack_risk = new Button(this.leftPos + 4, this.topPos + 57, 87, 20, Component.translatable("gui.engies_chaos.config.button_untrack_risk"), e -> {
			int x = ConfigScreen.this.x;
			int y = ConfigScreen.this.y;
			if (ConfigButton6ShowProcedure.execute(entity)) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new ConfigButtonMessage(12, x, y, z));
				ConfigButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		});
		this.addRenderableWidget(button_untrack_risk);
		button_untrack_risk1 = new Button(this.leftPos + 4, this.topPos + 57, 87, 20, Component.translatable("gui.engies_chaos.config.button_untrack_risk1"), e -> {
			int x = ConfigScreen.this.x;
			int y = ConfigScreen.this.y;
			if (ConfigButton7ShowProcedure.execute(entity)) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new ConfigButtonMessage(13, x, y, z));
				ConfigButtonMessage.handleButtonAction(entity, 13, x, y, z);
			}
		});
		this.addRenderableWidget(button_untrack_risk1);
		button_untrack = new Button(this.leftPos + 92, this.topPos + 57, 61, 20, Component.translatable("gui.engies_chaos.config.button_untrack"), e -> {
			int x = ConfigScreen.this.x;
			int y = ConfigScreen.this.y;
			if (ConfigButton8ShowProcedure.execute(entity)) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new ConfigButtonMessage(14, x, y, z));
				ConfigButtonMessage.handleButtonAction(entity, 14, x, y, z);
			}
		});
		this.addRenderableWidget(button_untrack);
		button_untrack1 = new Button(this.leftPos + 92, this.topPos + 57, 61, 20, Component.translatable("gui.engies_chaos.config.button_untrack1"), e -> {
			int x = ConfigScreen.this.x;
			int y = ConfigScreen.this.y;
			if (ConfigButton9ShowProcedure.execute(entity)) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new ConfigButtonMessage(15, x, y, z));
				ConfigButtonMessage.handleButtonAction(entity, 15, x, y, z);
			}
		});
		this.addRenderableWidget(button_untrack1);
		button_0 = new Button(this.leftPos + 128, this.topPos + 26, 30, 20, Component.translatable("gui.engies_chaos.config.button_0"), e -> {
			int x = ConfigScreen.this.x;
			int y = ConfigScreen.this.y;
			if (true) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new ConfigButtonMessage(16, x, y, z));
				ConfigButtonMessage.handleButtonAction(entity, 16, x, y, z);
			}
		});
		this.addRenderableWidget(button_0);
		button_off1 = new Button(this.leftPos + 4, this.topPos + 119, 40, 20, Component.translatable("gui.engies_chaos.config.button_off1"), e -> {
			int x = ConfigScreen.this.x;
			int y = ConfigScreen.this.y;
			if (MobHPBaseMultToggledOffCheckProcedure.execute(world, entity)) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new ConfigButtonMessage(17, x, y, z));
				ConfigButtonMessage.handleButtonAction(entity, 17, x, y, z);
			}
		});
		this.addRenderableWidget(button_off1);
		button_off = new Button(this.leftPos + 4, this.topPos + 119, 40, 20, Component.translatable("gui.engies_chaos.config.button_off"), e -> {
			int x = ConfigScreen.this.x;
			int y = ConfigScreen.this.y;
			if (MobHPBaseMultToggledOnCheckProcedure.execute(world, entity)) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new ConfigButtonMessage(18, x, y, z));
				ConfigButtonMessage.handleButtonAction(entity, 18, x, y, z);
			}
		});
		this.addRenderableWidget(button_off);
		imagebutton_denymark = new ImageButton(this.leftPos + 230, this.topPos + 125, 16, 16, 0, 0, 16, new ResourceLocation("engies_chaos:textures/screens/atlas/imagebutton_denymark.png"), 16, 32, e -> {
			int x = ConfigScreen.this.x;
			int y = ConfigScreen.this.y;
			if (EngiesTrueWrathToggleOffProcedure.execute(world, entity)) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new ConfigButtonMessage(19, x, y, z));
				ConfigButtonMessage.handleButtonAction(entity, 19, x, y, z);
			}
		});
		this.addRenderableWidget(imagebutton_denymark);
		imagebutton_checkmark = new ImageButton(this.leftPos + 230, this.topPos + 125, 16, 16, 0, 0, 16, new ResourceLocation("engies_chaos:textures/screens/atlas/imagebutton_checkmark.png"), 16, 32, e -> {
			int x = ConfigScreen.this.x;
			int y = ConfigScreen.this.y;
			if (EngiesTrueWrathToggleOnProcedure.execute(world, entity)) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new ConfigButtonMessage(20, x, y, z));
				ConfigButtonMessage.handleButtonAction(entity, 20, x, y, z);
			}
		});
		this.addRenderableWidget(imagebutton_checkmark);
	}

	@Override
	protected void containerTick() {
		super.containerTick();
		this.button_toggle_off.visible = DifficultyToggledOnCheckProcedure.execute(world, entity);
		this.button_toggle_off1.visible = DifficultyToggledOffCheckProcedure.execute(world, entity);
		this.button_raise.visible = DifficultyToggledOnCheck2Procedure.execute(world, entity);
		this.button_lower.visible = DifficultyToggledOnCheck3Procedure.execute(world, entity);
		this.button_toggle.visible = HealthOverlayButtonDisplayProcedure.execute(entity);
		this.button_untrack_risk.visible = ConfigButton6ShowProcedure.execute(entity);
		this.button_untrack_risk1.visible = ConfigButton7ShowProcedure.execute(entity);
		this.button_untrack.visible = ConfigButton8ShowProcedure.execute(entity);
		this.button_untrack1.visible = ConfigButton9ShowProcedure.execute(entity);
		this.button_off1.visible = MobHPBaseMultToggledOffCheckProcedure.execute(world, entity);
		this.button_off.visible = MobHPBaseMultToggledOnCheckProcedure.execute(world, entity);
		this.imagebutton_denymark.visible = EngiesTrueWrathToggleOffProcedure.execute(world, entity);
		this.imagebutton_checkmark.visible = EngiesTrueWrathToggleOnProcedure.execute(world, entity);
	}
}