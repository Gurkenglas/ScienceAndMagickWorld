package us.samcraft.samw.fluid;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 * @author Anthony Anderson(LordIllyohs)
 * 
 */
public class YellowWater extends FluidSAMW {
	public YellowWater() {
		super("Charged Water");
	}

	protected void onPlayerCollision(World world, int x, int y, int z,
			EntityLivingBase entity, int meta) {
		world.spawnEntityInWorld(new EntityLightningBolt(world, x, y, z));
		entity.setHealth(2);
	}

	@Override
	public int colorMultiplier(IBlockAccess iblockaccess, int x, int y, int z) {
		return 0xFFFF00;
	}

	public void setFluidProperties() {
		setDensity(300);
		setViscosity(100);
		setTemperature(400);
		setLuminosity(15);
	}

	// Copypaste into each Fluid until 1.7's ID update
	public static int fluidblockid;

	@Override
	public int getFluidBlockID() {
		return fluidblockid;
	}

	public static void setFluidBlockID(int id) {
		fluidblockid = id;
	}
}
