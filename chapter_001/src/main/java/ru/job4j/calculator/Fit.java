package ru.job4j.calculator;

/**
 * Программа расчета идеального веса.
 */
public class Fit {

    /**
     * Идеальный вес для мужщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public static double manWeight(double height) {
        return -1D;
    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public static double womanWeight(double height) {
        return -1D;
    }

    public static void main(String[] args) {
        double man = manWeight(100);
        System.out.println("Man 100 is " + man);
    }
}
