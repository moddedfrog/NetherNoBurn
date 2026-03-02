package me.frog.netherNoBurn;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class NetherNoBurn extends JavaPlugin {

    @Override
    public void onEnable() {
        // Register events
        getServer().getPluginManager().registerEvents(new events(), this);
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "NetherNoBurn Enabled");
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "NetherNoBurn Disabled");
    }
}

