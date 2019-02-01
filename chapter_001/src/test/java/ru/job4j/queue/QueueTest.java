package ru.job4j.queue;

import org.junit.Test;

import java.util.Iterator;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class QueueTest {
    @Test
    public void whenRemoveOnes() {
        Queue<String> queue = new Queue<>();
        queue.add("first");
        queue.add("second");
        queue.add("third");
        assertThat(queue.remove(), is("first"));
        assertThat(queue.remove(), is("second"));
        assertThat(queue.remove(), is("third"));
    }

    @Test(expected = IllegalStateException.class)
    public void whenIsEmpty() {
        Queue<String> queue = new Queue<>();
        queue.add("first");
        queue.remove();
        queue.remove();
    }

    @Test
    public void whenRemoveHeadAndAddHead() {
        Queue<String> queue = new Queue<>();
        queue.add("first");
        queue.remove();
        queue.add("second");
        assertThat(queue.remove(), is("second"));
    }

    @Test
    public void whenIterate() {
        Queue<String> queue = new Queue<>();
        queue.add("first");
        queue.add("second");
        queue.add("third");
        Iterator<String> it = queue.iterator();
        assertThat(it.next(), is("first"));
        assertThat(it.next(), is("second"));
        assertThat(it.next(), is("third"));
    }
}