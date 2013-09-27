package us.samcraft.samw.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import us.samcraft.samw.SAMWMain;
import us.samcraft.samw.lib.ITNames;
import us.samcraft.samw.lib.textures.ModItemIcons;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemManaIngot extends Item {

	public ItemManaIngot(int id) {
		super(id);
		this.setCreativeTab(SAMWMain.tabsamw);
		this.setUnlocalizedName(ITNames.ManaIngot);
	}
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister reg) {
		this.itemIcon = reg.registerIcon(ModItemIcons.ManaIngot);
	}

}
