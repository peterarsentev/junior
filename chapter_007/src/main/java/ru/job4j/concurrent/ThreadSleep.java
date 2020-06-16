package ru.job4j.concurrent;

import java.util.concurrent.TimeUnit;

public class ThreadSleep {
    public static void main(String[] args) {
        Thread thread = new Thread(
                () -> {
                    try {
                        for (int index = 0; index <= 100; index++) {
                            System.out.println("Loading : " + index  + "%");
                            Thread.sleep(1000);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                },
                "Detect sleep"
        );
        thread.start();
    }
}
