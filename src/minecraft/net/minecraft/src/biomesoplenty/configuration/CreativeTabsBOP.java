package net.minecraft.src.biomesoplenty.configuration;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;

public class CreativeTabsBOP extends CreativeTabs
{
	public CreativeTabsBOP(int position, String tabID)
	{
		super(position, tabID);
	}

	@Override
	public ItemStack getIconItemStack()
	{
		return new ItemStack(Item.seeds);
	}
}
