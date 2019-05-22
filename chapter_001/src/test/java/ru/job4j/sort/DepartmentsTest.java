package ru.job4j.sort;

import org.junit.Ignore;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@Ignore
public class DepartmentsTest {
    @Test
    public void whenMissed() {
        Departments deps = new Departments();
        List<String> input = Arrays.asList("k1/sk1");
        List<Departments.Org> expect = Arrays.asList(
                new Departments.Org(Arrays.asList("k1")),
                new Departments.Org(Arrays.asList("k1", "sk1"))
        );
        List<Departments.Org> result = deps.convert(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenAsc() {
        Departments deps = new Departments();
        List<String> input = Arrays.asList("k1/sk1", "k2");
        List<Departments.Org> expect = Arrays.asList(
                new Departments.Org(Arrays.asList("k1")),
                new Departments.Org(Arrays.asList("k1", "sk1")),
                new Departments.Org(Arrays.asList("k2"))
        );
        List<Departments.Org> result = deps.sortAsc(deps.convert(input));
        assertThat(result, is(expect));
    }

    @Test
    public void whenDesc() {
        Departments deps = new Departments();
        List<String> input = Arrays.asList("k1/sk1", "k2");
        List<Departments.Org> expect = Arrays.asList(
                new Departments.Org(Arrays.asList("k2")),
                new Departments.Org(Arrays.asList("k1")),
                new Departments.Org(Arrays.asList("k1", "sk1"))
        );
        List<Departments.Org> result = deps.sortDesc(deps.convert(input));
        assertThat(result, is(expect));
    }
}