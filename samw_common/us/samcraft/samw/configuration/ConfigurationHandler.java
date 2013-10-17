package us.samcraft.samw.configuration;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import us.samcraft.samw.lib.SAMWBNames;
import us.samcraft.samw.lib.SAMWBlockID;
import us.samcraft.samw.lib.SAMWINames;
import us.samcraft.samw.lib.SAMWItemID;
import us.samcraft.samw.lib.SAMWReference;
import cpw.mods.fml.common.FMLLog;


public class ConfigurationHandler {
	
	public static Configuration configuration;
	
	public static final String CATEGORY_INGOT = "Ingots";
	public static final String CATEGORY_PART = "Parts";
	public static final String CATAGORY_ORE = "Ores";
	public static final String CATAGORY_NATUREBLOCK = "Nature";
	public static final String CATAGORY_GEM = "Gems";
	
	public static void init(File configFile) {
		 
		 configuration = new Configuration(configFile);
		 
		 try{
			 
			configuration.load();
			
			/* Custom categories */
			configuration.addCustomCategoryComment(CATEGORY_INGOT, null);
			configuration.addCustomCategoryComment(CATEGORY_PART, null);
			configuration.addCustomCategoryComment(CATAGORY_ORE, null);
			configuration.addCustomCategoryComment(CATAGORY_NATUREBLOCK, null);
			configuration.addCustomCategoryComment(CATAGORY_GEM, null);
			
			/* Meta Items */ 
			SAMWItemID.GEM = configuration.getItem(CATEGORY_PART, SAMWINames.GEM, SAMWItemID.GEM_DEFAULT).getInt() - 256;
			SAMWItemID.MOLD = configuration.getItem(CATEGORY_PART, SAMWINames.MOLD, SAMWItemID.MOLD_DEFAULT).getInt() - 256;
			SAMWItemID.BLADE = configuration.get(CATEGORY_PART, SAMWINames.BLADE, SAMWItemID.BLADE_DEFAULT).getInt() - 256;
			SAMWItemID.SIMPTOOL = configuration.getItem(CATEGORY_PART, SAMWINames.SIMPTOOL, SAMWItemID.SIMPTOOL_DEFAULT).getInt() - 256;
			SAMWItemID.AXEHEAD = configuration.getItem(CATEGORY_PART, SAMWINames.AXEHEAD, SAMWItemID.AXEHEAD_DEFAULT).getInt() - 256;
			SAMWItemID.SHOVELHEAD = configuration.getItem(CATEGORY_PART, SAMWINames.SHOVHEAD, SAMWItemID.SHOVELHEAD_DEFAULT).getInt() - 256;
			SAMWItemID.PICKAXEHEAD = configuration.getItem(CATEGORY_PART, SAMWINames.PAXEHEAD, SAMWItemID.PICKAXEHEAD_DEFAULT).getInt() - 256;
			
			/* Regular Items */
			SAMWItemID.ADAMANTIUM_INGOT = configuration.getItem(CATEGORY_INGOT, SAMWINames.AdamantiumIngot, SAMWItemID.ADAMANTIUM_INGOT_DEFAULT).getInt() - 256;
			SAMWItemID.BRONZE_INGOT = configuration.getItem(CATEGORY_INGOT, SAMWINames.BronzeIngot, SAMWItemID.BRONZE_INGOT_DEFAULT).getInt() - 256;
			SAMWItemID.COPPER_INGOT = configuration.getItem(CATEGORY_INGOT, SAMWINames.CopperIngot, SAMWItemID.COPPER_INGOT_DEFAULT).getInt() - 256;
			SAMWItemID.MANA_INGOT = configuration.getItem(CATEGORY_INGOT, SAMWINames.ManaIngot, SAMWItemID.MANA_INGOT_DEFAULT).getInt() - 256;
			SAMWItemID.MITHRIL_INGOT = configuration.getItem(CATEGORY_INGOT, SAMWINames.MithrilIngot, SAMWItemID.MITHRIL_INGOT_DEFAULT).getInt() - 256;
			SAMWItemID.ORICHALCUM_INGOT = configuration.getItem(CATEGORY_INGOT, SAMWINames.OrichalcumIngot, SAMWItemID.ORICHALCUM_INGOT_DEFAULT).getInt() - 256;
			SAMWItemID.RUNE_INGOT = configuration.getItem(CATEGORY_INGOT, SAMWINames.RuneIngot, SAMWItemID.RUNE_INGOT_DEFAULT).getInt() - 256;
			SAMWItemID.SILICON_INGOT = configuration.getItem(CATEGORY_INGOT, SAMWINames.SiliconIngot, SAMWItemID.SILICON_INGOT_DEFAULT).getInt() - 256;
			SAMWItemID.SILVER_INGOT = configuration.getItem(CATEGORY_INGOT, SAMWINames.SiliverIngot, SAMWItemID.SILVER_INGOT_DEFAULT).getInt() - 256;
			SAMWItemID.STARSTEEL_INGOT = configuration.getItem(CATEGORY_INGOT, SAMWINames.StartSteelIngot, SAMWItemID.STARSTEEL_INGOT_DEFAULT).getInt() - 256;
			SAMWItemID.STEEL_INGOT = configuration.getItem(CATEGORY_INGOT, SAMWINames.SteelIngot, SAMWItemID.STEEL_INGOT_DEFAULT).getInt() - 256;
			SAMWItemID.TITANIUM_INGOT = configuration.getItem(CATEGORY_INGOT, SAMWINames.TitaniumIngot, SAMWItemID.TITANIUM_INGOT_DEFAULT).getInt() - 256;
			SAMWItemID.TIN_INGOT = configuration.getItem(CATEGORY_INGOT, SAMWINames.TinIngot, SAMWItemID.TIN_INGOT_DEFAULT).getInt() - 256;
			
			/* Blocks */
			SAMWBlockID.ADAMANTUM_ORE = configuration.getBlock(CATAGORY_ORE, SAMWBNames.oreAdamantium, SAMWBlockID.ADAMANTUM_ORE_DEFAULT).getInt() - 256;
			SAMWBlockID.COPPER_ORE = configuration.getBlock(CATAGORY_ORE, SAMWBNames.oreCopper, SAMWBlockID.COPPER_ORE_DEFAULT).getInt() - 256;
			SAMWBlockID.MITHRIL_ORE = configuration.getBlock(CATAGORY_ORE, SAMWBNames.oreMithril, SAMWBlockID.MITHRIL_ORE_DEFAULT).getInt() - 256;
			SAMWBlockID.ORICHALCUM_ORE = configuration.getBlock(CATAGORY_ORE, SAMWBNames.oreOrichalcum, SAMWBlockID.ORICHALCUM_ORE_DEFAULT).getInt() - 256;
			SAMWBlockID.RUNE_ORE = configuration.getBlock(CATAGORY_ORE, SAMWBNames.oreRune, SAMWBlockID.RUNE_ORE_DEFAULT).getInt() - 256;
			SAMWBlockID.SILICON_ORE = configuration.getBlock(CATAGORY_ORE, SAMWBNames.oreSilicon, SAMWBlockID.SILICON_ORE_DEFAULT).getInt() - 256;
			SAMWBlockID.SILIVER_ORE = configuration.getBlock(CATAGORY_ORE, SAMWBNames.oreSilver, SAMWBlockID.SILIVER_ORE_DEFAULT).getInt() - 256;
			SAMWBlockID.TIN_ORE = configuration.getBlock(CATAGORY_ORE, SAMWBNames.oreTin, SAMWBlockID.TIN_ORE_DEFAULT).getInt() - 256;
			SAMWBlockID.TITANIUM_ORE = configuration.getBlock(CATAGORY_ORE, SAMWBNames.oreTitanium, SAMWBlockID.TITANIUM_ORE_DEFAULT).getInt() - 256;
			SAMWBlockID.WONDERFLONIUM_ORE = configuration.getBlock(CATAGORY_ORE, SAMWBNames.oreWonderflonium, SAMWBlockID.WONDERFLONIUM_ORE_DEFAULT).getInt() -256;
			
			/* Nature blocks*/
			SAMWBlockID.LEAVES = configuration.getBlock(CATAGORY_NATUREBLOCK, SAMWBNames.LEAVES, SAMWBlockID.LEAVES_DEFAULT).getInt() - 256;
			 
		 }catch(Exception e) {
			 FMLLog.log(Level.SEVERE, e, SAMWReference.MOD_NAME + " Has had a issue loading its config");
		 }finally{
			configuration.save(); 
		 }
	 }

}
