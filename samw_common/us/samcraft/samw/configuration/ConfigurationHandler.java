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
			 
			configuration.load();
			 
			ItemID.GEM = configuration.getItem(Configuration.CATEGORY_ITEM, INames.GEM, ItemID.GEM_DEFAULT).getInt();
			ItemID.MOLD = configuration.getItem(Configuration.CATEGORY_ITEM, INames.MOLD, ItemID.MOLD_DEFAULT).getInt();
			ItemID.BLADE = configuration.get(Configuration.CATEGORY_ITEM, INames.BLADE, ItemID.BLADE_DEFAULT).getInt();
			ItemID.SIMPTOOL = configuration.getItem(Configuration.CATEGORY_ITEM, INames.SIMPTOOL, ItemID.SIMPTOOL_DEFAULT).getInt();
			ItemID.AXEHEAD = configuration.getItem(Configuration.CATEGORY_ITEM, INames.AXEHEAD, ItemID.AXEHEAD_DEFAULT).getInt();
			ItemID.SHOVELHEAD = configuration.getItem(Configuration.CATEGORY_ITEM, INames.SHOVHEAD, ItemID.SHOVELHEAD_DEFAULT).getInt();
			 
		 }catch(Exception e) {
			 FMLLog.log(Level.SEVERE, e, "Science&MagickWorld" + "Has had a issue loading its config");
		 }finally{
			configuration.save(); 
		 }
	 }

}
