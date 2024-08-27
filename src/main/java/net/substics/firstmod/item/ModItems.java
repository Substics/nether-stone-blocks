package net.substics.firstmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.substics.firstmod.NetherStoneBlocks;

public class ModItems {
    public static final Item NETHERRACK_BRICK = registerItem("netherrack_brick", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(NetherStoneBlocks.MOD_ID, name), item);
    }

    public static void registerModItems() {
        NetherStoneBlocks.LOGGER.info("Registering Mod Items For " + NetherStoneBlocks.MOD_ID);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
           entries.add(NETHERRACK_BRICK);
        });
    }
}