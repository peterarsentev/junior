package ru.job4j.api;

import java.util.stream.Stream;

public class IterIndex {
    public static void main(String[] args) {
        Stream.iterate(0, i -> i < 10, i -> i + 1)
                .map(v -> String.format(" %s", v))
                .forEach(System.out::print);
    }
}
