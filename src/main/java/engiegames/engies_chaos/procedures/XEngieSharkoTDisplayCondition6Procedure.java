package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.XEngieSharkoEntity;

public class XEngieSharkoTDisplayCondition6Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (!((entity.getDisplayName().getString()).equals("Pho") || (entity.getDisplayName().getString()).equals("Nyx")) && (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)
				&& (entity instanceof XEngieSharkoEntity _datEntI ? _datEntI.getEntityData().get(XEngieSharkoEntity.DATA_SharkoState) : 0) == 2
				&& (entity instanceof XEngieSharkoEntity _datEntL4 && _datEntL4.getEntityData().get(XEngieSharkoEntity.DATA_AlternateState)) == true) {
			return true;
		}
		return false;
	}
}