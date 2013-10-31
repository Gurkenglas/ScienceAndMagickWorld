package us.samcraft.samw.item.ingot;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import us.samcraft.samw.SAMWMain;
import us.samcraft.samw.lib.names.SAMWINames;
import us.samcraft.samw.lib.textures.ModItemIcons;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * @author Anthony Anderson(LordIlloyhs)
 *
 */
public class ItemManaIngot extends Item {

	public ItemManaIngot(int id) {
		super(id);
		this.setCreativeTab(SAMWMain.tabsamwi);
		this.setUnlocalizedName(SAMWINames.ManaIngot);
	}
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister reg) {
		this.itemIcon = reg.registerIcon(ModItemIcons.ManaIngot);
	}

}
