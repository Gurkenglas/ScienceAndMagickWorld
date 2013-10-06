package us.samcraft.samw.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import us.samcraft.samw.SAMWMain;
import us.samcraft.samw.lib.BNames;
import us.samcraft.samw.lib.textures.ModBlockIcons;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockoreCopper extends Block {

	public BlockoreCopper(int id) {
		super(id, Material.rock);
		this.setCreativeTab(SAMWMain.tabsamw);
		this.setUnlocalizedName(BNames.oreCopper);
		this.setHardness(3F);
	}
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister reg) {
		this.blockIcon = reg.registerIcon(ModBlockIcons.oreCopper);
	}

}
