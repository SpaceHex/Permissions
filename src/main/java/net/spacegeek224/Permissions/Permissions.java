package net.spacegeek224.Permissions;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.configuration.file.FileConfiguration;

public class Main extends JavaPlugin implements Listener {
	public FileConfiguration config = getConfig();
	private static Plugin plugin;
	@Override
	public void onEnable() {
		plugin = this;
		getServer().getPluginManager().registerEvents(this, this); 
		registerEvents(this,new PlayerJoin());
		config.addDefault("server-name","My Server");
		config.options().copyDefaults(true);
		saveConfig();
		getLogger().info(ChatColor.GREEN + "Plugin enabled!");
		// getCommand("help").setExecutor(new CommandHelp()); 
		getCommand("perm").setExecutor(new CommandPerm()); 
	}
	
	@Override
	public void onDisable() {
		plugin = null;
		getLogger().info(ChatColor.RED + "Plugin disabled!");
	}
	
	public static void registerEvents(org.bukkit.plugin.Plugin plugin,                                               
                        Listener... listeners) {                                                                         
                for (Listener listener : listeners) {                                                                    
                        Bukkit.getServer().getPluginManager()                                                            
                                        .registerEvents(listener, plugin);                                               
                }                                                                                                        
        } 
	public static Plugin getPlugin() {
		return plugin;
	}
	
}
