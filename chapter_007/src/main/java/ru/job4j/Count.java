package ru.job4j;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

import java.util.concurrent.locks.ReentrantLock;

public class Count {
    private int value;

    public void increment() {
        this.value++;
    }

    public int get() {
        return this.value;
    }
}
