package ru.job4j.kiss;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;

public class MaxMin {
    private <T> T solveMinMax(List<T> value, BiPredicate<T, T> predict) {
        T rsl = value.iterator().next();
        for (T item : value) {
            if (predict.test(rsl, item)) {
                rsl = item;
            }
        }
        return rsl;
    }

    public <T> T max(List<T> value, Comparator<T> comparator) {
        return solveMinMax(value, (left, right) -> comparator.compare(left, right) >= 0);
    }

    public <T> T min(List<T> value, Comparator<T> comparator) {
        return solveMinMax(value, (left, right) -> comparator.compare(left, right) <= 0);
    }
}
