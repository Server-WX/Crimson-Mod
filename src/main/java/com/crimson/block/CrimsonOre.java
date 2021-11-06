package com.crimson.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CrimsonOre extends BlockBase
{
    public CrimsonOre(String name, Material material, CreativeTabs tab)
    {
        super(name, material, tab);

        setSoundType(SoundType.STONE); // 放置/破坏时的声音
        setHardness(25.0f); // 方块硬度
        setResistance(5000); // 爆炸抗性
        setHarvestLevel("pickaxe", 3); // 能够被破坏的方式与挖掘等级
        //setLightLevel(3.0f); 方块亮度
        //setBlockUnbreakable(); 不可破坏
    }

    
    // 破坏后生成指定掉落物
/*    @Override
    public Item getItemDropped(IBlockState state, Random random, int fortune)
    {
        return Moditems.CRIMSON_INGOT; // 掉落物
    }

    @Override
    public  int quantityDropped(Random rand) // 随机凋落物
    {
        int min = 1;
        int max = 4;
        return rand.nextInt(max)+min;
    }
*/  
}
