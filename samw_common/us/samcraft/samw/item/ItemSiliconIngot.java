package us.samcraft.samw.item;

import us.samcraft.samw.SAMWMain;
import us.samcraft.samw.lib.ITNames;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemSiliconIngot extends Item {

	public ItemSiliconIngot(int id) {
		super(id);
		this.setCreativeTab(SAMWMain.tabsamw);
		this.setUnlocalizedName(ITNames.SiliconIngot);
	}
	@Override
	public void registerIcons(IconRegister reg) {
		this.itemIcon = reg.registerIcon("samw:/ingots/" + "SiliconIngot");
	}

}
