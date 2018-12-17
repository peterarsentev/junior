package ru.job4j;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Parent {
    private class Child {
    }

    public Child createChild() {
        return new Child();
    }
}
