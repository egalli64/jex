/*
  CodingBat Map 2 - https://codingbat.com/java/Map-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.map2;

import java.util.HashMap;
import java.util.Map;

/**
 * word0 - https://codingbat.com/prob/p152303
 * <p>
 * Generate a map having as keys the strings passed in, each of them associated
 * to the value zero.
 */
public class Word0 {
    /**
     * Create a map, put in it an entry for each string in the input array, using as
     * value always zero.
     *
     * @param strings a string array
     * @return the generated map
     */
    public static Map<String, Integer> solution(String[] strings) {
        Map<String, Integer> result = new HashMap<>();
        for (String key : strings) {
            result.put(key, 0);
        }

        return result;
    }
}
