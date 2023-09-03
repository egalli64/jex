/**
 * https://codingbat.com/java/Map-2
 */
package com.codingbat;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
    /**
     * codingbat.com/prob/p190862
     *
     * @param strings a string array
     * @return a map having strings as keys, associated to true if multiple
     */
    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> result = new HashMap<>(strings.length);
        for (String key : strings) {
            Boolean previous = result.putIfAbsent(key, false);
            if (previous != null && !previous) {
                result.put(key, true);
            }
        }

        return result;
    }

    /**
     * codingbat.com/prob/p134133
     *
     * @param strings an array
     * @return swap strings with same first char
     *         <li>each string could swap just once
     */
    public static String[] allSwap(String[] strings) {
        Map<Character, Integer> match = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String cur = strings[i];
            if (cur.isEmpty()) {
                continue;
            }

            Character key = cur.charAt(0);
            Integer pos = match.remove(key);
            if (pos != null) {
                String other = strings[pos];
                strings[pos] = cur;
                strings[i] = other;
            } else {
                match.put(key, i);
            }
        }
        return strings;
    }

    /**
     * codingbat.com/prob/p150113
     *
     * @param strings an array
     * @return swap strings with same first char
     *         <li>each first-char-string could swap just once
     */
    public static String[] firstSwap(String[] strings) {
        Map<Character, Integer> match = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String cur = strings[i];
            if (cur.isEmpty()) {
                continue;
            }

            Character key = cur.charAt(0);
            Integer pos = match.putIfAbsent(key, i);
            if (pos != null && pos != -1) {
                String other = strings[pos];
                strings[pos] = cur;
                strings[i] = other;

                match.put(key, -1);
            }
        }
        return strings;
    }
}
