package ru.job4j.condition;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class ThreeMaxTest {

    @Test
    public void firstMax() {
        int rsl = ThreeMax.max(10, 5, 1);
        assertThat(rsl, is(10));
    }

    @Test
    public void secondMax() {
        int rsl = ThreeMax.max(10, 50, 1);
        assertThat(rsl, is(50));
    }

    @Test
    public void thirdMax() {
        int rsl = ThreeMax.max(1, 5, 100) ;
        assertThat(rsl, is(100));
    }

    @Test
    public void allEq() {
        int rsl = ThreeMax.max(1, 1, 1);
        assertThat(rsl, is(1));
    }

    @Test
    public void firstEqSecond() {
        int rsl = ThreeMax.max(10, 10, 1);
        assertThat(rsl, is(10));
    }

    @Test
    public void firstEqThird() {
        int rsl = ThreeMax.max(100, 1, 100);
        assertThat(rsl, is(100));
    }

    @Test
    public void secondEqThird() {
        int rsl = ThreeMax.max(1, 100, 100);
        assertThat(rsl, is(100));
    }
}