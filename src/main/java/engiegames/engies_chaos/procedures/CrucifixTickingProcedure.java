package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

import engiegames.engies_chaos.init.EngiesChaosModEnchantments;

public class CrucifixTickingProcedure {
	public static void execute(LevelAccessor world, ItemStack itemstack) {
		if (itemstack.getEnchantmentLevel(Enchantments.MOB_LOOTING) == 1) {
			itemstack.getOrCreateTag().putDouble("durabilitydamagepercentage",
					(100 - (20 + itemstack.getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()) + itemstack.getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_TRUE_BLESSING.get()) / 2d)));
		} else if (itemstack.getEnchantmentLevel(Enchantments.MOB_LOOTING) == 2) {
			itemstack.getOrCreateTag().putDouble("durabilitydamagepercentage",
					(100 - (26.7 + itemstack.getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()) + itemstack.getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_TRUE_BLESSING.get()) / 2d)));
		} else if (itemstack.getEnchantmentLevel(Enchantments.MOB_LOOTING) >= 3) {
			itemstack.getOrCreateTag().putDouble("durabilitydamagepercentage",
					(100 - (30 + itemstack.getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()) + itemstack.getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_TRUE_BLESSING.get()) / 2d)));
		} else {
			itemstack.getOrCreateTag().putDouble("durabilitydamagepercentage",
					(100 - (itemstack.getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()) + itemstack.getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_TRUE_BLESSING.get()) / 2d)));
		}
	}
}