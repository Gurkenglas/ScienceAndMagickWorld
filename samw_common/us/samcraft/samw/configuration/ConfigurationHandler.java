package us.samcraft.samw.configuration;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import us.samcraft.samw.fluid.*;
import us.samcraft.samw.lib.SAMWReference;
import us.samcraft.samw.lib.id.SAMWBlockID;
import us.samcraft.samw.lib.id.SAMWFluidID;
import us.samcraft.samw.lib.id.SAMWItemID;
import us.samcraft.samw.lib.names.SAMWBNames;
import us.samcraft.samw.lib.names.SAMWINames;
import cpw.mods.fml.common.FMLLog;

/**
 * @author Anthony Anderson(LordIllyohs)
 *
 */
public class ConfigurationHandler {
	
	public static Configuration configuration;
	
	public static final String CATEGORY_INGOT                         = "Ingot     s";
	public static final String CATEGORY_PART = "Parts";
	public static final String CATAGORY_ORE = "Ores";
	public static final String CATAGORY_NATUREBLOCK = "Nature";
	public static final String CATAGORY_GEM = "Gems";
	public static final String CATAGORY_COMMONORE_GEN = "OreGeneration";
	public static final String CATAGORY_FLUID = "Fluids";
	
	public static void init(File configFile) {
		 
		 configuration = new Configuration(configFile);
		 
		 try{
			 
			configuration.load();
			
			/* Custom categories */
			configuration.addCustomCategoryComment(CATEGORY_INGOT                        , null);
			configuration.addCustomCategoryComment(CATEGORY_PART, null);
			configuration.addCustomCategoryComment(CATAGORY_ORE, null);
			configuration.addCustomCategoryComment(CATAGORY_NATUREBLOCK, null);
			configuration.addCustomCategoryComment(CATAGORY_GEM, null);
			configuration.addCustomCategoryComment(CATAGORY_FLUID, null);
			
			configuration.addCustomCategoryComment(CATAGORY_COMMONORE_GEN, "Enable or disable ore generation, disableing common ore generation disables all ores listied");
			
			/* Meta Items */ 
			SAMWItemID.GEM = configuration.getItem(CATEGORY_PART, SAMWINames.GEM, SAMWItemID.GEM_DEFAULT).getInt() - 256;
			SAMWItemID.MOLD = configuration.getItem(CATEGORY_PART, SAMWINames.MOLD, SAMWItemID.MOLD_DEFAULT).getInt() - 256;
			SAMWItemID.BLADE = configuration.get(CATEGORY_PART, SAMWINames.BLADE, SAMWItemID.BLADE_DEFAULT).getInt() - 256;
			SAMWItemID.SIMPTOOL = configuration.getItem(CATEGORY_PART, SAMWINames.SIMPTOOL, SAMWItemID.SIMPTOOL_DEFAULT).getInt() - 256;
			SAMWItemID.AXEHEAD = configuration.getItem(CATEGORY_PART, SAMWINames.AXEHEAD, SAMWItemID.AXEHEAD_DEFAULT).getInt() - 256;
			SAMWItemID.SHOVELHEAD = configuration.getItem(CATEGORY_PART, SAMWINames.SHOVHEAD, SAMWItemID.SHOVELHEAD_DEFAULT).getInt() - 256;
			SAMWItemID.PICKAXEHEAD = configuration.getItem(CATEGORY_PART, SAMWINames.PAXEHEAD, SAMWItemID.PICKAXEHEAD_DEFAULT).getInt() - 256;
			
			/* Regular Items */
			SAMWItemID.ADAMANTIUM_INGOT = configuration.getItem(CATEGORY_INGOT, "Adamantium Ingot"  , SAMWItemID.ADAMANTIUM_INGOT_DEFAULT ).getInt() - 256;
			SAMWItemID.COPPER_INGOT     = configuration.getItem(CATEGORY_INGOT, "Copper Ingot"      , SAMWItemID.COPPER_INGOT_DEFAULT     ).getInt() - 256;
			SAMWItemID.MITHRIL_INGOT    = configuration.getItem(CATEGORY_INGOT, "Mithril Ingot"     , SAMWItemID.MITHRIL_INGOT_DEFAULT    ).getInt() - 256;
			SAMWItemID.ORICHALCUM_INGOT = configuration.getItem(CATEGORY_INGOT, "Orichalcum Ingot"  , SAMWItemID.ORICHALCUM_INGOT_DEFAULT ).getInt() - 256;
			SAMWItemID.RUNE_INGOT       = configuration.getItem(CATEGORY_INGOT, "Rune Ingot"        , SAMWItemID.RUNE_INGOT_DEFAULT       ).getInt() - 256;
			SAMWItemID.SILICON_INGOT    = configuration.getItem(CATEGORY_INGOT, "Silicon Ingot"     , SAMWItemID.SILICON_INGOT_DEFAULT    ).getInt() - 256;
			SAMWItemID.SILVER_INGOT     = configuration.getItem(CATEGORY_INGOT, "Silver Ingot"      , SAMWItemID.SILVER_INGOT_DEFAULT     ).getInt() - 256;
			SAMWItemID.TIN_INGOT        = configuration.getItem(CATEGORY_INGOT, "Tin Ingot"         , SAMWItemID.TIN_INGOT_DEFAULT        ).getInt() - 256;
			SAMWItemID.TITANIUM_INGOT   = configuration.getItem(CATEGORY_INGOT, "Titanium Ingot"    , SAMWItemID.TITANIUM_INGOT_DEFAULT   ).getInt() - 256;
			SAMWItemID.BRONZE_INGOT     = configuration.getItem(CATEGORY_INGOT, "BronzeIngot"       , SAMWItemID.BRONZE_INGOT_DEFAULT     ).getInt() - 256;
			SAMWItemID.MANA_INGOT       = configuration.getItem(CATEGORY_INGOT, "ManaIngot"         , SAMWItemID.MANA_INGOT_DEFAULT       ).getInt() - 256;
			SAMWItemID.STARSTEEL_INGOT  = configuration.getItem(CATEGORY_INGOT, "StarSteelIngot"    , SAMWItemID.STARSTEEL_INGOT_DEFAULT  ).getInt() - 256;
			SAMWItemID.STEEL_INGOT      = configuration.getItem(CATEGORY_INGOT, "SteelIngot"        , SAMWItemID.STEEL_INGOT_DEFAULT      ).getInt() - 256;
			
			/* ores */
			SAMWBlockID.ADAMANTIUM_ORE = configuration.getBlock(CATAGORY_ORE, SAMWBNames.oreAdamantium, SAMWBlockID.ADAMANTIUM_ORE_DEFAULT).getInt() - 256;
			SAMWBlockID.COPPER_ORE = configuration.getBlock(CATAGORY_ORE, SAMWBNames.oreCopper, SAMWBlockID.COPPER_ORE_DEFAULT).getInt() - 256;
			SAMWBlockID.MITHRIL_ORE = configuration.getBlock(CATAGORY_ORE, SAMWBNames.oreMithril, SAMWBlockID.MITHRIL_ORE_DEFAULT).getInt() - 256;
			SAMWBlockID.ORICHALCUM_ORE = configuration.getBlock(CATAGORY_ORE, SAMWBNames.oreOrichalcum, SAMWBlockID.ORICHALCUM_ORE_DEFAULT).getInt() - 256;
			SAMWBlockID.RUNE_ORE = configuration.getBlock(CATAGORY_ORE, SAMWBNames.oreRune, SAMWBlockID.RUNE_ORE_DEFAULT).getInt() - 256;
			SAMWBlockID.SILICON_ORE = configuration.getBlock(CATAGORY_ORE, SAMWBNames.oreSilicon, SAMWBlockID.SILICON_ORE_DEFAULT).getInt() - 256;
			SAMWBlockID.SILVER_ORE = configuration.getBlock(CATAGORY_ORE, SAMWBNames.oreSilver, SAMWBlockID.SILVER_ORE_DEFAULT).getInt() - 256;
			SAMWBlockID.TIN_ORE = configuration.getBlock(CATAGORY_ORE, SAMWBNames.oreTin, SAMWBlockID.TIN_ORE_DEFAULT).getInt() - 256;
			SAMWBlockID.TITANIUM_ORE = configuration.getBlock(CATAGORY_ORE, SAMWBNames.oreTitanium, SAMWBlockID.TITANIUM_ORE_DEFAULT).getInt() - 256;
			SAMWBlockID.WONDERFLONIUM_ORE = configuration.getBlock(CATAGORY_ORE, SAMWBNames.oreWonderflonium, SAMWBlockID.WONDERFLONIUM_ORE_DEFAULT).getInt() -256;
			SAMWBlockID.LEAD_ORE = configuration.getBlock(CATAGORY_ORE, SAMWBNames.oreLead, SAMWBlockID.ORICHALCUM_ORE_DEFAULT).getInt() -256;
			
			/*Fluids*/
			Blood.setFluidBlockID(configuration.getBlock(CATAGORY_FLUID, "Blood", SAMWFluidID.BLOOD_DEFAULT).getInt());
			HeavyWater.setFluidBlockID(configuration.getBlock(CATAGORY_FLUID, "Heavy Water", SAMWFluidID.HEAVY_DEFAULT).getInt());
			PinkWater.setFluidBlockID(configuration.getBlock(CATAGORY_FLUID, "PinkWater", SAMWFluidID.PINK_DEFAULT).getInt());
			YellowWater.setFluidBlockID(configuration.getBlock(CATAGORY_FLUID, "Charged Water", SAMWFluidID.YELLOW_DEFAULT).getInt());
			GreenWater.setFluidBlockID(configuration.getBlock(CATAGORY_FLUID, "Hungry Water", SAMWFluidID.GREEN_DEFAULT).getInt());
			
			SAMWBlockID.CLEAR_DEC = configuration.getBlock(CATAGORY_ORE, SAMWBNames.decClearRock, SAMWBlockID.CLEARBLOCK_DEC_DEFAULT).getInt() -256;//temp place till I get this concept down
			
			/* Nature blocks*/
			//SAMWBlockID.LEAVES = configuration.getBlock(CATAGORY_NATUREBLOCK, SAMWBNames.LEAVES, SAMWBlockID.LEAVES_DEFAULT).getInt() - 256;
			
			/* Ore generation settings */
			ConfigurationSettings.COMMON_ORE_GEN = configuration.get(CATAGORY_COMMONORE_GEN, "Enabel common ore generation", ConfigurationSettings.COMMON_ORE_GEN_DEFUALT).getBoolean(ConfigurationSettings.COMMON_ORE_GEN_DEFUALT);
			ConfigurationSettings.COPPER_ORE_GEN = configuration.get(CATAGORY_COMMONORE_GEN, "Enabel copper ore generation", ConfigurationSettings.COPPER_ORE_GEN_DEFAULT).getBoolean(ConfigurationSettings.COPPER_ORE_GEN_DEFAULT);
			ConfigurationSettings.SILVER_ORE_GEN = configuration.get(CATAGORY_COMMONORE_GEN, "Enabel silver ore generation", ConfigurationSettings.SILVER_ORE_GEN_DEFAULT).getBoolean(ConfigurationSettings.SILVER_ORE_GEN_DEFAULT);
			ConfigurationSettings.TIN_ORE_GEN = configuration.get(CATAGORY_COMMONORE_GEN, "Enabel tin ore generation", ConfigurationSettings.TIN_ORE_GEN_DEfAULT).getBoolean(ConfigurationSettings.TIN_ORE_GEN_DEfAULT);
			
			
			 
		 }catch(Exception e) {
			 FMLLog.log(Level.SEVERE, e, SAMWReference.MOD_NAME + " Has had a issue loading its config");
		 }finally{
			configuration.save(); 
		 }
	 }

}
