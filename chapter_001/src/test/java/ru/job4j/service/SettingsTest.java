package ru.job4j.service;

import org.junit.Test;

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
    public void whenGetHomePathThenDefaultCTemp() {
        Settings settings = new Settings();
        settings.load();
        String home = settings.getValue("home.path");
        assertThat(home, is("c:\\temp\\"));
    }
}