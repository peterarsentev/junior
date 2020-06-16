package ru.job4j.api;

import java.util.stream.Stream;

public class SkipNull {
    public static void main(String[] args) {
        Stream.of(1, null, 2, null, 3)
                .flatMap(Stream::ofNullable)
                .map(v -> String.format(" %s", v))
                .forEach(System.out::print);
    }
}
