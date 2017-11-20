package ru.job4j.pad;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Model of note pad.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class NotePad {
    /**
     * Default size of notes;
     */
    private static final int DEF_SIZE = 100;

    /**
     * Contains of notes;
     */
    private String[] notes = new String[DEF_SIZE];

    private int last = 0;

    /**
     * Add a new note to pad.
     * @param note note.
     */
    public void add(String note) {
        if (last > notes.length) {
            throw new UnsupportedOperationException("Node pad count not expand");
        }
        this.notes[this.last++] = note;
    }

    /**
     * Delete note by position.
     * @param position position.
     */
    public void delete(int position) {
        System.arraycopy(
                this.notes, position + 1, this.notes,
                position, this.last - position);
        this.last--;
    }

    /**
     * Media result.
     * @param consumer Consumer.
     */
    public void to(Consumer<String> consumer) {
        Stream.of(
                Arrays.copyOf(this.notes, this.last)
        ).forEach(consumer);
    }
}
