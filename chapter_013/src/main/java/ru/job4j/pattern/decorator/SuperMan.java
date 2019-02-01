package ru.job4j.pattern.decorator;

public class SuperMan implements Hero {
    private final Hero base;

    public SuperMan(Hero base) {
        this.base = base;
    }

    @Override
    public void jump() {
        this.base.jump();
    }

    public void fly() {

    }
}
