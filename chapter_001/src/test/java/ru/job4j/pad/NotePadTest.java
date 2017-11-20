package ru.job4j.pad;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Tests for note pad.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class NotePadTest {
    @Test
    public void whenDeleteNoteThenCollapseSize() {
        NotePad pad = new NotePad();
        pad.add("first note ");
        pad.add("second note ");
        pad.add("third note ");
        pad.delete(1);
        StringBuilder log = new StringBuilder();
        pad.to(log::append);
        assertThat(log.toString(), is("first note third note "));
    }

    @Test
    public void whenDeleteFirstThenCollapseSize() {
        NotePad pad = new NotePad();
        pad.add("first note ");
        pad.add("third note ");
        pad.delete(0);
        StringBuilder log = new StringBuilder();
        pad.to(log::append);
        assertThat(log.toString(), is("third note "));
    }

    @Test
    public void whenDeleteLastThenCollapseSize() {
        NotePad pad = new NotePad();
        pad.add("first note ");
        pad.add("third note ");
        pad.delete(1);
        StringBuilder log = new StringBuilder();
        pad.to(log::append);
        assertThat(log.toString(), is("first note "));
    }
}