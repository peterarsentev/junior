package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index;
        }
        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }
    }
}
