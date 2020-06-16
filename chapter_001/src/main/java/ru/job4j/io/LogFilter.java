package ru.job4j.io;

import java.util.List;

public class LogFilter {
    public static List<String> filter(String file) {
        return null;
    }

    public static void save(List<String> log, String file) {

    }

    public static void main(String[] args) {
        List<String> log = filter("log.txt");
        save(log, "404.txt");
    }
}
