package virtualaerotech.drawknives.common.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import virtualaerotech.drawknives.common.items.ModAxeItem;

public class VanillaItems {
    public static final DeferredRegister<Item> VANILLA_ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, "minecraft");

    public static final RegistryObject<Item> WOODEN_AXE = VANILLA_ITEMS.register("wooden_axe", () -> new ModAxeItem(Tiers.WOOD, 6.0F, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> STONE_AXE = VANILLA_ITEMS.register("stone_axe", () -> new ModAxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> IRON_AXE = VANILLA_ITEMS.register("iron_axe", () -> new ModAxeItem(Tiers.IRON, 6.0F, -3.1F, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_AXE = VANILLA_ITEMS.register("golden_axe", () -> new ModAxeItem(Tiers.GOLD, 6.0F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_AXE = VANILLA_ITEMS.register("diamond_axe", () -> new ModAxeItem(Tiers.DIAMOND, 5.0F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_AXE = VANILLA_ITEMS.register("netherite_axe", () -> new ModAxeItem(Tiers.NETHERITE, 5.0F, -3.0F, new Item.Properties().fireResistant()));
}
