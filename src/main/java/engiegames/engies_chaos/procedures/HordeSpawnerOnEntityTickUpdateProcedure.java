package engiegames.engies_chaos.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

import java.util.Comparator;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModEntities;
import engiegames.engies_chaos.entity.NightmareOutragedEngieEntity;
import engiegames.engies_chaos.entity.NightmareMonstrosityEngieEntity;
import engiegames.engies_chaos.entity.NightmareMadEngieEntity;
import engiegames.engies_chaos.entity.NightmareHostileBiblicallyAccurateEngieEntity;
import engiegames.engies_chaos.entity.NightmareEnragedEngieEntity;
import engiegames.engies_chaos.entity.NightmareEngieEntity;
import engiegames.engies_chaos.entity.NightmareAngryEngieEntity;
import engiegames.engies_chaos.entity.MonstrosityEngieEntity;
import engiegames.engies_chaos.entity.MadEngieEntity;
import engiegames.engies_chaos.entity.InsanityOutragedEngieEntity;
import engiegames.engies_chaos.entity.InsanityMonstrosityEngieEntity;
import engiegames.engies_chaos.entity.InsanityMadEngieEntity;
import engiegames.engies_chaos.entity.InsanityHostileBiblicallyAccurateEngieEntity;
import engiegames.engies_chaos.entity.InsanityEnragedEngieEntity;
import engiegames.engies_chaos.entity.InsanityEngieEntity;
import engiegames.engies_chaos.entity.InsanityAngryEngieEntity;
import engiegames.engies_chaos.entity.HsotileEngieEntity;
import engiegames.engies_chaos.entity.HostileBiblicallyAccurateEngieEntity;
import engiegames.engies_chaos.entity.EnragedEngieEntity;
import engiegames.engies_chaos.entity.EngiePocOutragedEngieEntity;
import engiegames.engies_chaos.entity.EngiePocMonstrosityEngieEntity;
import engiegames.engies_chaos.entity.EngiePocMadEngieEntity;
import engiegames.engies_chaos.entity.EngiePocHostileBiblicallyAccurateEngieEntity;
import engiegames.engies_chaos.entity.EngiePocEnragedEngieEntity;
import engiegames.engies_chaos.entity.EngiePocEngieEntity;
import engiegames.engies_chaos.entity.EngiePocAngryEngieEntity;
import engiegames.engies_chaos.entity.AngryEngieEntity;
import engiegames.engies_chaos.entity.AngryCreatorEntity;
import engiegames.engies_chaos.EngiesChaosMod;

