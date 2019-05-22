package ru.job4j.tracker;

public abstract class BaseAction {
    private final int key;
    private final String name;

    protected BaseAction(final int key, final String name) {
        this.key = key;
        this.name = name;
    }

    public abstract void execute(Input input, Tracker tracker);

    public String info() {
        return String.format("%s : %s", this.key, this.name);
    }
}
