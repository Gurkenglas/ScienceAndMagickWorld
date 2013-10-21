package us.samcraft.samw.item;

import us.samcraft.samw.SAMWMain;
import us.samcraft.samw.lib.SAMWINames;
import us.samcraft.samw.lib.textures.ModItemIcons;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

/**
 * @author Anthony Anderson(LordIlloyhs)
 *
 */
public class ItemRuneIngot extends Item {

	public ItemRuneIngot(int id) {
		super(id);
		this.setCreativeTab(SAMWMain.tabsamw);
		this.setUnlocalizedName(SAMWINames.RuneIngot);
	}
	@Override
	public void registerIcons(IconRegister reg) {
		this.itemIcon = reg.registerIcon(ModItemIcons.RuneIngot);
	}

}
