package us.samcraft.samw.item;

import us.samcraft.samw.SAMWMain;
import us.samcraft.samw.lib.names.SAMWINames;
import us.samcraft.samw.lib.textures.ModItemIcons;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

/**
 * @author Anthony Anderson(LordIlloyhs)
 *
 */
public class ItemOrichalcumIngot extends Item {

	public ItemOrichalcumIngot(int id) {
		super(id);
		this.setCreativeTab(SAMWMain.tabsamwi);
		this.setUnlocalizedName(SAMWINames.OrichalcumIngot);
	}
	@Override
	public void registerIcons(IconRegister reg) {
		this.itemIcon = reg.registerIcon(ModItemIcons.OrichalcumIngot);
	}

}
