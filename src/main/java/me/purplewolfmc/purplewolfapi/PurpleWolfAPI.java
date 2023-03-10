package me.purplewolfmc.purplewolfapi;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;

public final class PurpleWolfAPI extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
// Plugin startup logic
        if (getServer().getPluginManager().getPlugin("GenesisMC") == null) {
            getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "[PurpleWolfAPI]              ____");
            getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "[PurpleWolfAPI]  ___        |    |   ___  [*]");
            getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "[PurpleWolfAPI] |   | | | | |    |  |   |");
            getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "[PurpleWolfAPI] |___| | | | |____|  |___|  |");
            getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "[PurpleWolfAPI] |     | | | |    |  |      |");
            getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "[PurpleWolfAPI] |     |_|_| |    |  |      |");
            getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "[PurpleWolfAPI] |           |    |  |      |");
            getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "[PurpleWolfAPI] |                   |");
            getServer().getConsoleSender().sendMessage(ChatColor.GRAY + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            if (this.getConfig().getString("console-dump-onstartup").equalsIgnoreCase("true")) {
                getServer().getConsoleSender().sendMessage(ChatColor.GRAY + "[PurpleWolfAPI] Loading API version 0.1.1");
                getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "[PurpleWolfAPI] DUMPING PLUGIN-API FILES:");
                getServer().getConsoleSender().sendMessage(ChatColor.GRAY + "Loading config file:" +
                        this.getConfig().getValues(Boolean.parseBoolean("all")));
                getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "[PurpleWolfAPI] Loading API");
                getServer().getConsoleSender().sendMessage(ChatColor.GRAY + "[PurpleWolfAPI] DUMPING SERVER FILES:" +
                        getServer().getVersion() +
                        getServer().getAllowEnd() +
                        getServer().getAllowNether() +
                        getServer().getPluginManager() +
                        getServer().getMaxPlayers() +
                        getServer().getConnectionThrottle() +
                        getServer().getLogger() +
                        getServer().getName() +
                        getServer().getBukkitVersion() +
                        getServer().getDefaultGameMode() +
                        getServer().getWorldType() +
                        getServer().getResourcePack() +
                        getServer().getHelpMap() +
                        getServer().getPluginManager().getPlugins()
                );
            } else {
                getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[PurpleWolfAPI] Successfully loaded version 0.1.1-SNAPSHOT (1.19.3)");
            }
            getServer().getConsoleSender().sendMessage(ChatColor.GRAY + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            getServer().getPluginManager().registerEvents(this, this);

            this.saveDefaultConfig();

            Bukkit.getServer().getPluginManager().registerEvents(this, this);
            this.getConfig().options().copyDefaults(true);
            this.saveDefaultConfig();

        }else{
            //no startup code
        }
    }


    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage("[PurpleWolfAPI] Disabling PurpleWolfAPI");
    }
}
