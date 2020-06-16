package ru.job4j.ex;

public class NPEx {
    public static void main(String[] args) {
        String[] shops = new String[5];
        shops[0] = "Petr Arsentev";
        for (int index = 0; index < shops.length; index++) {
            String el = shops[index];
            if (el != null) {
                System.out.println(el + " has a size : " + el.length());
            }
        }
    }
}
