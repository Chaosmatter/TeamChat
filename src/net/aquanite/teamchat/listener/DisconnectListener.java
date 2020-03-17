package net.aquanite.teamchat.listener;

import net.aquanite.teamchat.TeamChat;
import net.md_5.bungee.BungeeCord;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.PlayerDisconnectEvent;
import net.md_5.bungee.api.event.PostLoginEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class DisconnectListener implements Listener {

    @EventHandler
    public void onJoin(PostLoginEvent e) {
        ProxiedPlayer p = e.getPlayer();
        if(p.hasPermission("tc.autologin")) {
            for (final ProxiedPlayer all : BungeeCord.getInstance().getPlayers()) {
                if (TeamChat.login.contains(all)) {
                    if(p.hasPermission("rankcolor.4")) {
                        all.sendMessage(TeamChat.prefix + "§4" + p.getName() + " §7hat sich eingeloggt.");
                    } else if(p.hasPermission("rankcolor.b")) {
                        all.sendMessage(TeamChat.prefix + "§b" + p.getName() + " §7hat sich eingeloggt.");
                    } else if(p.hasPermission("rankcolor.c")) {
                        all.sendMessage(TeamChat.prefix + "§c" + p.getName() + " §7hat sich eingeloggt.");
                    } else if(p.hasPermission("rankcolor.e")) {
                        all.sendMessage(TeamChat.prefix + "§e" + p.getName() + " §7hat sich eingeloggt.");
                    } else if(p.hasPermission("rankcolor.9")) {
                        all.sendMessage(TeamChat.prefix + "§9" + p.getName() + " §7hat sich eingeloggt.");
                    } else if(p.hasPermission("rankcolor.1")) {
                        all.sendMessage(TeamChat.prefix + "§1" + p.getName() + " §7hat sich eingeloggt.");
                    } else if(p.hasPermission("rankcolor.2")) {
                        all.sendMessage(TeamChat.prefix + "§2" + p.getName() + " §7hat sich eingeloggt.");
                    } else if(p.hasPermission("rankcolor.3")) {
                        all.sendMessage(TeamChat.prefix + "§3" + p.getName() + " §7hat sich eingeloggt.");
                    } else if(p.hasPermission("rankcolor.5")) {
                        all.sendMessage(TeamChat.prefix + "§5" + p.getName() + " §7hat sich eingeloggt.");
                    } else if(p.hasPermission("rankcolor.6")) {
                        all.sendMessage(TeamChat.prefix + "§6" + p.getName() + " §7hat sich eingeloggt.");
                    } else if(p.hasPermission("rankcolor.7")) {
                        all.sendMessage(TeamChat.prefix + "§7" + p.getName() + " §7hat sich eingeloggt.");
                    } else if(p.hasPermission("rankcolor.8")) {
                        all.sendMessage(TeamChat.prefix + "§8" + p.getName() + " §7hat sich eingeloggt.");
                    } else if(p.hasPermission("rankcolor.0")) {
                        all.sendMessage(TeamChat.prefix + "§0" + p.getName() + " §7hat sich eingeloggt.");
                    } else if(p.hasPermission("rankcolor.a")) {
                        all.sendMessage(TeamChat.prefix + "§a" + p.getName() + " §7hat sich eingeloggt.");
                    } else if(p.hasPermission("rankcolor.d")) {
                        all.sendMessage(TeamChat.prefix + "§d" + p.getName() + " §7hat sich eingeloggt.");
                    } else if(p.hasPermission("rankcolor.e")) {
                        all.sendMessage(TeamChat.prefix + "§e" + p.getName() + " §7hat sich eingeloggt.");
                    } else {
                        all.sendMessage(TeamChat.prefix + "§f" + p.getName() + " §7hat sich eingeloggt.");
                    }
                }
                else {
                    TeamChat.login.contains(all);
                }
            }
            TeamChat.login.add(p);
            p.sendMessage(TeamChat.prefix + "§7Du wurdest §aEINGELOGGT§7.");
        }
    }

    @EventHandler
    public void onDisconnect(PlayerDisconnectEvent e) {
        ProxiedPlayer p = e.getPlayer();
        if (TeamChat.login.contains(p)) {
            TeamChat.login.remove(p);
            for (final ProxiedPlayer all : BungeeCord.getInstance().getPlayers()) {
                if (TeamChat.login.contains(all)) {
                    if(p.hasPermission("rankcolor.4")) {
                        all.sendMessage(TeamChat.prefix + "§4" + p.getName() + " §7hat sich §cAUSGELOGGT§7.");
                    } else if(p.hasPermission("rankcolor.b")) {
                        all.sendMessage(TeamChat.prefix + "§b" + p.getName() + " §7hat sich §cAUSGELOGGT§7.");
                    } else if(p.hasPermission("rankcolor.c")) {
                        all.sendMessage(TeamChat.prefix + "§c" + p.getName() + " §7hat sich §cAUSGELOGGT§7.");
                    } else if(p.hasPermission("rankcolor.e")) {
                        all.sendMessage(TeamChat.prefix + "§e" + p.getName() + " §7hat sich §cAUSGELOGGT§7.");
                    } else if(p.hasPermission("rankcolor.9")) {
                        all.sendMessage(TeamChat.prefix + "§9" + p.getName() + " §7hat sich §cAUSGELOGGT§7.");
                    } else if(p.hasPermission("rankcolor.1")) {
                        all.sendMessage(TeamChat.prefix + "§1" + p.getName() + " §7hat sich §cAUSGELOGGT§7.");
                    } else if(p.hasPermission("rankcolor.2")) {
                        all.sendMessage(TeamChat.prefix + "§2" + p.getName() + " §7hat sich §cAUSGELOGGT§7.");
                    }  else if(p.hasPermission("rankcolor.3")) {
                        all.sendMessage(TeamChat.prefix + "§3" + p.getName() + " §7hat sich §cAUSGELOGGT§7.");
                    } else if(p.hasPermission("rankcolor.5")) {
                        all.sendMessage(TeamChat.prefix + "§5" + p.getName() + " §7hat sich §cAUSGELOGGT§7.");
                    } else if(p.hasPermission("rankcolor.6")) {
                        all.sendMessage(TeamChat.prefix + "§6" + p.getName() + " §7hat sich §cAUSGELOGGT§7.");
                    } else if(p.hasPermission("rankcolor.7")) {
                        all.sendMessage(TeamChat.prefix + "§7" + p.getName() + " §7hat sich §cAUSGELOGGT§7.");
                    } else if(p.hasPermission("rankcolor.8")) {
                        all.sendMessage(TeamChat.prefix + "§8" + p.getName() + " §7hat sich §cAUSGELOGGT§7.");
                    } else if(p.hasPermission("rankcolor.0")) {
                        all.sendMessage(TeamChat.prefix + "§0" + p.getName() + " §7hat sich §cAUSGELOGGT§7.");
                    } else if(p.hasPermission("rankcolor.e")) {
                        all.sendMessage(TeamChat.prefix + "§e" + p.getName() + " §7hat sich §cAUSGELOGGT§7.");
                    } else if(p.hasPermission("rankcolor.d")) {
                        all.sendMessage(TeamChat.prefix + "§d" + p.getName() + " §7hat sich §cAUSGELOGGT§7.");
                    } else if(p.hasPermission("rankcolor.a")) {
                        all.sendMessage(TeamChat.prefix + "§a" + p.getName() + " §7hat sich §cAUSGELOGGT§7.");
                    } else {
                        all.sendMessage(TeamChat.prefix + "§7" + p.getName() + " §7hat sich §cAUSGELOGGT§7.");
                    }
                }
            }
        }
        if (TeamChat.listed.contains(p)) {
            TeamChat.listed.remove(p);
        }
    }
}
