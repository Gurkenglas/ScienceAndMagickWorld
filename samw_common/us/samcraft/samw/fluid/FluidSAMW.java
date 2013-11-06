package us.samcraft.samw.fluid;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public abstract class FluidSAMW extends Fluid {

	public FluidSAMW(String name) {
		super(name);
		setFluidProperties();
        FluidRegistry.registerFluid(this);
        setUnlocalizedName(name);
	}

	protected abstract void onPlayerCollision(World world, int x,
			int y, int z, EntityLivingBase entity, int meta);

	public abstract void setFluidProperties();
	
	public abstract int colorMultiplier(IBlockAccess iblockaccess, int x, int y, int z);

	public abstract String getSAMWName();
	
	public abstract int getFluidBlockID();
	public static void setFluidBlockID(int id) {
		throw new RuntimeException("Something tried to assign a FluidBlockID to FluidSAMW");
	}
}
