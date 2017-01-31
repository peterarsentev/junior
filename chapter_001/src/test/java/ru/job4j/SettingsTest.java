package ru.job4j;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class SettingsTest {
    @Test
    public void whenLoadThenGetFile() throws Exception {
        Settings settings = new Settings();
        File file = new File("c:\\projects\\junior\\app.properties");
        try (FileInputStream io = new FileInputStream(file)) {
              settings.load(io);
        }
        String value = settings.getValue("home.path");
        assertThat(value, is("c:\\temp\\"));
    }

    @Test
    public void whenIndepPath() throws Exception {
        Settings settings = new Settings();
        File file = new File("./src/main/resources/app.properties");
        try (FileInputStream io = new FileInputStream(file)) {
            settings.load(io);
        }
        String value = settings.getValue("home.path");
        assertThat(value, is("c:\\temp\\"));
    }

    @Test
    public void whenClassLoader() throws Exception {
        Settings settings = new Settings();
        ClassLoader loader = Settings.class.getClassLoader();
        try (InputStream io = loader.getResourceAsStream("ru/job4j/service/app.properties")) {
            settings.load(io);
        }
        String value = settings.getValue("home.path");
        assertThat(value, is("c:\\tmp\\"));
    }

}