package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;

public class NightmareHostileEngieySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIES_CHAOS_TOGGLE) == true) {
			if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.AMBIENCE_MODE) == false) {
				if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.NIGHTMARE_DIFFICULTY) == true || world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_TWO) == true
						|| world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_THREE) == true || world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIE_POC) == true
						|| EngiesChaosModVariables.MapVariables.get(world).sddaystart == true || EngiesChaosModVariables.MapVariables.get(world).thestart == true || EngiesChaosModVariables.MapVariables.get(world).engieswrathstart == true
						|| EngiesChaosModVariables.MapVariables.get(world).engiestruewrath == true) {
					if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD) {
						if (world.getMaxLocalRawBrightness(new BlockPos(x, y, z)) <= 7) {
							return true;
						}
					} else if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER) {
						if (world.getMaxLocalRawBrightness(new BlockPos(x, y, z)) <= 7) {
							return true;
						}
					} else if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.END) {
						return false;
					}
				} else if (!(world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.NIGHTMARE_DIFFICULTY) == true || world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_TWO) == true
						|| world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_THREE) == true || world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIE_POC) == true
						|| EngiesChaosModVariables.MapVariables.get(world).sddaystart == true || EngiesChaosModVariables.MapVariables.get(world).thestart == true || EngiesChaosModVariables.MapVariables.get(world).engieswrathstart == true
						|| EngiesChaosModVariables.MapVariables.get(world).engiestruewrath == true)) {
					return false;
				}
			} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.AMBIENCE_MODE) == true) {
				return false;
			}
		} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIES_CHAOS_TOGGLE) == false) {
			return false;
		}
		return false;
	}
}