package ru.job4j.pattern.decorator;

public class HeroFight implements Hero {
    private final Hero base;

    public HeroFight(Hero base) {
        this.base = base;
    }

    @Override
    public void jump() {
        this.base.jump();
        this.base.jump();
    }

    public void weapon() {
    }
}
