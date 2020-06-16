package ru.job4j.condition;

public class Max {
    public static int min(int left, int right) {
        int result = left > right ? right : left;
        return result;
    }


    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static void main(String[] args) {
        min(1, 2);
        max(1, 2);
    }
}
