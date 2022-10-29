/*
 * Prepare > Algorithms > String > Making Anagrams
 * https://www.hackerrank.com/challenges/making-anagrams/
 *
 * Given two non-empty string of chars in [a-z]
 * return the required minimal number of char deletion to make them anagrams
 */
package com.hackerrank.algorithms.strings;

import java.util.HashMap;
import java.util.Map;

public class MakingAnagrams {
    public static int makingAnagrams(String s1, String s2) {
        Map<Character, Integer> counters = new HashMap<>();
        for (Character c : s1.toCharArray()) {
            Integer prev = counters.putIfAbsent(c, 1);
            if (prev != null) {
                counters.put(c, prev + 1);
            }
        }

        for (Character c : s2.toCharArray()) {
            Integer prev = counters.putIfAbsent(c, -1);
            if (prev != null) {
                counters.put(c, prev - 1);
            }
        }

        int result = 0;
        for (int cur : counters.values()) {
            result += Math.abs(cur);
        }
        return result;
    }
}
