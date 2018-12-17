package ru.job4j.servlets;

import java.util.List;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class ValidateService implements Validate {

    private static final Validate INST = new ValidateService();

    private ValidateService() {
    }

    public static Validate getInstance() {
        return INST;
    }

    @Override
    public User add(User user) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
