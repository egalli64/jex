/*
 * 3512. Minimum Operations to Make Array Sum Divisible by K
 * https://leetcode.com/problems/minimum-operations-to-make-array-sum-divisible-by-k/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.stream.IntStream;

/**
 *
 */
class E3512 {
    /**
     * Smoke Test
     */
    static void main() {
        E3512 x = new E3512();

        System.out.println(x.minOperations(new int[]{3, 9, 7}, 5) == 4);
        System.out.println(x.minOperations(new int[]{4, 1, 3}, 4) == 0);
        System.out.println(x.minOperations(new int[]{3, 2}, 6) == 5);
    }

    public int minOperations(int[] nums, int k) {
        return IntStream.of(nums).sum() % k;
    }
}
