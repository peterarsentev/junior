package ru.job4j.generic;

import java.util.List;

public class UserStore implements UserDAO {

    private final Store<Base> store = new MemStore<>();

    @Override
    public void add(User model) {
        store.add(model.getRole());
        store.add(model);
    }

    @Override
    public boolean replace(String id, User model) {
        return store.replace(id, model);
    }

    @Override
    public boolean delete(String id) {
        return store.delete(id);
    }

    @Override
    public User findById(String id) {
        return null;
    }

    @Override
    public List<User> findByField() {
        return null;
    }
}
