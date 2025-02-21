package com.universeprojects.universelib.features.worldthread;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.plugin.Plugin;

public class SyncWorldThread implements WorldThread {
    @Override
    public void runTaskInWorldThread(Plugin plugin, World world, Runnable task) {
        task.run();
    }
}
