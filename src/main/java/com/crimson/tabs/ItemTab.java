package com.crimson.tabs;

import com.crimson.init.Moditems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ItemTab extends CreativeTabs{

	public ItemTab() {
		// 物品栏设定
		super("item_tab");
		
	}

	@Override
	public ItemStack getTabIconItem() {
		
		return new ItemStack(Moditems.CRIMSON_SWORD);// 物品栏图标
		
	}
	
}
