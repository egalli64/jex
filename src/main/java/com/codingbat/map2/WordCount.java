/*
  CodingBat Map 2 - https://codingbat.com/java/Map-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.map2;

import java.util.HashMap;
import java.util.Map;

/**
 * wordCount - https://codingbat.com/prob/p117630
 * <p>
 * Generate a map where each key is a string among the input ones, and the
 * associated value is the counter of times the string is present in the input
 * array.
 */
public class WordCount {
    /**
     * Generate a map. Loop on the input array. Put the current string in the map,
     * if not already in, with value 1, or, if the string is a key in the map,
     * increase its value (that is, its counter).
     *
     * @param strings a string array
     * @return the generated map
     */
    public static Map<String, Integer> solution(String[] strings) {
        Map<String, Integer> result = new HashMap<>();
        for (String key : strings) {
            Integer previous = result.putIfAbsent(key, 1);
            if (previous != null) {
                result.put(key, previous + 1);
            }
        }

        return result;
    }

    /**
     * Generate a map. Loop on the input array. Put the current string in the map,
     * if not already in, with value 1, or, if the string is a key in the map,
     * increase its value (that is, its counter).
     *
     * @param strings a string array
     * @return the generated map
     */
    public static Map<String, Integer> classic(String[] strings) {
        Map<String, Integer> result = new HashMap<>();
        for (String key : strings) {
            if (result.containsKey(key)) {
                result.put(key, result.get(key) + 1);
            } else {
                result.put(key, 1);
            }
        }

        return result;
    }
}
