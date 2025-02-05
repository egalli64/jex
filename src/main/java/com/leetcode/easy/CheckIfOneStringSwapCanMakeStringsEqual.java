/*
 * 1790. Check if One String Swap Can Make Strings Equal - https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given two non-empty string with the same length, check it the two differ for
 * at most a single character swap
 */
public class CheckIfOneStringSwapCanMakeStringsEqual {
    /**
     * Keep track of the position of the first two out of place chars. If a third
     * one is found, nothing to do more. Then return true only if no difference is
     * found or two differences solved by swap. (Actually, the checks on count could
     * be skipped, but they make the code clearer)
     * 
     * @param s1 first string
     * @param s2 second string
     * @return true if just one swap
     */
    public boolean areAlmostEqual(String s1, String s2) {
        int first = 0;
        int last = 0;
        int count = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (count == 0) {
                    first = i;
                    count += 1;
                } else if (count == 1) {
                    last = i;
                    count += 1;
                } else {
                    return false;
                }
            }
        }

        return count == 0 || count == 2 && s1.charAt(first) == s2.charAt(last) && s1.charAt(last) == s2.charAt(first);
    }

    public boolean noCount(String s1, String s2) {
        int[] swappers = { -1, -1 };

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (swappers[0] == -1) {
                    swappers[0] = i;
                } else if (swappers[1] == -1) {
                    swappers[1] = i;
                } else {
                    return false;
                }
            }
        }

        if (swappers[0] == swappers[1]) {
            return true;
        } else if (swappers[1] == -1) {
            return false;
        } else {
            return s1.charAt(swappers[0]) == s2.charAt(swappers[1]) && s1.charAt(swappers[1]) == s2.charAt(swappers[0]);
        }
    }
}
