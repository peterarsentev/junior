package ru.job4j.tracker;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        ByteArrayOutputStream mem = new ByteArrayOutputStream();
        PrintStream out = System.out;
        System.setOut(new PrintStream(mem));
//        ValidateInput input = new ValidateInput(
//                new StubInput(new String[] {"invalid", "1"})
//        );
//        input.askInt("Enter", 1);
//        assertThat(
//                mem,
//                is(String.format("Please enter validate data again.%n"))
//        );
//        System.setOut(out);
    }
}