package ru.job4j.pseudo;

import java.util.StringJoiner;

/**
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Triangle implements Shape {
    @Override
    public String pic() {
        return new StringJoiner(System.lineSeparator())
                .add("  ^  ")
                .add(" ^ ^ ")
                .add("^^^^^")
                .toString();
    }
}
