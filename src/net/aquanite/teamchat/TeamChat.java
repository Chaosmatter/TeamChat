package net.aquanite.teamchat;

import net.aquanite.teamchat.commands.tcCommand;
import net.aquanite.teamchat.listener.DisconnectListener;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Plugin;

import java.util.ArrayList;

public class TeamChat extends Plugin {


    private static TeamChat instance;

    public static String prefix = "§f§lTeamchat §8» ";
    public static String noperms = prefix + "§cDafür hast du keine Berechtigung.";
    public static ArrayList<ProxiedPlayer> login = new ArrayList<>();
    public static ArrayList<ProxiedPlayer> listed = new ArrayList<>();



    public void onEnable() {
        instance = this;
        System.out.println("Das Teamchat-System wurde hochgefahren und aktiviert!");
        this.getProxy().getPluginManager().registerCommand(this, new tcCommand());
        this.getProxy().getPluginManager().registerListener(this, new DisconnectListener());
    }

    public void onDisable() {
        System.out.println("Das Teamchat-System wurde heruntergefahren und deaktiviert!");
    }

    public static TeamChat getInstance() {
        return instance;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getNoperms() {
        return noperms;
    }

    public ArrayList<ProxiedPlayer> getLogin() {
        return login;
    }

    public ArrayList<ProxiedPlayer> getListed() {
        return listed;
    }
}
