package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class OptStream {
    public static void main(String[] args) {
        List<Integer> rsl = List.of(5, 1, 2);
        rsl.add(0);

//        Set.of(5, 1, 2).forEach(System.out::print);
//        Map.of("first", 1, "second", 2)
//                .forEach((v, k) -> System.out.println(String.format("%s %s", v, k)));
//        Stream<Integer> stream = Stream.of(1, 2, 3);
//        Optional<Integer> rsl = stream.filter(e -> e == 5).findFirst();
//        if (rsl.isPresent()) {
//            System.out.println(rsl.get());
//        } else {
//            System.out.println("Element not found.");
//        }
    }
}
