package ru.job4j.properties;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * This class works with file config (key=value format)
 * Example.
 * ##email config
 * email=parsentev@yandex.ru
 * name=Petr Arsentev
 * jdbc.url=...
 */
public class Config {
    private static final String SP = "=";
    private final String path;
    private final Map<String, String> settings = new LinkedHashMap<>();

    public Config(final String path) {
        this.path = path;
    }

    public Config load() {
        this.settings.clear();
        try (BufferedReader file = new BufferedReader(new FileReader(this.path))) {
            file.lines().forEach(
                    line -> {
                        if (line.contains(SP)) {
                            int pos = line.indexOf(SP);
                            settings.put(line.substring(0, pos), line.substring(pos + 1));
                        } else {
                            settings.put(line, "");
                        }
                    }
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this;
    }

    public String value(String key) {
        return this.settings.get(key);
    }

    public void put(String key, String value) {
        this.settings.put(key, value);
    }

    public void delete(String key) {
        this.settings.remove(key);
    }

    public void save() {
        try (final PrintWriter file = new PrintWriter(this.path)) {
            this.settings.forEach(
                    (key, value) -> {
                        file.append(key);
                        if (!value.isEmpty()) {
                            file.append(SP).append(value);
                        }
                        file.println();
                    }
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
