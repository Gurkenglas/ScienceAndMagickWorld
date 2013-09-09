package us.samcraft.samw.item;

import us.samcraft.samw.lib.INames;
import us.samcraft.samw.lib.ItemID;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

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
	public static Item StarSteel;
	public static Item Steel;
	
	public static void init() {
		
		Gem = new ItemGem(ItemID.GEM);
		Mold = new ItemMold(ItemID.MOLD);
		Blade = new ItemBlade(ItemID.BLADE);
		Simptool = new ItemSimpleTool(ItemID.SIMPTOOL);
//		AxeHead = new ItemAxeHead(ItemID.AXEHEAD);
		
		
		MetaItems();
		LanguageReg();
		GameReg();
				
	}

	private static void GameReg() {
		// TODO Auto-generated method stub
		
	}

	private static void LanguageReg() {
		// TODO Auto-generated method stub
		
	}

	private static void MetaItems() {
		/*Axe Head*/
//		for(int i = 0; i < INames.AXEHEAD_META_NAME.length; i++){
//			LanguageRegistry.addName(new ItemStack(AxeHead, 1, i), INames.AXEHEAD_META_NAME[i]);
//		}
		/*Gems*/
		for(int i = 0; i < INames.GEM_META_NAME.length; i++){
			LanguageRegistry.addName(new ItemStack(Gem, 1, i), INames.GEM_META_NAME[i]);
		}
		/*Molds*/
		for(int i = 0; i < INames.MOLD_META_NAME.length; i++){
			LanguageRegistry.addName(new ItemStack(Mold, 1, i), INames.MOLD_META_NAME[i]);
		}
		/*Blade*/
		for(int i = 0; i <INames.BLADE_META_NAME.length; i++){
			LanguageRegistry.addName(new ItemStack(Blade, 1, i), INames.BLADE_META_NAME[i]);
		}
		/*Simple Tools*/
		for(int i = 0; i <INames.SIMPTOOL_META_NAME.length; i++){
			LanguageRegistry.addName(new ItemStack(Simptool, 1, i), INames.SIMPTOOL_META_NAME[i]);			
		}
		
	}

}
