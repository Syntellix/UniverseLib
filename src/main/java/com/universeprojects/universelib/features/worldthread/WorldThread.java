package com.universeprojects.universelib.features.worldthread;

import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.plugin.Plugin;

public interface WorldThread {
    default void runTaskInWorldThread(Plugin plugin, Entity entity, Runnable task) {
        if (entity == null) {
            throw new IllegalArgumentException("Entity cannot be null");
        }

        runTaskInWorldThread(plugin, entity.getWorld(), task);
    };
    void runTaskInWorldThread(Plugin plugin, World world, Runnable task);
}
