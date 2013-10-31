package us.samcraft.samw.fluid;

import us.samcraft.samw.lib.names.SAMWFNames;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

/**
 * @author Anthony Anderson(LordIllyohs)
 *
 */
public class FluidBlood extends Fluid {
	
	public FluidBlood() {
        super(SAMWFNames.Blood);
        this.setDensity(10);
        this.setViscosity(2000);
        this.setTemperature(310);
        this.setDensity(2000);
        this.setLuminosity(10);
        FluidRegistry.registerFluid(this);
}

}