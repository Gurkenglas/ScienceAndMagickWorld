package us.samcraft.samw.core.handler;

import java.util.logging.Level;
import java.util.logging.Logger;

import cpw.mods.fml.common.FMLLog;

import us.samcraft.samw.lib.SAMWReference;

/**
 * @author Anthony Anderson(LordIlloyhs)
 *
 */
public class LogHelper {
	
	private static Logger samwLogger = Logger.getLogger(SAMWReference.MOD_NAME);

	public static void init() {
		
		samwLogger.setParent(FMLLog.getLogger());
		
	}
	
	public static void log(Level logLevel, Object object){
		samwLogger.log(logLevel, object.toString());
		
	}

}
