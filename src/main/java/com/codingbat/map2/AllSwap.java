/*
  CodingBat Map 2 - https://codingbat.com/java/Map-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.map2;

import java.util.HashMap;
import java.util.Map;

/**
 * allSwap - https://codingbat.com/prob/p134133
 * <p>
 * Rearrange the input string array swapping the current string with the
 * previous "matching" one. Two strings are "matching" if they have the same
 * first char (no empty string allowed). Each string could be swapped just once.
 */
public class AllSwap {
    /**
     * Create a map where the entries have as key the first letter of the string and
     * as value its index in the input array.
     * <p>
     * For each input string, remove its key from the map. If it is actually
     * removed, it means there was a "matching" in the returned position. Swap the
     * two string, current position and retrieved one. Otherwise, store the current
     * position in the map, for a possible future swap.
     *
     * @param strings an array
     * @return the rearranged array
     */
    public static String[] solution(String[] strings) {
        Map<Character, Integer> match = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            Character key = strings[i].charAt(0);
            Integer pos = match.remove(key);
            if (pos != null) {
                String other = strings[pos];
                strings[pos] = strings[i];
                strings[i] = other;
            } else {
                match.put(key, i);
            }
        }
        return strings;
    }
}
