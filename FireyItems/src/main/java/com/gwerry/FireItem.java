package com.gwerry;

import org.bukkit.plugin.java.JavaPlugin;

public class FireItem extends JavaPlugin {
    private CheckItems checkItems;
    @Override
    public void onEnable(){
        checkItems = new CheckItems();
        checkItems.start();
    }
    @Override
    public void onDisable(){
        checkItems.finishTask();
    }
}
