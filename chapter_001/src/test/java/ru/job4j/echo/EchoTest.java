package ru.job4j.echo;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class EchoTest {
    /**
     * Test add.
     */
    @Test
    public final void whenAddOneToOneThenTwo() {
        Echo echo = new Echo();
        double result = echo.add(1D, 1D);
        assertThat(result, is(2D));
    }

    /**
     * Test show.
     */
    @Test
    public final void whenExecuteShowThenPrintToConsole() {
        String line = System.getProperty("line.separator");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Echo echo = new Echo();
        echo.show(1D, 1D, 2D);
        assertThat(
                out.toString(),
                is(String.format("1.0 + 1.0 = 2.0%s", line))
        );
    }
}
