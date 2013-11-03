package us.samcraft.samw.fluid;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import us.samcraft.samw.lib.names.SAMWFNames;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

/**
 * @author Anthony Anderson(LordIllyohs)
 *
 */
public class BlockYellowWater extends BlockFluidClassic {

	public BlockYellowWater(int id) {
		super(id, SAMWFluid.YellowWater, Material.water);
		this.setUnlocalizedName(SAMWFNames.Yellow);
	}
	@Override
    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
		
		int meta = world.getBlockMetadata(x, y, z);
		
		if(!world.isRemote){
			if(entity instanceof EntityLivingBase){
				if(((EntityLivingBase)entity).isCollided)
					world.spawnEntityInWorld(new EntityLightningBolt(world,x,y,z ));
					((EntityLivingBase) entity).setHealth(2);
					
					
			}
		}
	}
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta) {
		return Block.waterMoving.getIcon(side, meta);
	}
	
	@Override
	public int colorMultiplier(IBlockAccess iblockaccess, int x, int y, int z){
		return 0xFFFF00;
	}

}
