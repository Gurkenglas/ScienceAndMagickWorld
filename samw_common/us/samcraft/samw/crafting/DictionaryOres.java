package us.samcraft.samw.crafting;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import us.samcraft.samw.block.SAMWBlock;

/**
 * @author Anthony Anderson(LordIlloyhs)
 *
 */
public class DictionaryOres {
	
	public static void init(){
		OreDictionary.registerOre("oreCopper", new ItemStack(SAMWBlock.oreCopper));
		OreDictionary.registerOre("oreSilicon", new ItemStack(SAMWBlock.oreSilicon));
		OreDictionary.registerOre("oreSiliver", new ItemStack(SAMWBlock.oreSiliver));
		OreDictionary.registerOre("oreTin", new ItemStack(SAMWBlock.oreTin));
		OreDictionary.registerOre("oreTitanium", new ItemStack(SAMWBlock.oreTitanium));
		
	}	
}
