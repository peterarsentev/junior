package ru.job4j.inheritance;

public class Config {
    String name;
    protected int position;
    public String[] properties;

    public Config(String name) {
        this.name = name;
    }

    void print() {
        System.out.println(position);
    }

    protected String getProperty(String key) {
        return search(key);
    }

    private String search(String key) {
        return key;
    }
}
