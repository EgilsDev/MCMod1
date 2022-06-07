package net.tofuzzzy.mod1.Items.Storage;


import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tofuzzzy.mod1.mod1;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, mod1.MOD_ID);

    public static final RegistryObject<Item> SHITBOW = ITEMS.register("shitbow",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).durability(420)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


/*
    public static final RegisteryObject<item> SHITBOW = ITEMS.register("shitbow",
            () -> new BowItem(new Item.Properties().tab(ModCreatvieModeTab.TUTORIAL_TAB).durability(420)));
 */
}

