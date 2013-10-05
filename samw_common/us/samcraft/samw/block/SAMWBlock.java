package us.samcraft.samw.block;

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
	public static Block oreTitanium;
	public static Block oreWonderflonium;
	
	public static void init(){
		
		/*Ores*/
		oreAdamantium = new BlockoreAdamantium(BlockID.ADAMANTUM_ORE);
		oreCopper = new BlockoreCoppere(BlockID.COPPER_ORE);
		oreMithril = new BlockoreMithril(BlockID.MITHRIL_ORE);
		oreOrichalcum = new BlockoreOrichalcum(BlockID.ORICHALCUM_ORE);
		oreRune = new BlockoreRune(BlockID.RUNE_ORE);
		oreSilicon = new BlockoreSilicon(BlockID.SILICON_ORE);
		oreSiliver = new BlockoreSiliver(BlockID.SILIVER_ORE_DEFAULT); 
		oreTitanium = new BlockoreTitanium(BlockID.SILIVER_ORE);
		oreWonderflonium = new BlockoreWonderflonium(BlockID.WONDERFLONIUM_ORE);
		// TODO work more on blocks 
	}
}
