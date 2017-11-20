package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class WordContainsTest {
    @Test
    public void whenOriginIsCombineThenTrue() {
        assertThat(
                new WordContains().is("hello", "elloh"),
                is(true)
        );
    }

    @Test
    public void whenOriginIsNotCombineThenFalse() {
        assertThat(
                new WordContains().is("lllo", "allo"),
                is(false)
        );
    }
}