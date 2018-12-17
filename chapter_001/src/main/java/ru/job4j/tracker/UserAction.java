package ru.job4j.tracker;

/**
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public interface UserAction {
    int key();

    void execute(Input input, Tracker tracker);

    String info();
}
