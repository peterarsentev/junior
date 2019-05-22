package ru.job4j.tree;

public class SuperMan implements Fly, Run {
    @Override
    public void execute() {
        Fly.super.execute();
        Run.super.execute();
    }
}
