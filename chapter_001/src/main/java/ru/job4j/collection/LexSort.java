package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String rigth) {
        return left.compareTo(rigth);
    }
}
