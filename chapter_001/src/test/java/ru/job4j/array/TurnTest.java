package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void whenArrayHas5() {
        assertThat(
                new Turn().turn(
                        new int[] {1, 2, 3, 4, 5}
                ),
                is(new int[] {5, 4, 3, 2, 1})
        );
    }

    @Test
    public void whenArrayEquals() {
        assertThat(
                new Turn().turn(
                        new int[] {3, 2, 3, 2, 3}
                ),
                is(new int[] {3, 2, 3, 2, 3})
        );
    }
}