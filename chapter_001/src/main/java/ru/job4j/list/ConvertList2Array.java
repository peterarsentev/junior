package ru.job4j.list;

import java.util.List;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class ConvertList {
    public int[][] toArray(List<Integer> list, int rows) {
        int cells = (int) Math.ceil((double) list.size() / rows);
        int[][] array = new int[rows][cells];
        int cell = 0;
        int row = 0;
        for (Integer value : list) {
            array[row][cell++] = value;
            if (cell == cells) {
                cell = 0;
                row++;
            }
        }
        return array;
    }
}
