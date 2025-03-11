/*
 * 1358. Number of Substrings Containing All Three Characters - https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * Given a string consisting only of 'a', 'b' and 'c', return the number of
 * substrings containing at least one occurrence of all these characters
 * <p>
 * Constraint: the string has at least 3 characters in it
 */
public class NumberSubstringsContainingAllThreeCharacters {
    public int numberOfSubstrings(String s) {
        int[] counters = { 0, 0, 0 };

        for (int i = 0; i < 3; i++) {
            counters[s.charAt(i) - 'a'] += 1;
        }

        int result = isGood(counters) ? 1 : 0;

        int left = 0;
        for (int right = 3; right < s.length(); right++) {
            char cur = s.charAt(right);
            counters[cur - 'a'] += 1;

            while (isGood(counters)) {
                result += s.length() - right;

                char out = s.charAt(left);
                counters[out - 'a'] -= 1;
                left += 1;
            }
        }

        return result;
    }

    private boolean isGood(int[] counters) {
        return counters[0] > 0 && counters[1] > 0 && counters[2] > 0;
    }
}
