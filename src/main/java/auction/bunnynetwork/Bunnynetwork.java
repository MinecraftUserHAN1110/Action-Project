package auction.bunnynetwork;

import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Bunnynetwork extends JavaPlugin {

    private static PluginManager pm = null;
    public static boolean isProtocolLibLoaded;
    private static ProtocolManager protocolManager;

    public static PluginManager getPluginManager() {
        return pm;
    }

    public static ProtocolManager getProtocolManager() {
        return protocolManager;
    }
    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("------------------------------------------------------------");
        try {
            pm = Bukkit.getPluginManager();
            System.out.println(ChatColor.GREEN + "PluginManager 로드에 성공하였습니다!");
        } catch (Exception e) {
            System.out.println(ChatColor.RED + "PluginManager을 로드하지 못했습니다.");
        }
        try {
            protocolManager = ProtocolLibrary.getProtocolManager();
            System.out.println(ChatColor.GREEN + "ProtocolLib을 로드하였습니다!");
            isProtocolLibLoaded = true;
        } catch (Exception e) {
            isProtocolLibLoaded = false;
            System.out.println(ChatColor.RED + "ProtocolLib을 로드하지 못했습니다!");
        }
        System.out.println("------------------------------------------------------------");
        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println(ChatColor.GREEN + "플러그인 활성화됨");
        System.out.println("------------------------------------------------------------");
    }

    @Override
    public void onLoad() {
        System.out.println(ChatColor.YELLOW + "플러그인 로드됨");
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("------------------------------------------------------------");
        System.out.println(ChatColor.RED + "플러그인 비활성화됨");
        System.out.println("------------------------------------------------------------");
    }
}
