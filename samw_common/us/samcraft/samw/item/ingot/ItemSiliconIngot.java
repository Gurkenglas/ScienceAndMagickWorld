package us.samcraft.samw.item.ingot;

import us.samcraft.samw.SAMWMain;
import us.samcraft.samw.lib.names.SAMWINames;
import us.samcraft.samw.lib.textures.ModItemIcons;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

/**
 * @author Anthony Anderson(LordIlloyhs)
 *
 */
public class ItemSiliconIngot extends Item {

	public ItemSiliconIngot(int id) {
		super(id);
		this.setCreativeTab(SAMWMain.tabsamwi);
		this.setUnlocalizedName(SAMWINames.SiliconIngot);
	}
	@Override
	public void registerIcons(IconRegister reg) {
		this.itemIcon = reg.registerIcon(ModItemIcons.SiliconIngot);
	}

}