package net.dongurs.delightfull.item;

import net.dongurs.delightfull.AnAdventurersDelight;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemStack;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Items {

    public static final Item SamuraiArmorTrim = registerItem("samurai_armor_trim",
            new Item(new Item.Settings()));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AnAdventurersDelight.MOD_ID, name), item);


    }


    private static void ItemGroupIngrediants(FabricItemGroupEntries entries){
        entries.add(SamuraiArmorTrim);
    }


    public static void registerModItems() {
        AnAdventurersDelight.LOGGER.info("Registering Mod Items for " + AnAdventurersDelight.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(Items::ItemGroupIngrediants);


    }

}
