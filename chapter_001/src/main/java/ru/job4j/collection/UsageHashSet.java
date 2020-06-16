package ru.job4j.collection;

import java.util.HashSet;

public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<String>();
        names.add("Petr");
        names.add("Ivan");
        names.add("Ivan");
        names.add("Vasily");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
