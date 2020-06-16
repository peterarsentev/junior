package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;

class A {
    static void of() {
        System.out.println("test a");
    }
}

class B extends A {
    static void of() {
        System.out.println("test b");
    }
}


public class CutClone {

    public static void main(String[] args) {
        A a = new B();
        a.of();

        B b = new B();
        b.of();

        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Stepan");
        names.add("Petrucho");
        names.add("Ivan");
        names.stream()
                .distinct()
                .forEach(System.out::println);

    }
}
