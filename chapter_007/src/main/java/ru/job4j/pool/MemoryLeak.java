package ru.job4j.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MemoryLeak {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(10);
        for (int index = 0; index < 10; index++) {
            pool.execute(() -> {
                try {
                    synchronized (MemoryLeak.class) {
                        MemoryLeak.class.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        Thread.sleep(10_000);
    }
}
