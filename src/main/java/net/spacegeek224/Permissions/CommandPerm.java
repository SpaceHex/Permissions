package net.spacegeek224.Permissions;                                                                                     
                                                                                                                         
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.Permission;
import org.bukkit.Bukkit;                                                                                                
import org.bukkit.ChatColor;                                                                                             
import org.bukkit.command.Command;                                                                                       
import org.bukkit.command.CommandExecutor;                                                                               
import org.bukkit.command.CommandSender;                                                                                
import org.bukkit.entity.Player;          
import org.bukkit.OfflinePlayer;
                                                                                                                         
public class CommandPerm implements CommandExecutor {                                                                    
        @Override                                                                                                        
        public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {                       
                
                //Player player = (Player) sender;
                if (args.length == 0) {
                        
                } else if (args.length == 4) {
                        if (args[0] == "user") {
                                if (args[2] == "add") {
                                        PermissionAttachment attachment = getPlayer(args[1]).addAttachment(Main.getPlugin());
                                        attachment.setPermission(new Permission(args[3]),true);
                                        getPlayer(args[1]).recalculatePermissions();
                                }
                        }
                  
                }
                return true;                                                                                            
        }
        public Player getPlayer(String s) {
          Player p = null;
             for (Player p1:Bukkit.getServer().getOnlinePlayers()) {
                     Bukkit.getLogger().info(p1.getDisplayName());
                     if (p1.getDisplayName() == s) {
                       p = p1;
                     } else {
                       p = Bukkit.getServer().getPlayer(s);
                     }
             }   
             return p;
        }                                                                                                              
}  
