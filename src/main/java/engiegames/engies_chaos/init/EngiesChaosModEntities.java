/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package engiegames.engies_chaos.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.YellowLightningEntity;
import engiegames.engies_chaos.entity.XEngieSharkoEntity;
import engiegames.engies_chaos.entity.XEngieGamesEntity;
import engiegames.engies_chaos.entity.WormholeSharkoEntity;
import engiegames.engies_chaos.entity.WormholeEngieEntity;
import engiegames.engies_chaos.entity.UncommonSharkoEntity;
import engiegames.engies_chaos.entity.UncommonEngieEntity;
import engiegames.engies_chaos.entity.TigerSharkoEntity;
import engiegames.engies_chaos.entity.ThrowbackSharkoEntity;
import engiegames.engies_chaos.entity.ThrowbackMadEngieEntity;
import engiegames.engies_chaos.entity.ThrowbackEnragedEngieEntity;
import engiegames.engies_chaos.entity.ThrowbackEngiEntity;
import engiegames.engies_chaos.entity.ThrowbackCreatorEntity;
import engiegames.engies_chaos.entity.ThrowbackAngryEngieEntity;
import engiegames.engies_chaos.entity.ThrowbackAngryCreatorEntity;
import engiegames.engies_chaos.entity.TheRealEngieGamesHalloweenEntity;
import engiegames.engies_chaos.entity.TheRealEngieGamesEntity;
import engiegames.engies_chaos.entity.TheEndHostileEntity;
import engiegames.engies_chaos.entity.TheEndEntity;
import engiegames.engies_chaos.entity.SuperDoomsDayHostileEntity;
import engiegames.engies_chaos.entity.SuperDoomsDayEntity;
import engiegames.engies_chaos.entity.SharkoEntity;
import engiegames.engies_chaos.entity.ShadowSharkEngieEntity;
import engiegames.engies_chaos.entity.ShadowSharkEngieBlindEntity;
import engiegames.engies_chaos.entity.ScorchedEntity;
import engiegames.engies_chaos.entity.RoughianTheRealEngieGamesEntity;
import engiegames.engies_chaos.entity.RiftBallEntity;
import engiegames.engies_chaos.entity.RareSharkoEntity;
import engiegames.engies_chaos.entity.RareEngieSharkoEntity;
import engiegames.engies_chaos.entity.RareEngieEntity;
import engiegames.engies_chaos.entity.QuizzetEntity;
import engiegames.engies_chaos.entity.PureInsanityEntity;
import engiegames.engies_chaos.entity.PunisherEntity;
import engiegames.engies_chaos.entity.ProtogenEntity;
import engiegames.engies_chaos.entity.OutragedDeathSharkoEntity;
import engiegames.engies_chaos.entity.OMENEntity;
import engiegames.engies_chaos.entity.NormalEntity;
import engiegames.engies_chaos.entity.NightmareOutragedEngieEntity;
import engiegames.engies_chaos.entity.NightmareMonstrosityEngieEntity;
import engiegames.engies_chaos.entity.NightmareMadEngieEntity;
import engiegames.engies_chaos.entity.NightmareHostileBiblicallyAccurateEngieEntity;
import engiegames.engies_chaos.entity.NightmareEnragedEngieEntity;
import engiegames.engies_chaos.entity.NightmareEngieEntity;
import engiegames.engies_chaos.entity.NightmareAngryEngieEntity;
import engiegames.engies_chaos.entity.MythicSharkoEntity;
import engiegames.engies_chaos.entity.MythicEngieEntity;
import engiegames.engies_chaos.entity.MonstrosityEngieEntity;
import engiegames.engies_chaos.entity.MonstrosityDeathSharkoEntity;
import engiegames.engies_chaos.entity.MindscapeEngieEntity;
import engiegames.engies_chaos.entity.MadEngieOldRiftedEntity;
import engiegames.engies_chaos.entity.MadEngieEntity;
import engiegames.engies_chaos.entity.MOABEntity;
import engiegames.engies_chaos.entity.LegendarySharkoEntity;
import engiegames.engies_chaos.entity.LegendaryEngieEntity;
import engiegames.engies_chaos.entity.InsanityOutragedEngieEntity;
import engiegames.engies_chaos.entity.InsanityMonstrosityEngieEntity;
import engiegames.engies_chaos.entity.InsanityMadEngieEntity;
import engiegames.engies_chaos.entity.InsanityHostileBiblicallyAccurateEngieEntity;
import engiegames.engies_chaos.entity.InsanityEntity;
import engiegames.engies_chaos.entity.InsanityEnragedEngieEntity;
import engiegames.engies_chaos.entity.InsanityEngieEntity;
import engiegames.engies_chaos.entity.InsanityAngryEngieEntity;
import engiegames.engies_chaos.entity.HsotileEngieEntity;
import engiegames.engies_chaos.entity.HostileBiblicallyAccurateEngieEntity;
import engiegames.engies_chaos.entity.HordeSpawnerEntity;
import engiegames.engies_chaos.entity.HeWhoGamesHostileEntity;
import engiegames.engies_chaos.entity.HeWhoGamesEntity;
import engiegames.engies_chaos.entity.GlitchSharkoEntity;
import engiegames.engies_chaos.entity.ExoticSharkoEntity;
import engiegames.engies_chaos.entity.ExoticEngieEntity;
import engiegames.engies_chaos.entity.EpicSharkoEntity;
import engiegames.engies_chaos.entity.EpicEngieEntity;
import engiegames.engies_chaos.entity.EnragedTNTEntity;
import engiegames.engies_chaos.entity.EnragedSpeedEntity;
import engiegames.engies_chaos.entity.EnragedNormalEntity;
import engiegames.engies_chaos.entity.EnragedEngieOldRiftedEntity;
import engiegames.engies_chaos.entity.EnragedEngieEntity;
import engiegames.engies_chaos.entity.EnragedDeathSharkoEntity;
import engiegames.engies_chaos.entity.EngieSharkoEntity;
import engiegames.engies_chaos.entity.EngiePocOutragedEngieEntity;
import engiegames.engies_chaos.entity.EngiePocMonstrosityEngieEntity;
import engiegames.engies_chaos.entity.EngiePocMadEngieEntity;
import engiegames.engies_chaos.entity.EngiePocHostileBiblicallyAccurateEngieEntity;
import engiegames.engies_chaos.entity.EngiePocEnragedEngieEntity;
import engiegames.engies_chaos.entity.EngiePocEngieEntity;
import engiegames.engies_chaos.entity.EngiePocAngryEngieEntity;
import engiegames.engies_chaos.entity.EngieGamesOutragedEngieEntity;
import engiegames.engies_chaos.entity.EngieGamesMonstrosityEngieEntity;
import engiegames.engies_chaos.entity.EngieGamesMadEngieEntity;
import engiegames.engies_chaos.entity.EngieGamesHostileEngieEntity;
import engiegames.engies_chaos.entity.EngieGamesHostileBiblicallyAccurateEngieEntity;
import engiegames.engies_chaos.entity.EngieGamesEntity;
import engiegames.engies_chaos.entity.EngieGamesEnragedEngieEntity;
import engiegames.engies_chaos.entity.EngieGamesDetectiveEntity;
import engiegames.engies_chaos.entity.EngieGamesAngryEngieEntity;
import engiegames.engies_chaos.entity.EngiEntity;
import engiegames.engies_chaos.entity.DoomsDayHostileEntity;
import engiegames.engies_chaos.entity.DoomsDayEntity;
import engiegames.engies_chaos.entity.DistortedEntity;
import engiegames.engies_chaos.entity.DDaySpikeEntity;
import engiegames.engies_chaos.entity.DDayLightningSpawnerEntity;
import engiegames.engies_chaos.entity.DDayAvalancheEntity;
import engiegames.engies_chaos.entity.DDAYRiftEntity;
import engiegames.engies_chaos.entity.CosmicTheRealEngieGamesEntity;
import engiegames.engies_chaos.entity.CosmicDeathSharkoEntity;
import engiegames.engies_chaos.entity.CommonEngieEntity;
import engiegames.engies_chaos.entity.ClippedbyengieEntity;
import engiegames.engies_chaos.entity.BlueBurstEntity;
import engiegames.engies_chaos.entity.BloodyEngieRiftedEntity;
import engiegames.engies_chaos.entity.BiblicallyDeathSharkoEntity;
import engiegames.engies_chaos.entity.BiblicallyAccurateEngieEntity;
import engiegames.engies_chaos.entity.AprilFoolsTigerSharkoEntity;
import engiegames.engies_chaos.entity.AprilFoolsSharkoEntity;
import engiegames.engies_chaos.entity.AprilFoolsRareSharkoEntity;
import engiegames.engies_chaos.entity.AprilFoolsRareEngieSharkoEntity;
import engiegames.engies_chaos.entity.AprilFoolsMythicSharkoEntity;
import engiegames.engies_chaos.entity.AprilFoolsLegendarySharkoEntity;
import engiegames.engies_chaos.entity.AprilFoolsExoticSharkoEntity;
import engiegames.engies_chaos.entity.AprilFoolsEngieSharkoEntity;
import engiegames.engies_chaos.entity.AprilFoolsAlbinoSharkoEntity;
import engiegames.engies_chaos.entity.AngryEngieOldRiftedEntity;
import engiegames.engies_chaos.entity.AngryEngieEntity;
import engiegames.engies_chaos.entity.AngryDeathSharkoEntity;
import engiegames.engies_chaos.entity.AngryCreatorRiftedEntity;
import engiegames.engies_chaos.entity.AngryCreatorEntity;
import engiegames.engies_chaos.entity.AlienSharkoEntity;
import engiegames.engies_chaos.EngiesChaosMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EngiesChaosModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, EngiesChaosMod.MODID);
	public static final RegistryObject<EntityType<EngiEntity>> ENGIE = register("engie",
			EntityType.Builder.<EngiEntity>of(EngiEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EngiEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<MadEngieEntity>> MAD_ENGIE = register("mad_engie",
			EntityType.Builder.<MadEngieEntity>of(MadEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MadEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<AngryEngieEntity>> ANGRY_ENGIE = register("angry_engie",
			EntityType.Builder.<AngryEngieEntity>of(AngryEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AngryEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<EnragedEngieEntity>> ENRAGED_ENGIE = register("enraged_engie",
			EntityType.Builder.<EnragedEngieEntity>of(EnragedEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<AngryCreatorEntity>> OUTRAGED_ENGIE = register("outraged_engie",
			EntityType.Builder.<AngryCreatorEntity>of(AngryCreatorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AngryCreatorEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<SharkoEntity>> SHARKO = register("sharko",
			EntityType.Builder.<SharkoEntity>of(SharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<ProtogenEntity>> PROTOGEN = register("protogen",
			EntityType.Builder.<ProtogenEntity>of(ProtogenEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ProtogenEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<QuizzetEntity>> QUIZZET = register("quizzet",
			EntityType.Builder.<QuizzetEntity>of(QuizzetEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(QuizzetEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<EnragedNormalEntity>> ENRAGED_NORMAL = register("enraged_normal",
			EntityType.Builder.<EnragedNormalEntity>of(EnragedNormalEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedNormalEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<EnragedTNTEntity>> ENRAGED_TNT = register("enraged_tnt",
			EntityType.Builder.<EnragedTNTEntity>of(EnragedTNTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedTNTEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<EnragedSpeedEntity>> ENRAGED_SPEED = register("enraged_speed",
			EntityType.Builder.<EnragedSpeedEntity>of(EnragedSpeedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedSpeedEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<CommonEngieEntity>> COMMON_ENGIE = register("common_engie",
			EntityType.Builder.<CommonEngieEntity>of(CommonEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CommonEngieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<UncommonEngieEntity>> UNCOMMON_ENGIE = register("uncommon_engie",
			EntityType.Builder.<UncommonEngieEntity>of(UncommonEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(UncommonEngieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RareEngieEntity>> RARE_ENGIE = register("rare_engie",
			EntityType.Builder.<RareEngieEntity>of(RareEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RareEngieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EpicEngieEntity>> EPIC_ENGIE = register("epic_engie",
			EntityType.Builder.<EpicEngieEntity>of(EpicEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EpicEngieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LegendaryEngieEntity>> LEGENDARY_ENGIE = register("legendary_engie",
			EntityType.Builder.<LegendaryEngieEntity>of(LegendaryEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LegendaryEngieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MythicEngieEntity>> MYTHIC_ENGIE = register("mythic_engie",
			EntityType.Builder.<MythicEngieEntity>of(MythicEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MythicEngieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ExoticEngieEntity>> EXOTIC_ENGIE = register("exotic_engie",
			EntityType.Builder.<ExoticEngieEntity>of(ExoticEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ExoticEngieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BiblicallyAccurateEngieEntity>> BIBLICALLY_ACCURATE_ENGIE = register("biblically_accurate_engie",
			EntityType.Builder.<BiblicallyAccurateEngieEntity>of(BiblicallyAccurateEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(BiblicallyAccurateEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<MonstrosityEngieEntity>> MONSTROSITY_ENGIE = register("monstrosity_engie", EntityType.Builder.<MonstrosityEngieEntity>of(MonstrosityEngieEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MonstrosityEngieEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HeWhoGamesEntity>> HE_WHO_GAMES = register("he_who_games", EntityType.Builder.<HeWhoGamesEntity>of(HeWhoGamesEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(HeWhoGamesEntity::new).fireImmune().sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<HeWhoGamesHostileEntity>> HE_WHO_GAMES_HOSTILE = register("he_who_games_hostile", EntityType.Builder.<HeWhoGamesHostileEntity>of(HeWhoGamesHostileEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(HeWhoGamesHostileEntity::new).fireImmune().sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<InsanityEntity>> INSANITY = register("insanity",
			EntityType.Builder.<InsanityEntity>of(InsanityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(InsanityEntity::new).fireImmune().sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<YellowLightningEntity>> YELLOW_LIGHTNING = register("yellow_lightning", EntityType.Builder.<YellowLightningEntity>of(YellowLightningEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YellowLightningEntity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<BlueBurstEntity>> BLUE_BURST = register("blue_burst",
			EntityType.Builder.<BlueBurstEntity>of(BlueBurstEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlueBurstEntity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<NormalEntity>> NORMAL = register("normal",
			EntityType.Builder.<NormalEntity>of(NormalEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NormalEntity::new).fireImmune().sized(0.6f, 1f));
	public static final RegistryObject<EntityType<MOABEntity>> MOAB = register("moab",
			EntityType.Builder.<MOABEntity>of(MOABEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MOABEntity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<PureInsanityEntity>> PURE_INSANITY = register("pure_insanity",
			EntityType.Builder.<PureInsanityEntity>of(PureInsanityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PureInsanityEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<DoomsDayEntity>> DOOMS_DAY = register("dooms_day",
			EntityType.Builder.<DoomsDayEntity>of(DoomsDayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DoomsDayEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<SuperDoomsDayEntity>> SUPER_DOOMS_DAY = register("super_dooms_day",
			EntityType.Builder.<SuperDoomsDayEntity>of(SuperDoomsDayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SuperDoomsDayEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<DoomsDayHostileEntity>> DOOMS_DAY_HOSTILE = register("dooms_day_hostile",
			EntityType.Builder.<DoomsDayHostileEntity>of(DoomsDayHostileEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DoomsDayHostileEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<SuperDoomsDayHostileEntity>> SUPER_DOOMS_DAY_HOSTILE = register("super_dooms_day_hostile",
			EntityType.Builder.<SuperDoomsDayHostileEntity>of(SuperDoomsDayHostileEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(SuperDoomsDayHostileEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<TheEndEntity>> THE_END = register("the_end",
			EntityType.Builder.<TheEndEntity>of(TheEndEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TheEndEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<TheEndHostileEntity>> THE_END_HOSTILE = register("the_end_hostile",
			EntityType.Builder.<TheEndHostileEntity>of(TheEndHostileEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TheEndHostileEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<EngieGamesDetectiveEntity>> ENGIE_GAMES_DETECTIVE = register("engie_games_detective",
			EntityType.Builder.<EngieGamesDetectiveEntity>of(EngieGamesDetectiveEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EngieGamesDetectiveEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<EngieGamesEntity>> ENGIE_GAMES = register("engie_games",
			EntityType.Builder.<EngieGamesEntity>of(EngieGamesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EngieGamesEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<DDayLightningSpawnerEntity>> D_DAY_LIGHTNING_SPAWNER = register("d_day_lightning_spawner", EntityType.Builder.<DDayLightningSpawnerEntity>of(DDayLightningSpawnerEntity::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DDayLightningSpawnerEntity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<DDAYRiftEntity>> DDAY_RIFT = register("dday_rift",
			EntityType.Builder.<DDAYRiftEntity>of(DDAYRiftEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DDAYRiftEntity::new).fireImmune().sized(4f, 0.1f));
	public static final RegistryObject<EntityType<EnragedEngieOldRiftedEntity>> ENRAGED_ENGIE_OLD_RIFTED = register("enraged_engie_old_rifted",
			EntityType.Builder.<EnragedEngieOldRiftedEntity>of(EnragedEngieOldRiftedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EnragedEngieOldRiftedEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<MadEngieOldRiftedEntity>> MAD_ENGIE_OLD_RIFTED = register("mad_engie_old_rifted",
			EntityType.Builder.<MadEngieOldRiftedEntity>of(MadEngieOldRiftedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MadEngieOldRiftedEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<AngryEngieOldRiftedEntity>> ANGRY_ENGIE_OLD_RIFTED = register("angry_engie_old_rifted",
			EntityType.Builder.<AngryEngieOldRiftedEntity>of(AngryEngieOldRiftedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AngryEngieOldRiftedEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<AngryCreatorRiftedEntity>> ANGRY_CREATOR_RIFTED = register("angry_creator_rifted",
			EntityType.Builder.<AngryCreatorRiftedEntity>of(AngryCreatorRiftedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AngryCreatorRiftedEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<BloodyEngieRiftedEntity>> BLOODY_ENGIE_RIFTED = register("bloody_engie_rifted",
			EntityType.Builder.<BloodyEngieRiftedEntity>of(BloodyEngieRiftedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BloodyEngieRiftedEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<MindscapeEngieEntity>> MINDSCAPE_ENGIE = register("mindscape_engie", EntityType.Builder.<MindscapeEngieEntity>of(MindscapeEngieEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(MindscapeEngieEntity::new).fireImmune().sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<DistortedEntity>> DISTORTED = register("distorted", EntityType.Builder.<DistortedEntity>of(DistortedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(500)
			.setUpdateInterval(3).setCustomClientFactory(DistortedEntity::new).fireImmune().sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<TheRealEngieGamesEntity>> THE_REAL_ENGIE_GAMES = register("the_real_engie_games",
			EntityType.Builder.<TheRealEngieGamesEntity>of(TheRealEngieGamesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TheRealEngieGamesEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<ScorchedEntity>> SCORCHED = register("scorched",
			EntityType.Builder.<ScorchedEntity>of(ScorchedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ScorchedEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<ThrowbackSharkoEntity>> THROWBACK_SHARKO = register("throwback_sharko",
			EntityType.Builder.<ThrowbackSharkoEntity>of(ThrowbackSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ThrowbackSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<WormholeEngieEntity>> WORMHOLE_ENGIE = register("wormhole_engie", EntityType.Builder.<WormholeEngieEntity>of(WormholeEngieEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(WormholeEngieEntity::new).fireImmune().sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<RoughianTheRealEngieGamesEntity>> ROUGHIAN_THE_REAL_ENGIE_GAMES = register("roughian_the_real_engie_games",
			EntityType.Builder.<RoughianTheRealEngieGamesEntity>of(RoughianTheRealEngieGamesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(RoughianTheRealEngieGamesEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<CosmicTheRealEngieGamesEntity>> COSMIC_THE_REAL_ENGIE_GAMES = register("cosmic_the_real_engie_games",
			EntityType.Builder.<CosmicTheRealEngieGamesEntity>of(CosmicTheRealEngieGamesEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(CosmicTheRealEngieGamesEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<ThrowbackMadEngieEntity>> THROWBACK_MAD_ENGIE = register("throwback_mad_engie",
			EntityType.Builder.<ThrowbackMadEngieEntity>of(ThrowbackMadEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ThrowbackMadEngieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ThrowbackAngryEngieEntity>> THROWBACK_ANGRY_ENGIE = register("throwback_angry_engie",
			EntityType.Builder.<ThrowbackAngryEngieEntity>of(ThrowbackAngryEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ThrowbackAngryEngieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ThrowbackEnragedEngieEntity>> THROWBACK_ENRAGED_ENGIE = register("throwback_enraged_engie",
			EntityType.Builder.<ThrowbackEnragedEngieEntity>of(ThrowbackEnragedEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(ThrowbackEnragedEngieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ThrowbackAngryCreatorEntity>> THROWBACK_ANGRY_CREATOR = register("throwback_angry_creator",
			EntityType.Builder.<ThrowbackAngryCreatorEntity>of(ThrowbackAngryCreatorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(ThrowbackAngryCreatorEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ThrowbackEngiEntity>> THROWBACK_ENGI = register("throwback_engi",
			EntityType.Builder.<ThrowbackEngiEntity>of(ThrowbackEngiEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ThrowbackEngiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ThrowbackCreatorEntity>> THROWBACK_CREATOR = register("throwback_creator",
			EntityType.Builder.<ThrowbackCreatorEntity>of(ThrowbackCreatorEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ThrowbackCreatorEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<HostileBiblicallyAccurateEngieEntity>> HOSTILE_BIBLICALLY_ACCURATE_ENGIE = register("hostile_biblically_accurate_engie",
			EntityType.Builder.<HostileBiblicallyAccurateEngieEntity>of(HostileBiblicallyAccurateEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(HostileBiblicallyAccurateEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<PunisherEntity>> PUNISHER = register("punisher", EntityType.Builder.<PunisherEntity>of(PunisherEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1024)
			.setUpdateInterval(3).setCustomClientFactory(PunisherEntity::new).fireImmune().sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<TheRealEngieGamesHalloweenEntity>> THE_REAL_ENGIE_GAMES_HALLOWEEN = register("the_real_engie_games_halloween",
			EntityType.Builder.<TheRealEngieGamesHalloweenEntity>of(TheRealEngieGamesHalloweenEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(TheRealEngieGamesHalloweenEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<ShadowSharkEngieEntity>> SHADOW_SHARK_ENGIE = register("shadow_shark_engie", EntityType.Builder.<ShadowSharkEngieEntity>of(ShadowSharkEngieEntity::new, MobCategory.AMBIENT)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShadowSharkEngieEntity::new).fireImmune().sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<ShadowSharkEngieBlindEntity>> SHADOW_SHARK_ENGIE_BLIND = register("shadow_shark_engie_blind", EntityType.Builder.<ShadowSharkEngieBlindEntity>of(ShadowSharkEngieBlindEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShadowSharkEngieBlindEntity::new).fireImmune().sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<ClippedbyengieEntity>> CLIPPEDBYENGIE = register("clippedbyengie",
			EntityType.Builder.<ClippedbyengieEntity>of(ClippedbyengieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ClippedbyengieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<NightmareEnragedEngieEntity>> NIGHTMARE_ENRAGED_ENGIE = register("nightmare_enraged_engie",
			EntityType.Builder.<NightmareEnragedEngieEntity>of(NightmareEnragedEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3)
					.setCustomClientFactory(NightmareEnragedEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<NightmareMadEngieEntity>> NIGHTMARE_MAD_ENGIE = register("nightmare_mad_engie",
			EntityType.Builder.<NightmareMadEngieEntity>of(NightmareMadEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(NightmareMadEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<NightmareAngryEngieEntity>> NIGHTMARE_ANGRY_ENGIE = register("nightmare_angry_engie",
			EntityType.Builder.<NightmareAngryEngieEntity>of(NightmareAngryEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NightmareAngryEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<NightmareOutragedEngieEntity>> NIGHTMARE_OUTRAGED_ENGIE = register("nightmare_outraged_engie",
			EntityType.Builder.<NightmareOutragedEngieEntity>of(NightmareOutragedEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3)
					.setCustomClientFactory(NightmareOutragedEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<NightmareMonstrosityEngieEntity>> NIGHTMARE_MONSTROSITY_ENGIE = register("nightmare_monstrosity_engie",
			EntityType.Builder.<NightmareMonstrosityEngieEntity>of(NightmareMonstrosityEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3)
					.setCustomClientFactory(NightmareMonstrosityEngieEntity::new).fireImmune().sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<NightmareHostileBiblicallyAccurateEngieEntity>> NIGHTMARE_HOSTILE_BIBLICALLY_ACCURATE_ENGIE = register("nightmare_hostile_biblically_accurate_engie",
			EntityType.Builder.<NightmareHostileBiblicallyAccurateEngieEntity>of(NightmareHostileBiblicallyAccurateEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3)
					.setCustomClientFactory(NightmareHostileBiblicallyAccurateEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<InsanityMadEngieEntity>> INSANITY_MAD_ENGIE = register("insanity_mad_engie",
			EntityType.Builder.<InsanityMadEngieEntity>of(InsanityMadEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(192).setUpdateInterval(3).setCustomClientFactory(InsanityMadEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<InsanityAngryEngieEntity>> INSANITY_ANGRY_ENGIE = register("insanity_angry_engie",
			EntityType.Builder.<InsanityAngryEngieEntity>of(InsanityAngryEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(192).setUpdateInterval(3).setCustomClientFactory(InsanityAngryEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<InsanityEnragedEngieEntity>> INSANITY_ENRAGED_ENGIE = register("insanity_enraged_engie",
			EntityType.Builder.<InsanityEnragedEngieEntity>of(InsanityEnragedEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(192).setUpdateInterval(3)
					.setCustomClientFactory(InsanityEnragedEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<InsanityOutragedEngieEntity>> INSANITY_OUTRAGED_ENGIE = register("insanity_outraged_engie",
			EntityType.Builder.<InsanityOutragedEngieEntity>of(InsanityOutragedEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(192).setUpdateInterval(3)
					.setCustomClientFactory(InsanityOutragedEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<InsanityMonstrosityEngieEntity>> INSANITY_MONSTROSITY_ENGIE = register("insanity_monstrosity_engie",
			EntityType.Builder.<InsanityMonstrosityEngieEntity>of(InsanityMonstrosityEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(192).setUpdateInterval(3)
					.setCustomClientFactory(InsanityMonstrosityEngieEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NightmareEngieEntity>> NIGHTMARE_HOSTILE_ENGIE = register("nightmare_hostile_engie",
			EntityType.Builder.<NightmareEngieEntity>of(NightmareEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(NightmareEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<InsanityEngieEntity>> INSANITY_HOSTILE_ENGIE = register("insanity_hostile_engie",
			EntityType.Builder.<InsanityEngieEntity>of(InsanityEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(192).setUpdateInterval(3).setCustomClientFactory(InsanityEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<InsanityHostileBiblicallyAccurateEngieEntity>> INSANITY_HOSTILE_BIBLICALLY_ACCURATE_ENGIE = register("insanity_hostile_biblically_accurate_engie",
			EntityType.Builder.<InsanityHostileBiblicallyAccurateEngieEntity>of(InsanityHostileBiblicallyAccurateEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(192).setUpdateInterval(3)
					.setCustomClientFactory(InsanityHostileBiblicallyAccurateEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<HsotileEngieEntity>> HOSTILE_ENGIE = register("hostile_engie",
			EntityType.Builder.<HsotileEngieEntity>of(HsotileEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(HsotileEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<RareSharkoEntity>> RARE_SHARKO = register("rare_sharko",
			EntityType.Builder.<RareSharkoEntity>of(RareSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RareSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EpicSharkoEntity>> EPIC_SHARKO = register("epic_sharko",
			EntityType.Builder.<EpicSharkoEntity>of(EpicSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EpicSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<LegendarySharkoEntity>> LEGENDARY_SHARKO = register("legendary_sharko",
			EntityType.Builder.<LegendarySharkoEntity>of(LegendarySharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LegendarySharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<MythicSharkoEntity>> MYTHIC_SHARKO = register("mythic_sharko",
			EntityType.Builder.<MythicSharkoEntity>of(MythicSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MythicSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<ExoticSharkoEntity>> EXOTIC_SHARKO = register("exotic_sharko",
			EntityType.Builder.<ExoticSharkoEntity>of(ExoticSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ExoticSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EngieSharkoEntity>> ENGIE_SHARKO = register("engie_sharko",
			EntityType.Builder.<EngieSharkoEntity>of(EngieSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EngieSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<RareEngieSharkoEntity>> RARE_ENGIE_SHARKO = register("rare_engie_sharko",
			EntityType.Builder.<RareEngieSharkoEntity>of(RareEngieSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RareEngieSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<TigerSharkoEntity>> TIGER_SHARKO = register("tiger_sharko",
			EntityType.Builder.<TigerSharkoEntity>of(TigerSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TigerSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<AlienSharkoEntity>> ALIEN_SHARKO = register("alien_sharko",
			EntityType.Builder.<AlienSharkoEntity>of(AlienSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AlienSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<AngryDeathSharkoEntity>> ANGRY_DEATH_SHARKO = register("angry_death_sharko",
			EntityType.Builder.<AngryDeathSharkoEntity>of(AngryDeathSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AngryDeathSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EnragedDeathSharkoEntity>> ENRAGED_DEATH_SHARKO = register("enraged_death_sharko",
			EntityType.Builder.<EnragedDeathSharkoEntity>of(EnragedDeathSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedDeathSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<OutragedDeathSharkoEntity>> OUTRAGED_DEATH_SHARKO = register("outraged_death_sharko",
			EntityType.Builder.<OutragedDeathSharkoEntity>of(OutragedDeathSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OutragedDeathSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<BiblicallyDeathSharkoEntity>> BIBLICALLY_DEATH_SHARKO = register("biblically_death_sharko",
			EntityType.Builder.<BiblicallyDeathSharkoEntity>of(BiblicallyDeathSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(BiblicallyDeathSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<MonstrosityDeathSharkoEntity>> MONSTROSITY_DEATH_SHARKO = register("monstrosity_death_sharko",
			EntityType.Builder.<MonstrosityDeathSharkoEntity>of(MonstrosityDeathSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(MonstrosityDeathSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<CosmicDeathSharkoEntity>> COSMIC_DEATH_SHARKO = register("cosmic_death_sharko",
			EntityType.Builder.<CosmicDeathSharkoEntity>of(CosmicDeathSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CosmicDeathSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<OMENEntity>> OMEN = register("omen",
			EntityType.Builder.<OMENEntity>of(OMENEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OMENEntity::new).fireImmune().sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<DDaySpikeEntity>> D_DAY_SPIKE = register("d_day_spike", EntityType.Builder.<DDaySpikeEntity>of(DDaySpikeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(DDaySpikeEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<DDayAvalancheEntity>> D_DAY_AVALANCHE = register("d_day_avalanche", EntityType.Builder.<DDayAvalancheEntity>of(DDayAvalancheEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DDayAvalancheEntity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<AprilFoolsSharkoEntity>> APRIL_FOOLS_SHARKO = register("april_fools_sharko",
			EntityType.Builder.<AprilFoolsSharkoEntity>of(AprilFoolsSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AprilFoolsSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<AprilFoolsAlbinoSharkoEntity>> APRIL_FOOLS_ALBINO_SHARKO = register("april_fools_albino_sharko",
			EntityType.Builder.<AprilFoolsAlbinoSharkoEntity>of(AprilFoolsAlbinoSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AprilFoolsAlbinoSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<AprilFoolsRareSharkoEntity>> APRIL_FOOLS_RARE_SHARKO = register("april_fools_rare_sharko",
			EntityType.Builder.<AprilFoolsRareSharkoEntity>of(AprilFoolsRareSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AprilFoolsRareSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<AprilFoolsLegendarySharkoEntity>> APRIL_FOOLS_LEGENDARY_SHARKO = register("april_fools_legendary_sharko",
			EntityType.Builder.<AprilFoolsLegendarySharkoEntity>of(AprilFoolsLegendarySharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AprilFoolsLegendarySharkoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AprilFoolsMythicSharkoEntity>> APRIL_FOOLS_MYTHIC_SHARKO = register("april_fools_mythic_sharko",
			EntityType.Builder.<AprilFoolsMythicSharkoEntity>of(AprilFoolsMythicSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AprilFoolsMythicSharkoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AprilFoolsExoticSharkoEntity>> APRIL_FOOLS_EXOTIC_SHARKO = register("april_fools_exotic_sharko",
			EntityType.Builder.<AprilFoolsExoticSharkoEntity>of(AprilFoolsExoticSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AprilFoolsExoticSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<AprilFoolsEngieSharkoEntity>> APRIL_FOOLS_ENGIE_SHARKO = register("april_fools_engie_sharko",
			EntityType.Builder.<AprilFoolsEngieSharkoEntity>of(AprilFoolsEngieSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AprilFoolsEngieSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<AprilFoolsRareEngieSharkoEntity>> APRIL_FOOLS_RARE_ENGIE_SHARKO = register("april_fools_rare_engie_sharko",
			EntityType.Builder.<AprilFoolsRareEngieSharkoEntity>of(AprilFoolsRareEngieSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AprilFoolsRareEngieSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<AprilFoolsTigerSharkoEntity>> APRIL_FOOLS_TIGER_SHARKO = register("april_fools_tiger_sharko",
			EntityType.Builder.<AprilFoolsTigerSharkoEntity>of(AprilFoolsTigerSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AprilFoolsTigerSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<UncommonSharkoEntity>> UNCOMMON_SHARKO = register("uncommon_sharko",
			EntityType.Builder.<UncommonSharkoEntity>of(UncommonSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(UncommonSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<XEngieGamesEntity>> X_ENGIE_GAMES = register("x_engie_games",
			EntityType.Builder.<XEngieGamesEntity>of(XEngieGamesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(XEngieGamesEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<RiftBallEntity>> RIFT_BALL = register("rift_ball",
			EntityType.Builder.<RiftBallEntity>of(RiftBallEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RiftBallEntity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<WormholeSharkoEntity>> WORMHOLE_SHARKO = register("wormhole_sharko", EntityType.Builder.<WormholeSharkoEntity>of(WormholeSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WormholeSharkoEntity::new).fireImmune().sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<GlitchSharkoEntity>> GLITCH_SHARKO = register("glitch_sharko", EntityType.Builder.<GlitchSharkoEntity>of(GlitchSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GlitchSharkoEntity::new).fireImmune().sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<XEngieSharkoEntity>> X_ENGIE_SHARKO = register("x_engie_sharko", EntityType.Builder.<XEngieSharkoEntity>of(XEngieSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(XEngieSharkoEntity::new).fireImmune().sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EngiePocMadEngieEntity>> ENGIE_POC_MAD_ENGIE = register("engie_poc_mad_engie",
			EntityType.Builder.<EngiePocMadEngieEntity>of(EngiePocMadEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(EngiePocMadEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<EngiePocAngryEngieEntity>> ENGIE_POC_ANGRY_ENGIE = register("engie_poc_angry_engie",
			EntityType.Builder.<EngiePocAngryEngieEntity>of(EngiePocAngryEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(EngiePocAngryEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<EngiePocEnragedEngieEntity>> ENGIE_POC_ENRAGED_ENGIE = register("engie_poc_enraged_engie",
			EntityType.Builder.<EngiePocEnragedEngieEntity>of(EngiePocEnragedEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3)
					.setCustomClientFactory(EngiePocEnragedEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<EngiePocOutragedEngieEntity>> ENGIE_POC_OUTRAGED_ENGIE = register("engie_poc_outraged_engie",
			EntityType.Builder.<EngiePocOutragedEngieEntity>of(EngiePocOutragedEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3)
					.setCustomClientFactory(EngiePocOutragedEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<EngiePocMonstrosityEngieEntity>> ENGIE_POC_MONSTROSITY_ENGIE = register("engie_poc_monstrosity_engie",
			EntityType.Builder.<EngiePocMonstrosityEngieEntity>of(EngiePocMonstrosityEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3)
					.setCustomClientFactory(EngiePocMonstrosityEngieEntity::new).fireImmune().sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<EngiePocHostileBiblicallyAccurateEngieEntity>> ENGIE_POC_HOSTILE_BIBLICALLY_ACCURATE_ENGIE = register("engie_poc_hostile_biblically_accurate_engie",
			EntityType.Builder.<EngiePocHostileBiblicallyAccurateEngieEntity>of(EngiePocHostileBiblicallyAccurateEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3)
					.setCustomClientFactory(EngiePocHostileBiblicallyAccurateEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<EngiePocEngieEntity>> ENGIE_POC_HOSTILE_ENGIE = register("engie_poc_hostile_engie",
			EntityType.Builder.<EngiePocEngieEntity>of(EngiePocEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(EngiePocEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<HordeSpawnerEntity>> HORDE_SPAWNER = register("horde_spawner", EntityType.Builder.<HordeSpawnerEntity>of(HordeSpawnerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HordeSpawnerEntity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<EngieGamesMadEngieEntity>> ENGIE_GAMES_MAD_ENGIE = register("engie_games_mad_engie",
			EntityType.Builder.<EngieGamesMadEngieEntity>of(EngieGamesMadEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(320).setUpdateInterval(3).setCustomClientFactory(EngieGamesMadEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<EngieGamesAngryEngieEntity>> ENGIE_GAMES_ANGRY_ENGIE = register("engie_games_angry_engie",
			EntityType.Builder.<EngieGamesAngryEngieEntity>of(EngieGamesAngryEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(320).setUpdateInterval(3)
					.setCustomClientFactory(EngieGamesAngryEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<EngieGamesEnragedEngieEntity>> ENGIE_GAMES_ENRAGED_ENGIE = register("engie_games_enraged_engie",
			EntityType.Builder.<EngieGamesEnragedEngieEntity>of(EngieGamesEnragedEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(320).setUpdateInterval(3)
					.setCustomClientFactory(EngieGamesEnragedEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<EngieGamesOutragedEngieEntity>> ENGIE_GAMES_OUTRAGED_ENGIE = register("engie_games_outraged_engie",
			EntityType.Builder.<EngieGamesOutragedEngieEntity>of(EngieGamesOutragedEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(320).setUpdateInterval(3)
					.setCustomClientFactory(EngieGamesOutragedEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<EngieGamesHostileBiblicallyAccurateEngieEntity>> ENGIE_GAMES_HOSTILE_BIBLICALLY_ACCURATE_ENGIE = register("engie_games_hostile_biblically_accurate_engie",
			EntityType.Builder.<EngieGamesHostileBiblicallyAccurateEngieEntity>of(EngieGamesHostileBiblicallyAccurateEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(320).setUpdateInterval(3)
					.setCustomClientFactory(EngieGamesHostileBiblicallyAccurateEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<EngieGamesMonstrosityEngieEntity>> ENGIE_GAMES_MONSTROSITY_ENGIE = register("engie_games_monstrosity_engie",
			EntityType.Builder.<EngieGamesMonstrosityEngieEntity>of(EngieGamesMonstrosityEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(320).setUpdateInterval(3)
					.setCustomClientFactory(EngieGamesMonstrosityEngieEntity::new).fireImmune().sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<EngieGamesHostileEngieEntity>> ENGIE_GAMES_HOSTILE_ENGIE = register("engie_games_hostile_engie",
			EntityType.Builder.<EngieGamesHostileEngieEntity>of(EngieGamesHostileEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(320).setUpdateInterval(3)
					.setCustomClientFactory(EngieGamesHostileEngieEntity::new)

					.sized(0.6f, 1.9f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			EngiEntity.init();
			MadEngieEntity.init();
			AngryEngieEntity.init();
			EnragedEngieEntity.init();
			AngryCreatorEntity.init();
			SharkoEntity.init();
			ProtogenEntity.init();
			QuizzetEntity.init();
			EnragedNormalEntity.init();
			EnragedTNTEntity.init();
			EnragedSpeedEntity.init();
			CommonEngieEntity.init();
			UncommonEngieEntity.init();
			RareEngieEntity.init();
			EpicEngieEntity.init();
			LegendaryEngieEntity.init();
			MythicEngieEntity.init();
			ExoticEngieEntity.init();
			BiblicallyAccurateEngieEntity.init();
			MonstrosityEngieEntity.init();
			HeWhoGamesEntity.init();
			HeWhoGamesHostileEntity.init();
			InsanityEntity.init();
			YellowLightningEntity.init();
			BlueBurstEntity.init();
			NormalEntity.init();
			MOABEntity.init();
			PureInsanityEntity.init();
			DoomsDayEntity.init();
			SuperDoomsDayEntity.init();
			DoomsDayHostileEntity.init();
			SuperDoomsDayHostileEntity.init();
			TheEndEntity.init();
			TheEndHostileEntity.init();
			EngieGamesDetectiveEntity.init();
			EngieGamesEntity.init();
			DDayLightningSpawnerEntity.init();
			DDAYRiftEntity.init();
			EnragedEngieOldRiftedEntity.init();
			MadEngieOldRiftedEntity.init();
			AngryEngieOldRiftedEntity.init();
			AngryCreatorRiftedEntity.init();
			BloodyEngieRiftedEntity.init();
			MindscapeEngieEntity.init();
			DistortedEntity.init();
			TheRealEngieGamesEntity.init();
			ScorchedEntity.init();
			ThrowbackSharkoEntity.init();
			WormholeEngieEntity.init();
			RoughianTheRealEngieGamesEntity.init();
			CosmicTheRealEngieGamesEntity.init();
			ThrowbackMadEngieEntity.init();
			ThrowbackAngryEngieEntity.init();
			ThrowbackEnragedEngieEntity.init();
			ThrowbackAngryCreatorEntity.init();
			ThrowbackEngiEntity.init();
			ThrowbackCreatorEntity.init();
			HostileBiblicallyAccurateEngieEntity.init();
			PunisherEntity.init();
			TheRealEngieGamesHalloweenEntity.init();
			ShadowSharkEngieEntity.init();
			ShadowSharkEngieBlindEntity.init();
			ClippedbyengieEntity.init();
			NightmareEnragedEngieEntity.init();
			NightmareMadEngieEntity.init();
			NightmareAngryEngieEntity.init();
			NightmareOutragedEngieEntity.init();
			NightmareMonstrosityEngieEntity.init();
			NightmareHostileBiblicallyAccurateEngieEntity.init();
			InsanityMadEngieEntity.init();
			InsanityAngryEngieEntity.init();
			InsanityEnragedEngieEntity.init();
			InsanityOutragedEngieEntity.init();
			InsanityMonstrosityEngieEntity.init();
			NightmareEngieEntity.init();
			InsanityEngieEntity.init();
			InsanityHostileBiblicallyAccurateEngieEntity.init();
			HsotileEngieEntity.init();
			RareSharkoEntity.init();
			EpicSharkoEntity.init();
			LegendarySharkoEntity.init();
			MythicSharkoEntity.init();
			ExoticSharkoEntity.init();
			EngieSharkoEntity.init();
			RareEngieSharkoEntity.init();
			TigerSharkoEntity.init();
			AlienSharkoEntity.init();
			AngryDeathSharkoEntity.init();
			EnragedDeathSharkoEntity.init();
			OutragedDeathSharkoEntity.init();
			BiblicallyDeathSharkoEntity.init();
			MonstrosityDeathSharkoEntity.init();
			CosmicDeathSharkoEntity.init();
			OMENEntity.init();
			DDaySpikeEntity.init();
			DDayAvalancheEntity.init();
			AprilFoolsSharkoEntity.init();
			AprilFoolsAlbinoSharkoEntity.init();
			AprilFoolsRareSharkoEntity.init();
			AprilFoolsLegendarySharkoEntity.init();
			AprilFoolsMythicSharkoEntity.init();
			AprilFoolsExoticSharkoEntity.init();
			AprilFoolsEngieSharkoEntity.init();
			AprilFoolsRareEngieSharkoEntity.init();
			AprilFoolsTigerSharkoEntity.init();
			UncommonSharkoEntity.init();
			XEngieGamesEntity.init();
			RiftBallEntity.init();
			WormholeSharkoEntity.init();
			GlitchSharkoEntity.init();
			XEngieSharkoEntity.init();
			EngiePocMadEngieEntity.init();
			EngiePocAngryEngieEntity.init();
			EngiePocEnragedEngieEntity.init();
			EngiePocOutragedEngieEntity.init();
			EngiePocMonstrosityEngieEntity.init();
			EngiePocHostileBiblicallyAccurateEngieEntity.init();
			EngiePocEngieEntity.init();
			HordeSpawnerEntity.init();
			EngieGamesMadEngieEntity.init();
			EngieGamesAngryEngieEntity.init();
			EngieGamesEnragedEngieEntity.init();
			EngieGamesOutragedEngieEntity.init();
			EngieGamesHostileBiblicallyAccurateEngieEntity.init();
			EngieGamesMonstrosityEngieEntity.init();
			EngieGamesHostileEngieEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ENGIE.get(), EngiEntity.createAttributes().build());
		event.put(MAD_ENGIE.get(), MadEngieEntity.createAttributes().build());
		event.put(ANGRY_ENGIE.get(), AngryEngieEntity.createAttributes().build());
		event.put(ENRAGED_ENGIE.get(), EnragedEngieEntity.createAttributes().build());
		event.put(OUTRAGED_ENGIE.get(), AngryCreatorEntity.createAttributes().build());
		event.put(SHARKO.get(), SharkoEntity.createAttributes().build());
		event.put(PROTOGEN.get(), ProtogenEntity.createAttributes().build());
		event.put(QUIZZET.get(), QuizzetEntity.createAttributes().build());
		event.put(ENRAGED_NORMAL.get(), EnragedNormalEntity.createAttributes().build());
		event.put(ENRAGED_TNT.get(), EnragedTNTEntity.createAttributes().build());
		event.put(ENRAGED_SPEED.get(), EnragedSpeedEntity.createAttributes().build());
		event.put(COMMON_ENGIE.get(), CommonEngieEntity.createAttributes().build());
		event.put(UNCOMMON_ENGIE.get(), UncommonEngieEntity.createAttributes().build());
		event.put(RARE_ENGIE.get(), RareEngieEntity.createAttributes().build());
		event.put(EPIC_ENGIE.get(), EpicEngieEntity.createAttributes().build());
		event.put(LEGENDARY_ENGIE.get(), LegendaryEngieEntity.createAttributes().build());
		event.put(MYTHIC_ENGIE.get(), MythicEngieEntity.createAttributes().build());
		event.put(EXOTIC_ENGIE.get(), ExoticEngieEntity.createAttributes().build());
		event.put(BIBLICALLY_ACCURATE_ENGIE.get(), BiblicallyAccurateEngieEntity.createAttributes().build());
		event.put(MONSTROSITY_ENGIE.get(), MonstrosityEngieEntity.createAttributes().build());
		event.put(HE_WHO_GAMES.get(), HeWhoGamesEntity.createAttributes().build());
		event.put(HE_WHO_GAMES_HOSTILE.get(), HeWhoGamesHostileEntity.createAttributes().build());
		event.put(INSANITY.get(), InsanityEntity.createAttributes().build());
		event.put(YELLOW_LIGHTNING.get(), YellowLightningEntity.createAttributes().build());
		event.put(BLUE_BURST.get(), BlueBurstEntity.createAttributes().build());
		event.put(NORMAL.get(), NormalEntity.createAttributes().build());
		event.put(MOAB.get(), MOABEntity.createAttributes().build());
		event.put(PURE_INSANITY.get(), PureInsanityEntity.createAttributes().build());
		event.put(DOOMS_DAY.get(), DoomsDayEntity.createAttributes().build());
		event.put(SUPER_DOOMS_DAY.get(), SuperDoomsDayEntity.createAttributes().build());
		event.put(DOOMS_DAY_HOSTILE.get(), DoomsDayHostileEntity.createAttributes().build());
		event.put(SUPER_DOOMS_DAY_HOSTILE.get(), SuperDoomsDayHostileEntity.createAttributes().build());
		event.put(THE_END.get(), TheEndEntity.createAttributes().build());
		event.put(THE_END_HOSTILE.get(), TheEndHostileEntity.createAttributes().build());
		event.put(ENGIE_GAMES_DETECTIVE.get(), EngieGamesDetectiveEntity.createAttributes().build());
		event.put(ENGIE_GAMES.get(), EngieGamesEntity.createAttributes().build());
		event.put(D_DAY_LIGHTNING_SPAWNER.get(), DDayLightningSpawnerEntity.createAttributes().build());
		event.put(DDAY_RIFT.get(), DDAYRiftEntity.createAttributes().build());
		event.put(ENRAGED_ENGIE_OLD_RIFTED.get(), EnragedEngieOldRiftedEntity.createAttributes().build());
		event.put(MAD_ENGIE_OLD_RIFTED.get(), MadEngieOldRiftedEntity.createAttributes().build());
		event.put(ANGRY_ENGIE_OLD_RIFTED.get(), AngryEngieOldRiftedEntity.createAttributes().build());
		event.put(ANGRY_CREATOR_RIFTED.get(), AngryCreatorRiftedEntity.createAttributes().build());
		event.put(BLOODY_ENGIE_RIFTED.get(), BloodyEngieRiftedEntity.createAttributes().build());
		event.put(MINDSCAPE_ENGIE.get(), MindscapeEngieEntity.createAttributes().build());
		event.put(DISTORTED.get(), DistortedEntity.createAttributes().build());
		event.put(THE_REAL_ENGIE_GAMES.get(), TheRealEngieGamesEntity.createAttributes().build());
		event.put(SCORCHED.get(), ScorchedEntity.createAttributes().build());
		event.put(THROWBACK_SHARKO.get(), ThrowbackSharkoEntity.createAttributes().build());
		event.put(WORMHOLE_ENGIE.get(), WormholeEngieEntity.createAttributes().build());
		event.put(ROUGHIAN_THE_REAL_ENGIE_GAMES.get(), RoughianTheRealEngieGamesEntity.createAttributes().build());
		event.put(COSMIC_THE_REAL_ENGIE_GAMES.get(), CosmicTheRealEngieGamesEntity.createAttributes().build());
		event.put(THROWBACK_MAD_ENGIE.get(), ThrowbackMadEngieEntity.createAttributes().build());
		event.put(THROWBACK_ANGRY_ENGIE.get(), ThrowbackAngryEngieEntity.createAttributes().build());
		event.put(THROWBACK_ENRAGED_ENGIE.get(), ThrowbackEnragedEngieEntity.createAttributes().build());
		event.put(THROWBACK_ANGRY_CREATOR.get(), ThrowbackAngryCreatorEntity.createAttributes().build());
		event.put(THROWBACK_ENGI.get(), ThrowbackEngiEntity.createAttributes().build());
		event.put(THROWBACK_CREATOR.get(), ThrowbackCreatorEntity.createAttributes().build());
		event.put(HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), HostileBiblicallyAccurateEngieEntity.createAttributes().build());
		event.put(PUNISHER.get(), PunisherEntity.createAttributes().build());
		event.put(THE_REAL_ENGIE_GAMES_HALLOWEEN.get(), TheRealEngieGamesHalloweenEntity.createAttributes().build());
		event.put(SHADOW_SHARK_ENGIE.get(), ShadowSharkEngieEntity.createAttributes().build());
		event.put(SHADOW_SHARK_ENGIE_BLIND.get(), ShadowSharkEngieBlindEntity.createAttributes().build());
		event.put(CLIPPEDBYENGIE.get(), ClippedbyengieEntity.createAttributes().build());
		event.put(NIGHTMARE_ENRAGED_ENGIE.get(), NightmareEnragedEngieEntity.createAttributes().build());
		event.put(NIGHTMARE_MAD_ENGIE.get(), NightmareMadEngieEntity.createAttributes().build());
		event.put(NIGHTMARE_ANGRY_ENGIE.get(), NightmareAngryEngieEntity.createAttributes().build());
		event.put(NIGHTMARE_OUTRAGED_ENGIE.get(), NightmareOutragedEngieEntity.createAttributes().build());
		event.put(NIGHTMARE_MONSTROSITY_ENGIE.get(), NightmareMonstrosityEngieEntity.createAttributes().build());
		event.put(NIGHTMARE_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), NightmareHostileBiblicallyAccurateEngieEntity.createAttributes().build());
		event.put(INSANITY_MAD_ENGIE.get(), InsanityMadEngieEntity.createAttributes().build());
		event.put(INSANITY_ANGRY_ENGIE.get(), InsanityAngryEngieEntity.createAttributes().build());
		event.put(INSANITY_ENRAGED_ENGIE.get(), InsanityEnragedEngieEntity.createAttributes().build());
		event.put(INSANITY_OUTRAGED_ENGIE.get(), InsanityOutragedEngieEntity.createAttributes().build());
		event.put(INSANITY_MONSTROSITY_ENGIE.get(), InsanityMonstrosityEngieEntity.createAttributes().build());
		event.put(NIGHTMARE_HOSTILE_ENGIE.get(), NightmareEngieEntity.createAttributes().build());
		event.put(INSANITY_HOSTILE_ENGIE.get(), InsanityEngieEntity.createAttributes().build());
		event.put(INSANITY_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), InsanityHostileBiblicallyAccurateEngieEntity.createAttributes().build());
		event.put(HOSTILE_ENGIE.get(), HsotileEngieEntity.createAttributes().build());
		event.put(RARE_SHARKO.get(), RareSharkoEntity.createAttributes().build());
		event.put(EPIC_SHARKO.get(), EpicSharkoEntity.createAttributes().build());
		event.put(LEGENDARY_SHARKO.get(), LegendarySharkoEntity.createAttributes().build());
		event.put(MYTHIC_SHARKO.get(), MythicSharkoEntity.createAttributes().build());
		event.put(EXOTIC_SHARKO.get(), ExoticSharkoEntity.createAttributes().build());
		event.put(ENGIE_SHARKO.get(), EngieSharkoEntity.createAttributes().build());
		event.put(RARE_ENGIE_SHARKO.get(), RareEngieSharkoEntity.createAttributes().build());
		event.put(TIGER_SHARKO.get(), TigerSharkoEntity.createAttributes().build());
		event.put(ALIEN_SHARKO.get(), AlienSharkoEntity.createAttributes().build());
		event.put(ANGRY_DEATH_SHARKO.get(), AngryDeathSharkoEntity.createAttributes().build());
		event.put(ENRAGED_DEATH_SHARKO.get(), EnragedDeathSharkoEntity.createAttributes().build());
		event.put(OUTRAGED_DEATH_SHARKO.get(), OutragedDeathSharkoEntity.createAttributes().build());
		event.put(BIBLICALLY_DEATH_SHARKO.get(), BiblicallyDeathSharkoEntity.createAttributes().build());
		event.put(MONSTROSITY_DEATH_SHARKO.get(), MonstrosityDeathSharkoEntity.createAttributes().build());
		event.put(COSMIC_DEATH_SHARKO.get(), CosmicDeathSharkoEntity.createAttributes().build());
		event.put(OMEN.get(), OMENEntity.createAttributes().build());
		event.put(D_DAY_SPIKE.get(), DDaySpikeEntity.createAttributes().build());
		event.put(D_DAY_AVALANCHE.get(), DDayAvalancheEntity.createAttributes().build());
		event.put(APRIL_FOOLS_SHARKO.get(), AprilFoolsSharkoEntity.createAttributes().build());
		event.put(APRIL_FOOLS_ALBINO_SHARKO.get(), AprilFoolsAlbinoSharkoEntity.createAttributes().build());
		event.put(APRIL_FOOLS_RARE_SHARKO.get(), AprilFoolsRareSharkoEntity.createAttributes().build());
		event.put(APRIL_FOOLS_LEGENDARY_SHARKO.get(), AprilFoolsLegendarySharkoEntity.createAttributes().build());
		event.put(APRIL_FOOLS_MYTHIC_SHARKO.get(), AprilFoolsMythicSharkoEntity.createAttributes().build());
		event.put(APRIL_FOOLS_EXOTIC_SHARKO.get(), AprilFoolsExoticSharkoEntity.createAttributes().build());
		event.put(APRIL_FOOLS_ENGIE_SHARKO.get(), AprilFoolsEngieSharkoEntity.createAttributes().build());
		event.put(APRIL_FOOLS_RARE_ENGIE_SHARKO.get(), AprilFoolsRareEngieSharkoEntity.createAttributes().build());
		event.put(APRIL_FOOLS_TIGER_SHARKO.get(), AprilFoolsTigerSharkoEntity.createAttributes().build());
		event.put(UNCOMMON_SHARKO.get(), UncommonSharkoEntity.createAttributes().build());
		event.put(X_ENGIE_GAMES.get(), XEngieGamesEntity.createAttributes().build());
		event.put(RIFT_BALL.get(), RiftBallEntity.createAttributes().build());
		event.put(WORMHOLE_SHARKO.get(), WormholeSharkoEntity.createAttributes().build());
		event.put(GLITCH_SHARKO.get(), GlitchSharkoEntity.createAttributes().build());
		event.put(X_ENGIE_SHARKO.get(), XEngieSharkoEntity.createAttributes().build());
		event.put(ENGIE_POC_MAD_ENGIE.get(), EngiePocMadEngieEntity.createAttributes().build());
		event.put(ENGIE_POC_ANGRY_ENGIE.get(), EngiePocAngryEngieEntity.createAttributes().build());
		event.put(ENGIE_POC_ENRAGED_ENGIE.get(), EngiePocEnragedEngieEntity.createAttributes().build());
		event.put(ENGIE_POC_OUTRAGED_ENGIE.get(), EngiePocOutragedEngieEntity.createAttributes().build());
		event.put(ENGIE_POC_MONSTROSITY_ENGIE.get(), EngiePocMonstrosityEngieEntity.createAttributes().build());
		event.put(ENGIE_POC_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), EngiePocHostileBiblicallyAccurateEngieEntity.createAttributes().build());
		event.put(ENGIE_POC_HOSTILE_ENGIE.get(), EngiePocEngieEntity.createAttributes().build());
		event.put(HORDE_SPAWNER.get(), HordeSpawnerEntity.createAttributes().build());
		event.put(ENGIE_GAMES_MAD_ENGIE.get(), EngieGamesMadEngieEntity.createAttributes().build());
		event.put(ENGIE_GAMES_ANGRY_ENGIE.get(), EngieGamesAngryEngieEntity.createAttributes().build());
		event.put(ENGIE_GAMES_ENRAGED_ENGIE.get(), EngieGamesEnragedEngieEntity.createAttributes().build());
		event.put(ENGIE_GAMES_OUTRAGED_ENGIE.get(), EngieGamesOutragedEngieEntity.createAttributes().build());
		event.put(ENGIE_GAMES_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), EngieGamesHostileBiblicallyAccurateEngieEntity.createAttributes().build());
		event.put(ENGIE_GAMES_MONSTROSITY_ENGIE.get(), EngieGamesMonstrosityEngieEntity.createAttributes().build());
		event.put(ENGIE_GAMES_HOSTILE_ENGIE.get(), EngieGamesHostileEngieEntity.createAttributes().build());
	}
}