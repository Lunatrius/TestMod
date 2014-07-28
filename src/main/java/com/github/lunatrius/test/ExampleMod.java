package com.example.examplemod;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.entity.monster.EntitySlime;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "LunaTest";
    public static final String VERSION = "1.0";

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
        EntitySlime slime = new EntitySlime(null);
        slime.setSlimeSize(1); // protected in vanilla
        for (int i = 0; i < 10; i++) System.out.println("================================================");
        System.out.println("Set the slime size to 1! Yay!");
        for (int i = 0; i < 10; i++) System.out.println("================================================");
    }
}
