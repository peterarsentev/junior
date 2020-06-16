package ru.job4j.collection;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Sort3G {
    public void sort(File source, File distance) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile(source, "r");
             RandomAccessFile raf2 = new RandomAccessFile(distance, "rw")) {
            String str = raf.readLine();
            raf2.writeBytes(str);
        }
    }
}
