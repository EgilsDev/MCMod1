package net.tofuzzzy.mod1;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

//All of this is experimental and for testing
public class onKeyPress {
    private Object mc;
    private long q;
    long Q = q;

    @SubscribeEvent
    public void onKeyPress(InputEvent.KeyInputEvent event) {
        InputConstants Keyboard = null;
        if (Keyboard.isKeyDown(q,1)) ;
        {
            System.out.println("q key was pressed");
            //this.mc.dispatchKeypresses(KEY_Q);
        }
    }

    //world.getBlockState(entity.getPosition().down())

    /*
    if (getMinecraft().gameSettings.keyBindJump.isPressed())
    {
      //** Do something here **
    }

     */
/*Dont even kow what the fuck is thos
    public void handleKeyboardInput() throws IOException{
        int k = Keyboard.getEventKey();
        char c = Keyboard.getEventCharacter();

        if (Keyboard.getEventKeyState() || k == 0 && Character.isDefined(c)){
            this.keyTyped(c, k);
        }
        this.mc.dispatchKeypresses();
    }  */
}
