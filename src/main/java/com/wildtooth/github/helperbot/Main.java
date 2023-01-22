package com.wildtooth.github.helperbot;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Getter
    private static Main instance;
    @Getter
    private Bot bot;

    @Override
    public void onEnable() {
        instance = this;
        // Plugin startup logic
        startBot();

    }

    public void startBot() {
        bot = new Bot(getInstance());
    }
}
