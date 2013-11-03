package us.samcraft.samw.fluid;

import us.samcraft.samw.lib.names.SAMWFNames;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;

/**
 * @author Anthony Anderson(LordIllyohs)
 *
 */
public class BlockHeavyWater extends BlockFluidClassic {

	public BlockHeavyWater(int id) {
		super(id, SAMWFluid.HeavyWater, Material.water);
		this.setUnlocalizedName(SAMWFNames.Heavy);
		
	}
	protected void onPlayerCollidedWithBlock(World world, int x,
			int y, int z, EntityLivingBase entity, int meta) {
		entity.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 500, 3));
		entity.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 500, 3));
	}
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta) {
		return Block.waterMoving.getIcon(side, meta);
	}
	@Override
	public int colorMultiplier(IBlockAccess iblockaccess, int x, int y, int z){
		return 0x757575;
	}

}