public class HordeSpawnerOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 999999, 255, false, false));
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR) {
			{
				Entity _ent = entity;
				_ent.teleportTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, _ent.getYRot(), _ent.getXRot());
			}
		} else {
			if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 1) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 1) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index0 = 0; index0 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index0++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new MadEngieEntity(EngiesChaosModEntities.MAD_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new MadEngieEntity(EngiesChaosModEntities.MAD_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 2) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index1 = 0; index1 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index1++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new AngryEngieEntity(EngiesChaosModEntities.ANGRY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new AngryEngieEntity(EngiesChaosModEntities.ANGRY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 3) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index2 = 0; index2 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index2++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EnragedEngieEntity(EngiesChaosModEntities.ENRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EnragedEngieEntity(EngiesChaosModEntities.ENRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 4) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index3 = 0; index3 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index3++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new AngryCreatorEntity(EngiesChaosModEntities.OUTRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new AngryCreatorEntity(EngiesChaosModEntities.OUTRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 5) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index4 = 0; index4 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index4++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new HostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new HostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 6) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index5 = 0; index5 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index5++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new MonstrosityEngieEntity(EngiesChaosModEntities.MONSTROSITY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new MonstrosityEngieEntity(EngiesChaosModEntities.MONSTROSITY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 7) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index6 = 0; index6 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index6++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new HsotileEngieEntity(EngiesChaosModEntities.HOSTILE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new HsotileEngieEntity(EngiesChaosModEntities.HOSTILE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
				EngiesChaosMod.queueServerWork(1, () -> {
					{
						final Vec3 _center = new Vec3(x, y, z);
						for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
							if (entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/hostile")))) {
								entityiterator.getPersistentData().putBoolean("hordespawned", true);
							}
						}
					}
				});
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 2) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 1) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index7 = 0; index7 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index7++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareMadEngieEntity(EngiesChaosModEntities.NIGHTMARE_MAD_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new NightmareMadEngieEntity(EngiesChaosModEntities.NIGHTMARE_MAD_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 2) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index8 = 0; index8 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index8++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareAngryEngieEntity(EngiesChaosModEntities.NIGHTMARE_ANGRY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new NightmareAngryEngieEntity(EngiesChaosModEntities.NIGHTMARE_ANGRY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 3) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index9 = 0; index9 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index9++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareEnragedEngieEntity(EngiesChaosModEntities.NIGHTMARE_ENRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new NightmareEnragedEngieEntity(EngiesChaosModEntities.NIGHTMARE_ENRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 4) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index10 = 0; index10 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index10++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareOutragedEngieEntity(EngiesChaosModEntities.NIGHTMARE_OUTRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new NightmareOutragedEngieEntity(EngiesChaosModEntities.NIGHTMARE_OUTRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 5) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index11 = 0; index11 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index11++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.NIGHTMARE_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new NightmareHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.NIGHTMARE_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 6) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index12 = 0; index12 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index12++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareMonstrosityEngieEntity(EngiesChaosModEntities.NIGHTMARE_MONSTROSITY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new NightmareMonstrosityEngieEntity(EngiesChaosModEntities.NIGHTMARE_MONSTROSITY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnightmarehordenumb == 7) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index13 = 0; index13 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index13++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareEngieEntity(EngiesChaosModEntities.NIGHTMARE_HOSTILE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new NightmareEngieEntity(EngiesChaosModEntities.NIGHTMARE_HOSTILE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
				EngiesChaosMod.queueServerWork(1, () -> {
					{
						final Vec3 _center = new Vec3(x, y, z);
						for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
							if (entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/nightmarehostile")))) {
								entityiterator.getPersistentData().putBoolean("hordespawned", true);
							}
						}
					}
				});
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 3) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 1) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index14 = 0; index14 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index14++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityMadEngieEntity(EngiesChaosModEntities.INSANITY_MAD_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new InsanityMadEngieEntity(EngiesChaosModEntities.INSANITY_MAD_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 2) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index15 = 0; index15 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index15++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityAngryEngieEntity(EngiesChaosModEntities.INSANITY_ANGRY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new InsanityAngryEngieEntity(EngiesChaosModEntities.INSANITY_ANGRY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 3) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index16 = 0; index16 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index16++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityEnragedEngieEntity(EngiesChaosModEntities.INSANITY_ENRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new InsanityEnragedEngieEntity(EngiesChaosModEntities.INSANITY_ENRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 4) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index17 = 0; index17 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index17++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityOutragedEngieEntity(EngiesChaosModEntities.INSANITY_OUTRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new InsanityOutragedEngieEntity(EngiesChaosModEntities.INSANITY_OUTRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 5) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index18 = 0; index18 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index18++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.INSANITY_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new InsanityHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.INSANITY_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 6) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index19 = 0; index19 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index19++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityMonstrosityEngieEntity(EngiesChaosModEntities.INSANITY_MONSTROSITY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new InsanityMonstrosityEngieEntity(EngiesChaosModEntities.INSANITY_MONSTROSITY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 7) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index20 = 0; index20 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index20++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new InsanityEngieEntity(EngiesChaosModEntities.INSANITY_HOSTILE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new InsanityEngieEntity(EngiesChaosModEntities.INSANITY_HOSTILE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
				EngiesChaosMod.queueServerWork(1, () -> {
					{
						final Vec3 _center = new Vec3(x, y, z);
						for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
							if (entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/insanityhostile")))) {
								entityiterator.getPersistentData().putBoolean("hordespawned", true);
							}
						}
					}
				});
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 4) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 1) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index21 = 0; index21 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index21++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocMadEngieEntity(EngiesChaosModEntities.ENGIE_POC_MAD_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngiePocMadEngieEntity(EngiesChaosModEntities.ENGIE_POC_MAD_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 2) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index22 = 0; index22 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index22++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocAngryEngieEntity(EngiesChaosModEntities.ENGIE_POC_ANGRY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngiePocAngryEngieEntity(EngiesChaosModEntities.ENGIE_POC_ANGRY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 3) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index23 = 0; index23 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index23++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocEnragedEngieEntity(EngiesChaosModEntities.ENGIE_POC_ENRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngiePocEnragedEngieEntity(EngiesChaosModEntities.ENGIE_POC_ENRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 4) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index24 = 0; index24 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index24++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocOutragedEngieEntity(EngiesChaosModEntities.ENGIE_POC_OUTRAGED_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngiePocOutragedEngieEntity(EngiesChaosModEntities.ENGIE_POC_OUTRAGED_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 5) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index25 = 0; index25 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index25++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.ENGIE_POC_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngiePocHostileBiblicallyAccurateEngieEntity(EngiesChaosModEntities.ENGIE_POC_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 6) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index26 = 0; index26 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index26++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocMonstrosityEngieEntity(EngiesChaosModEntities.ENGIE_POC_MONSTROSITY_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngiePocMonstrosityEngieEntity(EngiesChaosModEntities.ENGIE_POC_MONSTROSITY_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophengiepochordenumb == 7) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount != 0) {
						for (int index27 = 0; index27 < (int) EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount; index27++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new EngiePocEngieEntity(EngiesChaosModEntities.ENGIE_POC_HOSTILE_ENGIE.get(), _level);
								entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 0) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EngiePocEngieEntity(EngiesChaosModEntities.ENGIE_POC_HOSTILE_ENGIE.get(), _level);
							entityToSpawn.moveTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
				EngiesChaosMod.queueServerWork(1, () -> {
					{
						final Vec3 _center = new Vec3(x, y, z);
						for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
							if (entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/engiepochostile")))) {
								entityiterator.getPersistentData().putBoolean("hordespawned", true);
							}
						}
					}
				});
			}
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}