package net.my.first.mod;

import net.fabricmc.api.ModInitializer;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModMain implements ModInitializer {

    public static final Maracca Maracca_Item = new Maracca(new Item.Settings().group(ItemGroup.MISC).maxCount(1));

    @Override
    public void onInitialize() {
        System.out.println("Mod Initilised");

        Registry.register(Registry.ITEM, new Identifier("myfirstmod", "maracca"), Maracca_Item);

        Registry.register(Registry.SOUND_EVENT, Maracca.MARACCA_SOUND, Maracca.MARACCA_SOUND_EVENT);

    }
    
}
    
