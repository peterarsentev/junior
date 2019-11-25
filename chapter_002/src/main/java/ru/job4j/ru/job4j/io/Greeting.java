package ru.job4j.ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракл. Что ты хочешь узнать? ");
        String name = input.nextLine();
        System.out.println(name + ", рад Вас видеть!");
        int answer = new Random().nextInt(3);
    }
}
