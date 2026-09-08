package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModItems;
import engiegames.engies_chaos.init.EngiesChaosModAttributes;
import engiegames.engies_chaos.entity.PureInsanityEntity;
import engiegames.engies_chaos.entity.InsanityEntity;
import engiegames.engies_chaos.EngiesChaosMod;

@Mod.EventBusSubscriber
public class ItemSpawningProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof Player) {
			EngiesChaosMod.queueServerWork(1, () -> {
				if (Math.random() < 0.01905) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ENGIE_PLUSH.get()));
						entityToSpawn.setPickUpDelay(10);
						entityToSpawn.setUnlimitedLifetime();
						_level.addFreshEntity(entityToSpawn);
					}
				}
				if (Math.random() < 0.0004) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DEV_ENGIE_PLUSH.get()));
						entityToSpawn.setPickUpDelay(10);
						entityToSpawn.setUnlimitedLifetime();
						_level.addFreshEntity(entityToSpawn);
					}
				}
			});
			if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/mad_engie")))) {
				EngiesChaosMod.queueServerWork(1, () -> {
					if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MadEngieKillCount >= 50
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MadEngieKillCount < 100) {
						if (!(sourceentity instanceof ServerPlayer _plr11 && _plr11.level instanceof ServerLevel
								&& _plr11.getAdvancements().getOrStartProgress(_plr11.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:mad_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.MAD_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MadEngieKillCount >= 100
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MadEngieKillCount < 150) {
						if (!(sourceentity instanceof ServerPlayer _plr16 && _plr16.level instanceof ServerLevel
								&& _plr16.getAdvancements().getOrStartProgress(_plr16.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:mad_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.MAD_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr21 && _plr21.level instanceof ServerLevel
								&& _plr21.getAdvancements().getOrStartProgress(_plr21.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_mad_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_MAD_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MadEngieKillCount >= 150
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MadEngieKillCount < 200) {
						if (!(sourceentity instanceof ServerPlayer _plr26 && _plr26.level instanceof ServerLevel
								&& _plr26.getAdvancements().getOrStartProgress(_plr26.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:mad_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.MAD_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr31 && _plr31.level instanceof ServerLevel
								&& _plr31.getAdvancements().getOrStartProgress(_plr31.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_mad_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_MAD_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr36 && _plr36.level instanceof ServerLevel
								&& _plr36.getAdvancements().getOrStartProgress(_plr36.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_mad_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLD_MAD_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MadEngieKillCount >= 200
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MadEngieKillCount < 250) {
						if (!(sourceentity instanceof ServerPlayer _plr41 && _plr41.level instanceof ServerLevel
								&& _plr41.getAdvancements().getOrStartProgress(_plr41.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:mad_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.MAD_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr46 && _plr46.level instanceof ServerLevel
								&& _plr46.getAdvancements().getOrStartProgress(_plr46.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_mad_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_MAD_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr51 && _plr51.level instanceof ServerLevel
								&& _plr51.getAdvancements().getOrStartProgress(_plr51.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_mad_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLD_MAD_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr56 && _plr56.level instanceof ServerLevel
								&& _plr56.getAdvancements().getOrStartProgress(_plr56.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:diamond_mad_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DIAMOND_MAD_ENGIE_PLUS.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MadEngieKillCount >= 250) {
						if (!(sourceentity instanceof ServerPlayer _plr61 && _plr61.level instanceof ServerLevel
								&& _plr61.getAdvancements().getOrStartProgress(_plr61.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:mad_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.MAD_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr66 && _plr66.level instanceof ServerLevel
								&& _plr66.getAdvancements().getOrStartProgress(_plr66.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_mad_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_MAD_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr71 && _plr71.level instanceof ServerLevel
								&& _plr71.getAdvancements().getOrStartProgress(_plr71.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_mad_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLD_MAD_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr76 && _plr76.level instanceof ServerLevel
								&& _plr76.getAdvancements().getOrStartProgress(_plr76.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:diamond_mad_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DIAMOND_MAD_ENGIE_PLUS.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr81 && _plr81.level instanceof ServerLevel
								&& _plr81.getAdvancements().getOrStartProgress(_plr81.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:netherite_mad_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.NETHERITE_MAD_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				});
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/angry_engie")))) {
				EngiesChaosMod.queueServerWork(1, () -> {
					if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).AngryEngieKillCount >= 50
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).AngryEngieKillCount < 100) {
						if (!(sourceentity instanceof ServerPlayer _plr88 && _plr88.level instanceof ServerLevel
								&& _plr88.getAdvancements().getOrStartProgress(_plr88.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:angry_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).AngryEngieKillCount >= 100
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).AngryEngieKillCount < 150) {
						if (!(sourceentity instanceof ServerPlayer _plr93 && _plr93.level instanceof ServerLevel
								&& _plr93.getAdvancements().getOrStartProgress(_plr93.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:angry_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr98 && _plr98.level instanceof ServerLevel
								&& _plr98.getAdvancements().getOrStartProgress(_plr98.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_angry_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).AngryEngieKillCount >= 150
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).AngryEngieKillCount < 200) {
						if (!(sourceentity instanceof ServerPlayer _plr103 && _plr103.level instanceof ServerLevel
								&& _plr103.getAdvancements().getOrStartProgress(_plr103.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:angry_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr108 && _plr108.level instanceof ServerLevel
								&& _plr108.getAdvancements().getOrStartProgress(_plr108.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_angry_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr113 && _plr113.level instanceof ServerLevel
								&& _plr113.getAdvancements().getOrStartProgress(_plr113.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_angry_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).AngryEngieKillCount >= 200
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).AngryEngieKillCount < 250) {
						if (!(sourceentity instanceof ServerPlayer _plr118 && _plr118.level instanceof ServerLevel
								&& _plr118.getAdvancements().getOrStartProgress(_plr118.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:angry_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr123 && _plr123.level instanceof ServerLevel
								&& _plr123.getAdvancements().getOrStartProgress(_plr123.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_angry_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr128 && _plr128.level instanceof ServerLevel
								&& _plr128.getAdvancements().getOrStartProgress(_plr128.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_angry_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr133 && _plr133.level instanceof ServerLevel
								&& _plr133.getAdvancements().getOrStartProgress(_plr133.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:diamond_angry_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DIAMOND_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).AngryEngieKillCount >= 250) {
						if (!(sourceentity instanceof ServerPlayer _plr138 && _plr138.level instanceof ServerLevel
								&& _plr138.getAdvancements().getOrStartProgress(_plr138.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:angry_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr143 && _plr143.level instanceof ServerLevel
								&& _plr143.getAdvancements().getOrStartProgress(_plr143.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_angry_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr148 && _plr148.level instanceof ServerLevel
								&& _plr148.getAdvancements().getOrStartProgress(_plr148.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_angry_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr153 && _plr153.level instanceof ServerLevel
								&& _plr153.getAdvancements().getOrStartProgress(_plr153.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:diamond_angry_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DIAMOND_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr158 && _plr158.level instanceof ServerLevel
								&& _plr158.getAdvancements().getOrStartProgress(_plr158.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:netherite_angry_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.NETHERITE_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				});
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/enraged_engie")))) {
				EngiesChaosMod.queueServerWork(1, () -> {
					if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).EnragedEngieKillCount >= 50
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).EnragedEngieKillCount < 100) {
						if (!(sourceentity instanceof ServerPlayer _plr165 && _plr165.level instanceof ServerLevel
								&& _plr165.getAdvancements().getOrStartProgress(_plr165.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:enraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).EnragedEngieKillCount >= 100
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).EnragedEngieKillCount < 150) {
						if (!(sourceentity instanceof ServerPlayer _plr170 && _plr170.level instanceof ServerLevel
								&& _plr170.getAdvancements().getOrStartProgress(_plr170.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:enraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr175 && _plr175.level instanceof ServerLevel
								&& _plr175.getAdvancements().getOrStartProgress(_plr175.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_enraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).EnragedEngieKillCount >= 150
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).EnragedEngieKillCount < 200) {
						if (!(sourceentity instanceof ServerPlayer _plr180 && _plr180.level instanceof ServerLevel
								&& _plr180.getAdvancements().getOrStartProgress(_plr180.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:enraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr185 && _plr185.level instanceof ServerLevel
								&& _plr185.getAdvancements().getOrStartProgress(_plr185.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_enraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr190 && _plr190.level instanceof ServerLevel
								&& _plr190.getAdvancements().getOrStartProgress(_plr190.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_enraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).EnragedEngieKillCount >= 200
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).EnragedEngieKillCount < 250) {
						if (!(sourceentity instanceof ServerPlayer _plr195 && _plr195.level instanceof ServerLevel
								&& _plr195.getAdvancements().getOrStartProgress(_plr195.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:enraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr200 && _plr200.level instanceof ServerLevel
								&& _plr200.getAdvancements().getOrStartProgress(_plr200.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_enraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr205 && _plr205.level instanceof ServerLevel
								&& _plr205.getAdvancements().getOrStartProgress(_plr205.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_enraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr210 && _plr210.level instanceof ServerLevel
								&& _plr210.getAdvancements().getOrStartProgress(_plr210.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:diamond_enraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DIAMOND_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).EnragedEngieKillCount >= 250) {
						if (!(sourceentity instanceof ServerPlayer _plr215 && _plr215.level instanceof ServerLevel
								&& _plr215.getAdvancements().getOrStartProgress(_plr215.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:enraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr220 && _plr220.level instanceof ServerLevel
								&& _plr220.getAdvancements().getOrStartProgress(_plr220.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_enraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr225 && _plr225.level instanceof ServerLevel
								&& _plr225.getAdvancements().getOrStartProgress(_plr225.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_enraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr230 && _plr230.level instanceof ServerLevel
								&& _plr230.getAdvancements().getOrStartProgress(_plr230.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:diamond_enraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DIAMOND_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr235 && _plr235.level instanceof ServerLevel
								&& _plr235.getAdvancements().getOrStartProgress(_plr235.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:netherite_enraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.NETHERITE_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				});
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/outraged_engie")))) {
				EngiesChaosMod.queueServerWork(1, () -> {
					if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).OutragedEngieKillCount >= 50
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).OutragedEngieKillCount < 100) {
						if (!(sourceentity instanceof ServerPlayer _plr242 && _plr242.level instanceof ServerLevel
								&& _plr242.getAdvancements().getOrStartProgress(_plr242.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:outraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).OutragedEngieKillCount >= 100
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).OutragedEngieKillCount < 150) {
						if (!(sourceentity instanceof ServerPlayer _plr247 && _plr247.level instanceof ServerLevel
								&& _plr247.getAdvancements().getOrStartProgress(_plr247.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:outraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr252 && _plr252.level instanceof ServerLevel
								&& _plr252.getAdvancements().getOrStartProgress(_plr252.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_outraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).OutragedEngieKillCount >= 150
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).OutragedEngieKillCount < 200) {
						if (!(sourceentity instanceof ServerPlayer _plr257 && _plr257.level instanceof ServerLevel
								&& _plr257.getAdvancements().getOrStartProgress(_plr257.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:outraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr262 && _plr262.level instanceof ServerLevel
								&& _plr262.getAdvancements().getOrStartProgress(_plr262.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_outraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr267 && _plr267.level instanceof ServerLevel
								&& _plr267.getAdvancements().getOrStartProgress(_plr267.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_outraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).OutragedEngieKillCount >= 200
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).OutragedEngieKillCount < 250) {
						if (!(sourceentity instanceof ServerPlayer _plr272 && _plr272.level instanceof ServerLevel
								&& _plr272.getAdvancements().getOrStartProgress(_plr272.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:outraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr277 && _plr277.level instanceof ServerLevel
								&& _plr277.getAdvancements().getOrStartProgress(_plr277.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_outraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr282 && _plr282.level instanceof ServerLevel
								&& _plr282.getAdvancements().getOrStartProgress(_plr282.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_outraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr287 && _plr287.level instanceof ServerLevel
								&& _plr287.getAdvancements().getOrStartProgress(_plr287.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:diamond_outraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DIAMOND_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).OutragedEngieKillCount >= 250) {
						if (!(sourceentity instanceof ServerPlayer _plr292 && _plr292.level instanceof ServerLevel
								&& _plr292.getAdvancements().getOrStartProgress(_plr292.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:outraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr297 && _plr297.level instanceof ServerLevel
								&& _plr297.getAdvancements().getOrStartProgress(_plr297.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_outraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr302 && _plr302.level instanceof ServerLevel
								&& _plr302.getAdvancements().getOrStartProgress(_plr302.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_outraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr307 && _plr307.level instanceof ServerLevel
								&& _plr307.getAdvancements().getOrStartProgress(_plr307.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:diamond_outraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DIAMOND_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr312 && _plr312.level instanceof ServerLevel
								&& _plr312.getAdvancements().getOrStartProgress(_plr312.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:netherite_outraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.NETHERITE_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				});
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/biblicallyhostile")))) {
				EngiesChaosMod.queueServerWork(1, () -> {
					if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HostileBiblicallyKillCount >= 50
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HostileBiblicallyKillCount < 100) {
						if (!(sourceentity instanceof ServerPlayer _plr319 && _plr319.level instanceof ServerLevel
								&& _plr319.getAdvancements().getOrStartProgress(_plr319.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:biblically_accurate_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HostileBiblicallyKillCount >= 100
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HostileBiblicallyKillCount < 150) {
						if (!(sourceentity instanceof ServerPlayer _plr324 && _plr324.level instanceof ServerLevel
								&& _plr324.getAdvancements().getOrStartProgress(_plr324.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:biblically_accurate_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr329 && _plr329.level instanceof ServerLevel
								&& _plr329.getAdvancements().getOrStartProgress(_plr329.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_biblically_accurate_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_BIBLICALLY_ACCURATE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HostileBiblicallyKillCount >= 150
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HostileBiblicallyKillCount < 200) {
						if (!(sourceentity instanceof ServerPlayer _plr334 && _plr334.level instanceof ServerLevel
								&& _plr334.getAdvancements().getOrStartProgress(_plr334.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:biblically_accurate_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr339 && _plr339.level instanceof ServerLevel
								&& _plr339.getAdvancements().getOrStartProgress(_plr339.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_biblically_accurate_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_BIBLICALLY_ACCURATE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr344 && _plr344.level instanceof ServerLevel
								&& _plr344.getAdvancements().getOrStartProgress(_plr344.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_biblically_accurate_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_BIBLICALLY_ACCURATE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HostileBiblicallyKillCount >= 200
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HostileBiblicallyKillCount < 250) {
						if (!(sourceentity instanceof ServerPlayer _plr349 && _plr349.level instanceof ServerLevel
								&& _plr349.getAdvancements().getOrStartProgress(_plr349.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:biblically_accurate_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr354 && _plr354.level instanceof ServerLevel
								&& _plr354.getAdvancements().getOrStartProgress(_plr354.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_biblically_accurate_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_BIBLICALLY_ACCURATE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr359 && _plr359.level instanceof ServerLevel
								&& _plr359.getAdvancements().getOrStartProgress(_plr359.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_biblically_accurate_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_BIBLICALLY_ACCURATE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr364 && _plr364.level instanceof ServerLevel
								&& _plr364.getAdvancements().getOrStartProgress(_plr364.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:diamond_biblically_accurate_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DIAMOND_BIBLICALLY_ACCURATE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HostileBiblicallyKillCount >= 250) {
						if (!(sourceentity instanceof ServerPlayer _plr369 && _plr369.level instanceof ServerLevel
								&& _plr369.getAdvancements().getOrStartProgress(_plr369.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:biblically_accurate_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr374 && _plr374.level instanceof ServerLevel
								&& _plr374.getAdvancements().getOrStartProgress(_plr374.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_biblically_accurate_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_BIBLICALLY_ACCURATE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr379 && _plr379.level instanceof ServerLevel
								&& _plr379.getAdvancements().getOrStartProgress(_plr379.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_biblically_accurate_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_BIBLICALLY_ACCURATE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr384 && _plr384.level instanceof ServerLevel
								&& _plr384.getAdvancements().getOrStartProgress(_plr384.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:diamond_biblically_accurate_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DIAMOND_BIBLICALLY_ACCURATE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr389 && _plr389.level instanceof ServerLevel
								&& _plr389.getAdvancements().getOrStartProgress(_plr389.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:netherite_biblically_accurate_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.NETHERITE_BIBLICALLY_ACCURATE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				});
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/monstrosity_engie")))) {
				EngiesChaosMod.queueServerWork(1, () -> {
					if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MonstrosityEngieKillCount >= 50
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MonstrosityEngieKillCount < 100) {
						if (!(sourceentity instanceof ServerPlayer _plr396 && _plr396.level instanceof ServerLevel
								&& _plr396.getAdvancements().getOrStartProgress(_plr396.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:monstrosity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MonstrosityEngieKillCount >= 100
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MonstrosityEngieKillCount < 150) {
						if (!(sourceentity instanceof ServerPlayer _plr401 && _plr401.level instanceof ServerLevel
								&& _plr401.getAdvancements().getOrStartProgress(_plr401.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:monstrosity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr406 && _plr406.level instanceof ServerLevel
								&& _plr406.getAdvancements().getOrStartProgress(_plr406.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_monstrosity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MonstrosityEngieKillCount >= 150
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MonstrosityEngieKillCount < 200) {
						if (!(sourceentity instanceof ServerPlayer _plr411 && _plr411.level instanceof ServerLevel
								&& _plr411.getAdvancements().getOrStartProgress(_plr411.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:monstrosity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr416 && _plr416.level instanceof ServerLevel
								&& _plr416.getAdvancements().getOrStartProgress(_plr416.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_monstrosity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr421 && _plr421.level instanceof ServerLevel
								&& _plr421.getAdvancements().getOrStartProgress(_plr421.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_monstrosity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLD_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MonstrosityEngieKillCount >= 200
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MonstrosityEngieKillCount < 250) {
						if (!(sourceentity instanceof ServerPlayer _plr426 && _plr426.level instanceof ServerLevel
								&& _plr426.getAdvancements().getOrStartProgress(_plr426.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:monstrosity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr431 && _plr431.level instanceof ServerLevel
								&& _plr431.getAdvancements().getOrStartProgress(_plr431.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_monstrosity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr436 && _plr436.level instanceof ServerLevel
								&& _plr436.getAdvancements().getOrStartProgress(_plr436.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_monstrosity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLD_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr441 && _plr441.level instanceof ServerLevel
								&& _plr441.getAdvancements().getOrStartProgress(_plr441.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:diamond_monstrosity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DIAMOND_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MonstrosityEngieKillCount >= 250) {
						if (!(sourceentity instanceof ServerPlayer _plr446 && _plr446.level instanceof ServerLevel
								&& _plr446.getAdvancements().getOrStartProgress(_plr446.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:monstrosity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr451 && _plr451.level instanceof ServerLevel
								&& _plr451.getAdvancements().getOrStartProgress(_plr451.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_monstrosity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr456 && _plr456.level instanceof ServerLevel
								&& _plr456.getAdvancements().getOrStartProgress(_plr456.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_monstrosity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLD_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr461 && _plr461.level instanceof ServerLevel
								&& _plr461.getAdvancements().getOrStartProgress(_plr461.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:diamond_monstrosity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DIAMOND_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr466 && _plr466.level instanceof ServerLevel
								&& _plr466.getAdvancements().getOrStartProgress(_plr466.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:netherite_monstrosity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.NETHERITE_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				});
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/hostile_engie")))) {
				EngiesChaosMod.queueServerWork(1, () -> {
					if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HostileEngieKillCount >= 50
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HostileEngieKillCount < 100) {
						if (!(sourceentity instanceof ServerPlayer _plr473 && _plr473.level instanceof ServerLevel
								&& _plr473.getAdvancements().getOrStartProgress(_plr473.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:hostile_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.HOSTILE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HostileEngieKillCount >= 100
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HostileEngieKillCount < 150) {
						if (!(sourceentity instanceof ServerPlayer _plr478 && _plr478.level instanceof ServerLevel
								&& _plr478.getAdvancements().getOrStartProgress(_plr478.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:hostile_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.HOSTILE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr483 && _plr483.level instanceof ServerLevel
								&& _plr483.getAdvancements().getOrStartProgress(_plr483.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_hostile_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_HOSTILE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HostileEngieKillCount >= 150
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HostileEngieKillCount < 200) {
						if (!(sourceentity instanceof ServerPlayer _plr488 && _plr488.level instanceof ServerLevel
								&& _plr488.getAdvancements().getOrStartProgress(_plr488.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:hostile_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.HOSTILE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr493 && _plr493.level instanceof ServerLevel
								&& _plr493.getAdvancements().getOrStartProgress(_plr493.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_hostile_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_HOSTILE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr498 && _plr498.level instanceof ServerLevel
								&& _plr498.getAdvancements().getOrStartProgress(_plr498.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_hostile_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_HOSTILE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HostileEngieKillCount >= 200
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HostileEngieKillCount < 250) {
						if (!(sourceentity instanceof ServerPlayer _plr503 && _plr503.level instanceof ServerLevel
								&& _plr503.getAdvancements().getOrStartProgress(_plr503.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:hostile_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.HOSTILE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr508 && _plr508.level instanceof ServerLevel
								&& _plr508.getAdvancements().getOrStartProgress(_plr508.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_hostile_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_HOSTILE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr513 && _plr513.level instanceof ServerLevel
								&& _plr513.getAdvancements().getOrStartProgress(_plr513.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_hostile_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_HOSTILE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr518 && _plr518.level instanceof ServerLevel
								&& _plr518.getAdvancements().getOrStartProgress(_plr518.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:diamond_hostile_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DIAMOND_HOSTILE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HostileEngieKillCount >= 250) {
						if (!(sourceentity instanceof ServerPlayer _plr523 && _plr523.level instanceof ServerLevel
								&& _plr523.getAdvancements().getOrStartProgress(_plr523.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:hostile_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.HOSTILE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr528 && _plr528.level instanceof ServerLevel
								&& _plr528.getAdvancements().getOrStartProgress(_plr528.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_hostile_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_HOSTILE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr533 && _plr533.level instanceof ServerLevel
								&& _plr533.getAdvancements().getOrStartProgress(_plr533.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_hostile_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_HOSTILE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr538 && _plr538.level instanceof ServerLevel
								&& _plr538.getAdvancements().getOrStartProgress(_plr538.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:diamond_hostile_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DIAMOND_HOSTILE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr543 && _plr543.level instanceof ServerLevel
								&& _plr543.getAdvancements().getOrStartProgress(_plr543.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:netherite_hostile_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.NETHERITE_HOSTILE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				});
			} else if (entity instanceof InsanityEntity) {
				EngiesChaosMod.queueServerWork(1, () -> {
					if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).InsanityKillCount >= 50
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).InsanityKillCount < 100) {
						if (!(sourceentity instanceof ServerPlayer _plr550 && _plr550.level instanceof ServerLevel
								&& _plr550.getAdvancements().getOrStartProgress(_plr550.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).InsanityKillCount >= 100
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).InsanityKillCount < 150) {
						if (!(sourceentity instanceof ServerPlayer _plr555 && _plr555.level instanceof ServerLevel
								&& _plr555.getAdvancements().getOrStartProgress(_plr555.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr560 && _plr560.level instanceof ServerLevel
								&& _plr560.getAdvancements().getOrStartProgress(_plr560.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).InsanityKillCount >= 150
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).InsanityKillCount < 200) {
						if (!(sourceentity instanceof ServerPlayer _plr565 && _plr565.level instanceof ServerLevel
								&& _plr565.getAdvancements().getOrStartProgress(_plr565.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr570 && _plr570.level instanceof ServerLevel
								&& _plr570.getAdvancements().getOrStartProgress(_plr570.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr575 && _plr575.level instanceof ServerLevel
								&& _plr575.getAdvancements().getOrStartProgress(_plr575.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).InsanityKillCount >= 200
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).InsanityKillCount < 250) {
						if (!(sourceentity instanceof ServerPlayer _plr580 && _plr580.level instanceof ServerLevel
								&& _plr580.getAdvancements().getOrStartProgress(_plr580.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr585 && _plr585.level instanceof ServerLevel
								&& _plr585.getAdvancements().getOrStartProgress(_plr585.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr590 && _plr590.level instanceof ServerLevel
								&& _plr590.getAdvancements().getOrStartProgress(_plr590.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr595 && _plr595.level instanceof ServerLevel
								&& _plr595.getAdvancements().getOrStartProgress(_plr595.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:diamond_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DIAMOND_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).InsanityKillCount >= 250) {
						if (!(sourceentity instanceof ServerPlayer _plr600 && _plr600.level instanceof ServerLevel
								&& _plr600.getAdvancements().getOrStartProgress(_plr600.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr605 && _plr605.level instanceof ServerLevel
								&& _plr605.getAdvancements().getOrStartProgress(_plr605.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr610 && _plr610.level instanceof ServerLevel
								&& _plr610.getAdvancements().getOrStartProgress(_plr610.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr615 && _plr615.level instanceof ServerLevel
								&& _plr615.getAdvancements().getOrStartProgress(_plr615.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:diamond_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DIAMOND_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr620 && _plr620.level instanceof ServerLevel
								&& _plr620.getAdvancements().getOrStartProgress(_plr620.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:netherite_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.NETHERITE_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				});
			} else if (entity instanceof PureInsanityEntity) {
				EngiesChaosMod.queueServerWork(1, () -> {
					if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).InsanityKillCount >= 50
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).InsanityKillCount < 100) {
						if (!(sourceentity instanceof ServerPlayer _plr627 && _plr627.level instanceof ServerLevel
								&& _plr627.getAdvancements().getOrStartProgress(_plr627.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).InsanityKillCount >= 100
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).InsanityKillCount < 150) {
						if (!(sourceentity instanceof ServerPlayer _plr632 && _plr632.level instanceof ServerLevel
								&& _plr632.getAdvancements().getOrStartProgress(_plr632.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr637 && _plr637.level instanceof ServerLevel
								&& _plr637.getAdvancements().getOrStartProgress(_plr637.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).InsanityKillCount >= 150
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).InsanityKillCount < 200) {
						if (!(sourceentity instanceof ServerPlayer _plr642 && _plr642.level instanceof ServerLevel
								&& _plr642.getAdvancements().getOrStartProgress(_plr642.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr647 && _plr647.level instanceof ServerLevel
								&& _plr647.getAdvancements().getOrStartProgress(_plr647.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr652 && _plr652.level instanceof ServerLevel
								&& _plr652.getAdvancements().getOrStartProgress(_plr652.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).InsanityKillCount >= 200
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).InsanityKillCount < 250) {
						if (!(sourceentity instanceof ServerPlayer _plr657 && _plr657.level instanceof ServerLevel
								&& _plr657.getAdvancements().getOrStartProgress(_plr657.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr662 && _plr662.level instanceof ServerLevel
								&& _plr662.getAdvancements().getOrStartProgress(_plr662.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr667 && _plr667.level instanceof ServerLevel
								&& _plr667.getAdvancements().getOrStartProgress(_plr667.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr672 && _plr672.level instanceof ServerLevel
								&& _plr672.getAdvancements().getOrStartProgress(_plr672.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:diamond_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DIAMOND_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).InsanityKillCount >= 250) {
						if (!(sourceentity instanceof ServerPlayer _plr677 && _plr677.level instanceof ServerLevel
								&& _plr677.getAdvancements().getOrStartProgress(_plr677.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr682 && _plr682.level instanceof ServerLevel
								&& _plr682.getAdvancements().getOrStartProgress(_plr682.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr687 && _plr687.level instanceof ServerLevel
								&& _plr687.getAdvancements().getOrStartProgress(_plr687.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr692 && _plr692.level instanceof ServerLevel
								&& _plr692.getAdvancements().getOrStartProgress(_plr692.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:diamond_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DIAMOND_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr697 && _plr697.level instanceof ServerLevel
								&& _plr697.getAdvancements().getOrStartProgress(_plr697.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:netherite_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.NETHERITE_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				});
			}
			if (EngiesChaosModVariables.MapVariables.get(world).antimatterdropcheck == true) {
				if (Math.round(Mth.nextDouble(RandomSource.create(), 0,
						100)) <= (sourceentity instanceof LivingEntity _livingEntity704 && _livingEntity704.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
								? _livingEntity704.getAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
								: 0)) {
					if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) <= 5) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER.get()));
							entityToSpawn.setPickUpDelay(10);
							entityToSpawn.setUnlimitedLifetime();
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_FRAGMENT.get()));
							entityToSpawn.setPickUpDelay(10);
							entityToSpawn.setUnlimitedLifetime();
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
			if (entity instanceof ServerPlayer _plr714 && _plr714.level instanceof ServerLevel
					&& _plr714.getAdvancements().getOrStartProgress(_plr714.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:all_fully_done"))).isDone()) {
				if (Math.round(Mth.nextDouble(RandomSource.create(), 0,
						100)) <= (sourceentity instanceof LivingEntity _livingEntity716 && _livingEntity716.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get())
								? _livingEntity716.getAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
								: 0)) {
					if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) <= 5) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DARKMATTER.get()));
							entityToSpawn.setPickUpDelay(10);
							entityToSpawn.setUnlimitedLifetime();
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DARKMATTER_FRAGMENT.get()));
							entityToSpawn.setPickUpDelay(10);
							entityToSpawn.setUnlimitedLifetime();
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
		}
		if (Math.random() < 0.0004) {
			if (Mth.nextInt(RandomSource.create(), 1, 9) == 1) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.ITEMS_PLAQUE.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 9) == 2) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.MOBS_PLAQUE.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 9) == 3) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.EXTRAS_PLAQUE.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 9) == 4) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.SHARKOS_PLAQUE.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 9) == 5) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.DIMENSIONS_PLAQUE.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 9) == 6) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.ENRAGED_ZOMBIES_PLAQUE.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 9) == 7) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.ALL_ABOUT_ENGIE_PLAQUE.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 9) == 8) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.ENGIES_CHAOS_PLAQUE.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 9) == 9) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.ENGIE_PLAQUE.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}