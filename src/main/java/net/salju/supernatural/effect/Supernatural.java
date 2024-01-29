package net.salju.supernatural.effect;

import net.minecraftforge.client.extensions.common.IClientMobEffectExtensions;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class Supernatural extends MobEffect {
	public Supernatural(MobEffectCategory cate, int i) {
		super(cate, i);
	}

	@Override
	public boolean isDurationEffectTick(int d, int a) {
		return true;
	}

	@Override
	public void initializeClient(java.util.function.Consumer<IClientMobEffectExtensions> consumer) {
		consumer.accept(new IClientMobEffectExtensions() {
			@Override
			public boolean isVisibleInInventory(MobEffectInstance effect) {
				return false;
			}

			@Override
			public boolean isVisibleInGui(MobEffectInstance effect) {
				return false;
			}
		});
	}
}