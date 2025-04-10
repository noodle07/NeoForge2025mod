package neo.noodle.Neo2025mod.item_example;


import neo.noodle.Neo2025mod.TutorialMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModItemExample {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TutorialMod.MOD_ID);

    //public static final DeferredItem<Item> BATATADOMAC = ITEMS.registerItem(
    //        "batatadomac",
   //         Item::new, // The factory that the properties will be passed into.
   //         new Item.Properties() // The properties to use.
   // );

    public static final DeferredItem<Item> BATATADOMAC = ITEMS.registerSimpleItem(
            "batatadomac",
            new Item.Properties().food(new FoodProperties(5,0.6f,true))
    );

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
