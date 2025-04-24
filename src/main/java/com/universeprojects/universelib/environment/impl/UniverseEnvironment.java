package com.universeprojects.universelib.environment.impl;

import com.universeprojects.universelib.environment.Environment;
import com.universeprojects.universelib.features.asyncworldunload.AsyncWorldUnload;

public class UniverseEnvironment extends Environment {
    public UniverseEnvironment() {
        this.worldUnload = new AsyncWorldUnload();
    }

    @Override
    public boolean isUniverse() {
        return true;
    }
}
