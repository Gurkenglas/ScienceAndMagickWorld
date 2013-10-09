/**
 * All smelting recipes are in this class
 */
package us.samcraft.samw.crafting;

import net.minecraft.item.ItemStack;
import us.samcraft.samw.block.SAMWBlock;
import us.samcraft.samw.item.SAMWItem;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * @author Anthony
 *
 */
public class Smelting {
	
	public static void init(){
		GameRegistry.addSmelting(SAMWBlock.oreAdamantium.blockID, new ItemStack(SAMWItem.AdamantiumIngot), 0.7f);
		GameRegistry.addSmelting(SAMWBlock.oreCopper.blockID, new ItemStack(SAMWItem.CopperIngot), 0.3f);
		GameRegistry.addSmelting(SAMWBlock.oreMithril.blockID, new ItemStack(SAMWItem.MithrilIngot), 0.6f);
		GameRegistry.addSmelting(SAMWBlock.oreOrichalcum.blockID, new ItemStack(SAMWItem.AdamantiumIngot), 0.9f);
		GameRegistry.addSmelting(SAMWBlock.oreRune.blockID, new ItemStack(SAMWItem.RuneIngot), 0.7f);
		GameRegistry.addSmelting(SAMWBlock.oreSilicon.blockID, new ItemStack(SAMWItem.SiliconIngot), 0.4f);
		GameRegistry.addSmelting(SAMWBlock.oreSiliver.blockID, new ItemStack(SAMWItem.SilverIngot), 0.5f);
		GameRegistry.addSmelting(SAMWBlock.oreTin.blockID, new ItemStack(SAMWItem.TinIngot), 0.3f);
		GameRegistry.addSmelting(SAMWBlock.oreTitanium.blockID, new ItemStack(SAMWItem.TitaniumIngot), 0.9f);		
		
	}

}
