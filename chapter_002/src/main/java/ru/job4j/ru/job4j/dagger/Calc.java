package ru.job4j.ru.job4j.dagger;

import ru.job4j.tracker.Input;

import javax.inject.Inject;

public class Calc {

    private final Input input;

    @Inject
    public Calc(Input input) {
        this.input = input;
    }

    public void add() {
        int first = input.askInt("first: ");
        int second = input.askInt("second: ");
        System.out.println("result " + (first + second));
    }

    public static void main(String[] args) {
        InputComponent component = DaggerInputComponent.create();
        component.instance().add();
    }
}
