package ru.job4j.ex;

public class Find {
    public static String get(String[] data, int index) {
        if (index > 0 && index <= data.length) {
            return data[index];
        } else {
            throw new IllegalArgumentException("Index out of bound");
        }
    }

    public static void main(String[] args) {
        String[] data = {"onw", "two", "three"};
        String rsl = Find.get(data, 0);
        System.out.println(rsl);
    }
}
