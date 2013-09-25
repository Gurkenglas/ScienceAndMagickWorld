package us.samcraft.samw.configuration;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import us.samcraft.samw.lib.ITNames;
import us.samcraft.samw.lib.ItemID;
import cpw.mods.fml.common.FMLLog;


public class ConfigurationHandler {
	
	public static Configuration configuration;
	
	 public static void init(File configFile) {
		 
		 configuration = new Configuration(configFile);
		 
		 try{
			 
			configuration.load();
			 
			ItemID.GEM = configuration.getItem(Configuration.CATEGORY_ITEM, ITNames.GEM, ItemID.GEM_DEFAULT).getInt() - 256;
			ItemID.MOLD = configuration.getItem(Configuration.CATEGORY_ITEM, ITNames.MOLD, ItemID.MOLD_DEFAULT).getInt() - 256;
			ItemID.BLADE = configuration.get(Configuration.CATEGORY_ITEM, ITNames.BLADE, ItemID.BLADE_DEFAULT).getInt();
			ItemID.SIMPTOOL = configuration.getItem(Configuration.CATEGORY_ITEM, ITNames.SIMPTOOL, ItemID.SIMPTOOL_DEFAULT).getInt() - 256;
			ItemID.AXEHEAD = configuration.getItem(Configuration.CATEGORY_ITEM, ITNames.AXEHEAD, ItemID.AXEHEAD_DEFAULT).getInt() - 256;
			ItemID.SHOVELHEAD = configuration.getItem(Configuration.CATEGORY_ITEM, ITNames.SHOVHEAD, ItemID.SHOVELHEAD_DEFAULT).getInt() - 256;
			ItemID.PICKAXEHEAD = configuration.getItem(Configuration.CATEGORY_ITEM, ITNames.PAXEHEAD, ItemID.PICKAXEHEAD_DEFAULT).getInt() - 256;
			 
		 }catch(Exception e) {
			 FMLLog.log(Level.SEVERE, e, "Science&MagickWorld" + "Has had a issue loading its config");
		 }finally{
			configuration.save(); 
		 }
	 }

}
