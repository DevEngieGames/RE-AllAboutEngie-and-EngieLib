package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;

import engiegames.engies_chaos.entity.GlitchSharkoEntity;

public class GlitchSharkoRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) == sourceentity) {
			if (sourceentity.isShiftKeyDown()) {
				if (Math.random() <= 0.25) {
					if (Math.random() <= 0.05 && Math.random() > 0.04) {
						if (sourceentity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("As you pet " + entity.getDisplayName().getString() + ", you realise that " + "they" + " are slowly healing...")), true);
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 600, 2, false, true));
					} else if (Math.random() <= 0.04 && Math.random() > 0.03) {
						if (sourceentity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("As you pet " + entity.getDisplayName().getString() + ", you realise that " + "they" + " are much more resiliant...")), true);
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 3, false, true));
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 3, false, true));
					} else if (Math.random() <= 0.03 && Math.random() > 0.02) {
						if (sourceentity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("As you pet " + entity.getDisplayName().getString() + ", you realise that " + "they" + " are much more stronger...")), true);
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 3, false, true));
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 600, 3, false, true));
					} else if (Math.random() <= 0.02 && Math.random() > 0.01) {
						if (sourceentity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("As you pet " + entity.getDisplayName().getString() + ", you realise that " + "they" + " are a little bit faster now...")), true);
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 1, false, true));
					} else if (Math.random() <= 0.01 && Math.random() > 0.001) {
						if (sourceentity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("As you pet " + entity.getDisplayName().getString() + ", you realise that " + "they" + " are gotten a little more health...")), true);
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 5, false, true));
					} else if (Math.random() <= 0.001) {
						if (sourceentity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("As you pet " + entity.getDisplayName().getString() + ", you realise that " + "they" + " are a little too strong...")), true);
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.TOTEM_OF_UNDYING, x, y, z, 5, 1, 1, 1, 1);
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 600, 2, false, true));
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 1, false, true));
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 1, false, true));
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 3, false, true));
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 600, 3, false, true));
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 1, false, true));
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 5, false, true));
					} else {
						if (sourceentity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal((entity.getDisplayName().getString() + " gives you a big smile as you pet " + "them" + ".")), true);
					}
				} else if (Math.random() <= 0.005) {
					if (sourceentity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("Star begged and I responded with this change."), true);
				} else {
					if (sourceentity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("Anything to make " + entity.getDisplayName().getString() + " happy.")), true);
				}
			} else {
				if ((entity instanceof GlitchSharkoEntity _datEntI ? _datEntI.getEntityData().get(GlitchSharkoEntity.DATA_SharkoState) : 0) == 0) {
					if (entity instanceof GlitchSharkoEntity _datEntSetI)
						_datEntSetI.getEntityData().set(GlitchSharkoEntity.DATA_SharkoState, 1);
					entity.getPersistentData().putDouble("SharkoStateTimerForChance", Math.round(Mth.nextDouble(RandomSource.create(), 30, 60)));
				} else if ((entity instanceof GlitchSharkoEntity _datEntI ? _datEntI.getEntityData().get(GlitchSharkoEntity.DATA_SharkoState) : 0) >= 1
						&& (entity instanceof GlitchSharkoEntity _datEntI ? _datEntI.getEntityData().get(GlitchSharkoEntity.DATA_SharkoState) : 0) <= 3) {
					if (entity instanceof GlitchSharkoEntity _datEntSetI)
						_datEntSetI.getEntityData().set(GlitchSharkoEntity.DATA_SharkoState, 0);
					entity.getPersistentData().putDouble("SharkoStateTimerForChance", Math.round(Mth.nextDouble(RandomSource.create(), 30, 60)));
				}
			}
		}
	}
}