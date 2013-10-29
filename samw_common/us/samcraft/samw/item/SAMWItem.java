package us.samcraft.samw.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import us.samcraft.samw.lib.id.SAMWItemID;
import us.samcraft.samw.lib.names.SAMWINames;
import cpw.mods.fml.common.registry.GameRegistry;
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

	public static Item AdamantiumIngot;
	public static Item BronzeIngot;
	public static Item CopperIngot;
	public static Item ManaIngot;
	public static Item MithrilIngot;
	public static Item OrichalcumIngot;
	public static Item RuneIngot;
	public static Item SiliconIngot;
	public static Item SilverIngot;
	public static Item StarSteelIngot;
	public static Item SteelIngot;
	public static Item TinIngot;
	public static Item TitaniumIngot;

	public static void init() {

		/*meta Items*/
		Gem = new ItemGem(SAMWItemID.GEM);
		Mold = new ItemMold(SAMWItemID.MOLD);
		Blade = new ItemBlade(SAMWItemID.BLADE);
		Simptool = new ItemSimpleTool(SAMWItemID.SIMPTOOL);
		AxeHead = new ItemAxeHead(SAMWItemID.AXEHEAD);
		PickaxeHead = new ItemPickAxeHead(SAMWItemID.PICKAXEHEAD);
		ShovelHead = new ItemShovelHead(SAMWItemID.SHOVELHEAD);
		
		/*Regular items*/
		AdamantiumIngot = new ItemAdamantiumIngot(SAMWItemID.ADAMANTIUM_INGOT);
		BronzeIngot = new ItemBronzeIngot(SAMWItemID.BRONZE_INGOT);
		CopperIngot = new ItemCopperIngot(SAMWItemID.COPPER_INGOT);
		ManaIngot = new ItemManaIngot(SAMWItemID.MANA_INGOT);
		MithrilIngot = new ItemMithrilIngot(SAMWItemID.MITHRIL_INGOT);
		OrichalcumIngot = new ItemOrichalcumIngot(SAMWItemID.ORICHALCUM_INGOT);
		RuneIngot = new ItemRuneIngot(SAMWItemID.RUNE_INGOT);
		SiliconIngot = new ItemSiliconIngot(SAMWItemID.SILICON_INGOT);
		SilverIngot = new ItemSilverIngot(SAMWItemID.SILVER_INGOT);
		StarSteelIngot = new ItemStarSteelIngot(SAMWItemID.STARSTEEL_INGOT);
		SteelIngot = new ItemSteelIngot(SAMWItemID.STEEL_INGOT);
		TinIngot = new ItemTinIngot(SAMWItemID.TIN_INGOT);
		TitaniumIngot = new ItemTitaniumIngot(SAMWItemID.TITANIUM_INGOT);

		MetaItems();
		LanguageReg();
		GameReg();
		
	}

	private static void GameReg() {
		GameRegistry.registerItem(AdamantiumIngot, SAMWINames.AdamantiumIngot);
		GameRegistry.registerItem(BronzeIngot, SAMWINames.BronzeIngot);
		GameRegistry.registerItem(CopperIngot, SAMWINames.CopperIngot);
		GameRegistry.registerItem(ManaIngot, SAMWINames.ManaIngot);
		GameRegistry.registerItem(MithrilIngot, SAMWINames.MithrilIngot);
		GameRegistry.registerItem(RuneIngot, SAMWINames.RuneIngot);
		GameRegistry.registerItem(SiliconIngot, SAMWINames.SiliconIngot);
		GameRegistry.registerItem(SilverIngot, SAMWINames.SiliverIngot);
		GameRegistry.registerItem(StarSteelIngot, SAMWINames.StartSteelIngot);		
		GameRegistry.registerItem(SteelIngot, SAMWINames.SteelIngot);
		GameRegistry.registerItem(TitaniumIngot, SAMWINames.TitaniumIngot);
		GameRegistry.registerItem(TinIngot, SAMWINames.TinIngot);

	}

	private static void LanguageReg() {
		LanguageRegistry.addName(AdamantiumIngot, SAMWINames.AdamantiumIngot);
		LanguageRegistry.addName(BronzeIngot, SAMWINames.BronzeIngot);
		LanguageRegistry.addName(CopperIngot, SAMWINames.CopperIngot);
		LanguageRegistry.addName(ManaIngot, SAMWINames.ManaIngot);
		LanguageRegistry.addName(MithrilIngot, SAMWINames.MithrilIngot);
		LanguageRegistry.addName(RuneIngot, SAMWINames.RuneIngot);
		LanguageRegistry.addName(SiliconIngot, SAMWINames.SiliconIngot);
		LanguageRegistry.addName(SilverIngot, SAMWINames.SiliverIngot);
		LanguageRegistry.addName(StarSteelIngot, SAMWINames.StartSteelIngot);
		LanguageRegistry.addName(SteelIngot, SAMWINames.SteelIngot);
		LanguageRegistry.addName(TitaniumIngot, SAMWINames.TitaniumIngot);
		LanguageRegistry.addName(TinIngot, SAMWINames.TinIngot);
		
	}

	private static void MetaItems() {
		/* Axe head */
		 for(int i = 0; i < SAMWINames.AXEHEAD_META_NAME.length; i++){
			 LanguageRegistry.addName(new ItemStack(AxeHead, 1, i),SAMWINames.AXEHEAD_META_NAME[i]);
		 }
		/* Pickaxe head */
		for (int i = 0; i < SAMWINames.PAXEHEAD_META_NAME.length; i++){
			LanguageRegistry.addName(new ItemStack(PickaxeHead, 1, i), SAMWINames.PAXEHEAD_META_NAME[i]);
		}
		/* Gems */
		for (int i = 0; i < SAMWINames.GEM_META_NAME.length; i++) {
			LanguageRegistry.addName(new ItemStack(Gem, 1, i), SAMWINames.GEM_META_NAME[i]);
		}
		/* Molds */
		for (int i = 0; i < SAMWINames.MOLD_META_NAME.length; i++) {
			LanguageRegistry.addName(new ItemStack(Mold, 1, i), SAMWINames.MOLD_META_NAME[i]);
		}
		/* Blade */
		for (int i = 0; i < SAMWINames.BLADE_META_NAME.length; i++) {
			LanguageRegistry.addName(new ItemStack(Blade, 1, i), SAMWINames.BLADE_META_NAME[i]);
		}
		/* Simple Tools */
		for (int i = 0; i < SAMWINames.SIMPTOOL_META_NAME.length; i++) {
			LanguageRegistry.addName(new ItemStack(Simptool, 1, i), SAMWINames.SIMPTOOL_META_NAME[i]);
		}
		/* Shovel Head*/
		for (int i = 0; i < SAMWINames.SHOVHEAD_META_NAME.length; i++){
			LanguageRegistry.addName(new ItemStack(ShovelHead, 1, i), SAMWINames.SHOVHEAD_META_NAME[i]);
		}

	}

}
