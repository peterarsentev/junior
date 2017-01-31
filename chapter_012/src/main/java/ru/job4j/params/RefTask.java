package ru.job4j.params;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class RefTask {
    public static void main(String[] args) {
        Integer value = 1;
        RefTask.change(value);
        System.out.println(value);
    }

    public static void change(Integer that) {
        that++;
    }
}
