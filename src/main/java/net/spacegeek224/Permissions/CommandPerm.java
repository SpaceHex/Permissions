package net.spacegeek224.Permissions;                                                                                     
                                                                                                                         
import org.bukkit.Bukkit;                                                                                                
import org.bukkit.ChatColor;                                                                                             
import org.bukkit.command.Command;                                                                                       
import org.bukkit.command.CommandExecutor;                                                                               
import org.bukkit.command.CommandSender;                                                                                
import org.bukkit.entity.Player;                                                                                         
                                                                                                                         
public class CommandPerm implements CommandExecutor {                                                                    
        @Override                                                                                                        
        public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {                       
                
                //Player player = (Player) sender;
                if (args.length == 0) {
                        
                } else if (args.length == 4) {
                  for (Player on:Bukkit.getOnlinePlayers()) {
                    sender.sendMessage(on.getDisplayName());
                  }
                }
                return true;                                                                                            
        }                                                                                                                
                                                                                                                         
}  
