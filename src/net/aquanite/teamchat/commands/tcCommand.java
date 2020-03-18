package net.aquanite.teamchat.commands;

import net.aquanite.teamchat.TeamChat;
import net.md_5.bungee.BungeeCord;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class tcCommand extends Command {
    public tcCommand() {
        super("tc");
    }

    public void execute(final CommandSender sender, final String[] args) {
        if (sender instanceof ProxiedPlayer) {
            final ProxiedPlayer p = (ProxiedPlayer) sender;
            if (p.hasPermission("tc.see")) {
                if (args.length > 0) {
                    if (args[0].equalsIgnoreCase("login")) {
                        if (!TeamChat.getInstance().getLogin().contains(p)) {
                            for (final ProxiedPlayer all : BungeeCord.getInstance().getPlayers()) {
                                if (TeamChat.login.contains(all)) {
                                    if (p.hasPermission("rankcolor.4")) {
                                        all.sendMessage(TeamChat.getInstance().getPrefix() + "§4" + p.getName() + " §7hat sich §aEINGELOGGT§7.");
                                    } else if (p.hasPermission("rankcolor.b")) {
                                        all.sendMessage(TeamChat.prefix + "§b" + p.getName() + " §7hat sich §aEINGELOGGT§7.");
                                    } else if (p.hasPermission("rankcolor.c")) {
                                        all.sendMessage(TeamChat.prefix + "§c" + p.getName() + " §7hat sich §aEINGELOGGT§7.");
                                    } else if (p.hasPermission("rankcolor.e")) {
                                        all.sendMessage(TeamChat.prefix + "§e" + p.getName() + " §7hat sich §aEINGELOGGT§7.");
                                    } else if (p.hasPermission("rankcolor.9")) {
                                        all.sendMessage(TeamChat.prefix + "§9" + p.getName() + " §7hat sich §aEINGELOGGT§7.");
                                    } else if (p.hasPermission("rankcolor.1")) {
                                        all.sendMessage(TeamChat.prefix + "§1" + p.getName() + " §7hat sich eingeloggt.");
                                    } else if (p.hasPermission("rankcolor.2")) {
                                        all.sendMessage(TeamChat.prefix + "§2" + p.getName() + " §7hat sich eingeloggt.");
                                    } else if (p.hasPermission("rankcolor.3")) {
                                        all.sendMessage(TeamChat.prefix + "§3" + p.getName() + " §7hat sich eingeloggt.");
                                    } else if (p.hasPermission("rankcolor.5")) {
                                        all.sendMessage(TeamChat.prefix + "§5" + p.getName() + " §7hat sich eingeloggt.");
                                    } else if (p.hasPermission("rankcolor.6")) {
                                        all.sendMessage(TeamChat.prefix + "§6" + p.getName() + " §7hat sich eingeloggt.");
                                    } else if (p.hasPermission("rankcolor.7")) {
                                        all.sendMessage(TeamChat.prefix + "§7" + p.getName() + " §7hat sich eingeloggt.");
                                    } else if (p.hasPermission("rankcolor.8")) {
                                        all.sendMessage(TeamChat.prefix + "§8" + p.getName() + " §7hat sich eingeloggt.");
                                    } else if (p.hasPermission("rankcolor.0")) {
                                        all.sendMessage(TeamChat.prefix + "§0" + p.getName() + " §7hat sich eingeloggt.");
                                    } else if (p.hasPermission("rankcolor.a")) {
                                        all.sendMessage(TeamChat.prefix + "§a" + p.getName() + " §7hat sich eingeloggt.");
                                    } else if (p.hasPermission("rankcolor.d")) {
                                        all.sendMessage(TeamChat.prefix + "§d" + p.getName() + " §7hat sich eingeloggt.");
                                    } else if (p.hasPermission("rankcolor.e")) {
                                        all.sendMessage(TeamChat.prefix + "§e" + p.getName() + " §7hat sich eingeloggt.");
                                    } else {
                                        all.sendMessage(TeamChat.prefix + "§f" + p.getName() + " §7hat sich eingeloggt.");
                                    }
                                } else {
                                    TeamChat.login.contains(all);
                                }
                            }
                            TeamChat.login.add(p);
                            p.sendMessage(TeamChat.prefix + "§7Du hast dich §aEINGELOGGT§7.");
                        } else if (TeamChat.login.contains(p)) {
                            p.sendMessage(TeamChat.prefix + "§7Du bist bereits §aeingeloggt§e.");
                        }
                    } else if (args[0].equalsIgnoreCase("logout")) {
                        if (TeamChat.login.contains(p)) {
                            TeamChat.login.remove(p);
                            p.sendMessage(TeamChat.prefix + "§7Du hast dich §cAUSGELOGGT§7.");
                            if (!TeamChat.login.contains(p)) {
                                for (final ProxiedPlayer all : BungeeCord.getInstance().getPlayers()) {
                                    if (TeamChat.login.contains(all)) {
                                        if (p.hasPermission("rankcolor.4")) {
                                            all.sendMessage(TeamChat.prefix + "§4" + p.getName() + " §7hat sich §cAUSGELOGGT§7.");
                                        } else if (p.hasPermission("rankcolor.b")) {
                                            all.sendMessage(TeamChat.prefix + "§b" + p.getName() + " §7hat sich §cAUSGELOGGT§7.");
                                        } else if (p.hasPermission("rankcolor.c")) {
                                            all.sendMessage(TeamChat.prefix + "§c" + p.getName() + " §7hat sich §cAUSGELOGGT§7.");
                                        } else if (p.hasPermission("rankcolor.e")) {
                                            all.sendMessage(TeamChat.prefix + "§e" + p.getName() + " §7hat sich §cAUSGELOGGT§7.");
                                        } else if (p.hasPermission("rankcolor.9")) {
                                            all.sendMessage(TeamChat.prefix + "§9" + p.getName() + " §7hat sich §cAUSGELOGGT§7.");
                                        } else if (p.hasPermission("rankcolor.1")) {
                                            all.sendMessage(TeamChat.prefix + "§1" + p.getName() + " §7hat sich §cAUSGELOGGT§7.");
                                        } else if (p.hasPermission("rankcolor.2")) {
                                            all.sendMessage(TeamChat.prefix + "§2" + p.getName() + " §7hat sich §cAUSGELOGGT§7.");
                                        } else if (p.hasPermission("rankcolor.3")) {
                                            all.sendMessage(TeamChat.prefix + "§3" + p.getName() + " §7hat sich §cAUSGELOGGT§7.");
                                        } else if (p.hasPermission("rankcolor.5")) {
                                            all.sendMessage(TeamChat.prefix + "§5" + p.getName() + " §7hat sich §cAUSGELOGGT§7.");
                                        } else if (p.hasPermission("rankcolor.6")) {
                                            all.sendMessage(TeamChat.prefix + "§6" + p.getName() + " §7hat sich §cAUSGELOGGT§7.");
                                        } else if (p.hasPermission("rankcolor.7")) {
                                            all.sendMessage(TeamChat.prefix + "§7" + p.getName() + " §7hat sich §cAUSGELOGGT§7.");
                                        } else if (p.hasPermission("rankcolor.8")) {
                                            all.sendMessage(TeamChat.prefix + "§8" + p.getName() + " §7hat sich §cAUSGELOGGT§7.");
                                        } else if (p.hasPermission("rankcolor.0")) {
                                            all.sendMessage(TeamChat.prefix + "§0" + p.getName() + " §7hat sich §cAUSGELOGGT§7.");
                                        } else if (p.hasPermission("rankcolor.e")) {
                                            all.sendMessage(TeamChat.prefix + "§e" + p.getName() + " §7hat sich §cAUSGELOGGT§7.");
                                        } else if (p.hasPermission("rankcolor.d")) {
                                            all.sendMessage(TeamChat.prefix + "§d" + p.getName() + " §7hat sich §cAUSGELOGGT§7.");
                                        } else if (p.hasPermission("rankcolor.a")) {
                                            all.sendMessage(TeamChat.prefix + "§a" + p.getName() + " §7hat sich §cAUSGELOGGT§7.");
                                        } else {
                                            all.sendMessage(TeamChat.prefix + "§7" + p.getName() + " §7hat sich §cAUSGELOGGT§7.");
                                        }
                                    } else {
                                        TeamChat.login.contains(all);
                                    }
                                }
                            }
                        } else if (!TeamChat.login.contains(p)) {
                            p.sendMessage(TeamChat.prefix + "§7Du bist bereits §causgeloggt§7.");
                        }
                    } else if (args[0].equalsIgnoreCase("help")) {
                        p.sendMessage("§8§m---------------§8=§f§lTeamchat§8=§8§m---------------");
                        p.sendMessage(TeamChat.prefix + "§dPlugin edited by Chaosmatter");
                        p.sendMessage(TeamChat.prefix + "§f§l/tc [Nachricht] §eSende eine Nachricht im Teamchat");
                        p.sendMessage(TeamChat.prefix + "§f§l/tc login/Logout §eLogge dich in den Teamchat ein/aus");
                        p.sendMessage(TeamChat.prefix + "§f§l/tc list §eZeige alle aktiven Teammitglieder und ihren");
                        p.sendMessage(TeamChat.prefix + "§f§l/tc add/remove list §eZeigt/Versteckt deinen Server in der Teamliste");
                        p.sendMessage("§8§m---------------§8=§f§lTeamchat§8=§8§m---------------");
                    } else if (args[0].equalsIgnoreCase("list")) {
                        if (TeamChat.login.contains(p)) {
                            p.sendMessage("");
                            p.sendMessage("§8§m---------------§8=§f§lTeamchat§8=§8§m---------------");
                            for (final ProxiedPlayer all : BungeeCord.getInstance().getPlayers()) {
                                if (TeamChat.login.contains(all)) {
                                    if (!TeamChat.listed.contains(all)) {
                                        p.sendMessage(TeamChat.prefix + "§7Der Spieler §a" + all.getName() + " §7ist §aeingeloggt §7auf: §a§l" + all.getServer().getInfo().getName());
                                    } else {
                                        p.sendMessage(TeamChat.prefix + "§7Der Spieler §a" + all.getName() + " §7ist §aeingeloggt §7auf: §a§lHIDDEN");
                                    }
                                }
                            }
                            p.sendMessage("§8§m---------------§8=§f§lTeamchat§8=§8§m---------------");
                        } else {
                            p.sendMessage(TeamChat.prefix + "§7Für diese Aktion musst du §aeingeloggt §7sein.");
                        }
                    } else if (args[0].equalsIgnoreCase("remove")) {
                        if (args[1].equalsIgnoreCase("list")) {
                            if (TeamChat.login.contains(p)) {
                                if (!TeamChat.listed.contains(p)) {
                                    if(!p.hasPermission("tc.removelist")) {
                                        p.sendMessage(TeamChat.noperms);
                                    } else {
                                        TeamChat.listed.add(p);
                                        p.sendMessage(TeamChat.prefix + " §7Dein §aaktueller Server §7ist nun im TeamChat §aversteckt§7!");
                                    }
                                } else {
                                    p.sendMessage(TeamChat.prefix + " §7Dein aktueller Server ist bereits versteckt!");
                                }
                            } else {
                                p.sendMessage(TeamChat.prefix + "§7Für diese Aktion musst du §aeingeloggt §7sein.");
                            }
                        }
                    } else if (args[0].equalsIgnoreCase("add")) {
                        if (args[1].equalsIgnoreCase("list")) {
                            if (TeamChat.login.contains(p)) {
                                if (TeamChat.listed.contains(p)) {
                                    if(!p.hasPermission("tc.addlist")) {
                                        p.sendMessage(TeamChat.noperms);
                                    } else {
                                        TeamChat.listed.remove(p);
                                        p.sendMessage(TeamChat.prefix + " §7Dein §aaktueller Server §7ist nun wieder im TeamChat §azu sehen§7!");
                                    }
                                } else {
                                    p.sendMessage(TeamChat.prefix + " §7Dein aktueller Server ist bereits zu sehen!");
                                }
                            } else {
                                p.sendMessage(TeamChat.prefix + "§7Für diese Aktion musst du §aeingeloggt §7sein.");
                            }
                        }
                    } else if (TeamChat.login.contains(p)) {
                        for (final ProxiedPlayer all : BungeeCord.getInstance().getPlayers()) {
                            if (all.hasPermission("tc.see")) {
                                if (TeamChat.login.contains(all)) {
                                    String nachricht = "";
                                    for (int i = 0; i < args.length; ++i) {
                                        nachricht = String.valueOf(nachricht) + " " + args[i];

                                    }
                                    if (p.hasPermission("rankcolor.4")) {
                                        all.sendMessage(TeamChat.prefix + "§4" + p.getName() + " §8» §7" + nachricht.replace("&", "§"));
                                    } else if (p.hasPermission("rankcolor.b")) {
                                        all.sendMessage(TeamChat.prefix + "§b" + p.getName() + " §8» §7" + nachricht.replace("&", "§"));
                                    } else if (p.hasPermission("rankcolor.c")) {
                                        all.sendMessage(TeamChat.prefix + "§c" + p.getName() + " §8» §7" + nachricht.replace("&", "§"));
                                    } else if (p.hasPermission("rankcolor.9")) {
                                        all.sendMessage(TeamChat.prefix + "§9" + p.getName() + " §8» §7" + nachricht.replace("&", "§"));
                                    } else if (p.hasPermission("rankcolor.1")) {
                                        all.sendMessage(TeamChat.prefix + "§1" + p.getName() + " §8» §7" + nachricht.replace("&", "§"));
                                    } else if (p.hasPermission("rankcolor.2")) {
                                        all.sendMessage(TeamChat.prefix + "§2" + p.getName() + " §8» §7" + nachricht.replace("&", "§"));
                                    } else if (p.hasPermission("rankcolor.3")) {
                                        all.sendMessage(TeamChat.prefix + "§3" + p.getName() + " §8» §7" + nachricht.replace("&", "§"));
                                    } else if (p.hasPermission("rankcolor.5")) {
                                        all.sendMessage(TeamChat.prefix + "§5" + p.getName() + " §8» §7" + nachricht.replace("&", "§"));
                                    } else if (p.hasPermission("rankcolor.6")) {
                                        all.sendMessage(TeamChat.prefix + "§6" + p.getName() + " §8» §7" + nachricht.replace("&", "§"));
                                    } else if (p.hasPermission("rankcolor.7")) {
                                        all.sendMessage(TeamChat.prefix + "§7" + p.getName() + " §8» §7" + nachricht.replace("&", "§"));
                                    } else if (p.hasPermission("rankcolor.8")) {
                                        all.sendMessage(TeamChat.prefix + "§8" + p.getName() + " §8» §7" + nachricht.replace("&", "§"));
                                    } else if (p.hasPermission("rankcolor.0")) {
                                        all.sendMessage(TeamChat.prefix + "§0" + p.getName() + " §8» §7" + nachricht.replace("&", "§"));
                                    } else if (p.hasPermission("rankcolor.a")) {
                                        all.sendMessage(TeamChat.prefix + "§a" + p.getName() + " §8» §7" + nachricht.replace("&", "§"));
                                    } else if (p.hasPermission("rankcolor.e")) {
                                        all.sendMessage(TeamChat.prefix + "§e" + p.getName() + " §8» §7" + nachricht.replace("&", "§"));
                                    } else if (p.hasPermission("rankcolor.d")) {
                                        all.sendMessage(TeamChat.prefix + "§d" + p.getName() + " §8» §7" + nachricht.replace("&", "§"));
                                    } else {
                                        all.sendMessage(TeamChat.prefix + "§f" + p.getName() + " §8» §7" + nachricht.replace("&", "§"));
                                    }
                                } else {
                                    TeamChat.login.contains(all);
                                }
                            }
                        }
                    } else if (!TeamChat.login.contains(p)) {
                        p.sendMessage(TeamChat.prefix + "§7Für diese Aktion musst du §aeingeloggt §7sein.");
                    }
                } else if (args.length == 0) {
                    p.sendMessage("§8§m---------------§8=§f§lTeamchat§8=§8§m---------------");
                    p.sendMessage(TeamChat.prefix + "§dPlugin edited by Chaosmatter");
                    p.sendMessage(TeamChat.prefix + "§f§l/tc [Nachricht] §eSende eine Nachricht im Teamchat");
                    p.sendMessage(TeamChat.prefix + "§f§l/tc login/Logout §eLogge dich in den Teamchat ein/aus");
                    p.sendMessage(TeamChat.prefix + "§f§l/tc list §eZeige alle aktiven Teammitglieder und ihren");
                    p.sendMessage(TeamChat.prefix + "§f§l/tc add/remove list §eZeigt/Versteckt deinen Server in der Teamliste");
                    p.sendMessage("§8§m---------------§8=§f§lTeamchat§8=§8§m---------------");
                }
            } else {
                p.sendMessage(TeamChat.noperms);
            }
        } else {
            sender.sendMessage("§cMust be a player!");
        }
    }
}
