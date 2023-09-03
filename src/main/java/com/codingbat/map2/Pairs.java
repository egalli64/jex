/*
  CodingBat Map 2 - https://codingbat.com/java/Map-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.map2;

import java.util.HashMap;
import java.util.Map;

/**
 * pairs - https://codingbat.com/prob/p126332
 * <p>
 * Generate a map where each entry has a key the first char and value the last
 * char of the last string processed for that key.
 */
public class Pairs {
    /**
     * Create a map, loop on input strings, put in the map key/value as required.
     * Notice that more input strings have the same initial, the value is coming
     * from the last one.
     *
     * @param strings array of non-empty strings
     * @return the generated map
     */
    public static Map<String, String> solution(String[] strings) {
        Map<String, String> result = new HashMap<>();
        for (String s : strings) {
            result.put(String.valueOf(s.charAt(0)), String.valueOf(s.charAt(s.length() - 1)));
        }

        return result;
    }
}
