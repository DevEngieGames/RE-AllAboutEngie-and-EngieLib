package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.entity.MonstrosityEngieEntity;

public class MonstrosityEngieTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (EngiesChaosModVariables.MapVariables.get(world).seasonautumn == true || EngiesChaosModVariables.MapVariables.get(world).seasonwinter == true) {
			if (entity instanceof MonstrosityEngieEntity _datEntSetL)
				_datEntSetL.getEntityData().set(MonstrosityEngieEntity.DATA_coldseasoned, true);
		} else {
			if (entity instanceof MonstrosityEngieEntity _datEntSetL)
				_datEntSetL.getEntityData().set(MonstrosityEngieEntity.DATA_coldseasoned, false);
		}
	}
}