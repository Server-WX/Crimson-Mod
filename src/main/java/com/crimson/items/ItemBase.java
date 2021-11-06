package com.crimson.items;

import com.crimson.Main;
import com.crimson.init.Moditems;
import com.crimson.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

	public ItemBase(String name, CreativeTabs tab) {
		// 定义物品栏
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		
		Moditems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}
