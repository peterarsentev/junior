package ru.job4j.servlets;

import java.util.List;

public interface Store<T> {
    T add(T model);
    void update(T model);
    String delete(String id);
    List<T> findAll();
    String findById(String id);
}
