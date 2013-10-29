package us.samcraft.samw.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import us.samcraft.samw.SAMWMain;
import us.samcraft.samw.lib.names.SAMWINames;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * @author Anthony Anderson(LordIlloyhs)
 *
 */
public class ItemMold extends Item {

	@SideOnly(Side.CLIENT)
	private Icon[] icons;

	public ItemMold(int id) {
		super(id);
		this.setCreativeTab(SAMWMain.tabsamwi);
		this.setHasSubtypes(true);
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		return SAMWINames.MOLD + itemstack.getItemDamage();
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg) {
		icons = new Icon[SAMWINames.MOLD_ICONS.length];
		for (int i = 0; i < icons.length; i++) {
			icons[i] = reg.registerIcon("samw:mold/" + SAMWINames.MOLD_ICONS[i]);
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIconFromDamage(int dmg) {
		return icons[dmg];
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(int id, CreativeTabs tab, List list) {
		for (int i = 0; i < SAMWINames.MOLD_META_NAME.length; i++) {
			ItemStack stack = new ItemStack(id, 1, i);
			list.add(stack);
		}
	}

}
