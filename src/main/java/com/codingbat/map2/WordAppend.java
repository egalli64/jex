/*
  CodingBat Map 2 - https://codingbat.com/java/Map-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.map2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * wordAppend - https://codingbat.com/prob/p103593
 * <p>
 * Generate a string from the passed array concatenating to it each even
 * occurrence of the same value.
 */
public class WordAppend {
    /**
     * Add each input string to a counter map, when a even count for the current
     * string is detected, append it to the generating result.
     * 
     * @param strings an array
     * @return the generated string
     */
    public static String solution(String[] strings) {
        StringBuilder result = new StringBuilder();

        Map<String, Integer> counter = new HashMap<>();
        for (String s : strings) {
            Integer cur = counter.putIfAbsent(s, 1);
            if (cur != null) {
                cur += 1;
                if (cur % 2 == 0) {
                    result.append(s);
                }
                counter.put(s, cur);
            }
        }

        return result.toString();
    }

    /**
     * No need for a map, a set suffices. For each input string, try to remove it
     * from the set. On success, concatenate it to the result (it was an even copy),
     * on failure add it to the set (it was an odd copy).
     *
     * @param strings an array
     * @return the generated string
     */
    public static String bySet(String[] strings) {
        StringBuilder result = new StringBuilder();

        Set<String> checker = new HashSet<>();
        for (String s : strings) {
            if (checker.remove(s)) {
                result.append(s);
            } else {
                checker.add(s);
            }
        }

        return result.toString();
    }
}
