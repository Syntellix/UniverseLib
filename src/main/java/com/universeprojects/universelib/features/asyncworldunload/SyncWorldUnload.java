package com.universeprojects.universelib.features.asyncworldunload;

import org.bukkit.Bukkit;
import org.bukkit.World;

import java.util.concurrent.CompletableFuture;

public class SyncWorldUnload implements WorldUnload {
    @Override
    public CompletableFuture<Boolean> unloadWorldAsync(World world, boolean save) {
        if (world == null) {
            throw new IllegalArgumentException("World cannot be null");
        }

        return CompletableFuture.completedFuture(Bukkit.unloadWorld(world, save));
    }
}
