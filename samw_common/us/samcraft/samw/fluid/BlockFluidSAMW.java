package us.samcraft.samw.fluid;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public abstract class BlockFluidSAMW extends BlockFluidClassic {

	public BlockFluidSAMW(int id, Fluid fluid, Material material) {
		super(id, fluid, material);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onEntityCollidedWithBlock(World world, int x, int y, int z,
			Entity entity) {

		int meta = world.getBlockMetadata(x, y, z);

		if (!world.isRemote)
			if (entity instanceof EntityLivingBase) {
				if (((EntityLivingBase) entity).isCollided)
					onPlayerCollidedWithBlock(world, x, y, z,
							((EntityLivingBase) entity), meta);
			}

	}

	protected abstract void onPlayerCollidedWithBlock(World world, int x,
			int y, int z, EntityLivingBase entity, int meta);
}
