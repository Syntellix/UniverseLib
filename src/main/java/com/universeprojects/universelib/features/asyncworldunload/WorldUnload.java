package com.universeprojects.universelib.features.asyncworldunload;

import org.bukkit.World;

import java.util.concurrent.CompletableFuture;

public interface WorldUnload {
    default CompletableFuture<Boolean> unloadWorldAsync(World world) {
        return unloadWorldAsync(world, true);
    }

    CompletableFuture<Boolean> unloadWorldAsync(World world, boolean save);
}
