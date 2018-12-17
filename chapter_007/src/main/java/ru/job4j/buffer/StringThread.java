package ru.job4j.buffer;

public class StringThread {

    private String str;

    public StringThread(String str) {
        this.str = str;
    }

    public void concatent(int number) {
        System.out.print(number);
        synchronized(str) {
            String sNumber = String.valueOf(number);
            this.str += sNumber;
        }
    }

    public synchronized String getStr() {
        return str;
    }

    public static void main(String[] args) throws InterruptedException {
        StringThread intance = new StringThread("begin");
        Thread first = new Thread(){
            @Override
            public void run() {
                while (!Thread.currentThread().isInterrupted()) {
                    synchronized (intance) {
                        for (int index = 0; index < 10; index++) {
                            intance.concatent(1);
                        }
                        try {
                            intance.wait();
                            intance.notifyAll();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        Thread second = new Thread(){
            @Override
            public void run() {
                while (!Thread.currentThread().isInterrupted()) {
                    synchronized (intance) {
                        for (int index = 0; index < 10; index++) {
                            intance.concatent(2);
                        }
                        intance.notifyAll();
                        try {
                            intance.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        first.start();
        second.start();
//        Thread.sleep(2000);
//        first.interrupt();
//        second.interrupt();
        System.out.println(intance.getStr());
    }
}
