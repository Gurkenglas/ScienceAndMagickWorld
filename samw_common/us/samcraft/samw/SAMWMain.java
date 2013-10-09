package us.samcraft.samw;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;
import us.samcraft.samw.block.SAMWBlock;
import us.samcraft.samw.configuration.ConfigurationHandler;
import us.samcraft.samw.crafting.SAMWCrafting;
import us.samcraft.samw.crafting.Smelting;
import us.samcraft.samw.creativetab.CreativeTabWorld;
import us.samcraft.samw.item.SAMWItem;
import us.samcraft.samw.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(
	modid = Reference.MOD_ID, 
	name = Reference.MOD_NAME, 
	version = Reference.MOD_VERSION
	)
@NetworkMod(
	clientSideRequired = true, 
	serverSideRequired = false
			)
public class SAMWMain {
	
	@Instance(Reference.MOD_ID)
	public static SAMWMain instance;
	
	public static CreativeTabs tabsamw = new CreativeTabWorld(Reference.MOD_NAME);
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		ConfigurationHandler.init(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + "Science&Magick" + File.separator + "Science&MagickWorld" + ".cfg"));
		
		/* Hate putting this in my main class will move this later */
		LanguageRegistry.instance().addStringLocalization("itemGroup." + Reference.MOD_NAME, "en_US", Reference.MOD_NAME );
		
		SAMWBlock.init();
		SAMWItem.init();
		SAMWCrafting.init();
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		
	}
	
	@EventHandler	
	public static void postInit(FMLPostInitializationEvent event) {
		
	}

}
