/*
 * Prepare > Algorithms > String > Game of Thrones - I
 * https://www.hackerrank.com/challenges/game-of-thrones/
 *
 * Given a non-empty string of chars in [a-z]
 * return YES if it is the anagram of a palindrome, NO otherwise
 */
package com.hackerrank.algorithms.strings;

import java.util.HashSet;
import java.util.Set;

public class GameOfThronesI {
    public static String gameOfThrones(String s) {
        Set<Character> odds = new HashSet<>();
        for (Character c : s.toCharArray()) {
            if (!odds.remove(c)) {
                odds.add(c);
            }
        }
        if (s.length() % 2 == 0) {
            return odds.isEmpty() ? "YES" : "NO";
        }
        return odds.size() == 1 ? "YES" : "NO";
    }
}
