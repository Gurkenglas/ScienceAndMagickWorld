package us.samcraft.samw.block.tree;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import us.samcraft.samw.SAMWMain;
import us.samcraft.samw.lib.SAMWBNames;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

/**
 * @author Anthony Anderson(LordIlloyhs)
 *
 */
public class BlockLeaves extends Block{
	
	@SideOnly(Side.CLIENT)
	private Icon[] icons;
	
	public BlockLeaves(int id) {
		super(id, Material.leaves);
		this.setCreativeTab(SAMWMain.tabsamw);
		this.setUnlocalizedName(SAMWBNames.LEAVES);
				
	}
	@Override
	public boolean isOpaqueCube(){
		return true;
		
	}
	public int damageDropped(int dmg){
		return dmg;
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int id, CreativeTabs tab, List list){
		for(int i = 0; i < SAMWBNames.LEAVES_META_NAMES.length; i++){
			ItemStack stack = new ItemStack(id, 1, i);
			list.add(stack);
		}
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg){
		icons = new Icon[SAMWBNames.LEAVES_ICONS.length];
		for (int i = 0; i < icons.length; i++){
			icons[i] = reg.registerIcon("samw:tree/" + SAMWBNames.LEAVES_ICONS[i]);
		}
		
	}

}
