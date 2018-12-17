package ru.job4j.pool;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class ThreadPool {
    private final List<Thread> threads = new LinkedList<>();
    private final Queue<Runnable> queue = new LinkedBlockingQueue<>();

    public void work(Runnable job) {
        Runtime.getRuntime().availableProcessors();
    }

    public void shutdown() {

    }
}
