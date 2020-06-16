package ru.job4j.condition;

public class Cinema {
    public static void access(int age) {
        System.out.println("An age of customer is : " + age);
//        if (...) {
//            System.out.println("Welcome to cinema.");
//        } else {
//            System.out.println("it is not for you.");
//        }
    }

    public static void main(String[] args) {
        Cinema.access(21);
        Cinema.access(16);

    }
}
