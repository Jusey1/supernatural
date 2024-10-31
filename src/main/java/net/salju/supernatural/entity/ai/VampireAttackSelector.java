package net.salju.supernatural.entity.ai;

import net.salju.supernatural.events.SupernaturalManager;

import net.minecraft.world.entity.npc.AbstractVillager;
import net.minecraft.world.entity.monster.AbstractIllager;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.LivingEntity;



public class VampireAttackSelector implements Predicate<LivingEntity> {
	private final AbstractIllager vampire;

	public VampireAttackSelector(AbstractIllager source) {
		this.vampire = source;
	}

	public boolean test(@Nullable LivingEntity target) {
		if (target instanceof Player) {
			if (this.vampire.getCurrentRaid() != null) {
				return true;
			}
			return !(SupernaturalManager.isVampire(target));
		}
		return (target instanceof AbstractVillager || target instanceof IronGolem);
	}
}