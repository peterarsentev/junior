package ru.job4j;

import java.util.concurrent.CountDownLatch;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class DeadLock {
    private final CountDownLatch latch = new CountDownLatch(2);

    public void call(final Object left, final Object right) {
        try {
            synchronized (left) {
                latch.countDown();
                this.latch.await();
                synchronized (right) {
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
       final DeadLock dead = new DeadLock();
       final Object left = new Object();
       final Object right = new Object();
       new Thread(
               () -> dead.call(left, right)
       ).start();
        new Thread(
                () -> dead.call(right, left)
        ).start();
    }
}
