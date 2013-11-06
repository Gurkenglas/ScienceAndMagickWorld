package us.samcraft.samw.fluid;

import java.util.ArrayList;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * @author Anthony Anderson(LordIllyohs)
 * 
 */
public class SAMWFluid {

	public static ArrayList<BlockFluidSAMW> blocks = new ArrayList<BlockFluidSAMW>();

	public static ArrayList<FluidSAMW> fluids = new ArrayList<FluidSAMW>();

	public static void init() {
		blocks.add(new BlockFluidSAMW(new Blood()));
		blocks.add(new BlockFluidSAMW(new HeavyWater()));
		blocks.add(new BlockFluidSAMW(new PinkWater()));
		blocks.add(new BlockFluidSAMW(new YellowWater()));
		blocks.add(new BlockFluidSAMW(new GreenWater()));
		
		for (BlockFluidSAMW block : blocks)
			GameRegistry.registerBlock(block, block.fluid.getSAMWName());
		for (BlockFluidSAMW block : blocks)
			LanguageRegistry.addName(block, block.fluid.getSAMWName());
	}
}