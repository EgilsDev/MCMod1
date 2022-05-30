package net.tofuzzzy.mod1;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.io.IOException;

import static com.mojang.blaze3d.platform.InputConstants.KEY_Q;

public class onKeyPress {
    private Object mc;

    @SubscribeEvent
    public void onKeyPress(InputEvent.KeyInputEvent event) {
        InputConstants Keyboard = null;
        if (Keyboard.isKeyDown(KEY_Q)) ;
        {
            System.out.println("J key was pressed");
            this.mc.dispatchKeypresses(KEY_Q);
        }
    }

    public void handleKeyboardInput() throws IOException
    {

        int k = Keyboard.getEventKey();

        char c = Keyboard.getEventCharacter();


        if (Keyboard.getEventKeyState() || k == 0 && Character.isDefined(c))

        {

            this.keyTyped(c, k);

        }


        this.mc.dispatchKeypresses();

    }

}
