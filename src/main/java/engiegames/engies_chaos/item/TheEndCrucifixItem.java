package engiegames.engies_chaos.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.procedures.CrucifixTickingProcedure;
import engiegames.engies_chaos.init.EngiesChaosModTabs;

public class TheEndCrucifixItem extends Item {
	public TheEndCrucifixItem() {
		super(new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ITEMS).durability(125).rarity(Rarity.EPIC));
	}

	@Override
	public int getEnchantmentValue() {
		return 22;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		CrucifixTickingProcedure.execute(world, itemstack);
	}
}