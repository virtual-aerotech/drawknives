package virtualaerotech.drawknives.common.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import virtualaerotech.drawknives.DrawKnives;
import virtualaerotech.drawknives.common.items.DrawKnifeItem;

public class ModItems {
    public static final DeferredRegister<Item> MOD_ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DrawKnives.MOD_ID);
    public static final RegistryObject<Item> STONE_DRAW_KNIFE = MOD_ITEMS.register("stone_draw_knife", () -> new DrawKnifeItem(Tiers.STONE, new Item.Properties()));
    public static final RegistryObject<Item> IRON_DRAW_KNIFE = MOD_ITEMS.register("iron_draw_knife", () -> new DrawKnifeItem(Tiers.IRON, new Item.Properties()));
    public static final RegistryObject<Item> GOLD_DRAW_KNIFE = MOD_ITEMS.register("gold_draw_knife", () -> new DrawKnifeItem(Tiers.GOLD, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_DRAW_KNIFE = MOD_ITEMS.register("diamond_draw_knife", () -> new DrawKnifeItem(Tiers.DIAMOND, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_DRAW_KNIFE = MOD_ITEMS.register("netherite_draw_knife", () -> new DrawKnifeItem(Tiers.NETHERITE, new Item.Properties().fireResistant()));
}
