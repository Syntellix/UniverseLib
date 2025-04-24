package com.universeprojects.universelib.environment;

import com.universeprojects.universelib.features.asyncworldunload.WorldUnload;
import org.bukkit.World;

import java.util.concurrent.CompletableFuture;

public abstract class Environment {
    protected WorldUnload worldUnload;

    public CompletableFuture<Boolean> unloadWorldAsync(World world) {
        return worldUnload.unloadWorldAsync(world);
    }

    public abstract boolean isUniverse();
}
