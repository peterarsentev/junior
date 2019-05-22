package ru.job4j.properties;

import org.junit.Test;

import java.io.*;
import java.util.stream.Stream;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.*;

public class ConfigTest {

    @Test
    public void whenRemoveKeyConfig() throws IOException {
        File path = data(
                String.valueOf(System.currentTimeMillis()),
                "email=parsentev@yandex.ru"
        );
        Config config = new Config(path.getAbsolutePath()).load();
        config.delete("email");
        config.save();
        config.load();
        assertThat(config.value("email"), is(nullValue()));
        path.deleteOnExit();
    }

    @Test
    public void whenReadConfig() throws IOException {
        File path = data(
                String.valueOf(System.currentTimeMillis()),
                "email=parsentev@yandex.ru"
        );
        Config config = new Config(path.getAbsolutePath()).load();
        assertThat(config.value("email"), is("parsentev@yandex.ru"));
        path.deleteOnExit();
    }

    @Test
    public void whenWriteConfig() throws IOException {
        File path = data(
                String.valueOf(System.currentTimeMillis()),
                "email=parsentev@yandex.ru"
        );
        Config config = new Config(path.getAbsolutePath()).load();
        config.put("email", "123@google.ru");
        config.save();
        config.load();
        assertThat(config.value("email"), is("123@google.ru"));
        path.deleteOnExit();
    }

    @Test
    public void whenConfigHasComment() throws IOException {
        File path = data(
                String.valueOf(System.currentTimeMillis()),
                "### email for git",
                "email=parsentev@yandex.ru"
        );
        Config config = new Config(path.getAbsolutePath()).load();
        config.put("email", "123@google.ru");
        config.save();
        StringBuilder content = new StringBuilder();
        try (BufferedReader file = new BufferedReader(new FileReader(path))) {
            file.lines().forEach(
                    line -> content.append(line).append(System.lineSeparator())
            );
        }
        assertThat(
                content.toString(),
                is(
                        String.join(System.lineSeparator(),
                                "### email for git",
                                "email=123@google.ru", ""
                        )
                )
        );
        path.deleteOnExit();
    }

    private File data(String file, String ... properties) throws IOException {
        File path = new File(
                System.getProperty("java.io.tmpdir") +
                        System.getProperty("file.separator") +
                        file
        );
        if (!path.createNewFile()) {
            throw new IllegalStateException(String.format("File could not created %s", path.getAbsoluteFile()));
        }
        try (final PrintWriter store = new PrintWriter(path)) {
            Stream.of(properties).forEach(store::println);
        }
        return path;
    }
}