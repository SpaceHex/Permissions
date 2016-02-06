package net.spacegeek224.Permissions;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.permissions.PermissionAttachment;

public class PlayerJoin implements Listener {
  @EventHandler
  public void onPlayerJoin(PlayerJoinEvent event) {
    Player player = event.getPlayer();
    PermissionAttachment attachment = player.addAttachment(net.spacegeek224.Permissions.Main.getPlugin());
    attachment.setPermission("rank.admin",false);
    attachment.setPermission("rank.mod",true);
  }
}
