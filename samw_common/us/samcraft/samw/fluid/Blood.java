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
public class Blood extends FluidSAMW {
	public Blood() {
        super("Blood");
	}
	
	protected void onPlayerCollision(World world, int x,
			int y, int z, EntityLivingBase entity, int meta) {
		entity.addPotionEffect(new PotionEffect(Potion.confusion.id, 500, 3));
		entity.addPotionEffect(new PotionEffect(Potion.blindness.id, 600));
		entity.addPotionEffect(new PotionEffect(Potion.hunger.id, 500));
//		entity.addPotionEffect(new PotionEffect(Potion.harm.id, 10));
	}
	
	@Override
	public int colorMultiplier(IBlockAccess iblockaccess, int x, int y, int z){
		return 0xFF0000;
	}

	public void setFluidProperties() {
		setViscosity(2000);
		setTemperature(310);
		setDensity(2000);
		setLuminosity(10);
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
