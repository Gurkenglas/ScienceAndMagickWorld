package us.samcraft.samw.block;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import us.samcraft.samw.SAMWMain;
import us.samcraft.samw.lib.BNames;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class BlockLeaves extends Block{
	
	@SideOnly(Side.CLIENT)
	private Icon[] icons;
	
	public BlockLeaves(int id) {
		super(id, Material.leaves);
		this.setCreativeTab(SAMWMain.tabsamw);
				
	}
	
	public int damageDropped(int dmg){
		return dmg;
	}
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int id, CreativeTabs tab, List list){
		for(int i = 0; i < BNames.LEAVES_META_NAMES.length; i++){
			ItemStack stack = new ItemStack(id, 1, i);
			list.add(stack);
		}
	}
	
	

}
