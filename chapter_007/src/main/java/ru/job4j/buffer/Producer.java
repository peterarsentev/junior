package ru.job4j.buffer;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Producer extends Thread {
    private final Buffer buffer;
    private final int value;
    private final AtomicInteger lock;

    public Producer(final Buffer buffer, final int value, AtomicInteger lock) {
        this.buffer = buffer;
        this.value = value;
        this.lock = lock;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            synchronized (this.lock) {
                if (this.lock.get() != this.value) {
                    IntStream.range(0, 10).forEach(
                            value -> buffer.add(this.value)
                    );
                    this.lock.set(this.value);
                }
            }
        }
    }

    public static void main(String[] args) {
        final Buffer buffer = new Buffer();
        final AtomicInteger flag = new AtomicInteger(2);
        new Producer(buffer, 1, flag).start();
        new Producer(buffer, 2, flag).start();
    }
}
