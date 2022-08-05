package auction.bunnynetwork;

import org.bukkit.plugin.java.JavaPlugin;

public final class Bunnynetwork extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.print("플러그인 활성화됨");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.print("플러그인 비활성화됨");
    }
}
