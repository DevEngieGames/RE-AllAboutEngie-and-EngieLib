package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.ModList;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class ConfigShowDiffProcedure {
	public static String execute(LevelAccessor world) {
		if (ModList.get().isLoaded("attributefix")) {
			return "Difficulty: " + new java.text.DecimalFormat("###,###").format(EngiesChaosModVariables.MapVariables.get(world).MobDifficulty);
		}
		return "ERR.ATTRIBUTEFIXNOTINSTALLED";
	}
}