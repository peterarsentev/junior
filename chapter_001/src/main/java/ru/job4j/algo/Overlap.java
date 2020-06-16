package ru.job4j.algo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Overlap {
    public static List<Product> overlap(List<Product> now, List<Product> discount) {
        List<Product> rsl = new ArrayList<>();
        return rsl;
    }

    public static class Product {
        int begin;
        int end;
        long value;

        public Product(int begin, int end, long value) {
            this.begin = begin;
            this.end = end;
            this.value = value;
        }
    }
}
