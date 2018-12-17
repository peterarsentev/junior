package ru.job4j.buffer;

public class Buffer {
    private StringBuffer buffer = new StringBuffer();

    public void add(int value) {
        System.out.print(value);
        this.buffer.append(value);
    }

    @Override
    public String toString() {
        return this.buffer.toString();
    }
}
