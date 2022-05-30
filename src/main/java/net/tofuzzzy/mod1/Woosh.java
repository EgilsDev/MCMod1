package net.tofuzzzy.mod1;

import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class Woosh {
    @SubscribeEvent
    public static void Woosh(PlayerInteractEvent event) {

        Player player = event.getPlayer();
        int randomnum = 0;
        int min = 1;
        int max = 100;

        //JTextComponent.KeyBinding.setKeyBindState(mc.gameSettings.keyBind["q"].getKeyCode(), true);


        randomnum = (int) ( Math.random()*(max - min+1)+min);
        System.out.println(randomnum);

        if (randomnum > 50) {
            System.out.println("Shit was executed");
        }
    }

}
