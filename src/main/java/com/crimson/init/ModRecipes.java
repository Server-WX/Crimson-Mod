package com.crimson.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	//public static final ItemStack LAPIS_LAZULI = new ItemStack(Items.DYE, 1, 4); // 设定数值类型的物品
	//public static final ItemStack ROSE_RED = new ItemStack(Items.DYE, 1, 1);
	
	public static void init() {
							     // 输入物品							物品输出						输出物品数量
		//GameRegistry.addSmelting(ModBlocks.CRYING_OBSIDIAN_BLOCK, new ItemStack(Blocks.OBSIDIAN, 1), 0.7f); // 烧制后产生经验的概率
		//GameRegistry.addSmelting(LAPIS_LAZULI, ROSE_RED, 0.3f);
		GameRegistry.addSmelting(ModBlocks.CRIMSON_ORE, new ItemStack(Moditems.CRIMSON_INGOT, 1), 0.7f); // 烧制后产生经验的概率
		
	}

}

/*
 * 
 * 原版方块：Blocks.方块名称
 * 原版物品：items.物品名称
 * mod方块：ModBlocks.方块名
 * mod物品：ModItems.物品名
 * 
 * */
