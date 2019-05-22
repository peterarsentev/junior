package ru.job4j.tree;

public interface Fly {
    default void execute() {
        System.out.println("fly");
    }
}
