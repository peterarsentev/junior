package ru.job4j.max;

import java.util.Scanner;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class MaxBad {
    public static void main(String[] args) {
        MaxBad max = new MaxBad();
        System.out.println(max.max(1, 2, 3));
        System.out.println(max.max(1, 3, 1));
        System.out.println(max.max(3, 2, 1));
    }

    public int max(int one, int two, int thee) {
       return max(one, max(two, thee));
    }

    public int max(int one, int two) {
        return one > two ? one : two;
    }
}
