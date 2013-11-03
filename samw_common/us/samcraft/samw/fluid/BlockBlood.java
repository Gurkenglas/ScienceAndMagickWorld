package us.samcraft.samw.fluid;

import us.samcraft.samw.lib.textures.ModBlockIcons;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;

/**
 * @author Anthony Anderson(LordIllyohs)
 *
 */
public class BlockBlood extends BlockFluidClassic {
	
	public BlockBlood(int id) {
        super(id, SAMWFluid.Blood, Material.water);
        this.setUnlocalizedName("Blood");
	}
	@Override
    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
		
		int meta = world.getBlockMetadata(x, y, z);
		
		if(!world.isRemote){
			if(entity instanceof EntityLivingBase){
				if(((EntityLivingBase)entity).isCollided)
					((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.confusion.id, 500, 3));
					((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.blindness.id, 500));
					((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.hunger.id, 500));
//					((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.harm.id, 10));
					
					
			}
		}
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
