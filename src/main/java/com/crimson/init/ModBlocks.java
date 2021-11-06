package com.crimson.init;

import java.util.ArrayList;
import java.util.List;

import com.crimson.Main;

import com.crimson.block.CrimsonOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCK = new ArrayList<Block>();
	// 定义新方块  Main后面定义物品栏分类
	public static final Block CRIMSON_ORE = new CrimsonOre("crimson_ore", Material.IRON, Main.ITEM_TAB);
}
