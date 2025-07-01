/*
 * 3330. Find the Original Typed String I - https://leetcode.com/problems/find-the-original-typed-string-i/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given a string, knowing that each repeated group of same char could contain
 * wrong repetitions, return the total number of possible original correct
 * strings.
 * <p>
 * Constraints: string is non-empty, and contains only lower case English
 * letters.
 */
public class FindTheOriginalTypedStringI {
    public int possibleStringCount(String word) {
        int result = 1;

        char prev = word.charAt(0);
        for (int i = 1; i < word.length(); i++) {
            char cur = word.charAt(i);
            if (cur == prev) {
                result += 1;
            } else {
                prev = cur;
            }
        }

        return result;
    }
}
