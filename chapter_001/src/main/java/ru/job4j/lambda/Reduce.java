package ru.job4j.lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Reduce {

    public static int summation(int to) {
        BiFunction<Integer, Integer, Integer> func = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer left, Integer right) {
                return left + right;
            }
        };
        return loop(to, func);
    }

    public static int multiplication(int to) {
        BiFunction<Integer, Integer, Integer> func = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer left, Integer right) {
                return left * right;
            }
        };
        return loop(to, func);
    }

    private static int loop(int to, BiFunction<Integer, Integer, Integer> func) {
        int rsl = 0;
        for (int index = 0; index < to; index++) {
            rsl = func.apply(rsl, index);
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(summation(3));
        System.out.println(multiplication(3));
    }
}
