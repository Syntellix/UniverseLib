package com.universeprojects.universelib.util;

public final class ClassUtils {
    private ClassUtils() {}

    public static boolean hasClass(String className) {
        try {
            Class.forName(className);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }
}
