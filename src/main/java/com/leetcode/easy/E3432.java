/*
 * 3432. Count Partitions with Even Sum Difference
 * https://leetcode.com/problems/count-partitions-with-even-sum-difference/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.stream.IntStream;

/**
 * Check how many partitions of the given int array having even difference of their sums.
 */
class E3432 {
    /**
     * Smoke Test
     */
    static void main() {
        E3432 x = new E3432();

        System.out.println(x.countPartitions(new int[]{10, 10, 3, 7, 6}) == 4);
        System.out.println(x.countPartitions(new int[]{1, 2, 2}) == 0);
        System.out.println(x.countPartitions(new int[]{2, 4, 6, 8}) == 3);
    }

    /**
     * If the sum is odd, there's no good way of partitioning it.
     * If the sum is even, any partition will do.
     */
    public int countPartitions(int[] nums) {
        return IntStream.of(nums).sum() % 2 != 0 ? 0 : nums.length - 1;
    }
}
