package us.samcraft.samw.block;

import java.util.HashMap;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import us.samcraft.samw.block.clear.BlockdecClearRock;
import us.samcraft.samw.lib.id.SAMWBlockID;
import us.samcraft.samw.lib.names.SAMWBNames;
import net.minecraft.block.Block;

/**
 * @author Anthony Anderson(LordIlloyhs)
 *
 */
public class SAMWBlock {
	
	public static HashMap<String,Ore> ores=new HashMap<String,Ore>();
	
	public static Block decClearRock;
	
	public static Block Leaves;
	
	public static void init() {
		decClearRock = new BlockdecClearRock(SAMWBlockID.CLEAR_DEC);
		
		//Leaves = new BlockLeaves(SAMWBlockID.LEAVES);
		
		GameReg();
		LangReg();
		MetaBlock();
		
	}
	
	private static void MetaBlock() {
		
		
	}

	private static void GameReg() {
		//GameRegistry.registerBlock(Leaves, SAMWBNames.LEAVES);
		GameRegistry.registerBlock(decClearRock, SAMWBNames.decClearRock);
		
	}

	private static void LangReg() {
		LanguageRegistry.addName(decClearRock, SAMWBNames.decClearRock);
		
	}

}
