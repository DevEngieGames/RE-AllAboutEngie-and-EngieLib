package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.Difficulty;

import javax.annotation.Nullable;

import java.util.ArrayList;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;

@Mod.EventBusSubscriber
public class WorldTickProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.LevelTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.level);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (!world.isClientSide()) {
			if (ModList.get().isLoaded("attributefix") == false) {
				EngiesChaosModVariables.MapVariables.get(world).difficultytoggle = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			} else {
				if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.AMBIENCE_MODE) == true) {
					EngiesChaosModVariables.MapVariables.get(world).difficultytoggle = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
			}
			if (EngiesChaosModVariables.MapVariables.get(world).timecheckstop == false) {
				EngiesChaosModVariables.MapVariables.get(world).timeticks = world.dayTime();
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
			if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.TRUE_HARDCORE) == true) {
				EngiesChaosModVariables.MapVariables.get(world).truehardcoreenabledonworld = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			} else {
				EngiesChaosModVariables.MapVariables.get(world).truehardcoreenabledonworld = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
			if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIES_CHAOS_TOGGLE) == false && world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENRAGED_ZOMBIES_TOGGLE) == false
					&& world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.TRUE_THROWBACK_TOGGLE) == false) {
				world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.ENGIES_CHAOS_TOGGLE).set(true, world.getServer());
			}
			if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.HEAVY_LIGHTNING) == true) {
				EngiesChaosModVariables.MapVariables.get(world).heavylightningenabled = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			} else {
				EngiesChaosModVariables.MapVariables.get(world).heavylightningenabled = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
			if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_LIGHTNING) == true) {
				EngiesChaosModVariables.MapVariables.get(world).extremelightningenabled = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			} else {
				EngiesChaosModVariables.MapVariables.get(world).extremelightningenabled = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
			if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_DOOMSDAY_LIGHTNING) == true) {
				EngiesChaosModVariables.MapVariables.get(world).extremeddaylightningenabled = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			} else {
				EngiesChaosModVariables.MapVariables.get(world).extremeddaylightningenabled = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
			if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.NIGHTMARE_DIFFICULTY) == true || world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.INSANITY_DIFFICULTY) == true
					|| world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_ONE) == true || world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_TWO) == true
					|| world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_THREE) == true || world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIE_POC) == true) {
				if (world.getServer() != null)
					world.getServer().setDifficulty(Difficulty.HARD, true);
			}
			for (Entity entityiterator : new ArrayList<>(world.players())) {
				if (entityiterator.getPersistentData().getDouble("riftballdmgcd") > 0) {
					entityiterator.getPersistentData().putDouble("riftballdmgcd", (entityiterator.getPersistentData().getDouble("riftballdmgcd") - 1));
				}
				if (entityiterator.getPersistentData().getDouble("avadmgcd") > 0) {
					entityiterator.getPersistentData().putDouble("avadmgcd", (entityiterator.getPersistentData().getDouble("avadmgcd") - 1));
				}
				if (entityiterator.getPersistentData().getDouble("spikedmgcd") > 0) {
					entityiterator.getPersistentData().putDouble("spikedmgcd", (entityiterator.getPersistentData().getDouble("spikedmgcd") - 1));
				}
			}
		}
	}
}