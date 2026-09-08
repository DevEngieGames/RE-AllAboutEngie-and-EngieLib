package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;
import engiegames.engies_chaos.entity.CosmicDeathSharkoEntity;

public class CosmicDeathSharkoOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (entity instanceof CosmicDeathSharkoEntity _datEntI ? _datEntI.getEntityData().get(CosmicDeathSharkoEntity.DATA_SharkoState) : 0) != 0) {
				entity.getPersistentData().putDouble("SharkoStateTimerForChance", (entity.getPersistentData().getDouble("SharkoStateTimerForChance") - 0.05));
				if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIE_POC) == true) {
					if ((entity instanceof CosmicDeathSharkoEntity _datEntI ? _datEntI.getEntityData().get(CosmicDeathSharkoEntity.DATA_SharkoState) : 0) == 4) {
						if (entity instanceof CosmicDeathSharkoEntity _datEntSetI)
							_datEntSetI.getEntityData().set(CosmicDeathSharkoEntity.DATA_SharkoState, 3);
					}
				}
				if (entity.getPersistentData().getDouble("SharkoStateTimerForChance") <= 0) {
					if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIE_POC) == true) {
						entity.getPersistentData().putDouble("SharkoStateTimerForChance", Math.floor(Mth.nextDouble(RandomSource.create(), 5, 60)));
						if (!entity.isInWater() && !entity.isInLava()) {
							if ((entity instanceof CosmicDeathSharkoEntity _datEntI ? _datEntI.getEntityData().get(CosmicDeathSharkoEntity.DATA_SharkoState) : 0) == 1) {
								if (Math.random() <= 0.5) {
									if (entity instanceof CosmicDeathSharkoEntity _datEntSetI)
										_datEntSetI.getEntityData().set(CosmicDeathSharkoEntity.DATA_SharkoState, 2);
									if (Math.random() <= 0.49) {
										if (entity instanceof CosmicDeathSharkoEntity _datEntSetL)
											_datEntSetL.getEntityData().set(CosmicDeathSharkoEntity.DATA_AlternateState, false);
									} else {
										if (entity instanceof CosmicDeathSharkoEntity _datEntSetL)
											_datEntSetL.getEntityData().set(CosmicDeathSharkoEntity.DATA_AlternateState, true);
									}
								}
							} else if ((entity instanceof CosmicDeathSharkoEntity _datEntI ? _datEntI.getEntityData().get(CosmicDeathSharkoEntity.DATA_SharkoState) : 0) == 2) {
								if (Math.random() <= 0.5) {
									if (Math.random() <= 0.49) {
										if (entity instanceof CosmicDeathSharkoEntity _datEntSetI)
											_datEntSetI.getEntityData().set(CosmicDeathSharkoEntity.DATA_SharkoState, 3);
									} else {
										if (Math.random() >= 0.75) {
											if (entity instanceof CosmicDeathSharkoEntity _datEntSetI)
												_datEntSetI.getEntityData().set(CosmicDeathSharkoEntity.DATA_SharkoState, 1);
										}
									}
								}
							} else if ((entity instanceof CosmicDeathSharkoEntity _datEntI ? _datEntI.getEntityData().get(CosmicDeathSharkoEntity.DATA_SharkoState) : 0) == 3) {
								if (Math.random() >= 0.75) {
									if (entity instanceof CosmicDeathSharkoEntity _datEntSetI)
										_datEntSetI.getEntityData().set(CosmicDeathSharkoEntity.DATA_SharkoState, 2);
									if (Math.random() <= 0.49) {
										if (entity instanceof CosmicDeathSharkoEntity _datEntSetL)
											_datEntSetL.getEntityData().set(CosmicDeathSharkoEntity.DATA_AlternateState, false);
									} else {
										if (entity instanceof CosmicDeathSharkoEntity _datEntSetL)
											_datEntSetL.getEntityData().set(CosmicDeathSharkoEntity.DATA_AlternateState, true);
									}
								}
							}
						}
					} else {
						if (world instanceof Level _lvl25 && _lvl25.isDay()) {
							entity.getPersistentData().putDouble("SharkoStateTimerForChance", Math.floor(Mth.nextDouble(RandomSource.create(), 10, 60)));
							if (!entity.isInWater() && !entity.isInLava()) {
								if ((entity instanceof CosmicDeathSharkoEntity _datEntI ? _datEntI.getEntityData().get(CosmicDeathSharkoEntity.DATA_SharkoState) : 0) == 1) {
									if (Math.random() <= 0.5) {
										if (entity instanceof CosmicDeathSharkoEntity _datEntSetI)
											_datEntSetI.getEntityData().set(CosmicDeathSharkoEntity.DATA_SharkoState, 2);
										if (Math.random() <= 0.49) {
											if (entity instanceof CosmicDeathSharkoEntity _datEntSetL)
												_datEntSetL.getEntityData().set(CosmicDeathSharkoEntity.DATA_AlternateState, false);
										} else {
											if (entity instanceof CosmicDeathSharkoEntity _datEntSetL)
												_datEntSetL.getEntityData().set(CosmicDeathSharkoEntity.DATA_AlternateState, true);
										}
									}
								} else if ((entity instanceof CosmicDeathSharkoEntity _datEntI ? _datEntI.getEntityData().get(CosmicDeathSharkoEntity.DATA_SharkoState) : 0) == 2) {
									if (Math.random() <= 0.5) {
										if (Math.random() <= 0.49) {
											if (entity instanceof CosmicDeathSharkoEntity _datEntSetI)
												_datEntSetI.getEntityData().set(CosmicDeathSharkoEntity.DATA_SharkoState, 3);
										} else {
											if (Math.random() >= 0.75) {
												if (entity instanceof CosmicDeathSharkoEntity _datEntSetI)
													_datEntSetI.getEntityData().set(CosmicDeathSharkoEntity.DATA_SharkoState, 1);
											}
										}
									}
								} else if ((entity instanceof CosmicDeathSharkoEntity _datEntI ? _datEntI.getEntityData().get(CosmicDeathSharkoEntity.DATA_SharkoState) : 0) == 3) {
									if (Math.random() <= 0.0625) {
										if (entity instanceof CosmicDeathSharkoEntity _datEntSetI)
											_datEntSetI.getEntityData().set(CosmicDeathSharkoEntity.DATA_SharkoState, 4);
										if (Math.random() <= 0.49) {
											if (entity instanceof CosmicDeathSharkoEntity _datEntSetL)
												_datEntSetL.getEntityData().set(CosmicDeathSharkoEntity.DATA_AlternateState, false);
										} else {
											if (entity instanceof CosmicDeathSharkoEntity _datEntSetL)
												_datEntSetL.getEntityData().set(CosmicDeathSharkoEntity.DATA_AlternateState, true);
										}
									} else {
										if (Math.random() >= 0.75) {
											if (entity instanceof CosmicDeathSharkoEntity _datEntSetI)
												_datEntSetI.getEntityData().set(CosmicDeathSharkoEntity.DATA_SharkoState, 2);
											if (Math.random() <= 0.49) {
												if (entity instanceof CosmicDeathSharkoEntity _datEntSetL)
													_datEntSetL.getEntityData().set(CosmicDeathSharkoEntity.DATA_AlternateState, false);
											} else {
												if (entity instanceof CosmicDeathSharkoEntity _datEntSetL)
													_datEntSetL.getEntityData().set(CosmicDeathSharkoEntity.DATA_AlternateState, true);
											}
										}
									}
								} else if ((entity instanceof CosmicDeathSharkoEntity _datEntI ? _datEntI.getEntityData().get(CosmicDeathSharkoEntity.DATA_SharkoState) : 0) == 4) {
									if (Math.random() <= 0.5) {
										if (entity instanceof CosmicDeathSharkoEntity _datEntSetI)
											_datEntSetI.getEntityData().set(CosmicDeathSharkoEntity.DATA_SharkoState, 3);
									}
								}
							}
						} else if (!(world instanceof Level _lvl46 && _lvl46.isDay())) {
							entity.getPersistentData().putDouble("SharkoStateTimerForChance", Math.floor(Mth.nextDouble(RandomSource.create(), 5, 30)));
							if (!entity.isInWater() && !entity.isInLava()) {
								if ((entity instanceof CosmicDeathSharkoEntity _datEntI ? _datEntI.getEntityData().get(CosmicDeathSharkoEntity.DATA_SharkoState) : 0) == 1) {
									if (entity instanceof CosmicDeathSharkoEntity _datEntSetI)
										_datEntSetI.getEntityData().set(CosmicDeathSharkoEntity.DATA_SharkoState, 2);
									if (Math.random() <= 0.49) {
										if (entity instanceof CosmicDeathSharkoEntity _datEntSetL)
											_datEntSetL.getEntityData().set(CosmicDeathSharkoEntity.DATA_AlternateState, false);
									} else {
										if (entity instanceof CosmicDeathSharkoEntity _datEntSetL)
											_datEntSetL.getEntityData().set(CosmicDeathSharkoEntity.DATA_AlternateState, true);
									}
								} else if ((entity instanceof CosmicDeathSharkoEntity _datEntI ? _datEntI.getEntityData().get(CosmicDeathSharkoEntity.DATA_SharkoState) : 0) == 2) {
									if (entity instanceof CosmicDeathSharkoEntity _datEntSetI)
										_datEntSetI.getEntityData().set(CosmicDeathSharkoEntity.DATA_SharkoState, 3);
								} else if ((entity instanceof CosmicDeathSharkoEntity _datEntI ? _datEntI.getEntityData().get(CosmicDeathSharkoEntity.DATA_SharkoState) : 0) == 3) {
									if (entity instanceof CosmicDeathSharkoEntity _datEntSetI)
										_datEntSetI.getEntityData().set(CosmicDeathSharkoEntity.DATA_SharkoState, 4);
									if (Math.random() <= 0.49) {
										if (entity instanceof CosmicDeathSharkoEntity _datEntSetL)
											_datEntSetL.getEntityData().set(CosmicDeathSharkoEntity.DATA_AlternateState, false);
									} else {
										if (entity instanceof CosmicDeathSharkoEntity _datEntSetL)
											_datEntSetL.getEntityData().set(CosmicDeathSharkoEntity.DATA_AlternateState, true);
									}
								}
							}
						}
					}
				}
			}
			if (EngiesChaosModVariables.MapVariables.get(world).difficultytoggle == true) {
				if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty > 0) {
					if (entity instanceof LivingEntity _livingEntity61 && _livingEntity61.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
						_livingEntity61.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((85 * 2.5 * EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
				}
			}
		}
	}
}