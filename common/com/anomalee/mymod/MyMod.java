package com.anomalee.mymod;

import java.util.Random;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MyMod.MODID, name = MyMod.MODNAME, version = MyMod.VERSION, dependencies = MyMod.DEPENDENCIES)
public class MyMod {

	// Constants
	public static final String MODID = "mymod";
	public static final String MODNAME = "My Mod";
	public static final String VERSION = "@VERSION@";
	public static final String DEPENDENCIES = "required-after:forge@[13.19.1.2188,)";
	public static final String RESOURCE_PREFIX = MODID.toLowerCase() + ":"; // mymod:
	
	// Variables
	public static Random random = new Random();
	
	@Instance(MODID)
	public static MyMod instance;
	
	@SidedProxy(clientSide = "com.anomalee.mymod.ClientProxy", serverSide = "com.anomalee.mymod.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		proxy.init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
		proxy.postInit(event);
	}
}

