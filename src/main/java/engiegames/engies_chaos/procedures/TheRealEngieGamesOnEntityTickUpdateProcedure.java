package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import java.util.Calendar;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModEntities;
import engiegames.engies_chaos.entity.TheRealEngieGamesHalloweenEntity;

public class TheRealEngieGamesOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Calendar.getInstance().get(Calendar.MONTH) == 9 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) >= 29) {
			if (!entity.level.isClientSide())
				entity.discard();
			EngiesChaosModVariables.MapVariables.get(world).numberofengiegames = EngiesChaosModVariables.MapVariables.get(world).numberofengiegames - 1;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new TheRealEngieGamesHalloweenEntity(EngiesChaosModEntities.THE_REAL_ENGIE_GAMES_HALLOWEEN.get(), _level);
				entityToSpawn.moveTo(x, y, z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}