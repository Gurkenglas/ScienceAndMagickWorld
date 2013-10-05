package us.samcraft.samw.configuration;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import us.samcraft.samw.lib.BNames;
import us.samcraft.samw.lib.BlockID;
import us.samcraft.samw.lib.ITNames;
import us.samcraft.samw.lib.ItemID;
import us.samcraft.samw.lib.Reference;
import cpw.mods.fml.common.FMLLog;


public class ConfigurationHandler {
	
	public static Configuration configuration;
	
	public static final String CATEGORY_INGOT = "Ingots";
	public static final String CATEGORY_PART = "Parts";
	public static final String CATAGORY_ORE = "Ores";
	//public static final String CATAGORY_GEM
	
	public static void init(File configFile) {
		 
		 configuration = new Configuration(configFile);
		 
		 try{
			 
			configuration.load();
			
			/* Custom categories */
			configuration.addCustomCategoryComment(CATEGORY_INGOT, null);
			configuration.addCustomCategoryComment(CATEGORY_PART, null);
			configuration.addCustomCategoryComment(CATAGORY_ORE, null);
			
			/* Meta Items */ 
			ItemID.GEM = configuration.getItem(CATEGORY_PART, ITNames.GEM, ItemID.GEM_DEFAULT).getInt() - 256;
			ItemID.MOLD = configuration.getItem(CATEGORY_PART, ITNames.MOLD, ItemID.MOLD_DEFAULT).getInt() - 256;
			ItemID.BLADE = configuration.get(CATEGORY_PART, ITNames.BLADE, ItemID.BLADE_DEFAULT).getInt() - 256;
			ItemID.SIMPTOOL = configuration.getItem(CATEGORY_PART, ITNames.SIMPTOOL, ItemID.SIMPTOOL_DEFAULT).getInt() - 256;
			ItemID.AXEHEAD = configuration.getItem(CATEGORY_PART, ITNames.AXEHEAD, ItemID.AXEHEAD_DEFAULT).getInt() - 256;
			ItemID.SHOVELHEAD = configuration.getItem(CATEGORY_PART, ITNames.SHOVHEAD, ItemID.SHOVELHEAD_DEFAULT).getInt() - 256;
			ItemID.PICKAXEHEAD = configuration.getItem(CATEGORY_PART, ITNames.PAXEHEAD, ItemID.PICKAXEHEAD_DEFAULT).getInt() - 256;
			
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
			
			/* Blocks */
			BlockID.ADAMANTUM_ORE = configuration.getBlock(CATAGORY_ORE, BNames.oreAdamantium, BlockID.ADAMANTUM_ORE_DEFAULT).getInt() - 256;
		    BlockID.COPPER_ORE = configuration.getBlock(CATAGORY_ORE, BNames.oreCopper, BlockID.COPPER_ORE_DEFAULT).getInt() - 256;
			BlockID.MITHRIL_ORE = configuration.getBlock(CATAGORY_ORE, BNames.oreMithril, BlockID.MITHRIL_ORE_DEFAULT).getInt() - 256;
			BlockID.ORICHALCUM_ORE = configuration.getBlock(CATAGORY_ORE, BNames.oreOrichalcum, BlockID.ORICHALCUM_ORE_DEFAULT).getInt() - 256;
			BlockID.RUNE_ORE = configuration.getBlock(CATAGORY_ORE, BNames.oreRune, BlockID.RUNE_ORE_DEFAULT).getInt() - 256;
			BlockID.SILICON_ORE = configuration.getBlock(CATAGORY_ORE, BNames.oreSilicon, BlockID.SILICON_ORE_DEFAULT).getInt() - 256;
			BlockID.SILIVER_ORE = configuration.getBlock(CATAGORY_ORE, BNames.oreSilver, BlockID.SILIVER_ORE_DEFAULT).getInt() - 256;
			BlockID.TIN_ORE = configuration.getBlock(CATAGORY_ORE, BNames.oreTin, BlockID.TIN_ORE_DEFAULT).getInt() - 256;
			BlockID.TITANIUM_ORE = configuration.getBlock(CATAGORY_ORE, BNames.oreTitanium, BlockID.TITANIUM_ORE_DEFAULT).getInt() - 256;
			BlockID.WONDERFLONIUM_ORE = configuration.getBlock(CATAGORY_ORE, BNames.oreWonderflonium, BlockID.WONDERFLONIUM_ORE_DEFAULT).getInt() -256;
			 
		 }catch(Exception e) {
			 FMLLog.log(Level.SEVERE, e, Reference.MOD_NAME + " Has had a issue loading its config");
		 }finally{
			configuration.save(); 
		 }
	 }

}
