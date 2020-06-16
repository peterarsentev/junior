package ru.job4j.synch;

import net.jcip.annotations.ThreadSafe;

import java.util.Iterator;

@ThreadSafe
public class SingleLockList<T> implements Iterable<T> {

    public void add(T value) {
    }

    public T get(int index) {
        return null;
    }


    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
