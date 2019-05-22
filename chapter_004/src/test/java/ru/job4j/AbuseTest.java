package ru.job4j;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class AbuseTest {
    @Test
    public void whenAllOk() {
        Abuse abuse = new Abuse();
        assertThat(
                abuse.clean(
                        Arrays.asList("Hello", "Bye"),
                        Collections.EMPTY_LIST
                ),
                is(Arrays.asList("Hello", "Bye"))
        );
    }

    @Test
    public void whenAllFake() {
        Abuse abuse = new Abuse();
        assertThat(
                abuse.clean(
                        Arrays.asList("Hello Fake", "Bye"),
                        Arrays.asList("Fake")
                ),
                is(Arrays.asList("Hello", "Bye"))
        );
    }
}