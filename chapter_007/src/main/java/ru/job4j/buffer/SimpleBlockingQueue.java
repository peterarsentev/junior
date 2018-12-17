package ru.job4j.buffer;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

import java.util.LinkedList;
import java.util.Queue;

@ThreadSafe
public class SimpleBlockingQueue<T> {

    @GuardedBy("this")
    private final Queue<T> queue = new LinkedList<>();

    public void offer(T value) {
        synchronized (this.queue) {
            queue.add(value);
            queue.notifyAll();
        }
    }

    public T poll() throws InterruptedException {
        synchronized (this.queue) {
            while (this.queue.isEmpty()) {
                this.queue.wait();
            }
            return this.queue.poll();
        }
    }

    public boolean isEmpty() {
        synchronized (this.queue) {
            return this.queue.isEmpty();
        }
    }
}