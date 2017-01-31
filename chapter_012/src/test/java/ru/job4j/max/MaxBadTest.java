package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class MaxBadTest {
    @Test
    public void whenMaxFirstPosThenReturnFirst() {
        MaxBad max = new MaxBad();
        int result = max.max(3, 2, 1);
        assertThat("in {3, 2, 1} max 3", result, is(3));
    }

    @Test
    public void whenMaxSecondPosThenReturnSecond() {
        MaxBad max = new MaxBad();
        int result = max.max(2, 3, 1);
        assertThat("in {2, 3, 1} max 3", result, is(3));
    }
}