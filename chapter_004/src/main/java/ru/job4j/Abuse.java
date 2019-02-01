package ru.job4j;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Abuse {
    public static void main(String[] args) {
//        System.out.println(
//                List.of(1, 1, 2, 2).stream().distinct().collect(
//                        Collectors.toMap(
//                                e -> e,
//                                e -> e * e
//                        ))
//        );
//
//        List<List<Integer>> matrix = List.of(
//                List.of(1, 2),
//                List.of(3, 4)
//        );
//
//        System.out.println(
//                matrix.stream().flatMap(e -> e.stream()).collect(Collectors.toList())
//        );
        String value = List.of("Hello,", "user", "test").stream().collect(Collectors.joining(" "));
//        System.out.println(value);
        var filthy = List.of("fucker", "fuck");
        var clean = List.of(
                "Hello, fucker client",
                "Hello, user.")
                .stream()
                .map(line -> Arrays.stream(line.split(" "))
                            .filter(Predicate.not(filthy::contains))
                            .collect(Collectors.joining(" ")))
                .filter(Predicate.not(filthy::contains))
                .collect(Collectors.toList());
        System.out.println(clean);
    }
}
