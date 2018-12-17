package ru.job4j.multithreads;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@ThreadSafe
public class ParallelSearch {
    private final String root;
    private final String text;
    private final List<String> exts;

    @GuardedBy("this")
    private final Queue<String> files = new LinkedList<>();

    @GuardedBy("this")
    private final Queue<String> paths = new LinkedList<>();


    public ParallelSearch(String root, String text, List<String> exts) {
        this.root = root;
        this.text = text;
        this.exts = exts;
    }

    public void init() {
        Thread search = new Thread() {
            @Override
            public void run() {
                super.run();
            }
        };
        Thread read = new Thread() {
            @Override
            public void run() {
                super.run();
            }
        };
    }

    synchronized Queue<String>  result() {
        return this.paths;
    }
}
