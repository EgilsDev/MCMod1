package net.tofuzzzy.mod1;

import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class itemheld {
   @SubscribeEvent
    public static void helditem(PlayerInteractEvent event) {

        Player player = event.getPlayer();
        int clicks = 0;

        String iteminhand = String.valueOf(event.getPlayer().getMainHandItem().getItem());
        System.out.println(iteminhand);

        clicks = clicks + 1;
        System.out.println(clicks);

    }
}
