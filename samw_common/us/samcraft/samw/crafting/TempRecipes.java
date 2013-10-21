package us.samcraft.samw.crafting;

import us.samcraft.samw.item.SAMWItem;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * @author Anthony Anderson(LordIlloyhs)
 *
 */
public class TempRecipes {

	public static void init() {
		
		/* There should be a way to loop through these meta items I'll do it later*/
		AxeHead();
		
	}

	private static void AxeHead() {

		GameRegistry.addShapedRecipe(new ItemStack(SAMWItem.AxeHead, 1), new Object[]{ " xx", "  X", "   ", 'x', SAMWItem.AdamantiumIngot });
		
	}

}
