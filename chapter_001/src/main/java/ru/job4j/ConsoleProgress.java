package ru.job4j;

public class ConsoleProgress implements Runnable {
    public static void main(String[] args) throws Exception {
        Thread progress = new Thread(new ConsoleProgress());
        progress.start();
        System.out.println(progress.getState());
        Thread.sleep(10000);
        progress.interrupt();
        System.out.println(progress.getState());
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(50);
                System.out.print("\r load: " + '-');
                Thread.sleep(50);
                System.out.print("\r load: " + '\\');
                Thread.sleep(50);
                System.out.print("\r load: " + '|');
                Thread.sleep(50);
                System.out.print("\r load: " + '/');
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
