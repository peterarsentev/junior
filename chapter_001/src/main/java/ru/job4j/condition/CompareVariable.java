package ru.job4j.condition;

public class CompareVariable {
    public static void main(String[] args) {
       CompareVariable compare = new CompareVariable();
       compare.comparePrimitive(5, 10);
       compare.compareReference("Hello", "Hello");
    }

    public void comparePrimitive(int left, int right) {
        boolean less  = left < right;
        boolean great = left > right;
        boolean lessEq = left <= right;
        boolean greatEq = left >= right;
        boolean eq = left == right;
        System.out.println("Left is less then right. " + less);
        System.out.println("Left is great then right. " + great);
        System.out.println("Left is less or equal then right. " + lessEq);
        System.out.println("Left is great or equal then right. " + greatEq);
        System.out.println("Left is equal then right. " + eq);
    }

    public void compareReference(String left, String right) {
        boolean eq = left.equals(right);
        System.out.println("Left is equal then right. " + eq);
    }
}
