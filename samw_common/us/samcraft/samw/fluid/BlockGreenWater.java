package us.samcraft.samw.fluid;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import us.samcraft.samw.lib.names.SAMWFNames;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
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
public class BlockGreenWater extends BlockFluidClassic {

	public BlockGreenWater(int id) {
		super(id, SAMWFluid.GreenWater, Material.water);
		this.setUnlocalizedName(SAMWFNames.Green);
	}
	@Override
    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
		
		int meta = world.getBlockMetadata(x, y, z);
		
		if(!world.isRemote){
			if(entity instanceof EntityLivingBase) {
				if(((EntityLivingBase)entity).isCollided)
					((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.hunger.id, 500, 4));
					
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
		return 0x00FF00;
	}
}