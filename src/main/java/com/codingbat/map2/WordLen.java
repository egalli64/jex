/*
  CodingBat Map 2 - https://codingbat.com/java/Map-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.map2;

import java.util.HashMap;
import java.util.Map;

/**
 * wordLen - https://codingbat.com/prob/p125327
 * <p>
 * Generate a map having as keys the strings passed in, each of them associated
 * with its length.
 */
public class WordLen {
    /**
     * Create a map. For each string passed in, put it in (if it is not already in
     * the map) as key of an entry where the value is its length.
     *
     * @param strings an array
     * @return the generated map
     */
    public static Map<String, Integer> solution(String[] strings) {
        Map<String, Integer> result = new HashMap<>();
        for (String s : strings) {
            result.putIfAbsent(s, s.length());
        }

        return result;
    }
}
