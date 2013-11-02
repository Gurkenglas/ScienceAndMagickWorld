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
	 public static Block BlockHeavyWater;
     
     public static Fluid Blood;
     public static Fluid HeavyWater;

     public static void init() {
             
             Blood = new FluidBlood();
             HeavyWater = new FluidHeavyWater();
             
             BloodBlock = new BlockBlood(SAMWFluidID.BLOOD);
             BlockHeavyWater = new BockHeavyWater(SAMWFluidID.HEAVY_DEFAULT);
             
             GameReg();
             LangReg();
     }

     private static void GameReg() {
             GameRegistry.registerBlock(BloodBlock, SAMWFNames.Blood);
             GameRegistry.registerBlock(BlockHeavyWater, SAMWFNames.HeavyWater);
             
     }

     private static void LangReg() {
             LanguageRegistry.addName(BloodBlock, SAMWFNames.Blood);
             LanguageRegistry.addName(BlockHeavyWater, SAMWFNames.HeavyWater);
             
     }

}
