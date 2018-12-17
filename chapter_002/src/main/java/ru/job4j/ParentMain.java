package ru.job4j;

import javax.swing.text.AsyncBoxView;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class ParentMain {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Object child = parent.createChild();
        System.out.println(child);
    }
}
