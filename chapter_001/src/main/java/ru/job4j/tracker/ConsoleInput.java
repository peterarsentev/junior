package ru.job4j.tracker;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class ConsoleInput implements Input {
    @Override
    public String ask(String question) {
        return null;
    }

    @Override
    public int ask(String question, int[] range) throws MenuOutException {
        return Integer.valueOf(this.ask(question));
    }
}
