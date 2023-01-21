package com.wildtooth.github.helperbot;

import org.bukkit.plugin.java.JavaPlugin;

public final class HelperBot extends JavaPlugin {

    private static HelperBot instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static HelperBot getInstance() {
        return instance;
    }
}
