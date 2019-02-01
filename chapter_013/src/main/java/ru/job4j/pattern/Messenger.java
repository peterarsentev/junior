package ru.job4j.pattern;

public interface Messenger<T> {
    void send(T event);
}
