/*
  CodingBat Map 2 - https://codingbat.com/java/Map-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.map2;

import java.util.HashMap;
import java.util.Map;

/**
 * firstChar - https://codingbat.com/prob/p168493
 * <p>
 * Generate a map where each entry has as key the first letter of a string among
 * the ones passed in, and as value the concatenation of all the strings passed
 * in with the key as initial.
 */
public class FirstChar {
    /**
     * Create a map, loop on all the strings, put the string with its first char as
     * key, if it is not already in, otherwise put as value the previous value
     * concatenated with the current string.
     *
     * @param strings array of non-empty strings
     * @return the generated map
     */
    public static Map<String, String> solution(String[] strings) {
        Map<String, String> result = new HashMap<>();

        for (String s : strings) {
            String key = String.valueOf(s.charAt(0));
            String value = result.putIfAbsent(key, s);
            if (value != null) {
                result.put(key, value + s);
            }
        }

        return result;
    }

    /**
     * Create a map, loop on all the strings, put the string with its first char as
     * key, if it is not already in, otherwise put as value the previous value
     * concatenated with the current string.
     *
     * @param strings array of non-empty strings
     * @return the generated map
     */
    public static Map<String, String> classic(String[] strings) {
        Map<String, String> result = new HashMap<>();

        for (String s : strings) {
            String key = String.valueOf(s.charAt(0));
            if (result.containsKey(key)) {
                result.put(key, result.get(key) + s);
            } else {
                result.put(key, s);
            }
        }

        return result;
    }
}
