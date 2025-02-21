package com.universeprojects.universelib.environment;

import com.universeprojects.universelib.features.asyncworldunload.WorldUnload;
import com.universeprojects.universelib.features.worldthread.WorldThread;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.plugin.Plugin;

import java.util.concurrent.CompletableFuture;

public abstract class Environment {
    protected WorldThread worldThread;
    protected WorldUnload worldUnload;

    public void runTaskInWorldThread(Plugin plugin, Entity entity, Runnable task) {
        worldThread.runTaskInWorldThread(plugin, entity, task);
    }

    public void runTaskInWorldThread(Plugin plugin, World world, Runnable task) {
        worldThread.runTaskInWorldThread(plugin, world, task);
    }

    public CompletableFuture<Boolean> unloadWorldAsync(World world) {
        return worldUnload.unloadWorldAsync(world);
    }

    public abstract boolean isUniverse();
}
