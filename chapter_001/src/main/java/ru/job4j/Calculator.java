package ru.job4j;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Calculator {
    private final Operation add = (left, right) -> left + right;

    public double summation(int left, int right) {
        return this.add.calc(left, right);
    }

    public interface Operation {
        double calc(int left, int right);
    }
}
