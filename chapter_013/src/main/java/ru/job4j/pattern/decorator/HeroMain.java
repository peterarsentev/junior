package ru.job4j.pattern.decorator;

public class HeroMain {
    public static void main(String[] args) {
        Hero man = new SuperMan(new HeroFight(new Human()));
    }
}
