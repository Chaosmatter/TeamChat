package net.aquanite.teamchat.commands;

import net.aquanite.teamchat.TeamChat;
import net.md_5.bungee.BungeeCord;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class autoLoginCommand extends Command {
    public autoLoginCommand() {
        super("autologin");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        ProxiedPlayer p = (ProxiedPlayer) sender;
        if(p.hasPermission("tc.autologincmd")) {
            if(args.length == 0) {
                if(p.hasPermission("tc.autologin")) {
                    BungeeCord.getInstance().getPluginManager().dispatchCommand(BungeeCord.getInstance().getConsole(), "bungeeperms user " + sender.getName() + " remove tc.autologin");
                    p.sendMessage(TeamChat.prefix + "§7Du hast den Autologin §cdeaktiviert§7!");
                } else {
                    BungeeCord.getInstance().getPluginManager().dispatchCommand(BungeeCord.getInstance().getConsole(), "bungeeperms user " + sender.getName() + " add tc.autologin");
                    p.sendMessage(TeamChat.prefix + "§7Du hast den Autologin §2aktiviert§7!");
                }
            } else {
                p.sendMessage(TeamChat.prefix + "§7Bitte nutze §e/autologin§7.");
            }
        } else {
            p.sendMessage(TeamChat.noperms);
        }
    }
}
