package com.universeprojects.universelib;

import com.universeprojects.universelib.environment.Environment;
import com.universeprojects.universelib.environment.impl.NormalEnvironment;
import com.universeprojects.universelib.environment.impl.UniverseEnvironment;
import com.universeprojects.universelib.util.ClassUtils;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.plugin.Plugin;

public final class UniverseLib {
    private UniverseLib() {}

    private static final Environment ENVIRONMENT = initialize();
    private static Environment initialize() {
        if (ClassUtils.hasClass("com.universeprojects.config.UniverseConfig")) {
            return new UniverseEnvironment();
        } else {
            return new NormalEnvironment();
        }
    }

    public static Environment getEnvironment() {
        return ENVIRONMENT;
    }

    public static void runTaskInWorldThread(Plugin plugin, Entity entity, Runnable task) {
        ENVIRONMENT.runTaskInWorldThread(plugin, entity, task);
    }

    public static void runTaskInWorldThread(Plugin plugin, World world, Runnable task) {
        ENVIRONMENT.runTaskInWorldThread(plugin, world, task);
    }

    public static boolean isUniverse() {
        return ENVIRONMENT.isUniverse();
    }
}
