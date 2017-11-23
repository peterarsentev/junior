package ru.job4j.cycly;

import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
@Ignore
public class SearchCycleTest {
    @Test
    public void whenDataHasNotCycleThenRslEmpty() {
        Map<Integer, Integer> data = new HashMap<>();
        data.put(1, 2);
        data.put(2, 3);
        data.put(3, 4);
        assertThat(
                new SearchCycle().search(data).isEmpty(),
                is(true)
        );
    }

    @Test
    public void whenDataHasSingleCycleThenRslSingle() {
        Map<Integer, Integer> data = new HashMap<>();
        data.put(1, 2);
        data.put(2, 1);
        assertThat(
                new SearchCycle().search(data),
                is(Collections.singletonList(Arrays.asList(1, 2, 1)))
        );
    }

    @Test
    public void whenDataHasMultipleCycleThenRslMultiple() {
        Map<Integer, Integer> data = new HashMap<>();
        data.put(1, 2);
        data.put(2, 1);
        data.put(3, 4);
        data.put(4, 5);
        data.put(5, 3);
        assertThat(
                new SearchCycle().search(data),
                containsInAnyOrder(
                        Arrays.asList(1, 2, 1),
                        Arrays.asList(3, 4, 5, 3)
                )
        );
    }
}