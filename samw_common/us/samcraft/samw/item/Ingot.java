package us.samcraft.samw.item;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import us.samcraft.samw.SAMWMain;
import us.samcraft.samw.block.Ore;
import us.samcraft.samw.lib.textures.ModItemIcons;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class Ingot extends Item {

	String path;
	
	public Ingot(int id, String name, String path, String dictname) {
		super(id);
		setCreativeTab(SAMWMain.tabsamwi);
		setUnlocalizedName(name);
		this.path=path;
		SAMWItem.ingots.put(name,this);
		GameRegistry.registerItem(this, name);
		LanguageRegistry.addName(this, name);
		if(dictname!="")
			OreDictionary.registerOre(dictname, new ItemStack(this));
	}
	
	public Ingot(int id, String name, String path, String dictname, String oredictname, int oreid, String orename, float orehardness, String orepath, float smeltxp) {
		this(id, name, path, dictname);
		Ore ore=new Ore(oreid,orename,orehardness,orepath,oredictname);
		GameRegistry.addSmelting(ore.blockID, new ItemStack(this), smeltxp);
	}
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister reg) {
		this.itemIcon = reg.registerIcon(path);
	}
	
}
