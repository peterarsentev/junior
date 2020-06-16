package ru.job4j.generic;

import java.util.List;

public interface RoleDAO extends Store<Role> {
    List<Role> findByName(String name);
}
