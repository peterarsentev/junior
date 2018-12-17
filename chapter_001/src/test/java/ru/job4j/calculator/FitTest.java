package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FitTest {

    @Test
    public void manWeight() {
        Fit fit = new Fit();
        double weight = fit.manWeight(180);
        assertThat(weight, is(92D));
    }

    @Test
    public void womanWeight() {
        Fit fit = new Fit();
        double weight = fit.manWeight(170);
        assertThat(weight, is(69D));
    }
}