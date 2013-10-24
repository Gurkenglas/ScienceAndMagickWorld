package us.samcraft.samw.block.clear;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import us.samcraft.samw.SAMWMain;
import us.samcraft.samw.lib.SAMWBNames;
import us.samcraft.samw.lib.textures.ModBlockIcons;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

/**
 * @author Anthony Anderson(LordIlloyhs)
 *
 */
public class BlockdecClearRock extends Block{

	public BlockdecClearRock(int id) {
		super(id, Material.rock);
		this.setCreativeTab(SAMWMain.tabsamw);
		this.setUnlocalizedName(SAMWBNames.decClearRock);
		this.setHardness(3F);
	}
	@Override
	public boolean isOpaqueCube(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister reg) {
		this.blockIcon = reg.registerIcon(ModBlockIcons.decClearRock);
	}

}