package com.crimson;

import com.crimson.init.ModRecipes;
// 导包
import com.crimson.proxy.CommonProxy;
//import com.crimson.tabs.BlockTab;
import com.crimson.tabs.ItemTab;
import com.crimson.util.Reference;
import com.crimson.util.handlers.RegistryHandler;

import com.crimson.world.ModWorldGen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	// 主方法 mod启动类
	@Instance
	public static Main insance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		RegistryHandler.preInitRegistries();
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		
		ModRecipes.init();
		
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {
		
	}
	
	//public static CreativeTabs BLOCK_TAB = new BlockTab(); // 方块物品栏
	public static CreativeTabs ITEM_TAB = new ItemTab(); // 物品栏
	
}
