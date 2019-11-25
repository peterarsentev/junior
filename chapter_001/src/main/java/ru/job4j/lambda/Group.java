package ru.job4j.lambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Group {
    public static void main(String[] args) {
        System.out.println("123;45;".split(";").length);
        System.out.println(";11;".split(";").length);
//        Map<String, Set<String>> users = new HashMap<>();
//        users.put("Petr Arsentev", Set.of("p1@ya.ru", "p2@ya.ru"));
//        users.put("Ivan Ivanov", Set.of("i1@ya.ru", "i2@ya.ru"));

//        users.entrySet().stream().map().collect(Collectors.groupingBy((key, value) -> ()))
}
}
