package us.samcraft.samw.block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import us.samcraft.samw.lib.BNames;
import us.samcraft.samw.lib.BlockID;
import net.minecraft.block.Block;

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
		oreAdamantium = new BlockoreAdamantium(BlockID.ADAMANTUM_ORE);
		oreCopper = new BlockoreCopper(BlockID.COPPER_ORE);
		oreMithril = new BlockoreMithril(BlockID.MITHRIL_ORE);
		oreOrichalcum = new BlockoreOrichalcum(BlockID.ORICHALCUM_ORE);
		oreRune = new BlockoreRune(BlockID.RUNE_ORE);
		oreSilicon = new BlockoreSilicon(BlockID.SILICON_ORE);
		oreSiliver = new BlockoreSiliver(BlockID.SILIVER_ORE_DEFAULT); 
		oreTin = new BlockoreTin(BlockID.TIN_ORE);
		oreTitanium = new BlockoreTitanium(BlockID.SILIVER_ORE);
		oreWonderflonium = new BlockoreWonderflonium(BlockID.WONDERFLONIUM_ORE);
		Leaves = new BlockLeaves(BlockID.Leaves_DEFAULT);
		
		GameReg();
		LangReg();
		MetaBlock();
	}
	
	private static void MetaBlock() {
		
	}

	private static void GameReg() {
		GameRegistry.registerBlock(oreAdamantium, BNames.oreAdamantium);
		GameRegistry.registerBlock(oreCopper, BNames.oreCopper);
		GameRegistry.registerBlock(oreMithril, BNames.oreMithril);
		GameRegistry.registerBlock(oreOrichalcum, BNames.oreOrichalcum);
		GameRegistry.registerBlock(oreRune, BNames.oreRune);
		GameRegistry.registerBlock(oreSilicon, BNames.oreSilicon);
		GameRegistry.registerBlock(oreSiliver, BNames.oreSilver);
		GameRegistry.registerBlock(oreTin, BNames.oreTin);
		GameRegistry.registerBlock(oreTitanium, BNames.oreTitanium);
		GameRegistry.registerBlock(oreWonderflonium, BNames.oreWonderflonium);
		GameRegistry.registerBlock(Leaves, BNames.LEAVES);
		
	}

	private static void LangReg() {
		LanguageRegistry.addName(oreAdamantium, BNames.oreAdamantium);
		LanguageRegistry.addName(oreCopper, BNames.oreCopper);
		LanguageRegistry.addName(oreMithril, BNames.oreMithril);
		LanguageRegistry.addName(oreOrichalcum, BNames.oreOrichalcum);
		LanguageRegistry.addName(oreRune, BNames.oreRune);
		LanguageRegistry.addName(oreSilicon, BNames.oreSilicon);
		LanguageRegistry.addName(oreSiliver, BNames.oreSilver);
		LanguageRegistry.addName(oreTin, BNames.oreTin);
		LanguageRegistry.addName(oreTitanium, BNames.oreTitanium);
		LanguageRegistry.addName(oreWonderflonium, BNames.oreWonderflonium);
		
	}

}
