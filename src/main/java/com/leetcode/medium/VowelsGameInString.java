/*
 * 3227. Vowels Game in a String - https://leetcode.com/problems/vowels-game-in-a-string/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * Check if the input lowercase string has at least a vowel
 */
public class VowelsGameInString {
    public boolean doesAliceWin(String s) {
        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return true;
            }
        }
        return false;
    }

    public boolean modern(String s) {
        return s.chars().anyMatch(c -> "aeiou".indexOf(c) != -1);
    }
}
