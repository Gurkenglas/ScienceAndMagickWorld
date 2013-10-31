package us.samcraft.samw.block.ore;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import us.samcraft.samw.SAMWMain;
import us.samcraft.samw.lib.names.SAMWBNames;
import us.samcraft.samw.lib.textures.ModBlockIcons;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

/**
 * @author Anthony Anderson(LordIllyohs)
 *
 */
public class BlockoreLead extends Block{

	public BlockoreLead(int id) {
		super(id, Material.rock);
		this.setCreativeTab(SAMWMain.tabsamw);
		this.setUnlocalizedName(SAMWBNames.oreLead);
		this.setHardness(3F);
	}
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister reg) {
		this.blockIcon = reg.registerIcon(ModBlockIcons.oreLead);
	}

}
