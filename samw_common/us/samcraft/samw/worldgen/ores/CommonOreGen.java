 package us.samcraft.samw.worldgen.ores;

import java.util.Random;
import java.util.logging.Level;

import us.samcraft.samw.block.SAMWBlock;
import us.samcraft.samw.configuration.ConfigurationSettings;
import us.samcraft.samw.core.handler.LogHelper;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

/**
 * @author Anthony Anderson(LordIlloyhs)
 *
 */
public class CommonOreGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId){
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
			break;
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
			break;
		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
			break;
		}
		
	}

	private void generateEnd(World world, Random random, int i, int j) {
		
		
	}

	private void generateSurface(World world, Random random, int chunkX, int chunkZ) {
		
		if(ConfigurationSettings.COPPER_ORE_GEN == true){
			for (int i = 0; i < 16; i++){
				int BlockOreX = chunkX + random.nextInt(16);
				int BlockOreY = random.nextInt(50);
				int BlockOreZ = chunkZ + random.nextInt(16);
				
				(new WorldGenMinable(SAMWBlock.oreCopper.blockID, 5)).generate(world, random, BlockOreX, BlockOreY, BlockOreZ);
			}
			
		}else{
			
			LogHelper.log(Level.WARNING, "Copper ore generation has been diabled!");
			
		}
		if(ConfigurationSettings.SILVER_ORE_GEN == true){
			for (int i = 0; i < 16; i++){
				int BlockOreX = chunkX + random.nextInt(16);
				int BlockOreY = random.nextInt(50);
				int BlockOreZ = chunkZ + random.nextInt(16);
				
				(new WorldGenMinable(SAMWBlock.oreSiliver.blockID, 5)).generate(world, random, BlockOreX, BlockOreY, BlockOreZ);
			}
			
		}else{
			
			LogHelper.log(Level.WARNING, "Siliver ore generation has been diabled!");
			
		}
		if(ConfigurationSettings.TIN_ORE_GEN == true){
			for (int i = 0; i < 156; i++){
				int BlockOreX = chunkX + random.nextInt(16);
				int BlockOreY = random.nextInt(50);
				int BlockOreZ = chunkZ + random.nextInt(16);
				
				(new WorldGenMinable(SAMWBlock.oreTin.blockID, 5)).generate(world, random, BlockOreX, BlockOreY, BlockOreZ);
			}
			
		}else{
			
			LogHelper.log(Level.WARNING, "Tin ore generation has been diabled!");
			
		}
		
			
	}

	private void generateNether(World world, Random random, int i, int j) {
		
		
	}


}
