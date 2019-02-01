package ru.job4j.pattern.builder;

public class Computer {
    private final Processor processor;
    private final Monitor monitor;
    private final Keyboard keyboard;

    private Printer printer;
    private Scanner scanner;

    public Computer(Processor processor, Monitor monitor, Keyboard keyboard) {
        this.processor = processor;
        this.monitor = monitor;
        this.keyboard = keyboard;
    }

    public Computer printer(Printer printer) {
        this.printer = printer;
        return this;
    }

    public Computer scanner(Scanner scanner) {
        this.scanner = scanner;
        return this;
    }

    public static void main(String[] args) {
        Computer ps = new Computer(new Processor(), new Monitor(), new Keyboard())
                .printer(new Printer()).scanner(new Scanner());
    }
}
