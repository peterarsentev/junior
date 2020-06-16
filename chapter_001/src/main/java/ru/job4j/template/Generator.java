package ru.job4j.template;

import java.util.Map;

public interface Generator {
    String produce(String template, Map<String, Object> arg);
}
