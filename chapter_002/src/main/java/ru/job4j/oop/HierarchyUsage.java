package ru.job4j.oop;

public class HierarchyUsage {
    public static void main(String[] args) {
        // создаем объекта класса Car.
        Car car = new Car();
        // делаем приведение к типу родителя Transport.
        Transport tp = (Transport) car;
        // делаем приведение к типу родителя Object.
        Object obj = (Object) car;
        // Приведение типа при создании объекта.
        Object ocar = new Car();
        // Приведение типа за счет повышение по иерархии.
        Car carFromObject = (Car) ocar;

        // Ошибка в приведении типа.
        Object bicycle = new Bicycle();
        Car cb = (Car) bicycle; // код завершится с ошибок приведения типов ClassCastException

        System.out.println(new Car());
        System.out.println(new Bicycle());
        System.out.println(new Object());
    }
}
