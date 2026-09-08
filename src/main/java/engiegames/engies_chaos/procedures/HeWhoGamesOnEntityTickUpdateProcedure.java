package engiegames.engies_chaos.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import java.util.Comparator;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.EngiesChaosMod;

public class HeWhoGamesOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (EngiesChaosModVariables.MapVariables.get(world).hewhowatches == true) {
			if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(10 / 2d), e -> true).isEmpty()) {
				if (!entity.level.isClientSide())
					entity.discard();
				EngiesChaosMod.queueServerWork(1, () -> {
					EngiesChaosModVariables.MapVariables.get(world).nightmare = EngiesChaosModVariables.MapVariables.get(world).nightmare + 1;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				});
			}
			if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(50 / 2d), e -> true).isEmpty()) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(50 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
						if (entityiterator instanceof Player) {
							entity.lookAt(EntityAnchorArgument.Anchor.EYES,
									new Vec3(((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HHGLookX),
											((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HHGLookY),
											((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HHGLookZ)));
						}
					}
				}
				if (entity instanceof Mob _entity)
					_entity.getNavigation().stop();
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 999999, 5, false, false));
			} else {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).hewhowatches == false) {
			if (!entity.level.isClientSide())
				entity.discard();
			EngiesChaosModVariables.MapVariables.get(world).nightmare = 0;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		}
	}
}