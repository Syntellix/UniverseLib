package com.universeprojects.universelib.environment.impl;

import com.universeprojects.universelib.environment.Environment;
import com.universeprojects.universelib.features.asyncworldunload.SyncWorldUnload;
import com.universeprojects.universelib.features.worldthread.SyncWorldThread;

public class NormalEnvironment extends Environment {
    public NormalEnvironment() {
        this.worldThread = new SyncWorldThread();
        this.worldUnload = new SyncWorldUnload();
    }

    @Override
    public boolean isUniverse() {
        return false;
    }
}
