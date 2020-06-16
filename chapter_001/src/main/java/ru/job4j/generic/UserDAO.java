package ru.job4j.generic;

import java.util.List;

public interface UserDAO extends Store<User> {
    List<User> findByField();
}
