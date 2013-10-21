package us.samcraft.samw.block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import us.samcraft.samw.crafting.DictionaryOres;
import us.samcraft.samw.lib.SAMWBNames;
import us.samcraft.samw.lib.SAMWBlockID;
import net.minecraft.block.Block;

/**
 * @author Anthony Anderson(LordIlloyhs)
 *
 */
public class SAMWBlock {
	
	public static Block oreAdamantium;
	public static Block oreCopper;
	public static Block oreMithril;
	public static Block oreOrichalcum;
	public static Block oreRune;
	public static Block oreSilicon;
	public static Block oreSiliver;
	public static Block oreTin;
	public static Block oreTitanium;
	public static Block oreWonderflonium;
	public static Block Leaves;
	
	public static void init() {
		
		/*Ores*/
		oreAdamantium = new BlockoreAdamantium(SAMWBlockID.ADAMANTUM_ORE);
		oreCopper = new BlockoreCopper(SAMWBlockID.COPPER_ORE);
		oreMithril = new BlockoreMithril(SAMWBlockID.MITHRIL_ORE);
		oreOrichalcum = new BlockoreOrichalcum(SAMWBlockID.ORICHALCUM_ORE);
		oreRune = new BlockoreRune(SAMWBlockID.RUNE_ORE);
		oreSilicon = new BlockoreSilicon(SAMWBlockID.SILICON_ORE);
		oreSiliver = new BlockoreSiliver(SAMWBlockID.SILIVER_ORE_DEFAULT); 
		oreTin = new BlockoreTin(SAMWBlockID.TIN_ORE);
		oreTitanium = new BlockoreTitanium(SAMWBlockID.SILIVER_ORE);
		oreWonderflonium = new BlockoreWonderflonium(SAMWBlockID.WONDERFLONIUM_ORE);
		Leaves = new BlockLeaves(SAMWBlockID.LEAVES);
		
		GameReg();
		LangReg();
		MetaBlock();
		DictionaryOres.init();
		
	}
	
	private static void MetaBlock() {
		
		
	}

	private static void GameReg() {
		GameRegistry.registerBlock(oreAdamantium, SAMWBNames.oreAdamantium);
		GameRegistry.registerBlock(oreCopper, SAMWBNames.oreCopper);
		GameRegistry.registerBlock(oreMithril, SAMWBNames.oreMithril);
		GameRegistry.registerBlock(oreOrichalcum, SAMWBNames.oreOrichalcum);
		GameRegistry.registerBlock(oreRune, SAMWBNames.oreRune);
		GameRegistry.registerBlock(oreSilicon, SAMWBNames.oreSilicon);
		GameRegistry.registerBlock(oreSiliver, SAMWBNames.oreSilver);
		GameRegistry.registerBlock(oreTin, SAMWBNames.oreTin);
		GameRegistry.registerBlock(oreTitanium, SAMWBNames.oreTitanium);
		GameRegistry.registerBlock(oreWonderflonium, SAMWBNames.oreWonderflonium);
		GameRegistry.registerBlock(Leaves, SAMWBNames.LEAVES);
		
	}

	private static void LangReg() {
		LanguageRegistry.addName(oreAdamantium, SAMWBNames.oreAdamantium);
		LanguageRegistry.addName(oreCopper, SAMWBNames.oreCopper);
		LanguageRegistry.addName(oreMithril, SAMWBNames.oreMithril);
		LanguageRegistry.addName(oreOrichalcum, SAMWBNames.oreOrichalcum);
		LanguageRegistry.addName(oreRune, SAMWBNames.oreRune);
		LanguageRegistry.addName(oreSilicon, SAMWBNames.oreSilicon);
		LanguageRegistry.addName(oreSiliver, SAMWBNames.oreSilver);
		LanguageRegistry.addName(oreTin, SAMWBNames.oreTin);
		LanguageRegistry.addName(oreTitanium, SAMWBNames.oreTitanium);
		LanguageRegistry.addName(oreWonderflonium, SAMWBNames.oreWonderflonium);
		
	}

}
