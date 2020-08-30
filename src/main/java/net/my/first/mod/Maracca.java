package net.my.first.mod;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class Maracca extends Item{

    public Maracca(Settings settings) {
        super(settings);
    }

    public static final Identifier MARACCA_SOUND = new Identifier("myfirstmod:maracca");
    public static SoundEvent MARACCA_SOUND_EVENT = new SoundEvent(MARACCA_SOUND);

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        playerEntity.playSound(MARACCA_SOUND_EVENT, 1.0F, 1.0F);
        return new TypedActionResult<>(ActionResult.SUCCESS, playerEntity.getStackInHand(hand));
    }
    
}