package engiegames.engies_chaos.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.init.EngiesChaosModMenus;
import engiegames.engies_chaos.init.EngiesChaosModItems;

public class DeveloperModeGUIWhileThisGUIIsOpenTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
			ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GAMES_BAN_HAMMER.get()).copy();
			_setstack.setCount(1);
			_menu.getSlots().get(5).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
			ItemStack _setstack = new ItemStack(EngiesChaosModItems.OLD_ENRAGED_PLUSH_2.get()).copy();
			_setstack.setCount(1);
			_menu.getSlots().get(4).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
			ItemStack _setstack = new ItemStack(EngiesChaosModItems.X_ENGIE_PLUSH.get()).copy();
			_setstack.setCount(1);
			_menu.getSlots().get(10).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity.getPersistentData().getBoolean("EngiesChaos_Dev") == true) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.X_ENGIE_GAMESS_HELMET.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(6).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.X_ENGIE_GAMESS_CHESTPLATE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(7).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.X_ENGIE_GAMESS_LEGGINGS.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(8).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.X_ENGIE_GAMESS_BOOTS.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(9).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (entity.getPersistentData().getBoolean("EngiesChaos_Contributor") == true) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.OME_NS_HELMET.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(6).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.OME_NS_CHESTPLATE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(7).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.OME_NS_LEGGINGS.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(8).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.OME_NS_BOOTS.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(9).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (entity.getPersistentData().getBoolean("EngiesChaos_BetaTester") == true || entity.getPersistentData().getBoolean("EngiesChaos_Tester") == true) {
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.TRUE_X_ENGIE_HELMET.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(6).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.TRUE_X_ENGIE_CHESTPLATE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(7).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.TRUE_X_ENGIE_LEGGINGS.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(8).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.TRUE_X_ENGIE_BOOTS.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(9).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}