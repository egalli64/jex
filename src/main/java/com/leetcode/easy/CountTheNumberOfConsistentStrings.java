/*
 * 1684. Count the Number of Consistent Strings - https://leetcode.com/problems/count-the-number-of-consistent-strings/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * A string is consistent if all characters in it appear in a reference string.
 * <p>
 * Given a reference string and an array of strings, return the number of the
 * consistent ones.
 */
public class CountTheNumberOfConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> reference = new HashSet<>();
        for (int i = 0; i < allowed.length(); i++) {
            reference.add(allowed.charAt(i));
        }

        int result = 0;
        for (String word : words) {
            boolean consistent = true;
            for (int i = 0; i < word.length(); i++) {
                if (!reference.contains(word.charAt(i))) {
                    consistent = false;
                    break;
                }
            }
            if (consistent) {
                result += 1;
            }
        }

        return result;
    }
}
