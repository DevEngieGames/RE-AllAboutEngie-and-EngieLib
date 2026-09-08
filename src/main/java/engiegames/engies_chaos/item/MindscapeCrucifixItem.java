package engiegames.engies_chaos.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.procedures.CrucifixTickingProcedure;
import engiegames.engies_chaos.init.EngiesChaosModTabs;

public class MindscapeCrucifixItem extends Item {
	public MindscapeCrucifixItem() {
		super(new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ITEMS).durability(200).rarity(Rarity.EPIC));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		CrucifixTickingProcedure.execute(world, itemstack);
	}
}