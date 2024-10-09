package absolutelyaya.formidulus.item;

import absolutelyaya.formidulus.Formidulus;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

public class ExpandableLoreItem extends Item
{
	public ExpandableLoreItem(Settings settings)
	{
		super(settings);
	}
	
	/**
	 * This is really hacky; check ClientLoreItemMixin.<br>
	 * Basically, due to split sources, I can't detect Inputs here. So, I mix that part into my own code on the client instead
	 */
	public boolean shouldDisplayLore()
	{
		return false;
	}
	
	@Override
	public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type)
	{
		if(shouldDisplayLore())
			for (int i = 0; i < 6; i++)
				tooltip.addAll(Text.translatable(getTranslationKey() + ".lore" + i).getWithStyle(Style.EMPTY.withColor(Formatting.DARK_PURPLE).withItalic(true)));
		else
			tooltip.add(Text.translatable("item." + Formidulus.MOD_ID + ".expandable_lore_hint").getWithStyle(Style.EMPTY.withColor(Formatting.GRAY)).getFirst());
	}
}
