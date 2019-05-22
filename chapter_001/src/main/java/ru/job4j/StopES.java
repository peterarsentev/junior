package ru.job4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StopES {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(1);
        pool.execute(
                () -> {
                    try {
                        System.out.println("First");
                        System.out.println("Long tasks .... ");
                        Thread.sleep(5000);
                        System.out.println("Finish .... ");
                    } catch (Exception e) {
                        e.printStackTrace();
                        Thread.currentThread().interrupt();
                    }
                }
        );

        pool.execute(
                () -> {
                    try {
                        System.out.println("Second");
                        if (!Thread.currentThread().isInterrupted()) {
                            System.out.println(" Another long tasks .... ");
                            Thread.sleep(5000);
                        }
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                    }
                }
        );
        pool.shutdownNow();
    }
}
