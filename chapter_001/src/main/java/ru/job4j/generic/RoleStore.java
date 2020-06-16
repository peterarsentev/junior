package ru.job4j.generic;

import java.util.List;

public class RoleStore implements RoleDAO {
    @Override
    public void add(Role model) {

    }

    @Override
    public boolean replace(String id, Role model) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public Role findById(String id) {
        return null;
    }

    @Override
    public List<Role> findByName(String name) {
        return null;
    }
}
