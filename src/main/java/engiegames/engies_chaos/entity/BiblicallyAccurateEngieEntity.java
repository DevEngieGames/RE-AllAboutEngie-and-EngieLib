package engiegames.engies_chaos.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.levelgen.Heightmap;
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
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.protocol.Packet;
import net.minecraft.nbt.CompoundTag;

import engiegames.engies_chaos.procedures.BiblicallyAccurateEngieTickProcedure;
import engiegames.engies_chaos.procedures.BiblicallyAccurateEngieThisEntityKillsAnotherOneProcedure;
import engiegames.engies_chaos.procedures.BiblicallyAccurateEngieNaturalEntitySpawningConditionProcedure;
import engiegames.engies_chaos.init.EngiesChaosModEntities;

public class BiblicallyAccurateEngieEntity extends PathfinderMob {
	public static final EntityDataAccessor<Boolean> DATA_coldseasoned = SynchedEntityData.defineId(BiblicallyAccurateEngieEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<Boolean> DATA_holloweened = SynchedEntityData.defineId(BiblicallyAccurateEngieEntity.class, EntityDataSerializers.BOOLEAN);

	public BiblicallyAccurateEngieEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(EngiesChaosModEntities.BIBLICALLY_ACCURATE_ENGIE.get(), world);
	}

	public BiblicallyAccurateEngieEntity(EntityType<BiblicallyAccurateEngieEntity> type, Level world) {
		super(type, world);
		maxUpStep = 1f;
		xpReward = 60;
		setNoAi(false);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(DATA_coldseasoned, false);
		this.entityData.define(DATA_holloweened, false);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, Monster.class, false, false));
		this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 2.25, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}
		});
		this.goalSelector.addGoal(3, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(4, new LookAtPlayerGoal(this, Player.class, (float) 36));
		this.targetSelector.addGoal(5, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(7, new FloatGoal(this));
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
	public boolean hurt(DamageSource damagesource, float amount) {
		if (damagesource == DamageSource.FALL)
			return false;
		if (damagesource == DamageSource.DROWN)
			return false;
		if (damagesource.isExplosion())
			return false;
		return super.hurt(damagesource, amount);
	}

	@Override
	public boolean ignoreExplosion() {
		return true;
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putBoolean("Datacoldseasoned", this.entityData.get(DATA_coldseasoned));
		compound.putBoolean("Dataholloweened", this.entityData.get(DATA_holloweened));
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("Datacoldseasoned"))
			this.entityData.set(DATA_coldseasoned, compound.getBoolean("Datacoldseasoned"));
		if (compound.contains("Dataholloweened"))
			this.entityData.set(DATA_holloweened, compound.getBoolean("Dataholloweened"));
	}

	@Override
	public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
		super.awardKillScore(entity, score, damageSource);
		BiblicallyAccurateEngieThisEntityKillsAnotherOneProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), entity, this);
	}

	@Override
	public void baseTick() {
		super.baseTick();
		BiblicallyAccurateEngieTickProcedure.execute(this.level, this);
	}

	public static void init() {
		SpawnPlacements.register(EngiesChaosModEntities.BIBLICALLY_ACCURATE_ENGIE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			return BiblicallyAccurateEngieNaturalEntitySpawningConditionProcedure.execute(world, x, y, z);
		});
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.25);
		builder = builder.add(Attributes.MAX_HEALTH, 750);
		builder = builder.add(Attributes.ARMOR, 100);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 100);
		builder = builder.add(Attributes.FOLLOW_RANGE, 32);
		return builder;
	}
}