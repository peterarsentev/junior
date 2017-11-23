package ru.job4j.loop;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Count {
    public static void main(String[] args) {
    }

    public int add(int start, int finish) {
        int i, sum = 0;
        for (i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
