package com.universeprojects.universelib.features.worldthread;

import org.bukkit.World;
import org.bukkit.plugin.Plugin;

public class AsyncWorldThread implements WorldThread {
    @Override
    public void runTaskInWorldThread(Plugin plugin, World world, Runnable task) {
        if (world == null) {
            throw new IllegalArgumentException("Entity cannot be null");
        }

        if (task == null) {
            throw new IllegalArgumentException("Task cannot be null");
        }

        world.runTaskInWorldThread(task);
    }
}
