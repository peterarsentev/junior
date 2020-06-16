package ru.job4j.collection;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Sort3GTest {
    @Test
    public void read() throws Exception {
        Sort3G sort3G = new Sort3G();
        sort3G.sort(new File("./../checkstyle.xml"), new File("./../temp.txt"));
    }
}