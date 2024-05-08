package virtualaerotech.drawknives;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import virtualaerotech.drawknives.common.init.ModItems;
import virtualaerotech.drawknives.common.init.VanillaItems;


@Mod(DrawKnives.MOD_ID)
public class DrawKnives {
    public static final String MOD_ID = "drawknives";
    public DrawKnives() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.MOD_ITEMS.register(modEventBus);
        VanillaItems.VANILLA_ITEMS.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.STONE_DRAW_KNIFE);
            event.accept(ModItems.IRON_DRAW_KNIFE);
            event.accept(ModItems.GOLD_DRAW_KNIFE);
            event.accept(ModItems.DIAMOND_DRAW_KNIFE);
            event.accept(ModItems.NETHERITE_DRAW_KNIFE);
        }
    }
}
