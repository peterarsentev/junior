package ru.job4j.index;

import org.junit.Ignore;
import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@Ignore
public class WordIndexTest {
    @Test(timeout = 10000L)
    public void whenSingleWord() {
        assertThat(
                new WordIndex("Hello, world.").indexOf("world"),
                is(
                        new TreeSet<>(Arrays.asList(7))
                )
        );
    }

    @Test(timeout = 10000L)
    public void whenMultipleWords() {
        assertThat(
                new WordIndex("hello, hello, hello.").indexOf("hello"),
                is(
                        new TreeSet<>(Arrays.asList(0, 7, 14))
                )
        );
    }

    @Test(timeout = 10000L)
    public void whenNotMatch() {
        assertThat(
                new WordIndex("hello, hello, hello.").indexOf("match"),
                is(
                        new TreeSet<>(Collections.emptySet())
                )
        );
    }
}