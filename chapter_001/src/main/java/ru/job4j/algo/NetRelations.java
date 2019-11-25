package ru.job4j.algo;

import java.util.*;

public class NetRelations {

    public static Map<String, Set<String>> analyze(List<List<String>> data) {
        Map<String, Set<String>> list = new HashMap<>();
        Map<String, String> backward = new HashMap<>();
        int names = 0;
        for (List<String> group : data) {
            String name = null;
            for (String el : group) {
                if (backward.containsKey(el)) {
                    name = backward.get(el);
                    break;
                }
            }
            if (name != null) {
                list.get(name).addAll(group);
                for (String gr : group) {
                    backward.put(gr, name);
                }
            } else {
                name = String.valueOf(names++);
                list.put(name, new HashSet<>());
                list.get(name).addAll(group);
            }
            for (String gr : group) {
                backward.put(gr, name);
            }
        }
        return list;
    }

    public static void main(String[] args) {

        System.out.println(analyze(
                Arrays.asList(
                        Arrays.asList("1", "2", "3"),
                        Arrays.asList("3", "4", "5"),
                        Arrays.asList("5", "6", "7")
                )
        ));

        System.out.println(analyze(
                Arrays.asList(
                        Arrays.asList("1", "2", "3"),
                        Arrays.asList("3", "4", "5"),
                        Arrays.asList("8", "6", "7")
                )
        ));
    }
}
