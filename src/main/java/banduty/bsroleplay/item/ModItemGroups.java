package banduty.bsroleplay.item;

import banduty.bsroleplay.BsRolePlay;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static ItemGroup BSROLEPLAY_ITEM_GROUP;
    public static ItemGroup BSROLEPLAY_ARMOR_GROUP;
    public static ItemGroup BSROLEPLAY_BLOCK_GROUP;

    public static void registerItemGroups() {
        BSROLEPLAY_ITEM_GROUP = FabricItemGroup.builder(new Identifier(BsRolePlay.MOD_ID, "roleplay_item"))
                .displayName(Text.literal("BsRoleplay Item"))
                .icon(() -> new ItemStack(ModItems.ROLEPLAY_CORE)).build();

        BSROLEPLAY_BLOCK_GROUP = FabricItemGroup.builder(new Identifier(BsRolePlay.MOD_ID, "roleplay_block"))
                .displayName(Text.literal("BsRoleplay Block"))
                .icon(() -> new ItemStack(ModItems.HOLY_CLOUD_STATUE_ITEM)).build();

        BSROLEPLAY_ARMOR_GROUP = FabricItemGroup.builder(new Identifier(BsRolePlay.MOD_ID, "roleplay_armor"))
                .displayName(Text.literal("BsRoleplay Armor"))
                .icon(() -> new ItemStack(ModItems.CIVIC_CROWN)).build();
    }
}