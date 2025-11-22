/*
 * 3190. Find Minimum Operations to Make All Elements Divisible by Three
 * https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Count the minimum number of unity increase/decrease
 * to make all the elements in the array a multiple of 3
 */
public class E3190 {
    /**
     * Smoke Test
     */
    static void main() {
        E3190 x = new E3190();

        System.out.println(x.minimumOperations(new int[]{1, 2, 3, 4}) == 3);
        System.out.println(x.minimumOperations(new int[]{3, 6, 9}) == 0);
    }

    public int minimumOperations(int[] nums) {
        int result = 0;

        for (int num : nums) {
            if (num % 3 != 0) {
                result += 1;
            }
        }

        return result;
    }
}
