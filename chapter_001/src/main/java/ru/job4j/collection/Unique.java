package ru.job4j.collection;

import java.util.Arrays;

public class Unique {
    public boolean unique(int[] value) {
        Arrays.sort(value);
        boolean rsl = true;
        for (int index = 0; index < value.length - 1; index++) {
            if (value[index] == value[index + 1]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Unique process = new Unique();
        boolean rsl = process.unique(
                new int[] {5, 2, 5}
        );
        System.out.println(rsl);
    }
}
