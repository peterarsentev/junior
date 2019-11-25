package ru.job4j;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class HolderTest {

    @Test
    public void whenPossibleNull() throws InterruptedException {
        for (int i = 0; i < 10000; i++) {
            final Holder hold = new Holder();
            Thread first = new Thread(() -> hold.set("hi"));
            first.start();
            first.join();
            assertThat(hold.get(), is("hi"));
        }
    }
}