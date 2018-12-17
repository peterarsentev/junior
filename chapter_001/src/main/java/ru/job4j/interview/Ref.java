package ru.job4j.interview;

import java.util.ArrayList;
import java.util.List;

public class Ref {

    public static void main(String[] args) {
        List<String> emails = new ArrayList<String>();
        loadDb(emails);
        System.out.println("Load from db: " + emails);
        loadMem(emails);
        System.out.println("Load from mem: " + emails);
    }

    public static void loadDb(List<String> data) {
        data = new ArrayList<>();
        data.add("parsentev@yandex.ru");
    }

    public static void loadMem(List<String> data) {
        data.add("ivanov@yandex.ru");
    }
}
