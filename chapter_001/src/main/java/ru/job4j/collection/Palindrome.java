package ru.job4j.collection;

public class Palindrome {
    public boolean check(int[] left, int[] right) {
        boolean rsl = true;
        for (int index = 0; index != left.length; index++) {
            if (left[index] != right[left.length - index - 1]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Palindrome process = new Palindrome();
        boolean rsl = process.check(
                new int[] {1, 2, 3},
                new int[] {3, 2, 1}
        );
        System.out.println(rsl);
    }
}
