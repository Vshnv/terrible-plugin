package dev.jaims.terribleplugin;

import dev.jaims.terribleplugin.listener.NotSuspiciousJoinListener;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import dev.jaims.terribleplugin.cmd.CmdHello;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public class Main extends JavaPlugin{
    public static @Nullable @NotNull Main instance;
    public void onLoad(){    }
    public void onEnable(){
        for(@NotNull int i = 0; i < 10; i++){
            System.out.println(" ");
        }
        System.out.println("The worst plugin is loading!");
        instance=this;
        getCommand("hello").setExecutor(new CmdHello());
        getServer().getPluginManager().registerEvents(new NotSuspiciousJoinListener(),this);
        System.out.println("The worst plugin has loaded!");
        for(@NotNull int i = 0; i < 10; i++){
            System.out.println(" ");
        }
        for(@NotNull int i = 0; i < 20; i++){
            System.out.println("Oops! Looks like something's gone wrong here!");
            new RuntimeException("I'm an error! Woohoo!").printStackTrace();
        }
        System.out.println("Just kidding!");
        System.out.println("i forgot how to use the logger");
    }
    public void onDisable() {}
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args){
        if(command.getName().equalsIgnoreCase("command")){
            Player player=(Player) sender;
            ((Player)player).sendMessage("§eHello "+ChatColor.GOLD+":D");
        }
        return false;
    }
    void registerCommands(){
        getCommand("hello").setExecutor(new CmdHello());
    }
}
