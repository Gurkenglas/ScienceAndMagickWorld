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
public class GreenWater extends FluidSAMW {
	public GreenWater() {
		super("Hungry Water");
	}

	@Override
	public int colorMultiplier(IBlockAccess iblockaccess, int x, int y, int z) {
		return 0x00FF00;
	}

	protected void onPlayerCollision(World world, int x, int y, int z,
			EntityLivingBase entity, int meta) {
		entity.addPotionEffect(new PotionEffect(Potion.hunger.id, 500, 4));
	}

	public void setFluidProperties() {
		setViscosity(2000);
		setTemperature(400);
		setDensity(10);
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