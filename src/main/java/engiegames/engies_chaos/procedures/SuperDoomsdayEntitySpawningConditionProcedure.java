package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;

public class SuperDoomsdayEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIES_CHAOS_TOGGLE) == true) {
			if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD) {
				if ((EngiesChaosModVariables.MapVariables.get(world).sddaystart || EngiesChaosModVariables.MapVariables.get(world).thestart || EngiesChaosModVariables.MapVariables.get(world).engieswrathstart) == true) {
					if (EngiesChaosModVariables.MapVariables.get(world).TraderSuperDoomsdaySpawnLock == false) {
						return true;
					}
				} else if ((EngiesChaosModVariables.MapVariables.get(world).sddaystart && EngiesChaosModVariables.MapVariables.get(world).thestart && EngiesChaosModVariables.MapVariables.get(world).engieswrathstart) == false) {
					if (EngiesChaosModVariables.MapVariables.get(world).TraderSuperDoomsdaySpawnLock == false) {
						if (EngiesChaosModVariables.MapVariables.get(world).difficultytoggle == true) {
							if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty >= 11) {
								if (world.getMaxLocalRawBrightness(new BlockPos(x, y, z)) > 7) {
									return true;
								}
							}
						} else if (EngiesChaosModVariables.MapVariables.get(world).difficultytoggle == false) {
							if (world.getMaxLocalRawBrightness(new BlockPos(x, y, z)) > 7) {
								return true;
							}
						}
					}
				}
			} else if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER) {
				return false;
			} else if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.END) {
				return false;
			}
		}
		return false;
	}
}