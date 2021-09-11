package lekavar.lma.drinkbeer.item;

import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BeerMugSweetBerryKriekItem extends BeerMugBlockItem {
    public BeerMugSweetBerryKriekItem(Block block, Settings settings) {
        super(block,settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add( new TranslatableText("item.drinkbeer.beer_mug_sweet_berry_kriek.tooltip").formatted(Formatting.BLUE) );
    }
}
