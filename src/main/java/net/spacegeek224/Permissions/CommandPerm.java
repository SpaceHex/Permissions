package net.spacegeek224.Permissions;                                                                                     
                                                                                                                         
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
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
                        
                } else if (args.length == 2) {
                  Player target = getPlayer(args[0]);
                  target.sendMessage("Someone says " + args[1]);
                  
                }
                return true;                                                                                            
        }
        public Player getPlayer(String s) {
             for (Player p1:Bukkit.getServer().getOnlinePlayers()) {
                     Bukkit.getLogger().info(p1.getDisplayName());
                     if (p1.getDisplayName() == s) {
                       return p1;
                     } else {
                       return Bukkit.getServer().getPlayer(s);
                     }
             }   
             
        }                                                                                                              
}  
