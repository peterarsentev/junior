package ru.job4j.index;

import java.util.Collections;
import java.util.Set;

public final class WordIndex {
    private final String text;

    public WordIndex(final String text) {
        this.text = text;
    }

    public final Set<Integer> indexOf(final String word) {
        return Collections.emptySet();
    }
}
