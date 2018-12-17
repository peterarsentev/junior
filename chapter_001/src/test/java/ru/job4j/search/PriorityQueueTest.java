package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PriorityQueueTest {
    @Test
    public void whenHigherPriority() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        Task result = queue.take();
        assertThat(result.getDesc(), is("urgent"));
    }

    @Test
    public void whenLastPriority() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("1", 1));
        queue.put(new Task("2", 2));
        Task result = queue.take();
        assertThat(result.getPriority(), is(1));
    }

    @Test
    public void whenSort() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("low", 5));
        tasks.add(new Task("urgent", 1));
        assertThat(
                tasks, is(
                        Arrays.asList(
                                new Task("low", 5),
                                new Task("low", 5)
                        )
                )
        );
    }
}