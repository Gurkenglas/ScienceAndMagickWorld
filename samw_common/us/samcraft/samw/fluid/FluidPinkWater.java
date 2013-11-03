package us.samcraft.samw.fluid;

import us.samcraft.samw.lib.names.SAMWFNames;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

/**
 * @author Anthony Anderson(LordIllyohs)
 *
 */
public class FluidPinkWater extends Fluid {

	public FluidPinkWater() {
		super(SAMWFNames.Pink);
		this.setDensity(300);
		this.setViscosity(100);
		this.setTemperature(400);
		this.setLuminosity(15);
		FluidRegistry.registerFluid(this);
	}

}
