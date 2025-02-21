package com.universeprojects.universelib.environment.impl;

import com.universeprojects.universelib.environment.Environment;
import com.universeprojects.universelib.features.asyncworldunload.AsyncWorldUnload;
import com.universeprojects.universelib.features.worldthread.AsyncWorldThread;

public class UniverseEnvironment extends Environment {
    public UniverseEnvironment() {
        this.worldThread = new AsyncWorldThread();
        this.worldUnload = new AsyncWorldUnload();
    }

    @Override
    public boolean isUniverse() {
        return true;
    }
}
