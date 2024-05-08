package virtualaerotech.drawknives.common.items;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ToolAction;

public class ModAxeItem extends DiggerItem {
    public ModAxeItem(Tier pTier, float pAttackDamageModifier, float pAttackSpeedModifier, Item.Properties pProperties) {
        super(pAttackDamageModifier, pAttackSpeedModifier, pTier, BlockTags.MINEABLE_WITH_AXE, pProperties);
    }

    @Override
    public boolean canPerformAction(ItemStack stack, ToolAction toolAction) {
        return ToolActions.DEFAULT_AXE_ACTIONS.contains(toolAction);
    }
}
