package ru.job4j.tree;

public interface Run {
    default void execute() {
        System.out.println("run");
    }
}
