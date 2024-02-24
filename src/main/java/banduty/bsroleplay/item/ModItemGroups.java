package banduty.bsroleplay.item;

import banduty.bsroleplay.BsRolePlay;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static ItemGroup BSROLEPLAY_GROUP;

    public static void registerItemGroups() {
        BSROLEPLAY_GROUP = FabricItemGroup.builder(new Identifier(BsRolePlay.MOD_ID, "roleplay_core"))
                .displayName(Text.translatable("itemgroup.bsroleplay"))
                .icon(() -> new ItemStack(ModItems.CROWN)).build();
    }
}
