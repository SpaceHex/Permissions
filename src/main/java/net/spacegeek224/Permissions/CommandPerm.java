package net.spacegeek224.Permissions;                                                                                     
                                                                                                                         
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
                  @SuppressWarnings("deprecation")
                  Player target = getPlayerByName(args[0]);
                  target.sendMessage("Someone says " + args[1]);
                  
                }
                return true;                                                                                            
        }          
        Player getPlayerByName(String playerName) {
        Player playerToReturn = null;
        for(int i = 0; i < Bukkit.getServer().getOnlinePlayers().toArray().length; i++) {
            if(Bukkit.getServer().getOnlinePlayers().toArray()[i].getName().equalsIgnoreCase(playerName)) {
                playerToReturn = Bukkit.getServer().getOnlinePlayers().toArray()[i];
                break;
            }
        }
        return playerToReturn;
    }
 
    OfflinePlayer getOfflinePlayerByName(String playerName) {
        OfflinePlayer playerToReturn = null;
        for(int i = 0; i < Bukkit.getServer().getOfflinePlayers().toArray().length; i++) {
            if(Bukkit.getServer().getOfflinePlayers().toArray()[i].getName().equalsIgnoreCase(playerName)) {
                playerToReturn = Bukkit.getServer().getOfflinePlayers().toArray()[i];
                break;
            }
        }
        return playerToReturn;
    }
                                                                                                                         
}  
