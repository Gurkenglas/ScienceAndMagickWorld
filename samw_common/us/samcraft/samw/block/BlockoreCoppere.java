package us.samcraft.samw.block;

import us.samcraft.samw.SAMWMain;
import us.samcraft.samw.lib.BNames;
import us.samcraft.samw.lib.textures.ModBlockIcons;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockoreCoppere extends Block {

	public BlockoreCoppere(int id) {
		super(id, Material.rock);
		this.setCreativeTab(SAMWMain.tabsamw);
		this.setUnlocalizedName(BNames.oreCopper);
		this.setHardness(3F);
	}
	@Override
	public void registerIcons(IconRegister reg) {
		this.blockIcon = reg.registerIcon(ModBlockIcons.oreCopper);
	}

}
