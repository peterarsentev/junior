package ru.job4j.callback;

import java.util.Scanner;

public class Child {
    private final Scanner input = new Scanner(System.in);
    private final Callback callback;

    public Child(Callback callback) {
        this.callback = callback;
    }

    public void show() {
        System.out.print("Enter text: ");
        callback.execute(input.nextLine());
    }
}
