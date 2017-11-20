package ru.job4j.condition;

import java.util.HashMap;
import java.util.Map;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class WordContains {
    public boolean is(String origin, String combine) {
        boolean rsl = false;
        if (origin.length() == combine.length()) {
            rsl = true;
            Map<Character, Integer> data = new HashMap<>();
            for (char value : origin.toCharArray()) {
                data.put(value, data.containsKey(value) ? data.get(value) + 1 : 1);
            }
            for (char value : combine.toCharArray()) {
                Integer count = data.get(value);
                if (count == null || count < 1) {
                    rsl = false;
                    break;
                }
                data.put(value, --count);
            }
        }
        return rsl;
    }
}
