package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.entity.BiblicallyAccurateEngieEntity;

public class BiblicallyAccurateEngieTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty >= 1) {
			if (entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity0.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((100 * 2.5 * EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
		} else {
			if (entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity1.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(100);
		}
		if (EngiesChaosModVariables.MapVariables.get(world).seasonautumn == true || EngiesChaosModVariables.MapVariables.get(world).seasonwinter == true) {
			if (entity instanceof BiblicallyAccurateEngieEntity _datEntSetL)
				_datEntSetL.getEntityData().set(BiblicallyAccurateEngieEntity.DATA_coldseasoned, true);
		} else {
			if (entity instanceof BiblicallyAccurateEngieEntity _datEntSetL)
				_datEntSetL.getEntityData().set(BiblicallyAccurateEngieEntity.DATA_coldseasoned, false);
		}
	}
}