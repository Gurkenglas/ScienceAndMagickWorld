package us.samcraft.samw.item;

import java.util.List;

import us.samcraft.samw.SAMWMain;
import us.samcraft.samw.lib.INames;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class ItemShovelHead extends Item{
	
	@SideOnly(Side.CLIENT)
	private Icon[] icons;
	
	public ItemShovelHead(int id) {		
		super(id);
		this.setCreativeTab(SAMWMain.tabsamw);
		this.setHasSubtypes(true);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg){
		icons = new Icon[INames.SHOVEL_ICONS.length];
		for (int i = 0; i < icons.length; i++){
			icons[i] = reg.registerIcon("samw:" + INames.MOLD_ICONS[i]);
		}
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(int id, CreativeTabs tab, List list){
		for (int i = 0; i < INames.SHOVHEAD_META_NAME.length; i++){
			ItemStack stack = new ItemStack(id, 1, i);
			list.add(stack);
		}
	}

}
