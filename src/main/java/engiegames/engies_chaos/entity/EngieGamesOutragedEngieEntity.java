package engiegames.engies_chaos.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.nbt.CompoundTag;

import javax.annotation.Nullable;

import engiegames.engies_chaos.procedures.NegativeDifficultyAICheckProcedure;
import engiegames.engies_chaos.procedures.MobHitboxScalingProcedure;
import engiegames.engies_chaos.procedures.EntitySpawnsProcedure;
import engiegames.engies_chaos.procedures.EngieGamesHostileEngiesSpawningConditionProcedure;
import engiegames.engies_chaos.procedures.AnyEngieDiesAddCountProcedure;
import engiegames.engies_chaos.init.EngiesChaosModEntities;

public class EngieGamesOutragedEngieEntity extends Monster {
	public EngieGamesOutragedEngieEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(EngiesChaosModEntities.ENGIE_GAMES_OUTRAGED_ENGIE.get(), world);
	}

	public EngieGamesOutragedEngieEntity(EntityType<EngieGamesOutragedEngieEntity> type, Level world) {
		super(type, world);
		maxUpStep = 1f;
		xpReward = 35;
		setNoAi(false);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 2.1, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}
		});
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, Player.class, true, false) {
			@Override
			public boolean canUse() {
				double x = EngieGamesOutragedEngieEntity.this.getX();
				double y = EngieGamesOutragedEngieEntity.this.getY();
				double z = EngieGamesOutragedEngieEntity.this.getZ();
				Entity entity = EngieGamesOutragedEngieEntity.this;
				Level world = EngieGamesOutragedEngieEntity.this.level;
				return super.canUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}

			@Override
			public boolean canContinueToUse() {
				double x = EngieGamesOutragedEngieEntity.this.getX();
				double y = EngieGamesOutragedEngieEntity.this.getY();
				double z = EngieGamesOutragedEngieEntity.this.getZ();
				Entity entity = EngieGamesOutragedEngieEntity.this;
				Level world = EngieGamesOutragedEngieEntity.this.level;
				return super.canContinueToUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, ServerPlayer.class, true, false) {
			@Override
			public boolean canUse() {
				double x = EngieGamesOutragedEngieEntity.this.getX();
				double y = EngieGamesOutragedEngieEntity.this.getY();
				double z = EngieGamesOutragedEngieEntity.this.getZ();
				Entity entity = EngieGamesOutragedEngieEntity.this;
				Level world = EngieGamesOutragedEngieEntity.this.level;
				return super.canUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}

			@Override
			public boolean canContinueToUse() {
				double x = EngieGamesOutragedEngieEntity.this.getX();
				double y = EngieGamesOutragedEngieEntity.this.getY();
				double z = EngieGamesOutragedEngieEntity.this.getZ();
				Entity entity = EngieGamesOutragedEngieEntity.this;
				Level world = EngieGamesOutragedEngieEntity.this.level;
				return super.canContinueToUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}
		});
		this.goalSelector.addGoal(5, new LookAtPlayerGoal(this, Player.class, (float) 6) {
			@Override
			public boolean canUse() {
				double x = EngieGamesOutragedEngieEntity.this.getX();
				double y = EngieGamesOutragedEngieEntity.this.getY();
				double z = EngieGamesOutragedEngieEntity.this.getZ();
				Entity entity = EngieGamesOutragedEngieEntity.this;
				Level world = EngieGamesOutragedEngieEntity.this.level;
				return super.canUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}

			@Override
			public boolean canContinueToUse() {
				double x = EngieGamesOutragedEngieEntity.this.getX();
				double y = EngieGamesOutragedEngieEntity.this.getY();
				double z = EngieGamesOutragedEngieEntity.this.getZ();
				Entity entity = EngieGamesOutragedEngieEntity.this;
				Level world = EngieGamesOutragedEngieEntity.this.level;
				return super.canContinueToUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}
		});
		this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, ServerPlayer.class, (float) 6) {
			@Override
			public boolean canUse() {
				double x = EngieGamesOutragedEngieEntity.this.getX();
				double y = EngieGamesOutragedEngieEntity.this.getY();
				double z = EngieGamesOutragedEngieEntity.this.getZ();
				Entity entity = EngieGamesOutragedEngieEntity.this;
				Level world = EngieGamesOutragedEngieEntity.this.level;
				return super.canUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}

			@Override
			public boolean canContinueToUse() {
				double x = EngieGamesOutragedEngieEntity.this.getX();
				double y = EngieGamesOutragedEngieEntity.this.getY();
				double z = EngieGamesOutragedEngieEntity.this.getZ();
				Entity entity = EngieGamesOutragedEngieEntity.this;
				Level world = EngieGamesOutragedEngieEntity.this.level;
				return super.canContinueToUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(7, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(9, new FloatGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		AnyEngieDiesAddCountProcedure.execute(this, source.getEntity());
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		EntitySpawnsProcedure.execute(world, this);
		return retval;
	}

	@Override
	public void baseTick() {
		super.baseTick();
		this.refreshDimensions();
	}

	@Override
	public EntityDimensions getDimensions(Pose pose) {
		Entity entity = this;
		Level world = this.level;
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		return super.getDimensions(pose).scale((float) MobHitboxScalingProcedure.execute());
	}

	public static void init() {
		SpawnPlacements.register(EngiesChaosModEntities.ENGIE_GAMES_OUTRAGED_ENGIE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			return EngieGamesHostileEngiesSpawningConditionProcedure.execute(world, x, y, z);
		});
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.25);
		builder = builder.add(Attributes.MAX_HEALTH, 450);
		builder = builder.add(Attributes.ARMOR, 15);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 35);
		builder = builder.add(Attributes.FOLLOW_RANGE, 80);
		return builder;
	}
}