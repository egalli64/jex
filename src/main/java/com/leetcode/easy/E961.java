/*
 * 961. N-Repeated Element in Size 2N Array
 * https://leetcode.com/problems/1-bit-and-2-bit-characters/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * An even sized int array is passed in.
 * All items are unique, but one that appears exactly n/2 times.
 * Find it.
 */
class E961 {
    /**
     * Smoke Test
     */
    static void main() {
        E961 x = new E961();

        System.out.println(x.repeatedNTimes(new int[]{1, 2, 3, 3}) == 3);
        System.out.println(x.repeatedNTimes(new int[]{2, 1, 2, 5, 3, 2}) == 2);
        System.out.println(x.repeatedNTimes(new int[]{5, 1, 5, 2, 5, 3, 5, 4}) == 5);
    }

    /**
     * Find the first 3-sized window where the value is repeated.
     * Otherwise, it should be the last element.
     */
    public int repeatedNTimes(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++)
            if (nums[i] == nums[i + 1] || nums[i] == nums[i + 2])
                return nums[i];

        return nums[nums.length - 1];
    }
}
