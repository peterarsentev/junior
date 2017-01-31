package ru.job4j.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Settings {
    public final Properties prs = new Properties();

    public void load() {
        final ClassLoader loader = Settings.class.getClassLoader();
        try (InputStream it = loader.getResourceAsStream("app.properties")) {
            this.prs.load(it);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getValue(String key) {
        return this.prs.getProperty(key);
    }
}
