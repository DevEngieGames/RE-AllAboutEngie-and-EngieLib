package engiegames.engies_chaos.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import engiegames.engies_chaos.world.inventory.DeveloperModeGUIMenu;
import engiegames.engies_chaos.procedures.StunRadiusGetForDevGUIProcedure;
import engiegames.engies_chaos.procedures.RemovePlayerImmunityShowProcedure;
import engiegames.engies_chaos.procedures.GivePlayerImmunityShowProcedure;
import engiegames.engies_chaos.procedures.DevCheckProcedure;
import engiegames.engies_chaos.network.DeveloperModeGUIButtonMessage;
import engiegames.engies_chaos.init.EngiesChaosModScreens;
import engiegames.engies_chaos.EngiesChaosMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class DeveloperModeGUIScreen extends AbstractContainerScreen<DeveloperModeGUIMenu> implements EngiesChaosModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	EditBox statclocknum;
	EditBox number;
	Button button_raise;
	Button button_lower;
	Button button_heal_self;
	Button button_set_difficulty;
	Button button_duplicate_item;
	Button button_give_immunity;
	Button button_give_immunity1;
	Button button_stun_nearby_mobs;
	Button button_toggle_special_health;
	Button button_confirm_stat_clock_number_count;
	Button button_set_doomsday_risk;

	public DeveloperModeGUIScreen(DeveloperModeGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 245;
		this.imageHeight = 240;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		if (elementType == 0 && elementState instanceof String stringState) {
			if (name.equals("statclocknum"))
				statclocknum.setValue(stringState);
			else if (name.equals("number"))
				number.setValue(stringState);
		}
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = new ResourceLocation("engies_chaos:textures/screens/developer_mode_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		statclocknum.render(ms, mouseX, mouseY, partialTicks);
		number.render(ms, mouseX, mouseY, partialTicks);
		boolean customTooltipShown = false;
		if (mouseX > leftPos + 128 && mouseX < leftPos + 152 && mouseY > topPos + 11 && mouseY < topPos + 35) {
			this.renderTooltip(ms, Component.translatable("gui.engies_chaos.developer_mode_gui.tooltip_max_50525"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (mouseX > leftPos + 152 && mouseX < leftPos + 176 && mouseY > topPos + 11 && mouseY < topPos + 35) {
			this.renderTooltip(ms, Component.translatable("gui.engies_chaos.developer_mode_gui.tooltip_max_101050"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (mouseX > leftPos + 176 && mouseX < leftPos + 200 && mouseY > topPos + 11 && mouseY < topPos + 35) {
			this.renderTooltip(ms, Component.translatable("gui.engies_chaos.developer_mode_gui.tooltip_max_151575"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (mouseX > leftPos + 206 && mouseX < leftPos + 230 && mouseY > topPos + 55 && mouseY < topPos + 79) {
			this.renderTooltip(ms, Component.translatable("gui.engies_chaos.developer_mode_gui.tooltip_input_item_here"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (!customTooltipShown)
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
		if (statclocknum.isFocused())
			return statclocknum.keyPressed(key, b, c);
		if (number.isFocused())
			return number.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String statclocknumValue = statclocknum.getValue();
		String numberValue = number.getValue();
		super.resize(minecraft, width, height);
		statclocknum.setValue(statclocknumValue);
		number.setValue(numberValue);
	}

	@Override
	protected void renderLabels(PoseStack ms, int mouseX, int mouseY) {
		this.font.draw(ms, Component.translatable("gui.engies_chaos.developer_mode_gui.label_devgui"), 4, 4, -16777216);
		this.font.draw(ms, StunRadiusGetForDevGUIProcedure.execute(world), 129, 139, -16777216);
	}

	@Override
	public void init() {
		super.init();
		statclocknum = new EditBox(this.font, this.leftPos + 9, this.topPos + 14, 118, 18, Component.translatable("gui.engies_chaos.developer_mode_gui.statclocknum"));
		statclocknum.setMaxLength(8192);
		statclocknum.setResponder(content -> {
			if (!menuStateUpdateActive)
				menu.sendMenuStateUpdate(entity, 0, "statclocknum", content, false);
		});
		statclocknum.setSuggestion(Component.translatable("gui.engies_chaos.developer_mode_gui.statclocknum").getString());
		this.addWidget(this.statclocknum);
		number = new EditBox(this.font, this.leftPos + 4, this.topPos + 99, 118, 18, Component.translatable("gui.engies_chaos.developer_mode_gui.number"));
		number.setMaxLength(8192);
		number.setResponder(content -> {
			if (!menuStateUpdateActive)
				menu.sendMenuStateUpdate(entity, 0, "number", content, false);
		});
		number.setSuggestion(Component.translatable("gui.engies_chaos.developer_mode_gui.number").getString());
		this.addWidget(this.number);
		button_raise = new Button(this.leftPos + 129, this.topPos + 119, 51, 20, Component.translatable("gui.engies_chaos.developer_mode_gui.button_raise"), e -> {
			int x = DeveloperModeGUIScreen.this.x;
			int y = DeveloperModeGUIScreen.this.y;
			if (true) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new DeveloperModeGUIButtonMessage(0, x, y, z));
				DeveloperModeGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		this.addRenderableWidget(button_raise);
		button_lower = new Button(this.leftPos + 191, this.topPos + 119, 51, 20, Component.translatable("gui.engies_chaos.developer_mode_gui.button_lower"), e -> {
			int x = DeveloperModeGUIScreen.this.x;
			int y = DeveloperModeGUIScreen.this.y;
			if (true) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new DeveloperModeGUIButtonMessage(1, x, y, z));
				DeveloperModeGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		this.addRenderableWidget(button_lower);
		button_heal_self = new Button(this.leftPos + 6, this.topPos + 56, 77, 20, Component.translatable("gui.engies_chaos.developer_mode_gui.button_heal_self"), e -> {
			int x = DeveloperModeGUIScreen.this.x;
			int y = DeveloperModeGUIScreen.this.y;
			if (true) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new DeveloperModeGUIButtonMessage(2, x, y, z));
				DeveloperModeGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		this.addRenderableWidget(button_heal_self);
		button_set_difficulty = new Button(this.leftPos + 3, this.topPos + 119, 103, 20, Component.translatable("gui.engies_chaos.developer_mode_gui.button_set_difficulty"), e -> {
			int x = DeveloperModeGUIScreen.this.x;
			int y = DeveloperModeGUIScreen.this.y;
			if (true) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new DeveloperModeGUIButtonMessage(3, x, y, z));
				DeveloperModeGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		this.addRenderableWidget(button_set_difficulty);
		button_duplicate_item = new Button(this.leftPos + 97, this.topPos + 56, 103, 20, Component.translatable("gui.engies_chaos.developer_mode_gui.button_duplicate_item"), e -> {
			int x = DeveloperModeGUIScreen.this.x;
			int y = DeveloperModeGUIScreen.this.y;
			if (true) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new DeveloperModeGUIButtonMessage(4, x, y, z));
				DeveloperModeGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		this.addRenderableWidget(button_duplicate_item);
		button_give_immunity = new Button(this.leftPos + 3, this.topPos + 77, 98, 20, Component.translatable("gui.engies_chaos.developer_mode_gui.button_give_immunity"), e -> {
			int x = DeveloperModeGUIScreen.this.x;
			int y = DeveloperModeGUIScreen.this.y;
			if (GivePlayerImmunityShowProcedure.execute(entity)) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new DeveloperModeGUIButtonMessage(5, x, y, z));
				DeveloperModeGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		this.addRenderableWidget(button_give_immunity);
		button_give_immunity1 = new Button(this.leftPos + 3, this.topPos + 77, 98, 20, Component.translatable("gui.engies_chaos.developer_mode_gui.button_give_immunity1"), e -> {
			int x = DeveloperModeGUIScreen.this.x;
			int y = DeveloperModeGUIScreen.this.y;
			if (RemovePlayerImmunityShowProcedure.execute(entity)) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new DeveloperModeGUIButtonMessage(6, x, y, z));
				DeveloperModeGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		this.addRenderableWidget(button_give_immunity1);
		button_stun_nearby_mobs = new Button(this.leftPos + 129, this.topPos + 98, 113, 20, Component.translatable("gui.engies_chaos.developer_mode_gui.button_stun_nearby_mobs"), e -> {
			int x = DeveloperModeGUIScreen.this.x;
			int y = DeveloperModeGUIScreen.this.y;
			if (true) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new DeveloperModeGUIButtonMessage(7, x, y, z));
				DeveloperModeGUIButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		this.addRenderableWidget(button_stun_nearby_mobs);
		button_toggle_special_health = new Button(this.leftPos + 102, this.topPos + 77, 140, 20, Component.translatable("gui.engies_chaos.developer_mode_gui.button_toggle_special_health"), e -> {
			int x = DeveloperModeGUIScreen.this.x;
			int y = DeveloperModeGUIScreen.this.y;
			if (true) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new DeveloperModeGUIButtonMessage(8, x, y, z));
				DeveloperModeGUIButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		this.addRenderableWidget(button_toggle_special_health);
		button_confirm_stat_clock_number_count = new Button(this.leftPos + 8, this.topPos + 35, 192, 20, Component.translatable("gui.engies_chaos.developer_mode_gui.button_confirm_stat_clock_number_count"), e -> {
			int x = DeveloperModeGUIScreen.this.x;
			int y = DeveloperModeGUIScreen.this.y;
			if (true) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new DeveloperModeGUIButtonMessage(9, x, y, z));
				DeveloperModeGUIButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		});
		this.addRenderableWidget(button_confirm_stat_clock_number_count);
		button_set_doomsday_risk = new Button(this.leftPos + 3, this.topPos + 140, 119, 20, Component.translatable("gui.engies_chaos.developer_mode_gui.button_set_doomsday_risk"), e -> {
			int x = DeveloperModeGUIScreen.this.x;
			int y = DeveloperModeGUIScreen.this.y;
			if (DevCheckProcedure.execute(entity)) {
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new DeveloperModeGUIButtonMessage(10, x, y, z));
				DeveloperModeGUIButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		});
		this.addRenderableWidget(button_set_doomsday_risk);
	}

	@Override
	protected void containerTick() {
		super.containerTick();
		statclocknum.tick();
		number.tick();
		this.button_give_immunity.visible = GivePlayerImmunityShowProcedure.execute(entity);
		this.button_give_immunity1.visible = RemovePlayerImmunityShowProcedure.execute(entity);
		this.button_set_doomsday_risk.visible = DevCheckProcedure.execute(entity);
	}
}