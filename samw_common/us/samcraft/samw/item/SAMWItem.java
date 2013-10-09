package us.samcraft.samw.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import us.samcraft.samw.lib.ITNames;
import us.samcraft.samw.lib.ItemID;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

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
		Gem = new ItemGem(ItemID.GEM);
		Mold = new ItemMold(ItemID.MOLD);
		Blade = new ItemBlade(ItemID.BLADE);
		Simptool = new ItemSimpleTool(ItemID.SIMPTOOL);
		AxeHead = new ItemAxeHead(ItemID.AXEHEAD);
		PickaxeHead = new ItemPickAxeHead(ItemID.PICKAXEHEAD);
		ShovelHead = new ItemShovelHead(ItemID.SHOVELHEAD);
		
		/*Regular items*/
		AdamantiumIngot = new ItemAdamantiumIngot(ItemID.ADAMANTIUM_INGOT);
		BronzeIngot = new ItemBronzeIngot(ItemID.BRONZE_INGOT);
		CopperIngot = new ItemCopperIngot(ItemID.COPPER_INGOT);
		ManaIngot = new ItemManaIngot(ItemID.MANA_INGOT);
		MithrilIngot = new ItemMithrilIngot(ItemID.MITHRIL_INGOT);
		OrichalcumIngot = new ItemOrichalcumIngot(ItemID.ORICHALCUM_INGOT);
		RuneIngot = new ItemRuneIngot(ItemID.RUNE_INGOT);
		SiliconIngot = new ItemSiliconIngot(ItemID.SILICON_INGOT);
		SilverIngot = new ItemSilverIngot(ItemID.SILVER_INGOT);
		StarSteelIngot = new ItemStarSteelIngot(ItemID.STARSTEEL_INGOT);
		SteelIngot = new ItemSteelIngot(ItemID.STEEL_INGOT);
		TinIngot = new ItemTinIngot(ItemID.TIN_INGOT);
		TitaniumIngot = new ItemTitaniumIngot(ItemID.TITANIUM_INGOT);

		MetaItems();
		LanguageReg();
		GameReg();
		
	}

	private static void GameReg() {
		GameRegistry.registerItem(AdamantiumIngot, ITNames.AdamantiumIngot);
		GameRegistry.registerItem(BronzeIngot, ITNames.BronzeIngot);
		GameRegistry.registerItem(CopperIngot, ITNames.CopperIngot);
		GameRegistry.registerItem(ManaIngot, ITNames.ManaIngot);
		GameRegistry.registerItem(MithrilIngot, ITNames.MithrilIngot);
		GameRegistry.registerItem(RuneIngot, ITNames.RuneIngot);
		GameRegistry.registerItem(SiliconIngot, ITNames.SiliconIngot);
		GameRegistry.registerItem(SilverIngot, ITNames.SiliverIngot);
		GameRegistry.registerItem(StarSteelIngot, ITNames.StartSteelIngot);		
		GameRegistry.registerItem(SteelIngot, ITNames.SteelIngot);
		GameRegistry.registerItem(TitaniumIngot, ITNames.TitaniumIngot);
		GameRegistry.registerItem(TinIngot, ITNames.TinIngot);

	}

	private static void LanguageReg() {
		LanguageRegistry.addName(AdamantiumIngot, ITNames.AdamantiumIngot);
		LanguageRegistry.addName(BronzeIngot, ITNames.BronzeIngot);
		LanguageRegistry.addName(CopperIngot, ITNames.CopperIngot);
		LanguageRegistry.addName(ManaIngot, ITNames.ManaIngot);
		LanguageRegistry.addName(MithrilIngot, ITNames.MithrilIngot);
		LanguageRegistry.addName(RuneIngot, ITNames.RuneIngot);
		LanguageRegistry.addName(SiliconIngot, ITNames.SiliconIngot);
		LanguageRegistry.addName(SilverIngot, ITNames.SiliverIngot);
		LanguageRegistry.addName(StarSteelIngot, ITNames.StartSteelIngot);
		LanguageRegistry.addName(SteelIngot, ITNames.SteelIngot);
		LanguageRegistry.addName(TitaniumIngot, ITNames.TitaniumIngot);
		LanguageRegistry.addName(TinIngot, ITNames.TinIngot);
		
	}

	private static void MetaItems() {
		/* Axe head */
		 for(int i = 0; i < ITNames.AXEHEAD_META_NAME.length; i++){
			 LanguageRegistry.addName(new ItemStack(AxeHead, 1, i),ITNames.AXEHEAD_META_NAME[i]);
		 }
		/* Pickaxe head */
		for (int i = 0; i < ITNames.PAXEHEAD_META_NAME.length; i++){
			LanguageRegistry.addName(new ItemStack(PickaxeHead, 1, i), ITNames.PAXEHEAD_META_NAME[i]);
		}
		/* Gems */
		for (int i = 0; i < ITNames.GEM_META_NAME.length; i++) {
			LanguageRegistry.addName(new ItemStack(Gem, 1, i), ITNames.GEM_META_NAME[i]);
		}
		/* Molds */
		for (int i = 0; i < ITNames.MOLD_META_NAME.length; i++) {
			LanguageRegistry.addName(new ItemStack(Mold, 1, i), ITNames.MOLD_META_NAME[i]);
		}
		/* Blade */
		for (int i = 0; i < ITNames.BLADE_META_NAME.length; i++) {
			LanguageRegistry.addName(new ItemStack(Blade, 1, i), ITNames.BLADE_META_NAME[i]);
		}
		/* Simple Tools */
		for (int i = 0; i < ITNames.SIMPTOOL_META_NAME.length; i++) {
			LanguageRegistry.addName(new ItemStack(Simptool, 1, i), ITNames.SIMPTOOL_META_NAME[i]);
		}
		/* Shovel Head*/
		for (int i = 0; i < ITNames.SHOVHEAD_META_NAME.length; i++){
			LanguageRegistry.addName(new ItemStack(ShovelHead, 1, i), ITNames.SHOVHEAD_META_NAME[i]);
		}

	}

}
