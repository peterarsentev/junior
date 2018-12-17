package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class ShortOp {
    @Test
    public void longExperssionPositive() {
        int sx = 1;
        int compX = 1;
        sx = sx + (-compX);
        assertThat(sx, is(0));
    }

    @Test
    public void shortcutPositive() {
        int sx = 1;
        int compX = 1;
        sx -= compX;
        assertThat(sx, is(0));
    }

    @Test
    public void shortcut() {
        int sx = 1;
        int compX = -1;
        sx -= compX;
        assertThat(sx, is(2));
    }

    @Test
    public void longExpression() {
        int sx = 1;
        int compX = -1;
        sx = sx + (-compX);
        assertThat(sx, is(2));
    }
}
