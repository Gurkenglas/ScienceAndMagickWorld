package us.samcraft.samw.configuration;

import java.io.File;
import java.util.logging.Level;

import us.samcraft.samw.lib.INames;
import us.samcraft.samw.lib.ItemID;
import us.samcraft.samw.lib.Reference;

import cpw.mods.fml.common.FMLLog;

import net.minecraftforge.common.Configuration;


public class ConfigurationHandler {
	
	public static Configuration configuration;
	
	 public static void init(File configFile) {
		 
		 configuration = new Configuration(configFile);
		 
		 try{
			ItemID.GEM = configuration.getItem(Configuration.CATEGORY_ITEM, INames.GEM, ItemID.GEM_DEFAULT).getInt(); 
			 
		 }catch(Exception e) {
			 FMLLog.log(Level.SEVERE, e, Reference.MOD_NAME + "Has had a issue loading its config please");
		 }
	 }

}
