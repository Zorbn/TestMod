package io.github.zorbn.testmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TestMod implements ModInitializer {

    public static final Block TEST_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f));

    @Override
    public void onInitialize() {
        System.out.println("Loaded TestMod");

        Registry.register(Registry.BLOCK, new Identifier("testmod", "test_block"), TEST_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("testmod", "test_block"), new BlockItem(TEST_BLOCK, new Item.Settings().group(ItemGroup.MISC)));
    }
}
