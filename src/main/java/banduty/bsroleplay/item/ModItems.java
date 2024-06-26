package banduty.bsroleplay.item;

import banduty.bsroleplay.BsRolePlay;
import banduty.bsroleplay.block.ModBlock;
import banduty.bsroleplay.item.custom.armor.*;
import banduty.bsroleplay.item.custom.blocks.TinyBandutyItem;
import banduty.bsroleplay.item.custom.blocks.currency.CoinStackItem;
import banduty.bsroleplay.item.custom.blocks.currency.RPCoinItem;
import banduty.bsroleplay.item.custom.item.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    public static final Item ROLEPLAY_CORE = registerItem("roleplay_core",
            new Item(new FabricItemSettings()));
    public static final Item FUSION_CORE = registerItem("fusion_core",
            new Item(new FabricItemSettings()));

    public static final Item JUDGE_HAMMER = registerItem("judge_hammer",
            new JudgeHammer(new FabricItemSettings().maxCount(1).maxDamage(0).rarity(Rarity.UNCOMMON)));

    public static final Item POLICE_BATON = registerItem("police_baton",
            new PoliceBaton(ModToolMaterial.POLICE, new FabricItemSettings().maxDamage(0).rarity(Rarity.UNCOMMON)));

    public static final Item PHARAOH_STAFF = registerItem("pharaoh_staff",
            new PharaohStaff(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));

    public static final Item POLICE_HELMET = registerItem("police_helmet",
            new PoliceArmorItem(ModArmorMaterials.POLICE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item POLICE_CHESTPLATE = registerItem("police_chestplate",
            new PoliceArmorItem(ModArmorMaterials.POLICE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item POLICE_LEGGINGS = registerItem("police_leggings",
            new PoliceArmorItem(ModArmorMaterials.POLICE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item POLICE_BOOTS = registerItem("police_boots",
            new PoliceArmorItem(ModArmorMaterials.POLICE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item HALO = registerItem("halo",
            new HaloItem(ModArmorMaterials.HOLY, ArmorItem.Type.HELMET, new FabricItemSettings().rarity(Rarity.EPIC)));

    public static final Item RED_PIRATE_HELMET = registerItem("red_pirate_helmet",
            new PirateArmorItem(ModArmorMaterials.PIRATE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item RED_PIRATE_CHESTPLATE = registerItem("red_pirate_chestplate",
            new PirateArmorItem(ModArmorMaterials.PIRATE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item RED_PIRATE_LEGGINGS = registerItem("red_pirate_leggings",
            new PirateArmorItem(ModArmorMaterials.PIRATE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));

    public static final Item BLUE_PIRATE_HELMET = registerItem("blue_pirate_helmet",
            new PirateArmorItem(ModArmorMaterials.PIRATE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item BLUE_PIRATE_CHESTPLATE = registerItem("blue_pirate_chestplate",
            new PirateArmorItem(ModArmorMaterials.PIRATE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item BLUE_PIRATE_LEGGINGS = registerItem("blue_pirate_leggings",
            new PirateArmorItem(ModArmorMaterials.PIRATE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));

    public static final Item HOOK = registerItem("hook",
            new Hook(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));

    public static final Item CROWN = registerItem("crown",
            new CrownItem(ModArmorMaterials.KING, ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static final Item MINI_CROWN = registerItem("mini_crown",
            new MiniCrownItem(ModArmorMaterials.MINI_KING, ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static final Item DREAM_MASK = registerItem("dream_mask",
            new DreamMaskItem(ModArmorMaterials.MASK, ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static final Item BUNNY_MASK = registerItem("bunny_mask",
            new BunnyMaskItem(ModArmorMaterials.MASK, ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static final Item NEANDERTHAL_CHESTPLATE = registerItem("neanderthal_chestplate",
            new NeanderthalItem(ModArmorMaterials.NEANDERTHAL, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));

    public static final Item FUNERAL_MASK = registerItem("funeral_mask",
            new FuneralMaskItem(ModArmorMaterials.PHARAOH, ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static final Item CIVIC_CROWN = registerItem("civic_crown",
            new RomanEmperorItem(ModArmorMaterials.ROMAN, ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static final Item ROMAN_TOGA = registerItem("roman_toga",
            new RomanEmperorItem(ModArmorMaterials.ROMAN, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));

    public static final Item HAPPY_PILL = registerItem("happy_pill",
            new Item(new FabricItemSettings().food(ModFoodComponents.HAPPY_PILL).maxCount(BsRolePlay.CONFIG.common.getHappyPillMaxStack()).rarity(Rarity.RARE)));

    public static final Item COWBOY_HAT = registerItem("cowboy_hat",
            new CowboyItem(ModArmorMaterials.COWBOY, ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static final Item PONCHO = registerItem("poncho",
            new CowboyItem(ModArmorMaterials.COWBOY, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));

    public static final Item PROTECTION_HELMET = registerItem("protection_helmet",
            new ProtectionClothingItem(ModArmorMaterials.PROTECTION, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item PROTECTION_CHESTPLATE = registerItem("protection_chestplate",
            new ProtectionClothingItem(ModArmorMaterials.PROTECTION, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item PROTECTION_LEGGINGS = registerItem("protection_leggings",
            new ProtectionClothingItem(ModArmorMaterials.PROTECTION, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item PROTECTION_BOOTS = registerItem("protection_boots",
            new ProtectionClothingItem(ModArmorMaterials.PROTECTION, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item DEALER = registerItem("dealer",
            new DealerItem(ModArmorMaterials.MASK, ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static final Item SAD_PILL = registerItem("sad_pill",
            new SadPill(new FabricItemSettings().maxCount(BsRolePlay.CONFIG.common.getSadPillMaxStack()).rarity(Rarity.RARE)));

    public static final Item GADGET_HAT = registerItem("gadget_hat",
            new GadgetArmor(ModArmorMaterials.MASK, ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static final Item LAWYER_BLACKBLUE_CHESTPLATE = registerItem("lawyer_blackblue_chestplate",
            new LawyerItem(ModArmorMaterials.MASK, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item LAWYER_BLACKGOLD_CHESTPLATE = registerItem("lawyer_blackgold_chestplate",
            new LawyerItem(ModArmorMaterials.MASK, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item LAWYER_BLACKRED_CHESTPLATE = registerItem("lawyer_blackred_chestplate",
            new LawyerItem(ModArmorMaterials.MASK, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item LAWYER_LEGGINGS_BLACK = registerItem("lawyer_leggings_black",
            new LawyerItem(ModArmorMaterials.MASK, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item LAWYER_BOOTS_BLACK = registerItem("lawyer_boots_black",
            new LawyerItem(ModArmorMaterials.MASK, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item LAWYER_PURPLERED_CHESTPLATE = registerItem("lawyer_purplered_chestplate",
            new LawyerItem(ModArmorMaterials.MASK, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item LAWYER_LEGGINGS_PURPLE = registerItem("lawyer_leggings_purple",
            new LawyerItem(ModArmorMaterials.MASK, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item LAWYER_BOOTS_PURPLE = registerItem("lawyer_boots_purple",
            new LawyerItem(ModArmorMaterials.MASK, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item BRIEFCASE = registerItem("briefcase",
            new BriefCase(new FabricItemSettings().maxCount(1)));
    public static final Item BLACK_BRIEFCASE = registerItem("black_briefcase",
            new BriefCase(new FabricItemSettings().maxCount(1)));
    public static final Item VIOLET_BRIEFCASE = registerItem("purple_briefcase",
            new BriefCase(new FabricItemSettings().maxCount(1)));

    public static final Item TINY_BANDUTY_ITEM = registerItem("tiny_banduty",
            new TinyBandutyItem(ModBlock.TINY_BANDUTY, new FabricItemSettings().rarity(Rarity.EPIC).maxCount(1)));

    public static final Item HANDCUFFS = registerItem("handcuffs",
            new HandCuffs(new FabricItemSettings().maxCount(1).rarity(Rarity.UNCOMMON)));
    public static final Item HANDCUFFS_KEY = registerItem("handcuffs_key",
            new HandcuffsKey(new FabricItemSettings().maxCount(1).rarity(Rarity.UNCOMMON)));
    public static final Item ANTI_GOD_HANDCUFFS = registerItem("anti_god_handcuffs",
            new AntiGodHandcuffs(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));

    public static final Item FEDORA = registerItem("fedora",
            new ElegantItem(ModArmorMaterials.COWBOY, ArmorItem.Type.HELMET, new FabricItemSettings().maxCount(1)));

    public static final Item BRONZE_COIN = registerItem("bronze_coin",
            new RPCoinItem(ModBlock.BRONZE_COIN, new FabricItemSettings()));

    public static final Item GOLD_COIN = registerItem("gold_coin",
            new RPCoinItem(ModBlock.GOLD_COIN, new FabricItemSettings().rarity(Rarity.UNCOMMON)));

    public static final Item NETHERITE_COIN = registerItem("netherite_coin",
            new RPCoinItem(ModBlock.NETHERITE_COIN, new FabricItemSettings().rarity(Rarity.EPIC)));

    public static final Item BRONZE_COIN_STACK = registerItem("bronze_coin_stack",
            new CoinStackItem(ModBlock.BRONZE_COIN_STACK, new FabricItemSettings()));

    public static final Item GOLD_COIN_STACK = registerItem("gold_coin_stack",
            new CoinStackItem(ModBlock.GOLD_COIN_STACK, new FabricItemSettings().rarity(Rarity.UNCOMMON)));

    public static final Item NETHERITE_COIN_STACK = registerItem("netherite_coin_stack",
            new CoinStackItem(ModBlock.NETHERITE_COIN_STACK, new FabricItemSettings().rarity(Rarity.EPIC)));


    private static void addItemsToItemGroup() {
        addToItemGroup(ModItemGroups.BSROLEPLAY_ITEM_GROUP, ROLEPLAY_CORE);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ITEM_GROUP, FUSION_CORE);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ITEM_GROUP, BRIEFCASE);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ITEM_GROUP, BLACK_BRIEFCASE);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ITEM_GROUP, VIOLET_BRIEFCASE);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ITEM_GROUP, JUDGE_HAMMER);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ITEM_GROUP, POLICE_BATON);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ITEM_GROUP, HANDCUFFS_KEY);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ITEM_GROUP, HANDCUFFS);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ITEM_GROUP, ANTI_GOD_HANDCUFFS);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ITEM_GROUP, HOOK);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ITEM_GROUP, PHARAOH_STAFF);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ITEM_GROUP, HAPPY_PILL);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ITEM_GROUP, SAD_PILL);

        addToItemGroup(ModItemGroups.BSROLEPLAY_BLOCK_GROUP, TINY_BANDUTY_ITEM);
        addToItemGroup(ModItemGroups.BSROLEPLAY_BLOCK_GROUP, BRONZE_COIN);
        addToItemGroup(ModItemGroups.BSROLEPLAY_BLOCK_GROUP, BRONZE_COIN_STACK);
        addToItemGroup(ModItemGroups.BSROLEPLAY_BLOCK_GROUP, GOLD_COIN);
        addToItemGroup(ModItemGroups.BSROLEPLAY_BLOCK_GROUP, GOLD_COIN_STACK);
        addToItemGroup(ModItemGroups.BSROLEPLAY_BLOCK_GROUP, NETHERITE_COIN);
        addToItemGroup(ModItemGroups.BSROLEPLAY_BLOCK_GROUP, NETHERITE_COIN_STACK);

        addToItemGroup(ModItemGroups.BSROLEPLAY_ARMOR_GROUP, POLICE_HELMET);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ARMOR_GROUP, POLICE_CHESTPLATE);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ARMOR_GROUP, POLICE_LEGGINGS);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ARMOR_GROUP, POLICE_BOOTS);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ARMOR_GROUP, LAWYER_BLACKBLUE_CHESTPLATE);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ARMOR_GROUP, LAWYER_BLACKGOLD_CHESTPLATE);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ARMOR_GROUP, LAWYER_BLACKRED_CHESTPLATE);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ARMOR_GROUP, LAWYER_LEGGINGS_BLACK);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ARMOR_GROUP, LAWYER_BOOTS_BLACK);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ARMOR_GROUP, LAWYER_PURPLERED_CHESTPLATE);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ARMOR_GROUP, LAWYER_LEGGINGS_PURPLE);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ARMOR_GROUP, LAWYER_BOOTS_PURPLE);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ARMOR_GROUP, FEDORA);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ARMOR_GROUP, RED_PIRATE_HELMET);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ARMOR_GROUP, RED_PIRATE_CHESTPLATE);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ARMOR_GROUP, RED_PIRATE_LEGGINGS);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ARMOR_GROUP, BLUE_PIRATE_HELMET);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ARMOR_GROUP, BLUE_PIRATE_CHESTPLATE);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ARMOR_GROUP, BLUE_PIRATE_LEGGINGS);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ARMOR_GROUP, COWBOY_HAT);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ARMOR_GROUP, PONCHO);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ARMOR_GROUP, PROTECTION_HELMET);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ARMOR_GROUP, PROTECTION_CHESTPLATE);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ARMOR_GROUP, PROTECTION_LEGGINGS);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ARMOR_GROUP, PROTECTION_BOOTS);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ARMOR_GROUP, GADGET_HAT);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ARMOR_GROUP, DREAM_MASK);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ARMOR_GROUP, BUNNY_MASK);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ARMOR_GROUP, DEALER);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ARMOR_GROUP, NEANDERTHAL_CHESTPLATE);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ARMOR_GROUP, FUNERAL_MASK);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ARMOR_GROUP, CROWN);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ARMOR_GROUP, MINI_CROWN);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ARMOR_GROUP, CIVIC_CROWN);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ARMOR_GROUP, ROMAN_TOGA);
        addToItemGroup(ModItemGroups.BSROLEPLAY_ARMOR_GROUP, HALO);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BsRolePlay.MOD_ID, name), item);
    }
    public static void registerModItems() {
        BsRolePlay.LOGGER.info("Registering Mod Items for " + BsRolePlay.MOD_ID);

        addItemsToItemGroup();
    }
}