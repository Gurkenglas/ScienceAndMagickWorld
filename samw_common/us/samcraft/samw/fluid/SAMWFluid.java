package us.samcraft.samw.fluid;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import us.samcraft.samw.lib.id.SAMWFluidID;
import us.samcraft.samw.lib.names.SAMWFNames;
import net.minecraft.block.Block;
import net.minecraftforge.fluids.Fluid;

/**
 * @author Anthony Anderson(LordIllyohs)
 *
 */
public class SAMWFluid {
	
	 public static Block BloodBlock;
     
     public static Fluid Blood;

     public static void init() {
             
             Blood = new FluidBlood();
             BloodBlock = new BlockBlood(SAMWFluidID.BLOOD);
             
             GameReg();
             LangReg();
     }

     private static void GameReg() {
             GameRegistry.registerBlock(BloodBlock, SAMWFNames.Blood);
             
     }

     private static void LangReg() {
             LanguageRegistry.addName(BloodBlock, SAMWFNames.Blood);
             
     }

}
