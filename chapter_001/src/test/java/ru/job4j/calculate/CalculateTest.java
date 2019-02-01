package ru.job4j.calculate;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

@Ignore
public class CalculateTest {

    @Test
    public void whenPetrThen3EchoPetr() {
        String input = "Masha";
        Calculate calc = new Calculate();
        String result = calc.echo(input);
        String expect = "Echo, echo, echo : Masha";
        assertThat(result, is(expect));
    }
}