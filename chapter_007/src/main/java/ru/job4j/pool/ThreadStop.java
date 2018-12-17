package ru.job4j.pool;


public class ThreadStop {
    public static void main(String[] args) throws InterruptedException {
        Thread run = new Thread() {
            @Override
            public void run() {
                while (!Thread.currentThread().isInterrupted()) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        };

        run.start();
        Thread.sleep(500);
        run.interrupt();
    }

    public int min(int[] array) {
        int min = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[min]) {
                min = i;
            }
        }
        return min;
    }
}
