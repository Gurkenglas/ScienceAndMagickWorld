package us.samcraft.samw.block;

import us.samcraft.samw.SAMWMain;
import us.samcraft.samw.lib.BNames;
import us.samcraft.samw.lib.textures.ModBlockIcons;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockoreTitanium extends Block {

	public BlockoreTitanium(int id) {
		super(id, Material.rock);
		this.setCreativeTab(SAMWMain.tabsamw);
		this.setUnlocalizedName(BNames.oreTitanium);
		this.setHardness(7F);
	}
	@Override
	public void registerIcons(IconRegister reg) {
		this.blockIcon = reg.registerIcon(ModBlockIcons.oreTitanium);
	}

}
