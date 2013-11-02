package us.samcraft.samw.fluid;

import us.samcraft.samw.lib.names.SAMWFNames;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

/**
 * @author Anthony Anderson(LordIllyohs)
 *
 */
public class FluidHeavyWater extends Fluid {

	public FluidHeavyWater() {
		super(SAMWFNames.HeavyWater);
		this.setDensity(100);
		this.setViscosity(10);
		this.setTemperature(300);
		this.setLuminosity(5);
		FluidRegistry.registerFluid(this);
	}

}
