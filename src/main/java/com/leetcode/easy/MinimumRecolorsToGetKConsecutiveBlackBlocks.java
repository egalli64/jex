/*
 * 2379. Minimum Recolors to Get K Consecutive Black Blocks - https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given a string of 'W' and 'B' (for White and Black blocks), return the
 * minimum number of switch from W to B needed such that there is at least one
 * occurrence of k consecutive black blocks
 * <p>
 * Constraints: string is non-empty, and contains only 'W' and 'B'. The
 * requested block size is in [1..len]
 */
public class MinimumRecolorsToGetKConsecutiveBlackBlocks {
    public int minimumRecolors(String blocks, int k) {
        int result = 0;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                result += 1;
            }
        }
        if (result == 0) {
            return 0;
        }

        int current = result;
        for (int i = k; i < blocks.length(); i++) {
            if (blocks.charAt(i - k) == 'W') {
                current -= 1;
            }
            if (blocks.charAt(i) == 'W') {
                current += 1;
            }
            if (current == 0) {
                return 0;
            }
            result = Math.min(current, result);
        }

        return result;
    }
}
