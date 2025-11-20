/*
 * 2154. Keep Multiplying Found Values by Two
 * https://leetcode.com/problems/keep-multiplying-found-values-by-two/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Check if original is in nums.
 * If so, double it, and check the new value.
 * Go on as soon a value is found, then return the calculated value.
 */
class E2154 {
    /**
     * Smoke Test
     */
    static void main() {
        E2154 x = new E2154();

        System.out.println(x.findFinalValue(new int[]{5, 3, 6, 1, 12}, 3) == 24);
        System.out.println(x.findFinalValue(new int[]{2, 7, 9}, 4) == 4);
    }

    public int findFinalValue(int[] nums, int original) {
        Set<Integer> buffer = new HashSet<>();
        for (int num : nums) {
            buffer.add(num);
        }
        while (buffer.contains(original)) {
            original *= 2;
        }

        return original;
    }
}
