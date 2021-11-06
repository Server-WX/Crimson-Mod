package com.crimson.init;

import java.util.ArrayList;
import java.util.List;

import com.crimson.Main;
import com.crimson.items.ItemBase;
import com.crimson.items.armor.ArmorBase;
import com.crimson.items.food.EffectFoodBase;
import com.crimson.items.tools.ToolAxe;
import com.crimson.items.tools.ToolHoe;
import com.crimson.items.tools.ToolPickaxe;
import com.crimson.items.tools.ToolSpade;
import com.crimson.items.tools.ToolSword;
import com.crimson.util.Reference;

import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class Moditems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	// 工具合成材料																	        	材料名称	 挖掘等级     耐久度     挖掘速度	        伤害	                   附魔概率
	public static final ToolMaterial MATERIAL_CRIMSON = EnumHelper.addToolMaterial("material_crimson", 4, 8000, 40.0f, 114514191976.0f, 0);
	public static final ArmorMaterial ARMOR_MATERIAL_CRIMSON = EnumHelper.addArmorMaterial("armor_material_crimson", Reference.MOD_ID + ":crimson", 40, new int[] {3, 6, 8, 3}, 0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f);
	
	// 定义新物品  Main后面定义物品栏分类
	// 工具，武器
	public static final ItemSword CRIMSON_SWORD = new ToolSword("crimson_sword", Main.ITEM_TAB, MATERIAL_CRIMSON); // 殷红剑
	public static final ItemPickaxe CRIMSON_PICKAXE = new ToolPickaxe("crimson_pickaxe", Main.ITEM_TAB, MATERIAL_CRIMSON); // 殷红稿
	public static final ItemAxe CRIMSON_AXE = new ToolAxe("crimson_axe", Main.ITEM_TAB, MATERIAL_CRIMSON); // 殷红斧
	public static final ItemSpade CRIMSON_SPADE = new ToolSpade("crimson_spade", Main.ITEM_TAB, MATERIAL_CRIMSON); // 殷红铲
	public static final ItemHoe CRIMSON_HOE = new ToolHoe("crimson_hoe", Main.ITEM_TAB, MATERIAL_CRIMSON); // 殷红锄
	
	// 物品
	public static final Item CRIMSON_INGOT = new ItemBase("crimson_ingot", Main.ITEM_TAB);
	
	// 定义新的食物													食物名字            恢复饱食度    维持时间      能不能给狼吃
//	public static final ItemFood CRIMSON_FOOD = new FoodBase("crimson_food", 20, 10f, false, Main.ITEM_TAB);  普通食物				效果名			时间    效果等级                 
	public static final ItemFood CRIMSON_FOOD = new EffectFoodBase("crimson_food", 0, 0f, false, Main.ITEM_TAB, new PotionEffect(MobEffects.POISON, 60*20, 3, false, true));
	
	// 防具
	public static final Item CRIMSON_HELMET = new ArmorBase("crimson_helmet", ARMOR_MATERIAL_CRIMSON,  1, EntityEquipmentSlot.HEAD, Main.ITEM_TAB );
	public static final Item CRIMSON_CHESTPLATE = new ArmorBase("crimson_chestplate", ARMOR_MATERIAL_CRIMSON, 1, EntityEquipmentSlot.CHEST, Main.ITEM_TAB);
	public static final Item CRIMSON_LEGGINGS = new ArmorBase("crimson_leggings", ARMOR_MATERIAL_CRIMSON, 2, EntityEquipmentSlot.LEGS, Main.ITEM_TAB);
	public static final Item CRIMSON_BOOTS = new ArmorBase("crimson_boots", ARMOR_MATERIAL_CRIMSON, 1, EntityEquipmentSlot.FEET, Main.ITEM_TAB);
	
}
