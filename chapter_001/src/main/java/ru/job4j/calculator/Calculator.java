package ru.job4j.calculator;

public class Calculator {

    public static void add(double first, double second) {
        double result =  first + second;
        System.out.println(first + " + " + second + " = " + result);
    }

    public static void main(String[] args) {
        add(1, 1);
        add(2, 2);
    }
}