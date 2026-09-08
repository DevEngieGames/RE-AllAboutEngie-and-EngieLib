package engiegames.engies_chaos.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.Direction;
import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.ArrayList;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class ShadowSharkEngieBlindOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double raytrace_distance = 0;
		double rx = 0;
		double ry = 0;
		double rz = 0;
		boolean entity_found = false;
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(200 / 2d), e -> true).isEmpty()) {
				entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entityiterator.getX()), (entityiterator.getY() + 1.5), (entityiterator.getZ())));
				if ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).BlindShadowSharkEngieAttack == false) {
					if (!(!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(100 / 2d), e -> true).isEmpty())) {
						if ((entityiterator.getDirection()) == Direction.NORTH) {
							if (Mth.nextDouble(RandomSource.create(), 1, 4) <= 2) {
								{
									Entity _ent = entity;
									_ent.teleportTo((entityiterator.getX() + Mth.nextDouble(RandomSource.create(), 1, 45)), (entityiterator.getY()), (entityiterator.getZ() - Mth.nextDouble(RandomSource.create(), 25, 45)));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((entityiterator.getX() + Mth.nextDouble(RandomSource.create(), 1, 45)), (entityiterator.getY()), (entityiterator.getZ() - Mth.nextDouble(RandomSource.create(), 25, 45)),
												_ent.getYRot(), _ent.getXRot());
								}
							} else if (Mth.nextDouble(RandomSource.create(), 1, 4) >= 3) {
								{
									Entity _ent = entity;
									_ent.teleportTo((entityiterator.getX() - Mth.nextDouble(RandomSource.create(), 1, 45)), (entityiterator.getY()), (entityiterator.getZ() - Mth.nextDouble(RandomSource.create(), 25, 45)));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((entityiterator.getX() - Mth.nextDouble(RandomSource.create(), 1, 45)), (entityiterator.getY()), (entityiterator.getZ() - Mth.nextDouble(RandomSource.create(), 25, 45)),
												_ent.getYRot(), _ent.getXRot());
								}
							}
						} else if ((entityiterator.getDirection()) == Direction.SOUTH) {
							if (Mth.nextDouble(RandomSource.create(), 1, 4) <= 2) {
								{
									Entity _ent = entity;
									_ent.teleportTo((entityiterator.getX() + Mth.nextDouble(RandomSource.create(), 1, 45)), (entityiterator.getY()), (entityiterator.getZ() + Mth.nextDouble(RandomSource.create(), 25, 45)));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((entityiterator.getX() + Mth.nextDouble(RandomSource.create(), 1, 45)), (entityiterator.getY()), (entityiterator.getZ() + Mth.nextDouble(RandomSource.create(), 25, 45)),
												_ent.getYRot(), _ent.getXRot());
								}
							} else if (Mth.nextDouble(RandomSource.create(), 1, 4) >= 3) {
								{
									Entity _ent = entity;
									_ent.teleportTo((entityiterator.getX() - Mth.nextDouble(RandomSource.create(), 1, 45)), (entityiterator.getY()), (entityiterator.getZ() + Mth.nextDouble(RandomSource.create(), 25, 45)));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((entityiterator.getX() - Mth.nextDouble(RandomSource.create(), 1, 45)), (entityiterator.getY()), (entityiterator.getZ() + Mth.nextDouble(RandomSource.create(), 25, 45)),
												_ent.getYRot(), _ent.getXRot());
								}
							}
						} else if ((entityiterator.getDirection()) == Direction.EAST) {
							if (Mth.nextDouble(RandomSource.create(), 1, 4) <= 2) {
								{
									Entity _ent = entity;
									_ent.teleportTo((entityiterator.getX() + Mth.nextDouble(RandomSource.create(), 25, 45)), (entityiterator.getY()), (entityiterator.getZ() + Mth.nextDouble(RandomSource.create(), 1, 45)));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((entityiterator.getX() + Mth.nextDouble(RandomSource.create(), 25, 45)), (entityiterator.getY()), (entityiterator.getZ() + Mth.nextDouble(RandomSource.create(), 1, 45)),
												_ent.getYRot(), _ent.getXRot());
								}
							} else if (Mth.nextDouble(RandomSource.create(), 1, 4) >= 3) {
								{
									Entity _ent = entity;
									_ent.teleportTo((entityiterator.getX() + Mth.nextDouble(RandomSource.create(), 25, 45)), (entityiterator.getY()), (entityiterator.getZ() - Mth.nextDouble(RandomSource.create(), 1, 45)));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((entityiterator.getX() + Mth.nextDouble(RandomSource.create(), 25, 45)), (entityiterator.getY()), (entityiterator.getZ() - Mth.nextDouble(RandomSource.create(), 1, 45)),
												_ent.getYRot(), _ent.getXRot());
								}
							}
						} else if ((entityiterator.getDirection()) == Direction.WEST) {
							if (Mth.nextDouble(RandomSource.create(), 1, 4) <= 2) {
								{
									Entity _ent = entity;
									_ent.teleportTo((entityiterator.getX() - Mth.nextDouble(RandomSource.create(), 25, 45)), (entityiterator.getY()), (entityiterator.getZ() + Mth.nextDouble(RandomSource.create(), 1, 45)));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((entityiterator.getX() - Mth.nextDouble(RandomSource.create(), 25, 45)), (entityiterator.getY()), (entityiterator.getZ() + Mth.nextDouble(RandomSource.create(), 1, 45)),
												_ent.getYRot(), _ent.getXRot());
								}
							} else if (Mth.nextDouble(RandomSource.create(), 1, 4) >= 3) {
								{
									Entity _ent = entity;
									_ent.teleportTo((entityiterator.getX() - Mth.nextDouble(RandomSource.create(), 25, 45)), (entityiterator.getY()), (entityiterator.getZ() - Mth.nextDouble(RandomSource.create(), 1, 45)));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((entityiterator.getX() - Mth.nextDouble(RandomSource.create(), 25, 45)), (entityiterator.getY()), (entityiterator.getZ() - Mth.nextDouble(RandomSource.create(), 1, 45)),
												_ent.getYRot(), _ent.getXRot());
								}
							}
						}
					} else if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(5 / 2d), e -> true).isEmpty()) {
						if (!entity.level.isClientSide())
							entity.discard();
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.ENCHANT, x, y, z, 15, 1, 2, 1, 1);
					} else {
						if (entity instanceof Mob _entity)
							_entity.getNavigation().stop();
					}
				} else if ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).BlindShadowSharkEngieAttack == true) {
					if (entity instanceof Mob _entity)
						_entity.getNavigation().moveTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 1);
					if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(2 / 2d), e -> true).isEmpty()) {
						{
							Entity _ent = entityiterator;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "effect give @s blindness 10 255 true");
							}
						}
						{
							boolean _setval = false;
							entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.BlindShadowSharkEngieAttack = _setval;
								capability.syncPlayerVariables(entityiterator);
							});
						}
						if (!entity.level.isClientSide())
							entity.discard();
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.ENCHANT, x, y, z, 15, 1, 2, 1, 1);
					}
				}
			}
		}
	}
}