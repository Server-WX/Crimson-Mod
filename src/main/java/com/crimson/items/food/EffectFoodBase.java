package com.crimson.items.food;

import com.crimson.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EffectFoodBase extends FoodBase implements IHasModel 
{
	PotionEffect effect;
	public EffectFoodBase(String name, int amount, float saturation, boolean isWolfFood, CreativeTabs tab, PotionEffect effect) 
	{
		super(name, amount, saturation, isWolfFood, tab);
		setAlwaysEdible();  // 任何条件下都能食用
		this.effect = effect;
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
	{
		if (!worldIn.isRemote)
		{
			player.addPotionEffect(new PotionEffect(effect.getPotion(), effect.getDuration(), effect.getAmplifier(), effect.getIsAmbient(), effect.doesShowParticles()));
		}
	}
	
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack stack)
	{
		return true;
	}
	
}
