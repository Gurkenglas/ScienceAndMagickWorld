package us.samcraft.samw.item.part;

import java.util.List;

import us.samcraft.samw.SAMWMain;
import us.samcraft.samw.lib.names.SAMWINames;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

/**
 * @author Anthony Anderson(LordIlloyhs)
 *
 */
public class ItemPickAxeHead extends Item{
	
	@SideOnly(Side.CLIENT)
	private Icon[] icons;

	public ItemPickAxeHead(int id){
		super(id);
		this.setCreativeTab(SAMWMain.tabsamwi);
		this.setHasSubtypes(true);
	}
	@Override
	public String getUnlocalizedName(ItemStack itemstack){
		return SAMWINames.PAXEHEAD + itemstack.getItemDamage();
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg){
		icons = new Icon[SAMWINames.PAXHEAD_ICONS.length];
		for (int i = 0; i < icons.length; i++){
			icons[i] = reg.registerIcon("samw:parts/pickaxe/" + SAMWINames.PAXHEAD_ICONS[i]);
		}
	}
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIconFromDamage(int dmg){
		return icons[dmg];
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(int id, CreativeTabs tabs, List list){
		for (int i = 0; i < SAMWINames.BLADE_META_NAME.length; i++){
			ItemStack stack = new ItemStack(id, 1, i);
			list.add(stack);
		}
	}

}
