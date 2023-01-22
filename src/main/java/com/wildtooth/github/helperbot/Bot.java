package com.wildtooth.github.helperbot;

import lombok.Getter;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import org.jetbrains.annotations.NotNull;

public class Bot {
    private final Main plugin;
    @Getter
    private JDA jda;

    public Bot(@NotNull Main plugin) {
        this.plugin = plugin;
        start();
    }

    private void start() {
        jda = JDABuilder.createDefault(plugin.getConfig().getString("token"))
                .build();
    }
}
