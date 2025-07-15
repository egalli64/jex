/*
 * 3136. Valid Word - https://leetcode.com/problems/valid-word/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Check if the passed string is valid. It should follow these rules:
 * <ul>
 *     <li>3+ length</li>
 *     <li>Only digits and English letters (upper / lower case)</li>
 *     <li>At least a vowel (a e i o u)</li>
 *     <li>At least a consonant</li>
 * </ul>
 * The only no-no chars expected are: @ # $
 */
public class ValidWord {
    private boolean isVowel(char c) {
        char cur = Character.toLowerCase(c);
        return cur == 'a' || cur == 'e' || cur == 'i' || cur == 'o' || cur == 'u';
    }

    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }

        boolean hasVowel = false;
        boolean hasConsonant = false;

        for (char cur : word.toCharArray()) {
            if (cur == '@' || cur == '#' || cur == '$') {
                return false;
            } else if (isVowel(cur)) {
                hasVowel = true;
            } else if (!Character.isDigit(cur)) {
                hasConsonant = true;
            }
        }

        return hasVowel && hasConsonant;
    }
}
