package ru.job4j.collection;

import java.util.*;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
class Solution {
    class Pair {
        final int index;
        final int key;

        public Pair(int index, int key) {
            this.index = index;
            this.key = key;
        }
    }

    int solution(int[] value) {
        final Map<Integer, Pair> result = new TreeMap<>();
        for (int i = 0; i < value.length; i++) {
            Pair val = result.get(value[i]);
            if (val == null) {
                result.put(value[i], new Pair(i, 0));
            } else if (val.index != i) {
                result.put(
                        value[i],
                        new Pair(
                                val.index,
                                Math.max(val.key, Math.abs(val.key - i))
                        )
                );
            }
        }
        int max = 0;
        for (Pair pair : result.values()) {
            max = Math.max(pair.key, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] value = {4, 6, 2, 2, 6, 6, 1};
        Solution sol = new Solution();
        int result = sol.solution(value);
        System.out.println(result);
    }
}
