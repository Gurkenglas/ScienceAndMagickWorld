package us.samcraft.samw.block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import us.samcraft.samw.SAMWMain;
import us.samcraft.samw.lib.names.SAMWBNames;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class Ore extends Block {

	String path;

	public Ore(int id, String name, float hardness, String path, String dictname) {
		super(id, Material.rock);
		setCreativeTab(SAMWMain.tabsamw);
		setUnlocalizedName(SAMWBNames.oreAdamantium);
		this.path = path;
		SAMWBlock.ores.put(name,this);
		GameRegistry.registerBlock(this, name);
		LanguageRegistry.addName(this, name);
		if(dictname!="")
			OreDictionary.registerOre(dictname, new ItemStack(this));

		setHardness(hardness);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister reg) {
		blockIcon = reg.registerIcon(path);
	}

}
