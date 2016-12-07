package ru.job4j.params;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class ArrayReturn {
    private int[] values;

    public int[] sort(int[] values) {
        this.values = values;
        return values;
    }

    public void echo() {
        System.out.println(this.values[0]);
    }

    public static void main(String[] args) {
        ArrayReturn ar = new ArrayReturn();
        final int[] immutable = {1};
        final int[] ri = ar.sort(immutable);
        ri[0] = -1;
        ar.echo();
    }
}
