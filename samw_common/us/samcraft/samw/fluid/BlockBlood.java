package us.samcraft.samw.fluid;

import us.samcraft.samw.lib.names.SAMWFNames;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 * @author Anthony Anderson(LordIllyohs)
 *
 */
public class BlockBlood extends BlockFluidSAMW {
	
	public BlockBlood(int id) {
        super(id, SAMWFluid.Blood, Material.water);
        this.setUnlocalizedName(SAMWFNames.Blood);
	}
	
	protected void onPlayerCollidedWithBlock(World world, int x,
			int y, int z, EntityLivingBase entity, int meta) {
		entity.addPotionEffect(new PotionEffect(Potion.confusion.id, 500, 3));
		entity.addPotionEffect(new PotionEffect(Potion.blindness.id, 600));
		entity.addPotionEffect(new PotionEffect(Potion.hunger.id, 500));
//		entity.addPotionEffect(new PotionEffect(Potion.harm.id, 10));
	}
	
//	@Override
//  @SideOnly(Side.CLIENT)
//	public Icon getStillIcon(){
//		
//  }

	
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta) {
		return Block.waterMoving.getIcon(side, meta);
	}
	
	@Override
	public int colorMultiplier(IBlockAccess iblockaccess, int x, int y, int z){
		return 0xFF0000;
	}

}
