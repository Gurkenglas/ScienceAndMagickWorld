package us.samcraft.samw.fluid;

import us.samcraft.samw.lib.names.SAMWFNames;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

/**
 * @author Anthony Anderson(LordIllyohs)
 *
 */
public class FluidGreenWater extends Fluid {

	public FluidGreenWater() {
		super(SAMWFNames.Green);
		this.setViscosity(2000);
        this.setTemperature(400);
        this.setDensity(10);
        FluidRegistry.registerFluid(this);
	}

}
