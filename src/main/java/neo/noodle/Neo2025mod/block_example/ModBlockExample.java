package neo.noodle.Neo2025mod.block_example;

import neo.noodle.Neo2025mod.TutorialMod;
import neo.noodle.Neo2025mod.item_example.ModItemExample;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlockExample {

    //BLOCKS is a DeferredRegister.Blocks
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(TutorialMod.MOD_ID);

    // Lapis Emerald Block
    public static final DeferredBlock<Block> LAPIS_EMERALD_BLOCK = BLOCKS.registerSimpleBlock("lapis_emerald_block", BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.parse("modpinho:lapis_emerald_block"))).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE));
    // Lapis Emerald Block item
    public static final DeferredItem<BlockItem> LAPIS_EMERALD_ITEM = ModItemExample.ITEMS.register("lapis_emerald_block", () -> new BlockItem(LAPIS_EMERALD_BLOCK.get(), new BlockItem.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.parse("modpinho:lapis_emerald_block")))));

    // Ruby Block
    public static final DeferredBlock<Block> RUBY_BLOCK = BLOCKS.registerSimpleBlock("ruby_block", BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.parse("modpinho:ruby_block"))).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE));
    // Ruby Block item
    public static final DeferredItem<BlockItem> RUBY_BLOCK_ITEM = ModItemExample.ITEMS.register("ruby_block_item", () -> new BlockItem(RUBY_BLOCK.get(), new BlockItem.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.parse("modpinho:ruby_block")))));

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
