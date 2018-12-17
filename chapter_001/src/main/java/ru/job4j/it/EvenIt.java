package ru.job4j.it;

import java.util.Iterator;

public class EvenIt implements Iterator<Integer> {
    private final int[] values;

    public EvenIt(final int[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Integer next() {
        return null;
    }
}
