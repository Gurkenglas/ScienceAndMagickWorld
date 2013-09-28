package us.samcraft.samw.configuration;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import us.samcraft.samw.lib.ITNames;
import us.samcraft.samw.lib.ItemID;
import us.samcraft.samw.lib.Reference;
import cpw.mods.fml.common.FMLLog;


public class ConfigurationHandler {
	
	public static Configuration configuration;
	
	public static final String CATEGORY_INGOT = "Ingots";
	
	public static void init(File configFile) {
		 
		 configuration = new Configuration(configFile);
		 
		 try{
			 
			configuration.load();
			
			configuration.addCustomCategoryComment(CATEGORY_INGOT, "Ingot Ids");
			/* Meta Items */ 
			ItemID.GEM = configuration.getItem(Configuration.CATEGORY_ITEM, ITNames.GEM, ItemID.GEM_DEFAULT).getInt() - 256;
			ItemID.MOLD = configuration.getItem(Configuration.CATEGORY_ITEM, ITNames.MOLD, ItemID.MOLD_DEFAULT).getInt() - 256;
			ItemID.BLADE = configuration.get(Configuration.CATEGORY_ITEM, ITNames.BLADE, ItemID.BLADE_DEFAULT).getInt();
			ItemID.SIMPTOOL = configuration.getItem(Configuration.CATEGORY_ITEM, ITNames.SIMPTOOL, ItemID.SIMPTOOL_DEFAULT).getInt() - 256;
			ItemID.AXEHEAD = configuration.getItem(Configuration.CATEGORY_ITEM, ITNames.AXEHEAD, ItemID.AXEHEAD_DEFAULT).getInt() - 256;
			ItemID.SHOVELHEAD = configuration.getItem(Configuration.CATEGORY_ITEM, ITNames.SHOVHEAD, ItemID.SHOVELHEAD_DEFAULT).getInt() - 256;
			ItemID.PICKAXEHEAD = configuration.getItem(Configuration.CATEGORY_ITEM, ITNames.PAXEHEAD, ItemID.PICKAXEHEAD_DEFAULT).getInt() - 256;
			
			/* Regular Items */
			ItemID.ADAMANTIUM_INGOT = configuration.getItem(CATEGORY_INGOT, ITNames.AdamantiumIngot, ItemID.ADAMANTIUM_INGOT_DEFAULT).getInt() - 256;
			ItemID.BRONZE_INGOT = configuration.getItem(CATEGORY_INGOT, ITNames.BronzeIngot, ItemID.BRONZE_INGOT_DEFAULT).getInt() - 256;
			ItemID.COPPER_INGOT = configuration.getItem(CATEGORY_INGOT, ITNames.CopperIngot, ItemID.COPPER_INGOT_DEFAULT).getInt() - 256;
			ItemID.MANA_INGOT = configuration.getItem(CATEGORY_INGOT, ITNames.ManaIngot, ItemID.MANA_INGOT_DEFAULT).getInt() - 256;
			ItemID.MITHRIL_INGOT = configuration.getItem(CATEGORY_INGOT, ITNames.MithrilIngot, ItemID.MITHRIL_INGOT_DEFAULT).getInt() - 256;
			ItemID.ORICHALCUM_INGOT = configuration.getItem(CATEGORY_INGOT, ITNames.OrichalcumIngot, ItemID.ORICHALCUM_INGOT_DEFAULT).getInt() - 256;
			ItemID.RUNE_INGOT = configuration.getItem(CATEGORY_INGOT, ITNames.RuneIngot, ItemID.RUNE_INGOT_DEFAULT).getInt() - 256;
			ItemID.SILICON_INGOT = configuration.getItem(CATEGORY_INGOT, ITNames.SiliconIngot, ItemID.SILICON_INGOT_DEFAULT).getInt() - 256;
			ItemID.SILVER_INGOT = configuration.getItem(CATEGORY_INGOT, ITNames.SiliverIngot, ItemID.SILVER_INGOT_DEFAULT).getInt() - 256;
			ItemID.STARSTEEL_INGOT = configuration.getItem(CATEGORY_INGOT, ITNames.StartSteelIngot, ItemID.STARSTEEL_INGOT_DEFAULT).getInt() - 256;
			ItemID.STEEL_INGOT = configuration.getItem(CATEGORY_INGOT, ITNames.StartSteelIngot, ItemID.STEEL_INGOT_DEFAULT).getInt() - 256;
			ItemID.TITANIUM_INGOT = configuration.getItem(CATEGORY_INGOT, ITNames.TitaniumIngot, ItemID.TITANIUM_INGOT_DEFAULT).getInt() - 256;
			 
		 }catch(Exception e) {
			 FMLLog.log(Level.SEVERE, e, Reference.MOD_NAME + " Has had a issue loading its config");
		 }finally{
			configuration.save(); 
		 }
	 }

}
