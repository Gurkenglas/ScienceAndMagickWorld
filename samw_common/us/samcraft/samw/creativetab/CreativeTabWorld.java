package us.samcraft.samw.creativetab;

import us.samcraft.samw.block.SAMWBlock;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

/**
 * @author Anthony Anderson(LordIlloyhs)
 *
 */
public class CreativeTabWorld extends CreativeTabs{

	public CreativeTabWorld(String label) {
		super(label);
		
	}
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex(){
		return SAMWBlock.ores.get("Adamantium Ore").blockID;
	}

}
