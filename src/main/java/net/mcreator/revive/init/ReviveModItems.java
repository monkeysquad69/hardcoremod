
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.revive.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.revive.item.TotemItem;
import net.mcreator.revive.item.RegularSwordItem;
import net.mcreator.revive.item.RandomSwordItem;
import net.mcreator.revive.item.PurpleItem;
import net.mcreator.revive.item.MusicItem;
import net.mcreator.revive.item.LifeItem;
import net.mcreator.revive.item.IceswordItem;
import net.mcreator.revive.item.GrayItem;
import net.mcreator.revive.item.GooItem;
import net.mcreator.revive.item.FireItem;
import net.mcreator.revive.item.EnfiriumPetalItem;
import net.mcreator.revive.item.CheeseItem;
import net.mcreator.revive.ReviveMod;

public class ReviveModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ReviveMod.MODID);
	public static final RegistryObject<Item> TOTEM = REGISTRY.register("totem", () -> new TotemItem());
	public static final RegistryObject<Item> LIFE = REGISTRY.register("life", () -> new LifeItem());
	public static final RegistryObject<Item> CAULDRON = block(ReviveModBlocks.CAULDRON);
	public static final RegistryObject<Item> GOO = REGISTRY.register("goo", () -> new GooItem());
	public static final RegistryObject<Item> JEB_WOOL = block(ReviveModBlocks.JEB_WOOL);
	public static final RegistryObject<Item> FROZEN_SNIFFER_EGG = block(ReviveModBlocks.FROZEN_SNIFFER_EGG);
	public static final RegistryObject<Item> REGULAR_SWORD = REGISTRY.register("regular_sword", () -> new RegularSwordItem());
	public static final RegistryObject<Item> GRAY = REGISTRY.register("gray", () -> new GrayItem());
	public static final RegistryObject<Item> FRAGILE_MUD_BRICKS = block(ReviveModBlocks.FRAGILE_MUD_BRICKS);
	public static final RegistryObject<Item> ENFIRIUM_SPAWN_EGG = REGISTRY.register("enfirium_spawn_egg", () -> new ForgeSpawnEggItem(ReviveModEntities.ENFIRIUM, -16738048, -154, new Item.Properties()));
	public static final RegistryObject<Item> ICESWORD = REGISTRY.register("icesword", () -> new IceswordItem());
	public static final RegistryObject<Item> CHEESE = REGISTRY.register("cheese", () -> new CheeseItem());
	public static final RegistryObject<Item> FIRE = REGISTRY.register("fire", () -> new FireItem());
	public static final RegistryObject<Item> MUSIC = REGISTRY.register("music", () -> new MusicItem());
	public static final RegistryObject<Item> PURPLE = REGISTRY.register("purple", () -> new PurpleItem());
	public static final RegistryObject<Item> BANDIT_SPAWN_EGG = REGISTRY.register("bandit_spawn_egg", () -> new ForgeSpawnEggItem(ReviveModEntities.BANDIT, -10066330, -52429, new Item.Properties()));
	public static final RegistryObject<Item> INFERMOO_SPAWN_EGG = REGISTRY.register("infermoo_spawn_egg", () -> new ForgeSpawnEggItem(ReviveModEntities.INFERMOO, -39424, -26266, new Item.Properties()));
	public static final RegistryObject<Item> JUNGLEZOMBIE_SPAWN_EGG = REGISTRY.register("junglezombie_spawn_egg", () -> new ForgeSpawnEggItem(ReviveModEntities.JUNGLEZOMBIE, -16737997, -3355648, new Item.Properties()));
	public static final RegistryObject<Item> ENFIRIUM_PETAL = REGISTRY.register("enfirium_petal", () -> new EnfiriumPetalItem());
	public static final RegistryObject<Item> RANDOM_SWORD = REGISTRY.register("random_sword", () -> new RandomSwordItem());
	public static final RegistryObject<Item> OBAMA = block(ReviveModBlocks.OBAMA);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
