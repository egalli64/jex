/*
 * Prepare > Algorithms > String > Anagram
 * https://www.hackerrank.com/challenges/anagram/
 *
 * Given a non-empty string of chars in [a-z]
 * Split it in two
 * return the required minimal number of char changes in the first one to make it anagram of the second, or -1
 */
package hr.algorithms.strings;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static int anagram(String s) {
        if (s.length() % 2 == 1) {
            return -1;
        }
        Map<Character, Integer> counters = new HashMap<>();
        for (int i = 0; i < s.length() / 2; i++) {
            Character c = s.charAt(i);
            Integer prev = counters.putIfAbsent(c, 1);
            if (prev != null) {
                counters.put(c, prev + 1);
            }
        }

        for (int i = s.length() / 2; i < s.length(); i++) {
            Character c = s.charAt(i);
            Integer prev = counters.putIfAbsent(c, -1);
            if (prev != null) {
                counters.put(c, prev - 1);
            }
        }

        int result = 0;
        for (int cur : counters.values()) {
            if (cur > 0) {
                result += cur;
            }
        }
        return Math.abs(result);
    }
}
