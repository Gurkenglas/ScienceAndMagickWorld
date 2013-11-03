package us.samcraft.samw.fluid;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import us.samcraft.samw.lib.names.SAMWFNames;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;

/**
 * @author Anthony Anderson(LordIllyohs)
 * 
 */
public class BlockYellowWater extends BlockFluidClassic {

	public BlockYellowWater(int id) {
		super(id, SAMWFluid.YellowWater, Material.water);
		this.setUnlocalizedName(SAMWFNames.Yellow);
	}

	protected void onPlayerCollidedWithBlock(World world, int x, int y, int z,
			EntityLivingBase entity, int meta) {
		world.spawnEntityInWorld(new EntityLightningBolt(world, x, y, z));
		entity.setHealth(2);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta) {
		return Block.waterMoving.getIcon(side, meta);
	}

	@Override
	public int colorMultiplier(IBlockAccess iblockaccess, int x, int y, int z) {
		return 0xFFFF00;
	}

}
