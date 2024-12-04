/*
 * 2825. Make String a Subsequence Using Cyclic Increments - https://leetcode.com/problems/make-string-a-subsequence-using-cyclic-increments/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * Given two strings, check if the second one is a "subsequence" of the first
 * one.
 * <p>
 * Here "subsequence" means that all the character of the second one are in the
 * first one in the original order, possibly with gaps between each character.
 * Besides, the character could be "almost" equal, meaning that their cyclic
 * difference could be 1. So, 'a' and 'z' are considered equal.
 * <p>
 * Constraints: Strings are not empty, characters are in [a..z]
 */
public class MakeStringASubsequenceUsingCyclicIncrements {
    /**
     * Loop on each source character, when a target character is found, move to the
     * next one
     * 
     * @param str1 the source string
     * @param str2 the target string
     * @return true if the "subsequence" is found
     */
    public boolean canMakeSubsequence(String str1, String str2) {
        int target = 0;

        for (char src : str1.toCharArray()) {
            if (target == str2.length()) {
                return true;
            } else if ((str2.charAt(target) - src + 26) % 26 <= 1) {
                target += 1;
            }
        }

        return target == str2.length();
    }
}
