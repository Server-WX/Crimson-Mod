package com.crimson.items.tools;

import com.crimson.Main;
import com.crimson.init.Moditems;
import com.crimson.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ToolSpade extends ItemSpade implements IHasModel 
{
	public ToolSpade(String name, CreativeTabs tab, ToolMaterial material) {
		// 铲子物品栏
		super(material);
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
