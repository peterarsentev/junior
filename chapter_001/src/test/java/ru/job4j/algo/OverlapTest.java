package ru.job4j.algo;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import java.util.List;

public class OverlapTest {

    @Test
    public void whenInMuddle() {
        var now = List.of(
                new Overlap.Product(1, 10, 50)
        );
        var discount = List.of(
                new Overlap.Product(3, 4, 60)
        );
        var expect = List.of(
                new Overlap.Product(1, 3, 50),
                new Overlap.Product(3, 4, 60),
                new Overlap.Product(4, 10, 50)
        );
        var rsl = Overlap.overlap(now, discount);
        assertThat(rsl, is(expect));
    }
}