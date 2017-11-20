package ru.job4j.array;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Rotate {

    int[][] rotate(int[][] value) {
        System.out.println(value.length);
        for (int i = 0; i != value.length; i++) {
            for (int j = 0; j != value.length - i; j++) {
                int tmp = value[j][i];
                value[j][i] = value[i][j];
                value[i][j] = tmp;
            }
            System.out.println(Arrays.toString(value[i]));
        }
        return value;
    }

    public static void main(String[] args) {
        int[][] value = new Rotate().rotate(
                new int[][] {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                }
        );
//        Stream.of(value).forEach(
//                v -> System.out.println(Arrays.toString(v))
//        );
    }
}
