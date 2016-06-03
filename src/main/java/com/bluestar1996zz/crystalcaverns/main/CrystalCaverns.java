package com.bluestar1996zz.crystalcaverns.main;

import com.bluestar1996zz.crystalcaverns.proxies.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CrystalCaverns.MODID, name = CrystalCaverns.MODNAME, version = CrystalCaverns.VERSION)
public class CrystalCaverns {

    public static final String MODID = "crystalcaverns";
    public static final String MODNAME = "Crystal Caverns";
    public static final String VERSION = "1.0.0";

    @Instance
    public static CrystalCaverns instance = new CrystalCaverns();

    @SidedProxy(clientSide="com.bluestar1996zz.crystalcaverns.ClientProxy", serverSide="com.bluestar1996zz.crystalcaverns.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    }
}
