package com.dapperarmor;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class DapperArmorMod implements ModInitializer {
    public static final String MOD_ID = "dapperarmor";

    public static final Item TOP_HAT = new ArmorItem(
            DapperArmorMaterial.INSTANCE, ArmorItem.Type.HELMET,
            new Item.Settings());
    public static final Item SUIT_JACKET = new ArmorItem(
            DapperArmorMaterial.INSTANCE, ArmorItem.Type.CHESTPLATE,
            new Item.Settings());
    public static final Item SUIT_TROUSERS = new ArmorItem(
            DapperArmorMaterial.INSTANCE, ArmorItem.Type.LEGGINGS,
            new Item.Settings());
    public static final Item DRESS_SHOES = new ArmorItem(
            DapperArmorMaterial.INSTANCE, ArmorItem.Type.BOOTS,
            new Item.Settings());

    public static final RegistryKey<ItemGroup> DAPPER_GROUP_KEY =
            RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "dapper_group"));

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "top_hat"), TOP_HAT);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "suit_jacket"), SUIT_JACKET);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "suit_trousers"), SUIT_TROUSERS);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "dress_shoes"), DRESS_SHOES);

        ItemGroup group = FabricItemGroup.builder()
                .icon(() -> new ItemStack(TOP_HAT))
                .displayName(Text.translatable("itemGroup.dapperarmor.dapper_group"))
                .entries((displayContext, entries) -> {
                    entries.add(TOP_HAT);
                    entries.add(SUIT_JACKET);
                    entries.add(SUIT_TROUSERS);
                    entries.add(DRESS_SHOES);
                })
                .build();

        Registry.register(Registries.ITEM_GROUP, DAPPER_GROUP_KEY, group);
    }
}