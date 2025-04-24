package com.universeprojects.universelib.environment.impl;

import com.universeprojects.universelib.environment.Environment;
import com.universeprojects.universelib.features.asyncworldunload.SyncWorldUnload;

public class NormalEnvironment extends Environment {
    public NormalEnvironment() {
        this.worldUnload = new SyncWorldUnload();
    }

    @Override
    public boolean isUniverse() {
        return false;
    }
}
