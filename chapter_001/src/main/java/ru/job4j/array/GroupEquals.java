package ru.job4j.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupEquals {
    public static class Pair {
        final List<Integer> left = new ArrayList<>();
        final List<Integer> right = new ArrayList<>();
    }

    public Pair split(List<Integer> values) {
        values.sort(
                (left, right) -> right - left
        );
        Pair rsl = new Pair();
        int left = 0;
        int right = 0;
        for (Integer value : values) {
            if (left >= right) {
                right += value;
                rsl.right.add(value);
            } else {
                left += value;
                rsl.left.add(value);
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        GroupEquals equals = new GroupEquals();
        Pair pair = equals.split(Arrays.asList(10, 5, 3));
        System.out.println(pair);
    }
}
