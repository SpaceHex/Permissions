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
                  @SuppressWarnings("deprecation")
                  Player target = getPlayerByName(args[0]);
                  target.sendMessage("Someone says " + args[1]);
                  
                }
                return true;                                                                                            
        }          
      Player getPlayerByName(String playerName) {
         List<Player> players = Arrays.asList(Bukkit.getServer().getOnlinePlayers());
        Player playerToReturn = null;
        for(int i = 0; i < players.size(); i++) {
            if(players[i].getName().equalsIgnoreCase(playerName)) {
                playerToReturn = players[i];
                break;
            }
        }
        return playerToReturn;
    }
 
    OfflinePlayer getOfflinePlayerByName(String playerName) {
        OfflinePlayer playerToReturn = null;
        for(int i = 0; i < Bukkit.getServer().getOfflinePlayers().length; i++) {
            if(Bukkit.getServer().getOfflinePlayers()[i].getName().equalsIgnoreCase(playerName)) {
                playerToReturn = Bukkit.getServer().getOfflinePlayers()[i];
                break;
            }
        }
        return playerToReturn;
    }
                                                                                                                         
}  
