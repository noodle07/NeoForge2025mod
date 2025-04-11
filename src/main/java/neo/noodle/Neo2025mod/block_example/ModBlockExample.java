package neo.noodle.Neo2025mod.block_example;

import neo.noodle.Neo2025mod.TutorialMod;
import neo.noodle.Neo2025mod.item_example.ModItemExample;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlockExample {

    //BLOCKS is a DeferredRegister.Blocks
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(TutorialMod.MOD_ID);

    // METEORITE block
    public static final DeferredBlock<Block> MY_BETTER_BLOCK = BLOCKS.registerSimpleBlock("my_better_block", BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.parse("modpinho:my_better_block"))).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE));
    // METEORITE_BLOCK_ITEM block item
    public static final DeferredItem<BlockItem> MY_BETTER_BLOCK_ITEM = ModItemExample.ITEMS.register("my_better_block", () -> new BlockItem(MY_BETTER_BLOCK.get(), new BlockItem.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.parse("modpinho:my_better_block")))));

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
