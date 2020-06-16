package ru.job4j;

public final class Cache {
    private static Cache cache;

    private static synchronized Cache instOf() {
        if (cache == null) {
            cache = new Cache();
        }
        return cache;
    }
}
