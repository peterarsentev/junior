package ru.job4j.condition;

import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@Ignore
public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        try {
            new java.io.File(" hello_from_test.log").createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Max max = new Max();
        int result = max.max(1, 2);
        assertThat(result, is(2));
    }
}