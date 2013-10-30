package us.samcraft.samw.creativetab;

import us.samcraft.samw.block.SAMWBlock;
import us.samcraft.samw.item.SAMWItem;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

/**
 * @author Anthony
 *
 */
public class CreativeTabItem extends CreativeTabs {

	public CreativeTabItem(String label) {
		super(label);
	}
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex(){
		return SAMWItem.OrichalcumIngot.itemID;
	}

}
