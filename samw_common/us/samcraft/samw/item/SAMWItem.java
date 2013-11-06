package us.samcraft.samw.item;

import java.util.HashMap;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import us.samcraft.samw.item.part.ItemAxeHead;
import us.samcraft.samw.item.part.ItemBlade;
import us.samcraft.samw.item.part.ItemMold;
import us.samcraft.samw.item.part.ItemPickAxeHead;
import us.samcraft.samw.item.part.ItemShovelHead;
import us.samcraft.samw.item.part.ItemSimpleTool;
import us.samcraft.samw.lib.id.SAMWBlockID;
import us.samcraft.samw.lib.id.SAMWItemID;
import us.samcraft.samw.lib.names.SAMWINames;
import us.samcraft.samw.lib.textures.ModBlockIcons;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * @author Anthony Anderson(LordIlloyhs)
 * 
 */
public class SAMWItem {

	public static Item Gem;
	public static Item Mold;
	public static Item AxeHead;
	public static Item Blade;
	public static Item PickaxeHead;
	public static Item ScytheHead;
	public static Item ShovelHead;
	public static Item Simptool;

	public static HashMap<String,Ingot> ingots = new HashMap<String,Ingot>( );

	public static void init() {

		/* meta Items */
		Gem = new ItemGem(SAMWItemID.GEM );
		Mold = new ItemMold(SAMWItemID.MOLD );
		Blade = new ItemBlade(SAMWItemID.BLADE );
		Simptool = new ItemSimpleTool(SAMWItemID.SIMPTOOL );
		AxeHead = new ItemAxeHead(SAMWItemID.AXEHEAD );
		PickaxeHead = new ItemPickAxeHead(SAMWItemID.PICKAXEHEAD );
		ShovelHead = new ItemShovelHead(SAMWItemID.SHOVELHEAD );

		/* Regular items */
		new Ingot(SAMWItemID.ADAMANTIUM_INGOT, "Adamantium Ingot" , ""         , ""           , SAMWBlockID.ADAMANTIUM_ORE , "Adamantium Ore",  10F, ModBlockIcons.oreAdamantium , 0.7F);
		new Ingot(SAMWItemID.COPPER_INGOT,     "Copper Ingot"     , ""         , "oreCopper"  , SAMWBlockID.COPPER_ORE     , "Copper Ore"    ,  3F,  ModBlockIcons.oreCopper     , 0.3F);
		new Ingot(SAMWItemID.MITHRIL_INGOT,    "Mithril Ingot"    , ""         , ""           , SAMWBlockID.MITHRIL_ORE    , "Mithril Ore"   ,  8F,  ModBlockIcons.oreMithril    , 0.6F);
		new Ingot(SAMWItemID.ORICHALCUM_INGOT, "Orichalcum Ingot" , ""         , ""           , SAMWBlockID.ORICHALCUM_ORE , "Orichalcum Ore",  7F,  ModBlockIcons.oreOrichalcum , 0.9F);
		new Ingot(SAMWItemID.RUNE_INGOT,       "Rune Ingot"       , ""         , ""           , SAMWBlockID.RUNE_ORE       , "Rune Ore"      ,  9F,  ModBlockIcons.oreRune       , 0.7F);
		new Ingot(SAMWItemID.SILICON_INGOT,    "Silicon Ingot"    , ""         , "oreSilicon" , SAMWBlockID.SILICON_ORE    , "Silicon Ore"   ,  4F,  ModBlockIcons.oreSilicon    , 0.4F);
		new Ingot(SAMWItemID.SILVER_INGOT,     "Silver Ingot"     , ""         , "oreSilver"  , SAMWBlockID.SILVER_ORE     , "Silver Ore"    ,  4F,  ModBlockIcons.oreSilver     , 0.5F);
		new Ingot(SAMWItemID.TIN_INGOT,        "Tin Ingot"        , ""         , "oreTin"     , SAMWBlockID.TIN_ORE        , "Tin Ore"       ,  4F,  ModBlockIcons.oreTin        , 0.3F);
		new Ingot(SAMWItemID.TITANIUM_INGOT,   "Titanium Ingot"   , ""         , "oreTitanium", SAMWBlockID.TITANIUM_ORE   , "Titanium Ore"  ,  7F,  ModBlockIcons.oreTitanium   , 0.9F);
		new Ingot(SAMWItemID.BRONZE_INGOT,     "BronzeIngot"      , ""         );      
		new Ingot(SAMWItemID.MANA_INGOT,       "ManaIngot"        , ""         );          
		new Ingot(SAMWItemID.STARSTEEL_INGOT,  "StarSteelIngot"   , ""         );
		new Ingot(SAMWItemID.STEEL_INGOT,      "SteelIngot"       , ""         );        
		MetaItems();
	}

	private static void MetaItems() {
		/* Axe head */
		for (int i = 0; i < SAMWINames.AXEHEAD_META_NAME.length; i++) {
			LanguageRegistry.addName(new ItemStack(AxeHead, 1, i),
					SAMWINames.AXEHEAD_META_NAME[i] );
		}
		/* Pickaxe head */
		for (int i = 0; i < SAMWINames.PAXEHEAD_META_NAME.length; i++) {
			LanguageRegistry.addName(new ItemStack(PickaxeHead, 1, i),
					SAMWINames.PAXEHEAD_META_NAME[i] );
		}
		/* Gems */
		for (int i = 0; i < SAMWINames.GEM_META_NAME.length; i++) {
			LanguageRegistry.addName(new ItemStack(Gem, 1, i),
					SAMWINames.GEM_META_NAME[i] );
		}
		/* Molds */
		for (int i = 0; i < SAMWINames.MOLD_META_NAME.length; i++) {
			LanguageRegistry.addName(new ItemStack(Mold, 1, i),
					SAMWINames.MOLD_META_NAME[i] );
		}
		/* Blade */
		for (int i = 0; i < SAMWINames.BLADE_META_NAME.length; i++) {
			LanguageRegistry.addName(new ItemStack(Blade, 1, i),
					SAMWINames.BLADE_META_NAME[i] );
		}
		/* Simple Tools */
		for (int i = 0; i < SAMWINames.SIMPTOOL_META_NAME.length; i++) {
			LanguageRegistry.addName(new ItemStack(Simptool, 1, i),
					SAMWINames.SIMPTOOL_META_NAME[i] );
		}
		/* Shovel Head */
		for (int i = 0; i < SAMWINames.SHOVHEAD_META_NAME.length; i++) {
			LanguageRegistry.addName(new ItemStack(ShovelHead, 1, i),
					SAMWINames.SHOVHEAD_META_NAME[i] );
		}

	}

}
