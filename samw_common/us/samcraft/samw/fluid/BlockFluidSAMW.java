package us.samcraft.samw.fluid;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;

public class BlockFluidSAMW extends BlockFluidClassic {
	FluidSAMW fluid;

	public BlockFluidSAMW(FluidSAMW fluid) {
		super(fluid.getFluidBlockID(), fluid, Material.water);
		this.fluid=fluid;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta) {
		return Block.waterMoving.getIcon(side, meta);
	}

	@Override
	public int colorMultiplier(IBlockAccess iblockaccess, int x, int y, int z) {
		return fluid.colorMultiplier(iblockaccess, x, y, z);
	}

	@Override
	public void onEntityCollidedWithBlock(World world, int x, int y, int z,
			Entity entity) {

		int meta = world.getBlockMetadata(x, y, z);

		if (!world.isRemote)
			if (entity.isCollided)
				if (entity instanceof EntityLivingBase)
					fluid.onPlayerCollision(world, x, y, z,
							(EntityLivingBase) entity, meta);
	}
}
