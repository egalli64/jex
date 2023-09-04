/*
  CodingBat Map 2 - https://codingbat.com/java/Map-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.map2;

import java.util.HashMap;
import java.util.Map;

/**
 * firstSwap - https://codingbat.com/prob/p150113
 * <p>
 * Rearrange the input string array swapping the current string with the
 * previous "matching" one. Two strings are "matching" if they have the same
 * first char (no empty string allowed). Each first char match could lead just
 * once to a swap.
 */
public class FirstSwap {
    /**
     * Create a map where the entries have as key the first letter of the string and
     * as value its index in the input array.
     * <p>
     * For each input string, put if absent its key and index in the map. If it is
     * not put, being present, and if the position is valid, swap the two string,
     * current position and retrieved one. Then invalid the position for the current
     * key, so that it won't be used anymore.
     *
     * @param strings an array
     * @return the rearranged array
     */
    public static String[] solution(String[] strings) {
        Map<Character, Integer> match = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            Character key = strings[i].charAt(0);
            Integer pos = match.putIfAbsent(key, i);
            if (pos != null && pos != -1) {
                String other = strings[pos];
                strings[pos] = strings[i];
                strings[i] = other;

                match.put(key, -1);
            }
        }

        return strings;
    }
}
