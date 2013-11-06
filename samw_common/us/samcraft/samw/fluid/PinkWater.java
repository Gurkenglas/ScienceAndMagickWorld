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
public class PinkWater extends FluidSAMW {
	public PinkWater() {
		super("PinkWater");
	}
	protected void onPlayerCollision(World world, int x,
			int y, int z, EntityLivingBase entity, int meta) {
		entity.addPotionEffect(new PotionEffect(Potion.regeneration.id, 10));
	}
	
	@Override
	public int colorMultiplier(IBlockAccess iblockaccess, int x, int y, int z){
		return 0xFF00FF;
	}
	
	public void setFluidProperties() {
		setDensity(300);
		setViscosity(100);
		setTemperature(400);
		setLuminosity(15);
	}

	public String getSAMWName() {
		return "PinkWater";
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
