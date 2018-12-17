package ru.job4j.pool;

import java.util.concurrent.TimeUnit;

public class Until {
    public static void main(String[] args) {
        Thread producer = new Thread(
                () -> {
                    try {
                        TimeUnit.SECONDS.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );
        producer.start();
        while (producer.isAlive()) {
            System.out.println("life");
        }
        System.out.println("stop");
    }
}
