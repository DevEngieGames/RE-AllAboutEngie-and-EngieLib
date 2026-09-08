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
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
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
import engiegames.engies_chaos.procedures.HostileDoomsdayEntitySpawningConditionProcedure;
import engiegames.engies_chaos.procedures.EntitySpawnsProcedure;
import engiegames.engies_chaos.procedures.DoomsDayHostileEntityDiesProcedure;
import engiegames.engies_chaos.init.EngiesChaosModEntities;

public class DoomsDayHostileEntity extends Monster {
	public DoomsDayHostileEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(EngiesChaosModEntities.DOOMS_DAY_HOSTILE.get(), world);
	}

	public DoomsDayHostileEntity(EntityType<DoomsDayHostileEntity> type, Level world) {
		super(type, world);
		maxUpStep = 0.6f;
		xpReward = 0;
		setNoAi(false);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 2.7, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}
		});
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, Player.class, true, false) {
			@Override
			public boolean canUse() {
				double x = DoomsDayHostileEntity.this.getX();
				double y = DoomsDayHostileEntity.this.getY();
				double z = DoomsDayHostileEntity.this.getZ();
				Entity entity = DoomsDayHostileEntity.this;
				Level world = DoomsDayHostileEntity.this.level;
				return super.canUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}

			@Override
			public boolean canContinueToUse() {
				double x = DoomsDayHostileEntity.this.getX();
				double y = DoomsDayHostileEntity.this.getY();
				double z = DoomsDayHostileEntity.this.getZ();
				Entity entity = DoomsDayHostileEntity.this;
				Level world = DoomsDayHostileEntity.this.level;
				return super.canContinueToUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, ServerPlayer.class, true, false) {
			@Override
			public boolean canUse() {
				double x = DoomsDayHostileEntity.this.getX();
				double y = DoomsDayHostileEntity.this.getY();
				double z = DoomsDayHostileEntity.this.getZ();
				Entity entity = DoomsDayHostileEntity.this;
				Level world = DoomsDayHostileEntity.this.level;
				return super.canUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}

			@Override
			public boolean canContinueToUse() {
				double x = DoomsDayHostileEntity.this.getX();
				double y = DoomsDayHostileEntity.this.getY();
				double z = DoomsDayHostileEntity.this.getZ();
				Entity entity = DoomsDayHostileEntity.this;
				Level world = DoomsDayHostileEntity.this.level;
				return super.canContinueToUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}
		});
		this.goalSelector.addGoal(5, new LookAtPlayerGoal(this, Player.class, (float) 6) {
			@Override
			public boolean canUse() {
				double x = DoomsDayHostileEntity.this.getX();
				double y = DoomsDayHostileEntity.this.getY();
				double z = DoomsDayHostileEntity.this.getZ();
				Entity entity = DoomsDayHostileEntity.this;
				Level world = DoomsDayHostileEntity.this.level;
				return super.canUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}

			@Override
			public boolean canContinueToUse() {
				double x = DoomsDayHostileEntity.this.getX();
				double y = DoomsDayHostileEntity.this.getY();
				double z = DoomsDayHostileEntity.this.getZ();
				Entity entity = DoomsDayHostileEntity.this;
				Level world = DoomsDayHostileEntity.this.level;
				return super.canContinueToUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}
		});
		this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, ServerPlayer.class, (float) 6) {
			@Override
			public boolean canUse() {
				double x = DoomsDayHostileEntity.this.getX();
				double y = DoomsDayHostileEntity.this.getY();
				double z = DoomsDayHostileEntity.this.getZ();
				Entity entity = DoomsDayHostileEntity.this;
				Level world = DoomsDayHostileEntity.this.level;
				return super.canUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}

			@Override
			public boolean canContinueToUse() {
				double x = DoomsDayHostileEntity.this.getX();
				double y = DoomsDayHostileEntity.this.getY();
				double z = DoomsDayHostileEntity.this.getZ();
				Entity entity = DoomsDayHostileEntity.this;
				Level world = DoomsDayHostileEntity.this.level;
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
	public double getMyRidingOffset() {
		return -0.35D;
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
		DoomsDayHostileEntityDiesProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		EntitySpawnsProcedure.execute(world, this);
		return retval;
	}

	public static void init() {
		SpawnPlacements.register(EngiesChaosModEntities.DOOMS_DAY_HOSTILE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			return HostileDoomsdayEntitySpawningConditionProcedure.execute(world, x, y, z);
		});
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.25);
		builder = builder.add(Attributes.MAX_HEALTH, 925);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 1);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		return builder;
	}
}