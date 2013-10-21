package us.samcraft.samw.worldgen;

import java.util.logging.Level;

import cpw.mods.fml.common.registry.GameRegistry;
import us.samcraft.samw.configuration.ConfigurationSettings;
import us.samcraft.samw.core.handler.LogHelper;
import us.samcraft.samw.worldgen.ores.CommonOreGen;

/**
 * @author Anthony Anderson(LordIlloyhs)
 *
 */
public class SAMWGeneration {

	public static void init() {
		
		if(ConfigurationSettings.COMMON_ORE_GEN == true){
			GameRegistry.registerWorldGenerator(new CommonOreGen());
		}else{
			LogHelper.log(Level.WARNING, "Common ore generation has been diabled now disableing, Copper, Siliver, and Tin");
		}
		
	}

}
