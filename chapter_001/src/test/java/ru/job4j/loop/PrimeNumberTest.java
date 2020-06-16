package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PrimeNumberTest {
    @Test
    public void when5() {
        boolean rsl = CheckPrimeNumber.check(5);
        assertThat(rsl, is(true));
    }

    @Test
    public void when4() {
        boolean rsl = CheckPrimeNumber.check(4);
        assertThat(rsl, is(false));
    }

    @Test
    public void when1() {
        boolean rsl = CheckPrimeNumber.check(1);
        assertThat(rsl, is(false));
    }

    @Test
    public void when2() {
        boolean rsl = CheckPrimeNumber.check(2);
        assertThat(rsl, is(true));
    }

    @Test
    public void when3() {
        boolean rsl = CheckPrimeNumber.check(3);
        assertThat(rsl, is(true));
    }

    @Test
    public void when12() {
        boolean rsl = CheckPrimeNumber.check(12);
        assertThat(rsl, is(false));
    }

    @Test
    public void when13() {
        boolean rsl = CheckPrimeNumber.check(13);
        assertThat(rsl, is(true));
    }

    @Test
    public void when29() {
        boolean rsl = CheckPrimeNumber.check(29);
        assertThat(rsl, is(true));
    }

    @Test
    public void when47() {
        boolean rsl = CheckPrimeNumber.check(47);
        assertThat(rsl, is(true));
    }

    @Test
    public void when61() {
        boolean rsl = CheckPrimeNumber.check(61);
        assertThat(rsl, is(true));
    }
}