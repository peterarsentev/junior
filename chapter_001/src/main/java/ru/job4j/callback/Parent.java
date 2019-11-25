package ru.job4j.callback;

public class Parent implements Callback {
    private Child child = new Child(this);
    private boolean run = true;

    public void init() {
        while (run) {
            child.show();
        }
    }

    @Override
    public void execute(String message) {
        System.out.println("Get message: " + message);
        run = !"exit".equals(message);
    }

    public static void main(String[] args) {
        new Parent().init();
    }
}
