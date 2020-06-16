package ru.job4j.lambda;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Group {

    static class Holder {
        String key, value;

        Holder(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }


    public static Map<String, Set<String>> sections(List<Student> students) {
        return students.stream().flatMap(
                s -> s.getUnits().stream().map(u -> new Holder(u, s.getName()))
        ).collect(
                Collectors.groupingBy(t -> t.key,
                        Collector.of(
                                HashSet::new,
                                (set, el) -> set.add(el.value),
                                (left, right) -> { left.addAll(right); return left; }
                        )
                )
        );
    }

    public static void main(String[] args) {
        List<Student> students = List.of(new Student("Petr", Set.of("1", "2")), new Student("Ivan", Set.of("1", "2", "3")));
        System.out.println(sections(students));
    }
}
