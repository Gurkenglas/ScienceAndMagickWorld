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
		
		Gem = new ItemGem(ItemID.GEM_DEFAULT);
		Mold = new ItemMold(ItemID.MOLD_DEFAULT);
//		Simptool = new ItemSimpTools(ItemID.SIMPTOOL_DEFAULT);
		
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
		/*Gems*/
		for(int i = 0; i < INames.GEM_META_NAME.length; i++){
			LanguageRegistry.addName(new ItemStack(Gem, 1, i), INames.GEM_META_NAME[i]);
		}
		/*Molds*/
		for(int i = 0; i < INames.MOLD_META_NAME.length; i++){
			LanguageRegistry.addName(new ItemStack(Mold, 1, i), INames.MOLD_META_NAME[i]);
		}
		/*Simple Tools*/
//		for(int i = 0; i <INames.SIMPTOOL_META_NAME.length; i++){
//			LanguageRegistry.addName(new ItemStack(Simptool, 1, i), INames.MOLD_META_NAME[i]);
//		}
	}

}
