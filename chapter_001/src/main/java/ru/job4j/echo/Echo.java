package ru.job4j.echo;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Echo {

    /**
     * Add.
     * @param first - first.
     * @param second - second.
     * @return - sum of first and second.
     */
    public final double add(final double first, final double second) {
        return first + second;
    }

    /**
     * Show result in console.
     * @param first - first.
     * @param second - second.
     * @param result - result.
     */
    public final void show(
            final double first,
            final double second,
            final double result) {
        System.out.println(
                String.format("%s + %s = %s", first, second, result)
        );
    }
}
