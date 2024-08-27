package net.substics.firstmod;

import net.fabricmc.api.ModInitializer;

import net.minecraft.client.render.DimensionEffects;
import net.substics.firstmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NetherStoneBlocks implements ModInitializer {
	public static final String MOD_ID = "nether-stone-blocks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}