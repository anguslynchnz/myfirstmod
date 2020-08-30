package net.my.first.mod;

import net.fabricmc.api.ModInitializer;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModMain implements ModInitializer {

    public static final Item FABRIC_ITEM = new Item(new Item.Settings().group(ItemGroup.MISC));

    @Override
    public void onInitialize() {
        // TODO Auto-generated method stub
        System.out.println("Mod Initilised");

        Registry.register(Registry.ITEM, new Identifier("tutorial", "fabric_item"), FABRIC_ITEM);

    }
    
}
    
