package us.samcraft.samw.fluid;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 * @author Anthony Anderson(LordIllyohs)
 * 
 */
public class HeavyWater extends FluidSAMW {
	public HeavyWater() {
		super("Heavy Water");
	}

	protected void onPlayerCollision(World world, int x, int y, int z,
			EntityLivingBase entity, int meta) {
		entity.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 500, 3));
		entity.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 500, 3));
	}

	@Override
	public int colorMultiplier(IBlockAccess iblockaccess, int x, int y, int z) {
		return 0x757575;
	}

	public void setFluidProperties() {
		setDensity(100);
		setViscosity(10);
		setTemperature(300);
		setLuminosity(5);
	}

	@Override
	public String getSAMWName() {
		return "Heavy Water";
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
