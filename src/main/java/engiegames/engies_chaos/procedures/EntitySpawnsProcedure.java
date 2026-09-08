package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.ModList;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.EngiesChaosMod;

public class EntitySpawnsProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		EngiesChaosMod.queueServerWork(5, () -> {
			if (EngiesChaosModVariables.MapVariables.get(world).difficultytoggle == true) {
				if (EngiesChaosModVariables.MapVariables.get(world).mobbasehpmulttoggle == true) {
					if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/hostile")))) {
						if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty >= 1 && EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 525) {
							if (entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
								_livingEntity2.getAttribute(Attributes.MAX_HEALTH)
										.setBaseValue(((entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity1.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 2.5
												* EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 2.5 * EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
						} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty >= 525) {
							if (entity instanceof LivingEntity _livingEntity6 && _livingEntity6.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
								_livingEntity6.getAttribute(Attributes.MAX_HEALTH)
										.setBaseValue(((entity instanceof LivingEntity _livingEntity5 && _livingEntity5.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity5.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0)
												* EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth((float) ((entity instanceof LivingEntity _livingEntity7 && _livingEntity7.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity7.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0)
										* EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
						}
					} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/nightmarehostile")))) {
						if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty <= 0) {
							if (entity instanceof LivingEntity _livingEntity11 && _livingEntity11.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
								_livingEntity11.getAttribute(Attributes.MAX_HEALTH).setBaseValue(
										((entity instanceof LivingEntity _livingEntity10 && _livingEntity10.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity10.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 2));
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth(
										(float) ((entity instanceof LivingEntity _livingEntity12 && _livingEntity12.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity12.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 2));
						} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty >= 1 && EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 525) {
							if (entity instanceof LivingEntity _livingEntity15 && _livingEntity15.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
								_livingEntity15.getAttribute(Attributes.MAX_HEALTH)
										.setBaseValue(((entity instanceof LivingEntity _livingEntity14 && _livingEntity14.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity14.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0)
												* 2 * 2.5 * EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth(
										(float) ((entity instanceof LivingEntity _livingEntity16 && _livingEntity16.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity16.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 2
												* 2.5 * EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
						} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty >= 525) {
							if (entity instanceof LivingEntity _livingEntity19 && _livingEntity19.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
								_livingEntity19.getAttribute(Attributes.MAX_HEALTH)
										.setBaseValue(((entity instanceof LivingEntity _livingEntity18 && _livingEntity18.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity18.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0)
												* EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth(
										(float) ((entity instanceof LivingEntity _livingEntity20 && _livingEntity20.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity20.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0)
												* EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
						}
					} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/insanityhostile")))) {
						if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty <= 0) {
							if (entity instanceof LivingEntity _livingEntity24 && _livingEntity24.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
								_livingEntity24.getAttribute(Attributes.MAX_HEALTH).setBaseValue(
										((entity instanceof LivingEntity _livingEntity23 && _livingEntity23.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity23.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 3));
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth(
										(float) ((entity instanceof LivingEntity _livingEntity25 && _livingEntity25.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity25.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 3));
						} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty >= 1 && EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 525) {
							if (entity instanceof LivingEntity _livingEntity28 && _livingEntity28.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
								_livingEntity28.getAttribute(Attributes.MAX_HEALTH)
										.setBaseValue(((entity instanceof LivingEntity _livingEntity27 && _livingEntity27.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity27.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0)
												* 3 * 2.5 * EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth(
										(float) ((entity instanceof LivingEntity _livingEntity29 && _livingEntity29.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity29.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 3
												* 2.5 * EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
						} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty >= 525) {
							if (entity instanceof LivingEntity _livingEntity32 && _livingEntity32.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
								_livingEntity32.getAttribute(Attributes.MAX_HEALTH)
										.setBaseValue(((entity instanceof LivingEntity _livingEntity31 && _livingEntity31.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity31.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0)
												* EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth(
										(float) ((entity instanceof LivingEntity _livingEntity33 && _livingEntity33.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity33.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0)
												* EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
						}
					} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/engiepochostile")))) {
						if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty <= 0) {
							if (entity instanceof LivingEntity _livingEntity37 && _livingEntity37.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
								_livingEntity37.getAttribute(Attributes.MAX_HEALTH).setBaseValue(
										((entity instanceof LivingEntity _livingEntity36 && _livingEntity36.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity36.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 4));
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth(
										(float) ((entity instanceof LivingEntity _livingEntity38 && _livingEntity38.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity38.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 4));
						} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty >= 1 && EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 525) {
							if (entity instanceof LivingEntity _livingEntity41 && _livingEntity41.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
								_livingEntity41.getAttribute(Attributes.MAX_HEALTH)
										.setBaseValue(((entity instanceof LivingEntity _livingEntity40 && _livingEntity40.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity40.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0)
												* 4 * 2.5 * EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth(
										(float) ((entity instanceof LivingEntity _livingEntity42 && _livingEntity42.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity42.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 4
												* 2.5 * EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
						} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty >= 525) {
							if (entity instanceof LivingEntity _livingEntity45 && _livingEntity45.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
								_livingEntity45.getAttribute(Attributes.MAX_HEALTH)
										.setBaseValue(((entity instanceof LivingEntity _livingEntity44 && _livingEntity44.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity44.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0)
												* EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth(
										(float) ((entity instanceof LivingEntity _livingEntity46 && _livingEntity46.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity46.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0)
												* EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
						}
					} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/engiegameshostile")))) {
						if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty <= 0) {
							if (entity instanceof LivingEntity _livingEntity50 && _livingEntity50.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
								_livingEntity50.getAttribute(Attributes.MAX_HEALTH).setBaseValue(
										((entity instanceof LivingEntity _livingEntity49 && _livingEntity49.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity49.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 5));
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth(
										(float) ((entity instanceof LivingEntity _livingEntity51 && _livingEntity51.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity51.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 5));
						} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty >= 1 && EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 525) {
							if (entity instanceof LivingEntity _livingEntity54 && _livingEntity54.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
								_livingEntity54.getAttribute(Attributes.MAX_HEALTH)
										.setBaseValue(((entity instanceof LivingEntity _livingEntity53 && _livingEntity53.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity53.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0)
												* 5 * 2.5 * EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth(
										(float) ((entity instanceof LivingEntity _livingEntity55 && _livingEntity55.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity55.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 5
												* 2.5 * EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
						} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty >= 525) {
							if (entity instanceof LivingEntity _livingEntity58 && _livingEntity58.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
								_livingEntity58.getAttribute(Attributes.MAX_HEALTH)
										.setBaseValue(((entity instanceof LivingEntity _livingEntity57 && _livingEntity57.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity57.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0)
												* EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth(
										(float) ((entity instanceof LivingEntity _livingEntity59 && _livingEntity59.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity59.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0)
												* EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).mobbasehpmulttoggle == true) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty >= 1 && EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 525) {
						if (entity instanceof LivingEntity _livingEntity62 && _livingEntity62.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
							_livingEntity62.getAttribute(Attributes.MAX_HEALTH)
									.setBaseValue(((entity instanceof LivingEntity _livingEntity61 && _livingEntity61.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity61.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 2.5
											* EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 2.5 * EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
					} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty >= 525) {
						if (entity instanceof LivingEntity _livingEntity66 && _livingEntity66.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
							_livingEntity66.getAttribute(Attributes.MAX_HEALTH)
									.setBaseValue(((entity instanceof LivingEntity _livingEntity65 && _livingEntity65.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity65.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0)
											* EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((float) ((entity instanceof LivingEntity _livingEntity67 && _livingEntity67.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity67.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0)
									* EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).difficultytoggle == false) {
				if (EngiesChaosModVariables.MapVariables.get(world).mobbasehpmulttoggle == true) {
					if (ModList.get().isLoaded("attributefix") == true) {
						if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/nightmarehostile")))) {
							if (entity instanceof LivingEntity _livingEntity72 && _livingEntity72.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
								_livingEntity72.getAttribute(Attributes.MAX_HEALTH).setBaseValue(
										((entity instanceof LivingEntity _livingEntity71 && _livingEntity71.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity71.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 2));
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth(
										(float) ((entity instanceof LivingEntity _livingEntity73 && _livingEntity73.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity73.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 2));
						} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/insanityhostile")))) {
							if (entity instanceof LivingEntity _livingEntity77 && _livingEntity77.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
								_livingEntity77.getAttribute(Attributes.MAX_HEALTH).setBaseValue(
										((entity instanceof LivingEntity _livingEntity76 && _livingEntity76.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity76.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 3));
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth(
										(float) ((entity instanceof LivingEntity _livingEntity78 && _livingEntity78.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity78.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 3));
						} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/engiepochostile")))) {
							if (entity instanceof LivingEntity _livingEntity82 && _livingEntity82.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
								_livingEntity82.getAttribute(Attributes.MAX_HEALTH).setBaseValue(
										((entity instanceof LivingEntity _livingEntity81 && _livingEntity81.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity81.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 4));
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth(
										(float) ((entity instanceof LivingEntity _livingEntity83 && _livingEntity83.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity83.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 4));
						} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/engiegameshostile")))) {
							if (entity instanceof LivingEntity _livingEntity87 && _livingEntity87.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
								_livingEntity87.getAttribute(Attributes.MAX_HEALTH).setBaseValue(
										((entity instanceof LivingEntity _livingEntity86 && _livingEntity86.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity86.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 5));
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth(
										(float) ((entity instanceof LivingEntity _livingEntity88 && _livingEntity88.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity88.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 5));
						}
					}
				}
			}
		});
	}
}